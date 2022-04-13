package legym.fuck.utils

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService
import legym.fuck.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.liangguo.androidkit.color.ColorUtil
import com.liangguo.androidkit.color.resolveColor
import com.liangguo.easyingcontext.EasyingContext
import com.liangguo.easyingcontext.EasyingContext.currentActivity
import legym.fuck.logic.OnlineData
import legym.fuck.widget.exceptions.MaliciousUserException


/**
 * @author ldh
 * 时间: 2022/3/23 22:58
 *
 */
object AppUtils {

    fun getVersionName(context: Context = EasyingContext.context) =
        try {
            context.packageManager.getPackageInfo(context.packageName, 0).versionName
        } catch (e: Exception) {
            null
        }


    fun copy2ClipBoard(
        content: String,
        label: String? = null,
        context: Context = EasyingContext.context
    ) {
        kotlin.runCatching {
            //获取剪贴板管理器
            val cm = getSystemService(context, ClipboardManager::class.java)
            // 创建普通字符型ClipData
            val mClipData = ClipData.newPlainText(label ?: context.packageName, content)
            // 将ClipData内容放到系统剪贴板里。
            cm!!.setPrimaryClip(mClipData)
        }
    }

}


/**
 * Material主题下是不是暗主题
 */
val Context.isMaterialDarkTheme: Boolean
    get() = !ColorUtil.isColorLight(resolveColor(R.attr.colorSurface))

/**
 * 构造一个简单的对话框弹窗
 */
fun CommonAlertDialog(
    title: String? = null,
    message: String? = null,
    activity: Activity = currentActivity ?: throw IllegalArgumentException("需要传入Activity")
) = MaterialAlertDialogBuilder(activity, R.style.MaterialAlertDialog_Material3)
    .setTitle(title)
    .setMessage(message)
    .setPositiveButton(R.string.confirm, null)

/**
 * 隐藏软键盘
 * @param activity
 */
fun hideSoftInputFromWindow(
    activity: Activity = currentActivity ?: throw IllegalArgumentException("需要传入Activity")
) {
    val inputMethodManager = activity.getSystemService(INPUT_METHOD_SERVICE)
    if (inputMethodManager is InputMethodManager) {
        inputMethodManager.hideSoftInputFromWindow(
            activity.currentFocus!!.windowToken, InputMethodManager.HIDE_NOT_ALWAYS
        )
    }
}