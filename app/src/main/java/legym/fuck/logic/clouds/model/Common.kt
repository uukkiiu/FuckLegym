package legym.fuck.logic.clouds.model


/**
 * @author ldh
 * 时间: 2022/3/19 10:40
 *
 */
/**
 * 对话框上的按钮以及对应的url
 */
data class Button(
    val text: String,
    val intentFlags: List<Int>,
    val url: String?,
    val extra: String?,
)