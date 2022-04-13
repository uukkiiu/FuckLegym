package legym.fuck.ui.huodong

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import legym.fuck.R
import com.alibaba.fastjson.JSON
import com.liangguo.androidkit.app.ToastUtil
import com.liangguo.androidkit.string.ChineseStringMatcher
import com.liangguo.easyingcontext.EasyingContext.context
import com.xeinebiu.suspend.dialogs.SuspendAlertDialog
import com.xeinebiu.suspend.dialogs.confirm
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import legym.fuck.config.AppConfig
import legym.fuck.logic.OnlineData
import legym.fuck.logic.legym.network.NetworkRepository
import legym.fuck.logic.legym.network.model.huodong.*
import legym.fuck.logic.legym.network.model.huodong.signin.ActivitySignInRequestBean
import legym.fuck.logic.legym.network.model.huodong.signup.SignUpRequestBean
import legym.fuck.logic.legym.network.model.toastError
import legym.fuck.ui.huodong.model.QueryLimit
import legym.fuck.ui.huodong.model.UiAction
import legym.fuck.ui.huodong.model.localSelectedIndex
import legym.fuck.utils.CommonAlertDialog

const val LIMIT_LESS = "不限"


/**
 * @author ldh
 * 时间: 2022/3/27 14:12
 *
 */
class HuoDongViewModel : ViewModel() {

    /**
     * 当前正在对第几个查询条件做修改
     */
    val currentQueryLimit = MutableStateFlow(0)

    /**
     * 我的统计数据
     */
    val statistic = MutableLiveData<MyStatisticsResultBean>()

    /**
     * 查询条件
     */
    val queryLimits = listOf(
        QueryLimit(MutableStateFlow(0), mutableListOf("我的活动", "全部活动"), "查询对象", false),
        QueryLimit(MutableStateFlow(0), mutableListOf("进行中", "未开始", "已结束"), "我的活动状态", false),
        QueryLimit(
            MutableStateFlow(0),
            mutableListOf(LIMIT_LESS, "进行中", "报名中", "未开始", "已结束"),
            "状态",
            true
        ),
        QueryLimit(MutableStateFlow(0), mutableListOf(LIMIT_LESS), "校区", true),
        QueryLimit(
            MutableStateFlow(0),
            mutableListOf(LIMIT_LESS, "还能报的", "我已报的", "人数爆满"),
            "报名分类",
            true
        ),
        QueryLimit(
            MutableStateFlow(0),
            mutableListOf("不排序", "先看明天", "先看下周"),
            "时间排序",
            true
        ),
    )

    /**
     * 当前的状态是否允许一键报名
     *
     * 限制条件：选择学校活动且选择状态是还能报的。
     */
    val isQuicklyRegisterEnable: Boolean
        get() = queryLimits[0].selectedIndex.value == 1 && queryLimits[4].selectedIndex.value == 1

    /**
     * 当前获取到的活动
     */
    val activities = MutableStateFlow(listOf<HuodongItem>())

    /**
     * 是否显示快速回到顶部按钮
     */
    val turnTopFabShow = MutableStateFlow(false)

    /**
     * 经过搜索过滤之后的活动
     */
    val filtedActivities = MutableStateFlow(listOf<HuodongItem>())

    /**
     * 用来过滤活动的
     */
    val filterString = MutableStateFlow("")

    val refreshing = MutableStateFlow(false)

    val showLoadingDialog = MutableStateFlow(false)

    val appBottomBarShow = MutableStateFlow(false)

    /**
     * 活动页是否是选择模式
     */
    val selectMode = MutableStateFlow(false)

    /**
     * 选中的活动的id
     */
    val selectedActivities = MutableLiveData(mutableSetOf<String>())

    val recyclerAdapter = ActivitiesAdapter(selectedActivities.value!!) { action ->
        viewModelScope.launch {
            showLoadingDialog.emit(true)
            with(action) {
                when (this) {
                    is UiAction.GoSignUp -> {
                        //活动报名，先要查看这个活动现在能不能报名
                        NetworkRepository.isActivityConflict(activity.id).data?.let {
                            if (it) {
                                if (!isContinueSignup()) {
                                    return@with
                                }
                            }
                        }
                        NetworkRepository.signUpActivity(SignUpRequestBean(activity.id)).apply {
                            data?.let {
                                if (it.success) ToastUtil.success("报名成功")
                                else CommonAlertDialog("报名失败", it.reason).show()
                                loadActivities()
                            } ?: toastError()
                        }
                    }
                    is UiAction.CancelSignUp -> {
                        //取消活动报名
                        NetworkRepository.cancelSignUpActivity(SignUpRequestBean(id)).apply {
                            data?.let {
                                if (it) ToastUtil.success("取消报名成功")
                                else ToastUtil.error("取消失败")
                                loadActivities()
                            } ?: toastError()
                        }
                    }
                    is UiAction.ActivitySignIn -> {
                        //活动签到
                        NetworkRepository.signInActivity(
                            ActivitySignInRequestBean(
                                activityId = activityId,
                                userId = OnlineData.getUserDataAsync().id
                            )
                        ).apply {
                            var resData = com.alibaba.fastjson.JSONObject()
                            try {
                                resData = JSON.parseObject(message)
                            } catch (e: Exception) {
                                resData["message"] = "乐健服务器错误，无法处理数据！"
                            }
                            val resMsg: String = resData.getString("message")
                            if (message!!.contains("成功")) {
                                ToastUtil.success("签到成功")
                            } else {
                                ToastUtil.error("失败！$resMsg")
                            }
                            loadActivities()
                        }
                    }

                    is UiAction.OnActivityClick -> {
                        onActivitySelectChanged(activity, index)
                    }
                }
            }
            showLoadingDialog.emit(false)
        }
    }

    /**
     * 校区
     */
    val campus = MutableStateFlow(listOf<CampusItem>())

    /**
     * 加载一次活动
     */
    suspend fun loadActivities() = withContext(Dispatchers.IO) {
        if (queryLimits[0].selectedIndex.value == 0) {
            //加载我的活动
            NetworkRepository.getMyActivities(
                MyActivityRequestBean(
                    day = 999,
                    state = when (queryLimits[1].selectedIndex.value) {
                        1 -> 3
                        2 -> 5
                        else -> 4
                    },
                    page = 1,
                    size = 999,
                    semesterId = OnlineData.asyncLogin().data?.semesterId
                        ?: OnlineData.currentData.value?.id ?: ""
                )
            ).apply {
                data?.let { result ->
                    //最后再提交加载好的活动数据
                    activities.emit(result.items)
                } ?: let {
                    it.toastError()
                    Log.e("加载我的活动失败", it.toString())
                }
            }

        } else {
            val selected = queryLimits[3].selectedIndex.value
            val campus = if (selected == 0) "" else campus.value[selected - 1].id
            //加载学校活动
            NetworkRepository.getActivities(
                AllActivitiesRequestBean(
                    name = "",
                    campus = campus,
                    page = 1,
                    size = 999,
                    state = when (queryLimits[2].selectedIndex.value) {
                        1 -> "4"
                        2 -> "1"
                        3 -> "0"
                        4 -> "2"
                        else -> ""
                    },
                    topicId = "",
                    week = ""
                )
            ).apply {
                data?.let {
                    activities.emit(it.items)
                } ?: let {
                    it.toastError()
                    Log.e("加载学校活动失败", it.toString())
                }
            }
        }
        refreshing.emit(false)
    }

    init {
        viewModelScope.apply {
            queryLimits.forEach { limit ->
                if (limit.title == "校区") return@forEach
                launch(Dispatchers.IO) {
                    limit.selectedIndex.emit(limit.localSelectedIndex)
                    limit.selectedIndex.collectLatest {
                        limit.localSelectedIndex = it
                    }
                }
            }

            launch {
                //不同校区切换
                NetworkRepository.getCampus().data?.let { list ->
                    campus.emit(list)
                }
            }
            launch {
                refreshing.collect {
                    if (it) loadActivities()
                }
            }
            launch {
                activities.collectLatest {
                    filterActivities()
                }
            }
            launch {
                //搜索的方式过滤活动
                filterString.collectLatest {
                    filterActivities()
                }
            }

            launch {
                //加载校区情况
                campus.collectLatest { list ->
                    queryLimits[3].options.apply {
                        clear()
                        add(LIMIT_LESS)
                        list.forEach {
                            add(it.name)
                        }
                    }
                }
            }

            queryLimits.forEachIndexed { index, limit ->
                launch {
                    limit.selectedIndex.collectLatest {
                        if (index >= 4) {
                            filterActivities()
                        } else refreshing.emit(true)
                    }
                }
            }

            launch {
                selectMode.collectLatest {
                    appBottomBarShow.emit(it)
                }
            }
        }

    }

    /**
     * 对活动进行一次过滤
     */
    private suspend fun filterActivities() = withContext(Dispatchers.IO) {
        //从这个数据开始往下走逐渐过滤
        val data = mutableListOf<HuodongItem>()
        data.addAll(activities.value)

        /**
         * 是否提前报名的规则
         */
        val signAdvance: (HuodongItem) -> Boolean = if (AppConfig.ENABLE_SIGN_ADVANCE) {
            { it.isRegisterAble && it.state <= 1 }
        } else {
            { it.isRegisterAble && it.state == 1 }
        }

        if (queryLimits[0].selectedIndex.value != 0) {
            //限制报名情况，只有在学校活动的模式下才生效
            queryLimits[4].selectedIndex.value.let { index ->
                when (index) {
                    1 -> data.retainAll(signAdvance)
                    2 -> data.retainAll { it.isRegister }
                    3 -> data.retainAll { it.limitPeopleNumber - it.registerPeople <= 0 }
                    else -> {}
                }
            }
        }

        //进行时间的排序
        queryLimits[5].selectedIndex.value.let { index ->
            when (index) {
                1 -> data.sortWith { item1, item2 ->
                    (item1.startTime.toLong() - item2.startTime.toLong()).toInt()
                }
                2 -> data.sortWith { item1, item2 ->
                    (item2.startTime.toLong() - item1.startTime.toLong()).toInt()
                }
                else -> {}
            }
        }

        //过滤搜索的关键词
        if (filterString.value.isEmpty()) {
            filtedActivities.emit(data)
        } else {
            //按照活动的名字和地点按中文匹配度排序
            val ratesMap = mutableListOf<Pair<HuodongItem, Double>>()
            data.forEach {
                ratesMap.add(
                    it to ChineseStringMatcher(
                        it.name + it.address,
                        filterString.value
                    ).matchingRate
                )
            }
            ratesMap.sortWith { p1, p2 ->
                with (p2.second - p1.second) {
                    when {
                        this > 0 -> 1
                        this < 0 -> -1
                        else -> 0
                    }
                }
            }
            val mateched = mutableListOf<HuodongItem>()
            ratesMap.forEach {
                if (it.second > 0) mateched.add(it.first)
            }
            filtedActivities.emit(mateched)
        }
    }

    //面向ui的接口就是这种最普通的，内部再用协程实现数据请求
    fun loadStatistics() {
        viewModelScope.launch {
            NetworkRepository.getMyStatistics().data?.let {
                statistic.value = it
            }
        }
    }

    /**
     * 当这个活动报名时有冲突的时候会弹出一个对话框询问用户是否继续
     */
    private suspend fun isContinueSignup() = withContext(Dispatchers.Main) {
        val resume = context.getString(R.string.resume)
        val cancel = context.getString(R.string.cancel)
        val result = CommonAlertDialog(
            title = context.getString(R.string.warning),
            message = "该活动时间与已选活动或课程相冲突，是否继续？"
        )
            .confirm(positiveButtonText = resume, negativeButtonText = cancel)
        return@withContext result == SuspendAlertDialog.DialogAction.Positive
    }

    /**
     * 当活动项的选中状态改变后调用
     */
    private fun onActivitySelectChanged(activity: HuodongItem, index: Int) {
        with(selectedActivities.value!!) {
            if (contains(activity.id)) remove(activity.id)
            else add(activity.id)
            selectedActivities.value = this
            selectMode.tryEmit(isNotEmpty())
        }
        recyclerAdapter.notifyItemChanged(index)
    }

    /**
     * 取消或选择所有活动
     */
    fun selectOrCancelAll(select: Boolean) {
        with(selectedActivities.value!!) {
            clear()
            if (select) {
                filtedActivities.value.forEach {
                    add(it.id)
                }
            }
            selectedActivities.value = this
            selectMode.tryEmit(isNotEmpty())
        }
        recyclerAdapter.notifyItemRangeChanged(0, recyclerAdapter.activities.size)
    }

}