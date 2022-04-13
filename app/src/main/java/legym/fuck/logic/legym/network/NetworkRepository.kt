package legym.fuck.logic.legym.network

import android.util.Log
import fucklegym.top.entropy.NetworkSupport
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import legym.fuck.config.AppConfig
import legym.fuck.logic.OnlineData
import legym.fuck.logic.OnlineData.getUserDataAsync
import legym.fuck.logic.legym.network.model.HttpResult
import legym.fuck.logic.legym.network.model.course.SignCourseRequestBean
import legym.fuck.logic.legym.network.model.huodong.AllActivitiesRequestBean
import legym.fuck.logic.legym.network.model.huodong.MyActivityRequestBean
import legym.fuck.logic.legym.network.model.huodong.signup.SignUpRequestBean
import legym.fuck.logic.legym.network.model.login.LoginRequestBean
import legym.fuck.logic.legym.network.model.running.*
import legym.fuck.logic.legym.network.model.running.runningHistory.RunningHistoryRequestBean
import legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningRequestBean
import legym.fuck.logic.legym.network.model.signin.ActivityListRequestBean
import legym.fuck.logic.legym.network.model.signin.signin.ActivitySignInRequestBean
import legym.fuck.logic.legym.network.model.signin.signup.ActivitySignUpRequestBean
import legym.fuck.logic.legym.network.service.*
import legym.fuck.ui.run.logic.RunningType
import java.io.IOException
import java.util.*
import kotlin.random.Random


/**
 * 乐健请求头的Map类型
 */
typealias LegymHeaderMap = MutableMap<String, String>

/**
 * 请求头
 */
suspend fun getHeaderMap(): LegymHeaderMap = mutableMapOf(
    Pair("Content-type", "application/json"),
    Pair("Authorization", "Bearer " + getUserDataAsync().accessToken)
)


/**
 * @author ldh
 * 时间: 2022/3/17 17:32
 *
 */
object NetworkRepository {

    private val loginService by lazy { ServiceCreator.create<LoginService>() }
    private val runningService by lazy { ServiceCreator.create<RunningService>() }
    private val educationService by lazy { ServiceCreator.create<EducationService>() }

    @Deprecated("SignInService已弃用")
    private val signInService by lazy { ServiceCreator.create<SignInService>() }

    private val activityService by lazy { ServiceCreator.create<ActivityService>() }
    private val courseService by lazy { ServiceCreator.create<CourseService>() }

    /**
     * 进行登录
     */
    suspend fun login(userId: String?, password: String?) = catchErrorAndUpload("登录") {
        loginService.login(LoginRequestBean(password = password, userName = userId))
    }

    /**
     * 上传跑步数据
     */
    suspend fun uploadRunningDetail(requestBean: UploadRunningDetailsRequestBean) = catchError {
        runningService.uploadRunningDetails(getHeaderMap(), requestBean)
    }

    /**
     * 用以前的旧代码上传跑步数据
     *
     * 这个函数会判断要上传的成绩是否达到限制，若超过限制，则会截取一部分有效的上传为有效成绩，然后这个试图上传的成绩会加一个随机数作为总成绩
     *
     * @param targetMileage 试图要上传的成绩
     */
    suspend fun uploadRunningDetail(
        map: String?,
        targetMileage: Float,
        limitationsGoalsSexInfoId: String?,
        type: RunningType
    ) = withContext(Dispatchers.IO) {
        var effectiveMileage = targetMileage.toDouble()

        OnlineData.runningLimitFlow.value?.let {
            if (!it.hasRule) return@let
            if (AppConfig.noRunningLimit) return@let
            //每次跑步的限制
            with(it) {
                if (effectiveMileage < effectiveMileageStartOrDefault) effectiveMileage = 0.0
                if (effectiveMileage > effectiveMileageEndOrDefault) effectiveMileage =
                    effectiveMileageEndOrDefault
            }

            val limit = with(it) {
                //用每日限制减去今日已跑，剩下的就是你现在还能跑的有效的
                listOf(
                    dailyMileageOrDefault - totalDayMileageOrDefault,
                    weeklyMileageOrDefault - totalWeekMileageOrDefault
                )
            }

            var min = limit.minOf { it }
            min = if (min < 0) 0.0 else min
            if (effectiveMileage > min) effectiveMileage = min
            //现在的情况是有效的一定是没有超过上限的，这个值为0 - 最低的一个还剩多少
        }

        var totalMileage = targetMileage.toDouble()

        if (effectiveMileage == totalMileage && Random.nextBoolean()) {
            totalMileage += Random.nextDouble(0.5)
        }

        try {
            val endTime = Date()
            //平均配速
            val randomSpeed = Random.nextDouble(5.0, 9.0)
            //总共跑步时间
            val duration = randomSpeed * totalMileage * 60 * 1000
            val startTime =
                Date((endTime.time - duration).toLong())
            val success = NetworkSupport.uploadRunningDetail(
                getUserDataAsync().accessToken,
                limitationsGoalsSexInfoId,
                OnlineData.currentData.value!!.id,
                totalMileage,
                effectiveMileage,
                startTime,
                endTime,
                map,
                type.title
            ) == NetworkSupport.UploadStatus.SUCCESS
            return@withContext UploadRunningDetailsResult(
                effectiveMileage = effectiveMileage,
                totalMileage = totalMileage,
                success = success
            )
        } catch (e: IOException) {
            Log.e("上传失败", e.toString())
            return@withContext UploadRunningDetailsResult(
                effectiveMileage = effectiveMileage,
                totalMileage = totalMileage,
                success = false
            )
        }
    }

    /**
     * 获取当前学期信息
     */
    suspend fun getCurrentSemesterId() = catchErrorAndUpload("获取当前学期信息") {
        educationService.getCurrent(getHeaderMap())
    }

    /**
     * 获取跑步的规则限制
     */
    suspend fun getRunningLimit(requestBean: RunningLimitRequestBean) =
        catchErrorAndUpload("获取跑步的规则限制") {
            runningService.getRunningLimit(getHeaderMap(), requestBean)
        }

    /**
     * 获取已经跑了多少公里了
     */
    suspend fun getTotalRunning(requestBean: TotalRunningRequestBean) = catchError {
        runningService.getTotalRunning(getHeaderMap(), requestBean)
    }

    /**
     * 获取跑步历史记录
     */
    suspend fun getRunningHistory(requestBean: RunningHistoryRequestBean) = catchError {
        runningService.getDetails(getHeaderMap(), requestBean)
    }

    /**
     * 获取我自己的活动
     */
    suspend fun getMyActivities(requestBean: MyActivityRequestBean) = catchError {
        activityService.getMyActivities(getHeaderMap(), requestBean)
    }

    /**
     * 获取我的活动统计
     */
    suspend fun getMyStatistics() = catchError {
        activityService.getMyStatistics(getHeaderMap())
    }

    /**
     * 获取学校的活动
     */
    suspend fun getActivities(requestBean: AllActivitiesRequestBean) = catchError {
        activityService.getActivities(getHeaderMap(), requestBean)
    }

    /**
     * 获取所有的校区
     */
    suspend fun getCampus() = catchError {
        activityService.getCampus(getHeaderMap())
    }

    /**
     * 活动报名
     */
    suspend fun signUpActivity(requestBean: SignUpRequestBean) = catchError {
        activityService.signUpActivity(getHeaderMap(), requestBean)
    }

    /**
     * 取消活动报名
     */
    suspend fun cancelSignUpActivity(requestBean: SignUpRequestBean) = catchError {
        activityService.cancelSignUpActivity(getHeaderMap(), requestBean)
    }

    /**
     * 判断活动是否冲突
     */
    suspend fun isActivityConflict(activityId: String) = catchError {
        activityService.isActivityConflict(getHeaderMap(), activityId)
    }

    /**
     * ddb活动签到
     */
    suspend fun signInActivity(requestBean: legym.fuck.logic.legym.network.model.huodong.signin.ActivitySignInRequestBean) =
        catchError {
            activityService.signInActivity(getHeaderMap(), requestBean)
        }

    /**
     * 获取活动列表
     */
    @Deprecated("SignInService已弃用")
    suspend fun getActivityList(requestBean: ActivityListRequestBean) = catchError {
        signInService.getActivityList(getHeaderMap(), requestBean)
    }


    /**
     * 活动签到
     */
    @Deprecated("SignInService已弃用")
    suspend fun signInActivity(requestBean: ActivitySignInRequestBean) = catchError {
        signInService.signIn(getHeaderMap(), requestBean)
    }

    /**
     * 获取课程列表
     */
    suspend fun getCourseList() = catchError {
        courseService.getCourseList(getHeaderMap())
    }

    /**
     * 获取课程信息
     */
    suspend fun getCourseInfo(courseId: String) = catchError {
        courseService.getCourseInfo(getHeaderMap(), courseId)
    }

    /**
     * 获取单个课程详情
     */
    suspend fun getCourseDetails(courseId: String) = catchError {
        courseService.getCourseDetail(getHeaderMap(), courseId)
    }

    /**
     * 课程签到
     */
    suspend fun signForCourse(signCourseRequestBean: SignCourseRequestBean) = catchError {
        courseService.signForCourse(getHeaderMap(), signCourseRequestBean)
    }

    /**
     * 活动报名
     */
    @Deprecated("SignInService已弃用")
    suspend fun signUpActivity(requestBean: ActivitySignUpRequestBean) =
        withContext(Dispatchers.IO) {
            signInService.signUp(getHeaderMap(), requestBean)
        }

    /**
     * 所有的网络请求都统一经过这个函数
     */
    suspend fun <T> catchError(block: suspend () -> HttpResult<T?>): HttpResult<T?> {
        return try {
            var result = withContext(Dispatchers.IO) { block() }
            if (result.code == 401 || result.code == 1002) {
                //Token失效，重新登录
                OnlineData.asyncLogin().data?.let {
                    //登录成功，再请求一次
                    result = catchError { block() }
                }
            }
            result
        } catch (e: Exception) {
            if (e is retrofit2.HttpException) {
                HttpResult(
                    code = e.code(),
                    message = e.response()?.errorBody()?.let { body ->
                        try {
                            body.string()
                        } catch (oom: OutOfMemoryError) {
                            e.message()
                        }
                    },
                    data = null
                )
            } else {
                HttpResult(code = 1000, message = e.message ?: "", data = null)
            }
        }
    }

    /**
     * 所有的网络请求都统一经过这个函数
     *
     * 这是专门为网络请求失败专门进行上报的
     */
    private suspend fun <T> catchErrorAndUpload(
        tag: String,
        block: suspend () -> HttpResult<T?>
    ): HttpResult<T?> {
        return try {
            var result = withContext(Dispatchers.IO) { block() }
            if (result.code == 401 || result.code == 1002) {
                //Token失效，重新登录
                OnlineData.asyncLogin().data?.let {
                    //登录成功，再请求一次
                    result = catchError { block() }
                }
            }
            result
        } catch (e: Exception) {
            if (e is retrofit2.HttpException) {
                HttpResult(
                    code = e.code(),
                    message = e.response()?.errorBody()?.let { body ->
                        try {
                            body.string()
                        } catch (oom: OutOfMemoryError) {
                            e.message()
                        }
                    },
                    data = null
                )
            } else {
                HttpResult(code = 1000, message = e.message ?: "", data = null)
            }
        }
    }

}