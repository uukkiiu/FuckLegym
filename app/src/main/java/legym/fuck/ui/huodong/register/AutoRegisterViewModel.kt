package legym.fuck.ui.huodong.register

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import legym.fuck.logic.legym.network.NetworkRepository
import legym.fuck.logic.legym.network.model.HttpResult
import legym.fuck.logic.legym.network.model.huodong.HuodongItem
import legym.fuck.logic.legym.network.model.huodong.signup.SignUpRequestBean
import legym.fuck.logic.legym.network.model.huodong.signup.SignUpResultBean
import java.util.concurrent.atomic.AtomicInteger


/**
 * @author ldh
 * 时间: 2022/3/29 14:58
 *
 */
class AutoRegisterViewModel: ViewModel() {

    /**
     * 选中的并且可以报名的活动列表
     */
    var validActivities = mutableListOf<HuodongItem>()

    /**
     * 报名成功的活动
     */
    val successTasks = mutableSetOf<HuodongItem>()

    /**
     * 报名失败的活动
     * 用活动去映射原因
     */
    val failedTasks = mutableMapOf<HuodongItem, String>()

    /**
     * 网络异常的活动
     */
    val exceptionTasks = mutableMapOf<HuodongItem, HttpResult<out Any?>>()

    /**
     * 进度 0 ~ 100 整数
     */
    val progress = MutableLiveData(AtomicInteger(0))

    /**
     * 总活动数
     */
    val maxActivityNum = MutableStateFlow(0)

    val finished = MutableLiveData(false)

    /**
     * 一键报名所有
     */
    fun doRegister() {
        viewModelScope.launch(Dispatchers.IO) {
            maxActivityNum.emit(validActivities.size)
            val tasks = mutableListOf<Deferred<HttpResult<SignUpResultBean?>>>()
            validActivities.forEach { activity ->
                tasks.add(async {
                    NetworkRepository.signUpActivity(SignUpRequestBean(activity.id)).apply {
                        data?.let {
                            if(it.success) {
                                successTasks.add(activity)
                            }
                            else {
                                failedTasks[activity] = it.reason ?: ""
                            }
                        } ?: let {
                            exceptionTasks[activity] = it
                        }
                        progress.value!!.addAndGet(1)
                        withContext(Dispatchers.Main) { progress.value = progress.value!! }
                    }
                })
            }
            tasks.awaitAll()
            finished.postValue(true)
        }
    }

    /**
     * 一键取消报名所有
     */
    fun doUnregister() {
        viewModelScope.launch(Dispatchers.IO) {
            maxActivityNum.emit(validActivities.size)
            val tasks = mutableListOf<Deferred<HttpResult<out Any?>>>()
            validActivities.forEach { activity ->
                tasks.add(async {
                    NetworkRepository.cancelSignUpActivity(SignUpRequestBean(activity.id)).apply {
                        data?.let {
                            if(it) {
                                successTasks.add(activity)
                            } else {
                                failedTasks[activity] = message.toString()
                            }
                        } ?: let {
                            exceptionTasks[activity] = it
                        }
                        progress.value!!.addAndGet(1)
                        withContext(Dispatchers.Main) { progress.value = progress.value!! }
                    }
                })
            }
            tasks.awaitAll()
            finished.postValue(true)
        }
    }
}