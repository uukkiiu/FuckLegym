package legym.fuck.logic.legym.network.model.login

import kotlinx.serialization.Serializable

/**
 * 登录请求的
 */
@Serializable
data class LoginRequestBean(
    /**
     * 未知，一般都是1
     */
    val entrance: Int = 1,
    val password: String?,
    val userName: String?
)