package legym.fuck.logic

import android.util.Log
import androidx.lifecycle.MutableLiveData
import legym.fuck.BuildConfig
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import legym.fuck.core.export.BmobUserStore
import legym.fuck.logic.LocalUserData.hasRead
import legym.fuck.logic.LocalUserData.password
import legym.fuck.logic.LocalUserData.userId
import legym.fuck.logic.clouds.CloudsNetworkRepository
import legym.fuck.logic.clouds.model.DocInfo
import legym.fuck.logic.legym.network.NetworkRepository
import legym.fuck.logic.legym.network.model.HttpResult
import legym.fuck.logic.legym.network.model.current.GetCurrentResultBean
import legym.fuck.logic.legym.network.model.login.LoginResult
import legym.fuck.logic.legym.network.model.running.RunningLimitRequestBean
import legym.fuck.logic.legym.network.model.running.RunningLimitResultBean
import legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningResultBean
import legym.fuck.ui.login.LoginActivity


/**
 * @author ldh
 * 时间: 2022/3/17 17:24
 *  `
 */
object OnlineData {

    /**
     * 当前的用户
     */
    var userData = MutableStateFlow<LoginResult?>(null)

    /**
     * 有的账号可能获取不到跑步的限制
     */
    val runningLimitFlow = MutableStateFlow<RunningLimitResultBean?>(null)

    val currentData = MutableStateFlow<GetCurrentResultBean?>(null)

    val bmobUser = MutableLiveData<legym.fuck.core.model.BmobUser?>(null)

    /**
     * 是否是新用户注册
     */
    val firstRegister = MutableStateFlow(false)

    val totalRunning: MutableStateFlow<TotalRunningResultBean?> = MutableStateFlow(null)

    /**
     * 文档列表
     */
    val docInfoList = MutableStateFlow(listOf<DocInfo>())

    /**
     * 未读文档
     */
    val unreadDocList = MutableStateFlow(mutableListOf<DocInfo>())


    init {
        CoroutineScope(Dispatchers.IO).apply {
            //更新未读文档信息
            launch {
                docInfoList.collect { docs ->
                    val unreadDocs = mutableListOf<DocInfo>()
                    unreadDocs.clear()
                    docs.forEach { doc ->
                        if (!doc.hasRead) unreadDocs.add(doc)
                    }
                    unreadDocList.emit(unreadDocs)
                }
            }
        }
    }

    /**
     * 获取当前登录的用户，若当前用户为null，则重新打开登录界面，否则直接调用[success]。
     */
    fun getUserDataOrRelogin(success: (LoginResult) -> Unit) {
        userData.value?.let {
            success(it)
        } ?: LoginActivity.startAndClear()
    }

    /**
     * 同步的方式获取当前用户
     *
     * 如果当前用户不为空则直接返回
     *
     * 如果当前用户为空，则再登录一次，登录成功则返回新的结果，登录失败则抛异常
     */
    suspend fun getUserDataAsync(): LoginResult = userData.value ?: asyncLogin().let { result ->
        result.data ?: let { throw java.lang.Exception("以重新登录的方式获取当前用户，重新登录失败${result.message}") }
    }

    suspend fun asyncLogin() = withContext(Dispatchers.IO) {
        if (userId == null || password == null || userId!!.isEmpty() || password!!.isEmpty()) return@withContext HttpResult(
            1000,
            null,
            "账号或密码为null"
        )
        val result = NetworkRepository.login(userId, password)
        result.data?.let { loginResult ->
            userData.emit(loginResult)
            //登录成功后要进行俩两个任务：同步Bmob数据，还要请求乐健的信息
//            val jobBmob = async {
//                asyncBmobData(userId!!, loginResult)
//            }
//            val jobLegym = async {
//                loadCurrentData()
//                currentData.value?.let { loadRunningLimitData(it) }
//            }
//            awaitAll(jobBmob, jobLegym)
        }
        result
    }


    /**
     * 重新加载一次当前用户状态的数据
     *
     * 若是第一次加载则会新生成一个Flow对象
     */
    suspend fun loadCurrentData() = withContext(Dispatchers.IO) {
        NetworkRepository.getCurrentSemesterId().apply {
            data?.let { currentResultBean ->
                currentData.emit(currentResultBean)
            }
        }
    }

    /**
     * 重新加载一次跑步限制的数据
     *
     * 若是第一次加载则会新生成一个Flow对象
     */
    suspend fun loadRunningLimitData(currentResultBean: GetCurrentResultBean) =
        withContext(Dispatchers.IO) {
            NetworkRepository.getRunningLimit(RunningLimitRequestBean(currentResultBean.id)).apply {
                data?.let { result ->
                    runningLimitFlow.emit(result)
                }
            }
        }

    suspend fun loadDocInfo() = withContext(Dispatchers.IO) {
        CloudsNetworkRepository.getDocs()?.let { total ->
            val effect = mutableListOf<DocInfo>()
            total.forEach {
                if (!it.debug || BuildConfig.DEBUG) {
                    effect.add(it)
                }
            }
            docInfoList.emit(effect)
            effect
        }
    }

    init {
        CoroutineScope(Dispatchers.IO).apply {
            launch {
                userData.collectLatest {
                    it?.let {
                        loadCurrentData()
                    }
                }
            }
            launch {
                userData.collectLatest {
                    it?.let { user ->

                    }
                }
            }
            launch {
                currentData.collectLatest {
                    it?.let {
                        loadRunningLimitData(it)
                    }
                }
            }
        }

    }

}
