package legym.fuck.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


/**
 * @author ldh
 * 时间: 2022/3/18 11:22
 *
 */
class LoginViewModel: ViewModel() {

    /**
     * 低调使用
     */
    val dontPublic = MutableLiveData(false)

    /**
     * 自己负责
     */
    val responsibleSelf = MutableLiveData(false)


}