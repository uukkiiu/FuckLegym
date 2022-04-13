package legym.fuck.logic.legym.network.model.course.info

data class CourseInfoListItem(
    val attainabilityId: String? = null,
    val allowSureSign: Boolean? = null,
    val allowSign: Boolean? = null,
    val weekNumber: Int = 0,
    val organizationId: String? = "",
    val startDayOfWeek: Long = 0,
    val currentSureWeek: Boolean? = false,
    val startSignDataStatus: Boolean? = false,
    val signNumber: Int? = null,
    val startSignDate: Long? = null,
    val signType: Int? = null,
    val currentWeek: Boolean? = false,
    val attainabilityType: Int? = null,
    val courseId: String? = "",
    val endDayOfWeek: Long? = 0,
    val startSignNumber: Int? = 0
)