package legym.fuck.config

import android.app.Application
import android.util.Log
import com.pgyersdk.Pgy
import com.tencent.mmkv.MMKV
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import legym.fuck.logic.clouds.CloudsNetworkRepository


/**
 * @author ldh
 * 时间: 2022/3/16 21:43
 *
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initConfig()
        registerActivityLifecycleCallbacks(AppActivityLifecycleCallback)
    }


    private fun initConfig() {
        initOnlineData()
        loadStopInfo()

        MMKV.initialize(this)
        Pgy.init(this, "7bc05ec8807ad76daa1a3efc3ab14cb5")
    }

}

/**
 * 加载停用信息
 */
fun loadStopInfo() {
    CoroutineScope(Dispatchers.IO).launch {
        CloudsNetworkRepository.getStopConfig()?.let {
            AppConfig.stopInfo.postValue(it)
        }
    }
}

/**
 * 同步在线配置
 */
fun initOnlineData() {
    CoroutineScope(Dispatchers.IO).launch {
        CloudsNetworkRepository.getAppOLConfig()?.let {
            AppConfig.onLineConfig.emit(it)
        }
    }
}
