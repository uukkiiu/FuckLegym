package legym.fuck.logic.legym.network.model.running.runningHistory

data class RunningHistoryRequestBean(
    val page: Int,
    val semesterId: String,
    val size: Int
)