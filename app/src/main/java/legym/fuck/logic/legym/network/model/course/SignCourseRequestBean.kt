package legym.fuck.logic.legym.network.model.course

data class SignCourseRequestBean(
    val pageType: String = "course",
    val attainabilityType: String = "0",
    val courseId: String = "",
    val userId: String = "",
    val weekNumber: Int? = 0,
    val startSignNumber: Int = 1
)