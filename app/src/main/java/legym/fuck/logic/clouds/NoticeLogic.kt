package legym.fuck.logic.clouds

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context.CLIPBOARD_SERVICE
import android.content.Intent
import android.net.Uri
import legym.fuck.R
import com.liangguo.androidkit.app.ToastUtil
import com.liangguo.androidkit.commons.backToHome
import com.liangguo.easyingcontext.EasyingContext.context
import com.liangguo.easyingcontext.EasyingContext.currentActivity
import legym.fuck.logic.clouds.model.Button
import legym.fuck.logic.LocalUserData
import legym.fuck.ui.login.LoginActivity


/**
 * @author ldh
 * 时间: 2022/3/20 11:41
 *
 */
object NoticeLogic {

    /**
     * 通知的按钮的点击逻辑统一处理事件
     */
    fun onNoticeButtonClick(button: Button) {
        button.url?.let { url ->
            when (url) {
                "finish" -> currentActivity?.finish()
                "backToHome" -> backToHome()
                "copyClipboard" -> copyClipboard(button.extra)
                "signOut" -> {
                    LocalUserData.password = ""
                    LoginActivity.startAndClear()
                }
                else -> {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    button.intentFlags.forEach {
                        intent.addFlags(it)
                    }
                    (currentActivity ?: context).startActivity(intent)
                }
            }
        }
    }

    /**
     * 复制文字到剪贴板
     */
    fun copyClipboard(content: String?, showText: Boolean = true) {
        content?.let {
            currentActivity?.let {
                val myClipboard: ClipboardManager =
                    it.getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
                val primaryClip = ClipData.newPlainText("text", content)
                myClipboard.setPrimaryClip(primaryClip)
                if (showText) ToastUtil.success(context.getString(R.string.has_copy_to_clipborad))
            }
        }
    }


}