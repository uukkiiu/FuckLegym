package legym.fuck.ui.huodong

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.viewModels
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import legym.fuck.R
import legym.fuck.databinding.ActivityHuodongBinding
import com.angcyo.dsladapter.inflate
import com.ferfalk.simplesearchview.SimpleSearchView
import com.liangguo.androidkit.app.ToastUtil
import com.liangguo.androidkit.color.resolveColor
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import legym.fuck.base.CollapsingToolbarActivity
import legym.fuck.ui.huodong.mydeatils.MyActivityDetailsBottomFragment
import legym.fuck.ui.huodong.register.AutoRegisterFragment
import legym.fuck.ui.huodong.register.AutoUnregisterFragment
import legym.fuck.utils.CommonAlertDialog
import legym.fuck.utils.hideSoftInputFromWindow
import legym.fuck.utils.isMaterialDarkTheme
import legym.fuck.widget.popup.SingleSelectorPopup


/**
 * @author ldh
 * 时间: 2022/3/27 14:08
 *
 */
class HuoDongActivity : CollapsingToolbarActivity() {

    private val mViewModel by viewModels<HuoDongViewModel>()

    private val mSelectorPopup by lazy {
        SingleSelectorPopup.create(this, mDataBinding.containerFilter) {
            mViewModel.queryLimits[mViewModel.currentQueryLimit.value].selectedIndex.tryEmit(it)
        }
    }

    override val layoutResID = R.layout.activity_huodong

    private val mDataBinding by lazy {
        ActivityHuodongBinding.bind(rootLayout)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding.initViews()
        mViewModel.initDataListeners()
    }

    @SuppressLint("PrivateResource")
    private fun ActivityHuodongBinding.initViews() {
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
        buttonRegisterAll.setOnClickListener {
            AutoRegisterFragment().showIfNeeded(supportFragmentManager)
        }
        buttonUnregisterAll.setOnClickListener {
            AutoUnregisterFragment().showIfNeeded(supportFragmentManager)
        }

        fab.setOnClickListener {
            //快速到达顶部
            recyclerView.smoothScrollToPosition(0)
        }
        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                //滚动的距离超过1000就认为可以显示出快速到达顶部的按钮了
                mViewModel.turnTopFabShow.tryEmit(recyclerView.computeVerticalScrollOffset() > 1000)

                //RecyclerView滚动引起底部选择栏是否显示， 这个效果暂时被屏蔽了
//                if (dy > 5) mViewModel.appBottomBarShow.tryEmit(false)
//                else if (dy < -5) mViewModel.appBottomBarShow.tryEmit(mViewModel.selectMode.value)
            }
        })
        bottomAppBar.setNavigationOnClickListener {
            mViewModel.selectOrCancelAll(false)
        }
        buttonSelectAll.setOnClickListener {
            mViewModel.selectOrCancelAll(true)
        }
        appbarLayout.setBackgroundColor(resolveColor(R.attr.colorPrimaryContainer))
        recyclerView.adapter = mViewModel.recyclerAdapter
        refreshLayout.setOnRefreshListener {
            mViewModel.refreshing.tryEmit(true)
        }
        with(mViewModel) {
            queryLimits.forEach { _ ->
                containerLinearFilter.inflate(R.layout.inflate_selector_tab_item, true)
            }

            queryLimits.forEachIndexed { index, _ ->
                //为顶部的几个过滤按钮设置点击事件
                findFilterItemGroup(index).apply {
                    setOnClickListener {
                        val textView = (getChildAt(0) as TextView)
                        val preColor = textView.textColors
                        currentQueryLimit.tryEmit(index)
                        mSelectorPopup.onDismissListener = {
                            textView.setTextColor(preColor)
                        }
                        textView.setTextColor(resolveColor(if (isMaterialDarkTheme) R.attr.colorSecondary else R.attr.colorPrimary))
                        mSelectorPopup.show()
                    }
                }
            }


            queryLimits.forEachIndexed { index, limit ->
                limit.selectedIndex.asLiveData().observe(this@HuoDongActivity) {
                    mSelectorPopup.setData(it, queryLimits[currentQueryLimit.value].options)
                    ((containerLinearFilter.getChildAt(index) as ViewGroup).getChildAt(0) as TextView).text =
                        if (limit.limitLessAble && it == 0) limit.title else limit.options[it]
                }
            }

            searchView.setOnSearchViewListener(object : SimpleSearchView.SearchViewListener {
                override fun onSearchViewClosed() {
                    filterString.tryEmit("")
                }

                override fun onSearchViewClosedAnimation() {}
                override fun onSearchViewShown() {}
                override fun onSearchViewShownAnimation() {}
            })
            searchView.setOnQueryTextListener(object : SimpleSearchView.OnQueryTextListener {
                override fun onQueryTextChange(newText: String): Boolean {
                    filterString.tryEmit(newText)
                    lifecycleScope.launch {
                        delay(250)
                        mDataBinding.recyclerView.smoothScrollToPosition(0)
                    }
                    return false
                }

                override fun onQueryTextCleared(): Boolean {
                    filterString.tryEmit("")
                    return false
                }

                override fun onQueryTextSubmit(query: String): Boolean {
                    hideSoftInputFromWindow(this@HuoDongActivity)
                    return true
                }
            })
        }
    }


    @SuppressLint("SetTextI18n")
    private fun HuoDongViewModel.initDataListeners() {
        with(mDataBinding) {
            currentQueryLimit.asLiveData().observe(this@HuoDongActivity) {
                mSelectorPopup.setData(queryLimits[it].selectedIndex.value, queryLimits[it].options)
            }
            filtedActivities.asLiveData().observe(this@HuoDongActivity) { activities ->
                recyclerAdapter.activities = activities.toMutableList()
            }
            refreshing.asLiveData().observe(this@HuoDongActivity) {
                if (it) {
                    progress.show()
                    containerEmpty.isVisible = false
                } else {
                    refreshLayout.finishRefresh()
                    progress.hide()
                    containerEmpty.isVisible = filtedActivities.value.isEmpty()
                }
            }
            filtedActivities.asLiveData().observe(this@HuoDongActivity) {
                containerEmpty.isVisible = it.isEmpty() && !refreshing.value
            }
            queryLimits[0].selectedIndex.asLiveData().observe(this@HuoDongActivity) {
                findFilterItemGroup(1).isVisible = it == 0
                findFilterItemGroup(2).isVisible = it != 0
                findFilterItemGroup(3).isVisible = it != 0
                findFilterItemGroup(4).isVisible = it != 0
            }
            showLoadingDialog.asLiveData().observe(this@HuoDongActivity) {
                if (it) loadingDialog.show()
                else loadingDialog.dismiss()
            }
            turnTopFabShow.asLiveData().observe(this@HuoDongActivity) {
                fab.animate().alpha(if (it) 1f else 0f).withEndAction {
                    fab.isInvisible = !it
                }
            }
            selectedActivities.observe(this@HuoDongActivity) {
                textViewSelectCount.text = "选中:${it.size}"
            }
            selectMode.asLiveData().observe(this@HuoDongActivity) {

            }
            bottomAppBar.post {
                appBottomBarShow.asLiveData().observe(this@HuoDongActivity) {
                    if (it) bottomAppBar.performShow(true) else bottomAppBar.performHide(true)
                }
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_huodong, menu)
        mDataBinding.searchView.setMenuItem(menu.findItem(R.id.action_search))
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.activity_statistics -> {
                mViewModel.loadStatistics()
                MyActivityDetailsBottomFragment().showIfNeeded(supportFragmentManager)
            }
            R.id.activity_quickly_register -> {
                CommonAlertDialog(
                    activity = this,
                    title = "什么是一键报名？",
                    message = "     由于有些学校活动很多，想报名的话一个个去点，但是很多情况下报名不一定成功。 所以加入了这个功能，使用方式：\n\n1. 切换到“全部活动”\n\n2. 选择自己的校区\n\n3. 报名分类选择“还能报的”\n\n4. 自己可以做一些筛选，但要保证 活动选择的是 “全部活动” ，并且报名分类选择的是 “还能报的”，然后就可以点击下方按钮开始了。 \n\n\n 注意事项： \n\n该功能只会对当前列表中显示出来的活动进行报名，所以你可以通过筛选和输入关键词的方式来进行筛选出部分活动来报名。报名顺序大致是从上往下，可以通过筛选条件或搜索关键词的方式来确定顺序。（实际是异步并发，但大致符合顺序）"
                ).apply {
                    setNegativeButton(R.string.cancel, null)
                    if (mViewModel.isQuicklyRegisterEnable) {
                        setPositiveButton("开始！") { _, _ ->
                            if (mViewModel.filtedActivities.value.isEmpty()) ToastUtil.error("当前列表活动数为0")
                            else AutoRegisterFragment().showIfNeeded(supportFragmentManager)
                        }
                    } else {
                        setPositiveButton("先切换，再来点我") { _, _ ->
                            lifecycleScope.launch {
                                mViewModel.queryLimits.apply {
                                    this[0].selectedIndex.emit(1)
                                    this[4].selectedIndex.emit(1)
                                }
                            }
                        }
                    }
                }.show()
            }
        }
        return true
    }


    override fun onBackPressed() {
        if (mDataBinding.searchView.onBackPressed()) {
            return
        }
        super.onBackPressed()
    }

    /**
     * 查找顶部过滤栏的某一项
     */
    private fun findFilterItemGroup(index: Int) =
        mDataBinding.containerLinearFilter.getChildAt(index) as ViewGroup

}