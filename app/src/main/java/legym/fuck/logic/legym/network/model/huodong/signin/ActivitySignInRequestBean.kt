package legym.fuck.logic.legym.network.model.huodong.signin

/**
 * 活动签到的请求体
 *
 * @param activityType 一般都是0
 * @param attainabilityType 2代表活动， 0代表课程
 * @param pageType 一般是 "activity"
 * @param times 第几次签到，填1还是2没有影响
 */
data class ActivitySignInRequestBean(
    val activityId: String,
    val activityType: Int = 0,
    val attainabilityType: Int = 2,
    val pageType: String = "activity",
    val times: Int = 1,
    val userId: String
)