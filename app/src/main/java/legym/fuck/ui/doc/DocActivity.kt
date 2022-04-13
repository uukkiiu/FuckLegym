package legym.fuck.ui.doc

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import legym.fuck.R
import legym.fuck.base.BaseActivity
import legym.fuck.databinding.ActivityDocBinding
import legym.fuck.logic.LocalUserData.hasRead
import legym.fuck.logic.OnlineData


/**
 * @author ldh
 * 时间: 2022/3/21 21:55
 *
 */
class DocActivity : BaseActivity() {

    private val mDataBinding by lazy {
        DataBindingUtil.setContentView<ActivityDocBinding>(this, R.layout.activity_doc)
    }

    private val mViewModel by viewModels<DocViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initDataListeners()
    }

    private fun initDataListeners() {
        mViewModel.currentDoc.observe(this) {
            mDataBinding.toolbar.subtitle = it.title
            mDataBinding.drawerLayout.closeDrawers()
            it.hasRead = true
        }
    }

    private fun initViews() {
        with (mDataBinding) {

            toolbar.inflateMenu(R.menu.menu_exit)
            toolbar.setOnMenuItemClickListener {
                if (it.itemId == R.id.exit) {
                    finish()
                }
                true
            }
            toolbar.setTitle(R.string.online_doc)

            //手机端的话要初始化一下Drawer
            val drawerLayout = drawerLayout
            // 参数：开启抽屉的activity、DrawerLayout的对象、toolbar按钮打开关闭的对象、描述open drawer、描述close drawer
            val mDrawerToggle = ActionBarDrawerToggle(this@DocActivity, drawerLayout, toolbar, R.string.open, R.string.close)
            // 添加抽屉按钮，通过点击按钮实现打开和关闭功能; 如果不想要抽屉按钮，只允许在侧边边界拉出侧边栏，可以不写此行代码
            mDrawerToggle.syncState()
            // 设置按钮的动画效果; 如果不想要打开关闭抽屉时的箭头动画效果，可以不写此行代码
            drawerLayout.addDrawerListener(mDrawerToggle)
        }

    }

    override fun onBackPressed() {
        if (mDataBinding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDataBinding.drawerLayout.closeDrawer(GravityCompat.START)
            return
        }
        super.onBackPressed()
    }

    override fun onResume() {
        super.onResume()
        lifecycleScope.launch {
            OnlineData.loadDocInfo()
        }
    }

}