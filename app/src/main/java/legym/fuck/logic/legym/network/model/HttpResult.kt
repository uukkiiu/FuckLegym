package legym.fuck.logic.legym.network.model

import com.liangguo.androidkit.app.ToastUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


/**
 * @author ldh
 * 时间: 2022/3/18 12:56
 *
 *
 * 乐健接口返回的通用结果
 */
data class HttpResult<T>(
    val code: Int,
    val `data`: T?,
    val message: String?
)

suspend fun HttpResult<*>.toastError() = withContext(Dispatchers.Main) {
    val msg = StringBuilder("网络请求异常")
        .append(" ")
        .append(code)
    message?.let {
        msg.append("  ")
            .append("原因：")
            .append(it)
    }
    ToastUtil.error(msg)
}

val HttpResult<*>.errorString: String
    get() {
        val msg = StringBuilder()
            .append(code)
        message?.let {
            msg.append("  ")
                .append("原因：")
                .append(it)
        }
        return msg.toString()
    }
