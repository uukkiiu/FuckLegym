package legym.fuck.utils

import android.util.Log


/**
 * @author ldh
 * 时间: 2022/4/2 10:56
 *
 */

/**
 * 安全的转换成某种类型
 */
inline fun <reified T> Any?.toTypeOrNull(): T? {
    return if (this is T) this
    else null
}
