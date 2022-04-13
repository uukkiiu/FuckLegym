package legym.fuck.logic.legym.network.service

import legym.fuck.logic.legym.network.LegymHeaderMap
import legym.fuck.logic.legym.network.model.HttpResult
import legym.fuck.logic.legym.network.model.current.GetCurrentResultBean
import retrofit2.http.GET
import retrofit2.http.HeaderMap


/**
 * @author ldh
 * 时间: 2022/3/18 17:13
 *
 */
interface EducationService {

    @GET("/education/semester/getCurrent")
    suspend fun getCurrent(@HeaderMap headerMap: LegymHeaderMap): HttpResult<GetCurrentResultBean?>

}