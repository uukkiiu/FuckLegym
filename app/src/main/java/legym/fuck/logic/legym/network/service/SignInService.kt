package legym.fuck.logic.legym.network.service

import legym.fuck.logic.legym.network.LegymHeaderMap
import legym.fuck.logic.legym.network.model.HttpResult
import legym.fuck.logic.legym.network.model.signin.AcitivityListResultBean
import legym.fuck.logic.legym.network.model.signin.ActivityListRequestBean
import legym.fuck.logic.legym.network.model.signin.signin.ActivitySignInRequestBean
import legym.fuck.logic.legym.network.model.signin.signin.ActivitySignInResultBean
import legym.fuck.logic.legym.network.model.signin.signup.ActivitySignUpRequestBean
import legym.fuck.logic.legym.network.model.signin.signup.ActivitySignUpResultBean
import retrofit2.http.Body
import retrofit2.http.HeaderMap
import retrofit2.http.POST
import retrofit2.http.PUT


/**
 * @Name SignInService
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月21日 15:20
 **/
@Deprecated("已启用，以后删掉", replaceWith = ReplaceWith("改用ActivityService"))
interface SignInService {

    @POST("/education/app/activity/getActivityList")
    suspend fun getActivityList(
        @HeaderMap headerMap: LegymHeaderMap,
        @Body requestBean: ActivityListRequestBean
    ): HttpResult<AcitivityListResultBean?>

    @PUT("/education/activity/app/attainability/sign")
    suspend fun signIn(
        @HeaderMap headerMap: LegymHeaderMap,
        @Body requestBean: ActivitySignInRequestBean
    ): HttpResult<ActivitySignInResultBean?>

    @POST("/education/app/activity/signUp")
    suspend fun signUp(
        @HeaderMap headerMap: LegymHeaderMap,
        @Body requestBean: ActivitySignUpRequestBean
    ): ActivitySignUpResultBean
}