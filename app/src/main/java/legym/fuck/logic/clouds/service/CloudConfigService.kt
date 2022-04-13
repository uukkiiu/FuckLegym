package legym.fuck.logic.clouds.service

import legym.fuck.logic.clouds.model.*
import retrofit2.http.GET


/**
 * @author ldh
 * 时间: 2022/3/19 8:52
 *
 */
interface CloudConfigService {

    @GET("config/stop.json")
    suspend fun getStopConfig(): StopConfig

    @GET("config/notice.json")
    suspend fun getNotices(): List<Notice>

    @GET("config/log.json")
    suspend fun getUploadLogCinfig(): UploadLogBean

    @GET("config/appconfig.json")
    suspend fun getAppOLConfig(): AppOLConfig

    @GET("config/docs.json")
    suspend fun getDocs(): List<DocInfo>


    @GET("docs/maps-new.json")
    suspend fun getMaps(): List<RunningMap>


}