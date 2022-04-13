package legym.fuck.ui.signin

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import com.angcyo.dsladapter.DslAdapter
import com.liangguo.androidkit.app.ToastUtil
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import legym.fuck.logic.OnlineData
import legym.fuck.logic.legym.network.NetworkRepository
import legym.fuck.logic.legym.network.model.signin.ActivityListRequestBean
import legym.fuck.logic.legym.network.model.signin.signin.ActivitySignInRequestBean
import legym.fuck.logic.legym.network.model.signin.signin.ItemsItem
import legym.fuck.logic.legym.network.model.signin.signup.ActivitySignUpRequestBean
import legym.fuck.ui.signin.model.ActivityItem
import java.lang.Exception


/**
 * @ClassName SignUpViewModel
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月20日 22:42
 **/
class SignInViewModel : ViewModel() {

    /**
     *
     */
    val autoSignIn = MutableLiveData(false)

    /**
     * 当前可显示的活动
     */
    val currentActivities = MutableStateFlow(listOf<ItemsItem?>())

    /**
     * 选中的活动
     */
    val selectActivities = MutableLiveData(mutableMapOf<String, String>())

    /**
     * 总活动数
     */
    val total = MutableLiveData(0)

    /**
     * 总页数
     */
    val pageTotalNum = MutableLiveData(0)

    /**
     * 当前页数
     */
    val pageNum = MutableLiveData(1)

    /**
     * 错误原因
     */
    var errorMap = MutableLiveData(mutableListOf<String>())

    val activityAdapter = DslAdapter()

    init {
        loadActivities()

        viewModelScope.apply {
            launch {
                currentActivities.collect {
                    activityAdapter.changeDataItems { adapterItems ->
                        adapterItems.clear()
                        it?.forEach {
                            adapterItems.add(ActivityItem(it!!, this@SignInViewModel))
                        }
                    }
                }
            }
        }
    }

    /**
     * 加载活动
     * @param page 加载页数
     */
    fun loadActivities(page: Int = 1) {
        viewModelScope.launch {
            NetworkRepository.getActivityList(
                ActivityListRequestBean(page = page)
            ).apply {
                data?.let {
                    currentActivities.emit(it.items!!)
                    total.postValue(it.total)
                }
            }
        }
    }

    /**
     * 对选中活动进行报名
     */
    fun signUpWithActivities() {
        viewModelScope.launch {
            var count = 0
            var failCount = 0
            val errorMapTmp = mutableListOf<String>()

            selectActivities.value?.forEach { it ->
                NetworkRepository.signUpActivity(
                    ActivitySignUpRequestBean(
                        activityId = it.key
                    )
                ).apply {
                    data.let { data ->
                        if (data.success) count++
                        else {
                            errorMapTmp.add("${it.value} : ${this.data?.reason}")
                            failCount++
                        }
                    }
                }
            }

            errorMap.postValue(errorMapTmp)

            if (failCount == 0 && count > 0) {
                ToastUtil.success("$count 个活动全部报名成功")
            } else if (count > failCount) {
                ToastUtil.info("$count 个活动报名成功， $failCount 个活动报名失败")
            } else if (count <= failCount && count != 0) {
                ToastUtil.warning("$count 个活动报名成功， $failCount 个活动报名失败")
            } else {
                ToastUtil.error("$failCount 个活动全部报名失败")
            }
            Log.d("signin1", "signUpWithActivities: ${errorMap.value}")

        }
    }

    /**
     * 对选中活动进行签到
     */
    fun signInWithActivities() {
        viewModelScope.launch {
            var count = 0
            var failCount = 0
            val errorMapTmp = mutableListOf<String>()

            selectActivities.value?.forEach { it ->
                try {
                    NetworkRepository.signInActivity(
                        ActivitySignInRequestBean(
                            activityId = it.key,
                            userId = OnlineData.getUserDataAsync().id
                        )
                    ).apply {
                        this.message?.let { message ->
                            var resData:JSONObject? = JSONObject()

                            try {
                                resData = JSON.parseObject(message)
                            }catch (e: Exception){
                                resData?.put("message", "乐健服务器错误，无法处理数据！")
                            }

                            val resMsg: String = resData!!.getString("message")

                            if (message.contains("成功")) count++
                            else {
                                errorMapTmp.add("${it.value} : $resMsg")
                                failCount++
                            }
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                    failCount++
                }
            }

            errorMap.postValue(errorMapTmp)

            if (failCount == 0 && count > 0) {
                ToastUtil.success("$count 个活动全部签到成功")
            } else if (count > failCount) {
                ToastUtil.info("$count 个活动签到成功， $failCount 个活动签到失败")
            } else if (count <= failCount && count != 0) {
                ToastUtil.warning("$count 个活动签到成功， $failCount 个活动签到失败")
            } else {
                ToastUtil.error("$failCount 个活动全部签到失败")
            }
            Log.d("signin1", "signUpWithActivities: ${errorMap.value}")

        }
    }
}