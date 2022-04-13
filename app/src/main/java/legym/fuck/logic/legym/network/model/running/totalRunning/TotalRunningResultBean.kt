package legym.fuck.logic.legym.network.model.running.totalRunning

import kotlinx.serialization.Serializable

@Serializable
data class TotalRunningResultBean(
    val totalMileage: String,
    val totalPart: Int
)