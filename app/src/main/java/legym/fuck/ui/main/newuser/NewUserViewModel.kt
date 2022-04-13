package legym.fuck.ui.main.newuser

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.withContext
import legym.fuck.core.export.BmobUserStore


/**
 * @author ldh
 * 时间: 2022/3/25 14:42
 *
 */
class NewUserViewModel : ViewModel() {

    val confirming = MutableStateFlow(false)

    var inputInviteCode = ""

    suspend fun getTargetUser() =
        withContext(Dispatchers.IO) { BmobUserStore.findUserByObjectId(inputInviteCode) }


}