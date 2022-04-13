package legym.fuck.config

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.view.WindowManager
import legym.fuck.BuildConfig

/**
 * @author ldh
 * 时间: 2022/4/7 15:29
 *
 */
object AppActivityLifecycleCallback: Application.ActivityLifecycleCallbacks {
    override fun onActivityCreated(p0: Activity, p1: Bundle?) {
        if (!BuildConfig.DEBUG) {
            //禁止应用内截屏
            p0.window.addFlags(WindowManager.LayoutParams.FLAG_SECURE)
        }
    }

    override fun onActivityStarted(p0: Activity) {
    }

    override fun onActivityResumed(p0: Activity) {
    }

    override fun onActivityPaused(p0: Activity) {
    }

    override fun onActivityStopped(p0: Activity) {
    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
    }

    override fun onActivityDestroyed(p0: Activity) {
    }


}