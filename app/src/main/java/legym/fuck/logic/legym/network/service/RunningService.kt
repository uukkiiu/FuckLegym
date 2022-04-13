package legym.fuck.logic.legym.network.service

import legym.fuck.logic.legym.network.LegymHeaderMap
import legym.fuck.logic.legym.network.model.HttpResult
import legym.fuck.logic.legym.network.model.running.RunningLimitRequestBean
import legym.fuck.logic.legym.network.model.running.RunningLimitResultBean
import legym.fuck.logic.legym.network.model.running.UploadRunningDetailsRequestBean
import legym.fuck.logic.legym.network.model.running.runningHistory.RunningHistoryRequestBean
import legym.fuck.logic.legym.network.model.running.runningHistory.RunningHistoryResultBean
import legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningRequestBean
import legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningResultBean
import retrofit2.http.Body
import retrofit2.http.HeaderMap
import retrofit2.http.POST


/**
 * @author ldh
 * 时间: 2022/3/18 15:32
 *
 */
interface RunningService {

    @POST("running/app/uploadRunningDetails")
    suspend fun uploadRunningDetails(@HeaderMap headerMap: LegymHeaderMap, @Body requestBean: UploadRunningDetailsRequestBean): HttpResult<String?>

    @POST("running/app/getRunningLimit")
    suspend fun getRunningLimit(@HeaderMap headerMap: LegymHeaderMap, @Body requestBean: RunningLimitRequestBean): HttpResult<RunningLimitResultBean?>

    @POST("/running/app/getTotalRunning")
    suspend fun getTotalRunning(@HeaderMap headerMap: LegymHeaderMap, @Body requestBean: TotalRunningRequestBean): HttpResult<TotalRunningResultBean?>

    @POST("/running/app/getDetails")
    suspend fun getDetails(@HeaderMap headerMap: LegymHeaderMap, @Body requestBean: RunningHistoryRequestBean): HttpResult<RunningHistoryResultBean?>

}