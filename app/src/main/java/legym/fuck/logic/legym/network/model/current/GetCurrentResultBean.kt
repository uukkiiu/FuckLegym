package legym.fuck.logic.legym.network.model.current

import kotlinx.serialization.Serializable

@Serializable
data class GetCurrentResultBean(
    val current: String?,
    val endDate: Long?,
    //这个id才是真正的semesterId
    val id: String,
    val index: Int?,
    val organizationId: String,
    val startDate: Long?,
    val weekIndex: Int?,
    val yearRange: String?
)