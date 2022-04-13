package legym.fuck.logic.legym.network.model.huodong

/**
 * @param state 活动状态，4代表查询进行中的活动，5代表查询已结束的活动，3代表查询未开始的活动
 * @param day 代表需要查询多少天的活动，如7代表近7天
 */
data class MyActivityRequestBean(
    val day: Int,
    val page: Int,
    val semesterId: String,
    val size: Int,
    val state: Int
)