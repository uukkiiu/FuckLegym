package legym.fuck.config

import android.app.Application
import android.util.Log
import androidx.lifecycle.ProcessLifecycleOwner
import cn.bmob.v3.Bmob
import legym.fuck.BuildConfig
import com.pgyersdk.crash.PgyCrashManager
import com.tencent.bugly.Bugly
import com.tencent.bugly.crashreport.CrashReport
import com.tencent.mmkv.MMKV
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import legym.fuck.logic.clouds.CloudsNetworkRepository
import legym.fuck.widget.exceptions.MaliciousUserException


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

private fun test2() {
    val time = System.currentTimeMillis()
    Log.e("加密测试", "当前时间$time")
}