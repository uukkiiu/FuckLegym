package legym.fuck.logic.legym.network.service

import legym.fuck.logic.legym.network.LegymHeaderMap
import legym.fuck.logic.legym.network.model.HttpResult
import legym.fuck.logic.legym.network.model.course.CourseDetailResultBean
import legym.fuck.logic.legym.network.model.course.CourseListResultBean
import legym.fuck.logic.legym.network.model.course.SignCourseRequestBean
import legym.fuck.logic.legym.network.model.course.info.CourseInfoResultBean
import retrofit2.http.*


/**
 * @Name CourseService
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月29日 18:36
 **/
interface CourseService {

    @GET("/education/course/app/forStudent/list")
    suspend fun getCourseList(
        @HeaderMap headerMap: LegymHeaderMap
    ): HttpResult<List<CourseListResultBean>?>

    @PUT("/education/course/app/forStudent/sign")
    suspend fun signForCourse(
        @HeaderMap headerMap: LegymHeaderMap,
        @Body requestBean: SignCourseRequestBean
    ): HttpResult<Any?>

    @GET("/education/course/app/forStudent/attainability/info")
    suspend fun getCourseInfo(
        @HeaderMap headerMap: LegymHeaderMap,
        @Query("courseId") courseId: String
    ): HttpResult<CourseInfoResultBean?>

    @GET("/education/course/app/forStudent/info")
    suspend fun getCourseDetail(
        @HeaderMap headerMap: LegymHeaderMap,
        @Query("courseId") courseId: String
    ): HttpResult<CourseDetailResultBean?>
}