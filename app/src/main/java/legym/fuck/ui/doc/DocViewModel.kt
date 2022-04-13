package legym.fuck.ui.doc

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import legym.fuck.logic.OnlineData
import legym.fuck.logic.clouds.model.DocInfo


/**
 * @author ldh
 * 时间: 2022/3/21 22:26
 *
 */
class DocViewModel : ViewModel() {

    val currentDoc = MutableLiveData<DocInfo>()

    init {
        viewModelScope.launch {
            OnlineData.unreadDocList.value.firstOrNull()?.let {
                currentDoc.value = it
            } ?: let {
                OnlineData.docInfoList.value.firstOrNull()?.let {
                    currentDoc.value = it
                }
            }
        }
    }

}