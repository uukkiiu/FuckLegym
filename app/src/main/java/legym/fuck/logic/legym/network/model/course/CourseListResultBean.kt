package legym.fuck.logic.legym.network.model.course

data class CourseListResultBean(
    val courseStatusStr: String = "",
    val year: Int = 0,
    val name: String = "",
    val courseStatus: Int? = 0,
    val soonTag: Boolean? = false,
    val startTime: Long? = 0,
    val timeStr: String? = "",
    val id: String = "",
    val endTime: Long? = 0,
    val weekLabel: String? = ""
)