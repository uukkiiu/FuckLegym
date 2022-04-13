package legym.fuck.ui.huodong.model

import kotlinx.coroutines.flow.MutableStateFlow
import legym.fuck.config.defaultMMKV


/**
 * @author ldh
 * 时间: 2022/3/27 17:13
 *
 *
 * @param selectedIndex 当前选中的第几项
 * @param options 有哪些选项
 * @param title 标题
 * @param limitLessAble 是否可以有“不限”的查询
 */
data class QueryLimit(
    var selectedIndex: MutableStateFlow<Int>,
    val options: MutableList<String>,
    val title: String,
    val limitLessAble: Boolean
)

private const val KEY_FILTER_PREFERENCE = "KEY_FILTER_PREFERENCE"

/**
 * 储存在本地的选择偏好
 */
var QueryLimit.localSelectedIndex: Int
    get() = defaultMMKV.getInt(localPreferenceKey, 0)
    set(value) {
        defaultMMKV.putInt(localPreferenceKey, value)
    }

/**
 * 储存在本地的选择偏好的key，基于[com.tencent.mmkv.MMKV]
 */
val QueryLimit.localPreferenceKey: String
    get() = "$KEY_FILTER_PREFERENCE - $title"