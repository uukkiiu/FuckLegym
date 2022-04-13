package legym.fuck.logic.legym.network.model.running

import kotlinx.serialization.Serializable

@Serializable
data class RunningLimitRequestBean(
    val semesterId: String?
)