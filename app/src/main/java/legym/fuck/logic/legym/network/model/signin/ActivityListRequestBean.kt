package legym.fuck.logic.legym.network.model.signin

data class ActivityListRequestBean(
    val topicId: String? = "",
    val week: String? = "",
    val size: Int = 10,
    val campus: String? = "",
    val name: String? = "",
    val page: Int = 1,
    val state: String? = ""
)