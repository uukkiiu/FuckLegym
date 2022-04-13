package legym.fuck.logic.legym.network.model.course.info

data class CourseInfoResultBean(
    val attainabilityList: List<CourseInfoListItem>?,
    val attainabilityNumber: Int? = 0,
    val yetNumber: Int? = 0
)