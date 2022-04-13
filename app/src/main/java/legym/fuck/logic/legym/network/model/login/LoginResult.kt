package legym.fuck.logic.legym.network.model.login

import kotlinx.serialization.Serializable

/**
 * 登录成功后返回的用户信息
 */
@Serializable
data class LoginResult(
    val accessToken: String,
    val accessTokenExpires: Long?,
    val accountNumber: String?,
    val authorities: List<String>,
    val avatar: String?,
    val birthDay: Long?,
    val campusId: String?,
    val campusName: String?,
    val faceId: String?,
    val gender: Int?,
    val height: Int?,
    val id: String,
    val identity: String?,
    val mobile: String?,
    val nickName: String?,
    val organizationId: String,
    val organizationName: String,
    val organizationUserNumber: String,
    val organizationVerified: Int,
    val realName: String,
    val refreshToken: String,
    val schoolId: String?,
    val schoolName: String,
    val semesterId: String?,
    val tokenType: String?,
    val userId: String?,
    val uuasId: String?,
    val weight: Int?,
    val year: Int
)

