package legym.fuck.logic.legym.network.model.running.runningHistory

data class RunningHistoryResultBean(
    val gradeDetails: List<GradeDetail>,
    val total: Any,
    val totalPage: Any
)

data class GradeDetail(
    val effectiveMileage: String,
    val effectivePart: Int,
    val endTime: String,
    val id: String,
    val keepTime: String,
    val operationMileage: Any,
    val operationPart: Any,
    val runningType: Int,
    val runningTypeName: String,
    val scoringType: Int,
    val startTime: String,
    val totalMileage: String,
    val totalPart: Int?,
    val uneffectiveReason: String
)