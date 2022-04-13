package legym.fuck.logic.legym.network.model.signin.signin

import legym.fuck.logic.legym.network.model.signin.signup.Data

data class ActivitySignInResultBean(
    val code: Int = 0,
    val data: Data?,
    val message: String? = ""
)