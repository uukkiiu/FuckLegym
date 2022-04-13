package legym.fuck.logic.legym.network.model.signin.signin

data class ActivitySignInRequestBean(
    val activityId: String = "",
    val times: Int = 1,
    val pageType: String = "",
    val attainabilityType: Int = 2,
    val activityType: Int = 0,
    val userId: String = ""
)