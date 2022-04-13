package legym.fuck.logic.legym.network.model.signin

import legym.fuck.logic.legym.network.model.signin.signin.ItemsItem

data class AcitivityListResultBean(
    val total: Int? = 0,
    val pageSize: Int? = 10,
    val pageNum: Int? = 1,
    val items: List<ItemsItem>?
)