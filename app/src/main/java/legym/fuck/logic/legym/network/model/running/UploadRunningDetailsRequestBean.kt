package legym.fuck.logic.legym.network.model.running

data class UploadRunningDetailsRequestBean(
    //App版本号
    val appVersion: String,
    val avePace: Double,
    val calorie: Int,
    val deviceType: String,
    val effectiveMileage: Double,
    val effectivePart: Int,
    val endTime: String,
    val gpsMileage: Double,
    val keepTime: Int,
    val limitationsGoalsSexInfoId: String?,
    val paceNumber: Int,
    val paceRange: Double,
    val routineLine: List<RoutineLine>,
    val scoringType: Int,
    val semesterId: String?,
    val signDigital: String,
    val signPoint: List<RoutineLine>,
    val startTime: String,
    val systemVersion: String,
    val totalMileage: Double,
    val totalPart: Double,
    val type: String,
    val uneffectiveReason: String?
)

data class RoutineLine(
    val latitude: Double,
    val longitude: Double
)

/**
 * 用旧的代码上传跑步数据时返回的结果
 */
data class UploadRunningDetailsResult(
    val effectiveMileage: Double,
    val totalMileage: Double,
    val success: Boolean
)