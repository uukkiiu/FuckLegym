package legym.fuck.config

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import androidx.lifecycle.MutableLiveData
import com.liangguo.easyingcontext.EasyingContext.context
import com.tencent.mmkv.MMKV
import kotlinx.coroutines.flow.MutableStateFlow
import legym.fuck.logic.clouds.model.AppOLConfig
import legym.fuck.logic.clouds.model.StopConfig
import java.text.SimpleDateFormat


/**
 * @author ldh
 * 时间: 2022/3/18 15:37
 *
 */
object AppConfig {

    /**
     * 允许提前报名
     */
    val ENABLE_SIGN_ADVANCE = legym.fuck.BuildConfig.DEBUG

    /**
     * 乐健体育的版本号
     */
    const val LEGYM_APP_VERSION = "3.1.0"

    /**
     * App在线数据配置
     */
    var onLineConfig = MutableStateFlow(AppOLConfig())

    @SuppressLint("SimpleDateFormat")
    val legymDateStringFormatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

    /**
     * 默认每日里程上限，当获取runningLimit有问题的时候就用这个
     */
    const val DEFAULT_DAILY_RUNNING_LIMIT = 6.0

    /**
     * 默认每周里程上限，当获取runningLimit有问题的时候就用这个
     */
    const val DEFAULT_WEEKLY_RUNNING_LIMIT = 30.0

    /**
     * 应用版本号
     */
    val versionCode: Int
        get() {
            var versionCode = 10
            try {
                versionCode =
                    context.packageManager.getPackageInfo(context.packageName, 0).versionCode
            } catch (e: PackageManager.NameNotFoundException) {
                e.printStackTrace()
            }
            return versionCode
        }


    /**
     * 若为true，则上传跑步成绩时不限制有效里程
     */
    var noRunningLimit = true

    /**
     * 保留两位小数
     */
    const val FLOAT_FORMAT_DOUBLE = "%.2f"

    /**
     * 停用信息
     */
    val stopInfo = MutableLiveData<StopConfig?>()

}

val defaultMMKV by lazy { MMKV.defaultMMKV() }
