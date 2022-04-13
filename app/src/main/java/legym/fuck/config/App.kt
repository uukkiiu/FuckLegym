package legym.fuck.config

import android.app.Application
import android.util.Log
import androidx.lifecycle.ProcessLifecycleOwner
import cn.bmob.v3.Bmob
import legym.fuck.BuildConfig
import com.liangguo.security.AppSecurityConfig.getBmobAppKey
import com.liangguo.security.AppSecurityConfig.getBuglyId
import com.liangguo.security.SecurityUtil
import com.pgyersdk.crash.PgyCrashManager
import com.tencent.bugly.Bugly
import com.tencent.bugly.crashreport.CrashReport
import com.tencent.mmkv.MMKV
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import legym.fuck.logic.clouds.CloudsNetworkRepository
import legym.fuck.utils.assertNoProxy
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
        assertNoProxy()
        initOnlineData()
        loadStopInfo()
        Bugly.init(this, getBuglyId(), BuildConfig.DEBUG)
        CrashReport.initCrashReport(this, getBuglyId(), BuildConfig.DEBUG)

        PgyCrashManager.register(this)

        MMKV.initialize(this)

        Bmob.initialize(this, getBmobAppKey())

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
    val crypt = SecurityUtil.generateCryptSign(time, "我就是乐健账号哈哈哈")
    Log.e("加密测试", "密文$crypt")
}