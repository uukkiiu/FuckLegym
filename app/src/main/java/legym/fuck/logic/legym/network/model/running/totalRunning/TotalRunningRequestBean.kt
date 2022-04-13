package legym.fuck.logic.legym.network.model.running.totalRunning

import kotlinx.serialization.Serializable

@Serializable
data class TotalRunningRequestBean(
    val hasRule: Boolean,
    val semesterId: String
)