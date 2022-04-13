package legym.fuck.logic.clouds.model

data class Notice(
    val id: String,
    val alwaysShow: Boolean,
    val title: String,
    val message: String,
    val cancelable: Boolean,
    val targetActivity: String,
    val show: Boolean,
    val buttons: List<Button>,
)

