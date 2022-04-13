package legym.fuck.logic.legym.network.model.huodong

/**
 * @param campus 对应的校区id，空则为全部
 * @param state 当前活动所处状态：0代表报名未开始，1代表报名中，2代表报名结束，4代表进行中，空则为全部
 * @param week 代表筛选星期几的活动，1代表星期一以此类推，空则为全部
 */
data class AllActivitiesRequestBean(
    val campus: String,
    val name: String,
    val page: Int,
    val size: Int,
    val state: String,
    val topicId: String,
    val week: String
)