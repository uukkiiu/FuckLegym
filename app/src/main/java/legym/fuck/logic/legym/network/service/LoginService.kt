package legym.fuck.logic.legym.network.service

import legym.fuck.logic.legym.network.model.login.LoginRequestBean
import legym.fuck.logic.legym.network.model.login.LoginResult
import legym.fuck.logic.legym.network.model.HttpResult
import retrofit2.http.Body
import retrofit2.http.POST


/**
 * @author ldh
 * 时间: 2022/3/18 12:54
 *
 */
interface LoginService {

    /**
     * 登录
     */
    @POST("/authorization/user/manage/login")
    suspend fun login(@Body requestBean: LoginRequestBean): HttpResult<LoginResult?>

}