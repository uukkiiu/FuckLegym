package legym.fuck.logic.legym.network.service

import legym.fuck.logic.legym.network.LegymHeaderMap
import legym.fuck.logic.legym.network.model.HttpResult
import legym.fuck.logic.legym.network.model.huodong.*
import legym.fuck.logic.legym.network.model.huodong.signup.SignUpRequestBean
import legym.fuck.logic.legym.network.model.huodong.signup.SignUpResultBean
import retrofit2.http.*


/**
 * @author ldh
 * 时间: 2022/3/27 18:03
 *
 */
interface ActivityService {

    @POST("/education/app/activity/my/getActivityList")
    suspend fun getMyActivities(
        @HeaderMap headerMap: LegymHeaderMap,
        @Body requestBean: MyActivityRequestBean
    ): HttpResult<ActivitiesResultBean?>


    @POST("/education/app/activity/getActivityList")
    suspend fun getActivities(
        @HeaderMap headerMap: LegymHeaderMap,
        @Body requestBean: AllActivitiesRequestBean
    ): HttpResult<ActivitiesResultBean?>

    @POST("/education/campus/queryAll")
    suspend fun getCampus(
        @HeaderMap headerMap: LegymHeaderMap
    ): HttpResult<List<CampusItem>?>


    @POST("/education/app/activity/signUp")
    suspend fun signUpActivity(
        @HeaderMap headerMap: LegymHeaderMap,
        @Body requestBean: SignUpRequestBean
    ): HttpResult<SignUpResultBean?>

    @POST("/education/app/activity/cancelSignUp")
    suspend fun cancelSignUpActivity(
        @HeaderMap headerMap: LegymHeaderMap,
        @Body requestBean: SignUpRequestBean
    ): HttpResult<Boolean?>


    @PUT("/education/activity/app/attainability/sign")
    suspend fun signInActivity(
        @HeaderMap headerMap: LegymHeaderMap,
        @Body requestBean: legym.fuck.logic.legym.network.model.huodong.signin.ActivitySignInRequestBean
    ): HttpResult<Any?>

    @GET("/education/app/activity/signUpStatistics")
    suspend fun getMyStatistics(
        @HeaderMap headerMap: LegymHeaderMap
    ): HttpResult<MyStatisticsResultBean?>

    @GET("/education/app/activity/checkConflict")
    suspend fun isActivityConflict(
        @HeaderMap headerMap: Map<String, String>,
        @Query("activityId") activityId: String
    ): HttpResult<Boolean?>


}