package legym.fuck.logic.legym.network.model.running

import kotlinx.serialization.Serializable
import legym.fuck.config.AppConfig

@Serializable
data class RunningLimitResultBean(
    val averageCadenceEnd: Int?,
    val averageCadenceStart: Int?,
    val averageSpeedEnd: String?,
    val averageSpeedStart: String?,
    val currentTimeStamp: String?,
    val dailyMileage: Double?,
    val dailyParagraph: String?,
    val effectiveMileageEnd: Double?,
    val effectiveMileageStart: Double?,
    val effectiveParagraphEnd: Any?,
    val effectiveParagraphMileage: Any?,
    val effectiveParagraphStart: Any?,
    val enableStatus: Any?,
    val fixedPointNumber: Any?,
    val fixedPointOrder: Any?,
    val fixedPointPattern: Int?,
    val fixedPointPercentage: Any?,
    val freePattern: Int?,
    val hasRule: Boolean,
    val limitationsGoalsSexInfoId: String?,
    val notice: Any?,
    val patternId: String?,
    val runningTimeLimit: RunningTimeLimit?,
    val scopePattern: Int?,
    val scopePercentage: Int?,
    val scoringType: Int?,
    val semesterMileage: Double?,
    val semesterParagraph: Any?,
    val totalDayMileage: String?,
    val totalDayPart: Int?,
    val totalWeekMileage: String?,
    val totalWeekPart: Int?,
    val weeklyMileage: Double?,
    val weeklyParagraph: Any?
)

@Serializable
data class RunningTimeLimit(
    val endTime: String,
    val openTimes: List<OpenTime>,
    val startTime: String,
    val weekOpenTimes: List<WeekOpenTime>
)

@Serializable
data class OpenTime(
    val dayEndTime: String,
    val dayStartTime: String
)

@Serializable
data class WeekOpenTime(
    val dayEndTime: String,
    val dayStartTime: String,
    val week: String
)

val RunningLimitResultBean.dailyMileageOrDefault: Double
    get() = dailyMileage ?: AppConfig.DEFAULT_DAILY_RUNNING_LIMIT


val RunningLimitResultBean.weeklyMileageOrDefault: Double
    get() = weeklyMileage ?: AppConfig.DEFAULT_WEEKLY_RUNNING_LIMIT

val RunningLimitResultBean.effectiveMileageStartOrDefault: Double
    get() = effectiveMileageStart ?: 0.0

val RunningLimitResultBean.effectiveMileageEndOrDefault: Double
    get() = effectiveMileageEnd ?: Double.MAX_VALUE

val RunningLimitResultBean.totalDayMileageOrDefault: Double
    get() = totalDayMileage?.toDoubleOrNull() ?: Double.MAX_VALUE

val RunningLimitResultBean.totalWeekMileageOrDefault: Double
    get() = totalWeekMileage?.toDoubleOrNull() ?: Double.MAX_VALUE
