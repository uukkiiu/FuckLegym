package legym.fuck.ui.runhistory

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import legym.fuck.R
import com.angcyo.dsladapter.DslAdapter
import com.liangguo.androidkit.app.ToastUtil
import com.liangguo.easyingcontext.EasyingContext.context
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import legym.fuck.logic.OnlineData
import legym.fuck.logic.legym.network.NetworkRepository
import legym.fuck.logic.legym.network.model.running.runningHistory.GradeDetail
import legym.fuck.logic.legym.network.model.running.runningHistory.RunningHistoryRequestBean
import legym.fuck.ui.runhistory.model.HistoryItem


/**
 * @author ldh
 * 时间: 2022/3/21 9:50
 *
 */
class RunningHistoryViewModel : ViewModel() {

    val historyData = MutableStateFlow(listOf<GradeDetail>())

    val loading = MutableLiveData(false)

    val historyAdapter = DslAdapter()

    fun loadHistoryData() {
        viewModelScope.launch {
            loading.value = true
            val result = NetworkRepository.getRunningHistory(
                RunningHistoryRequestBean(
                    //乐健的后端目前不支持分页查询，也不知道他们怎么设定的，就直接请求，最多50项
                    page = 1,
                    semesterId = OnlineData.currentData.value!!.id,
                    size = 50
                )
            )
            result.data?.let { resultBean ->
                //数据加载完成，提交数据
                historyData.emit(resultBean.gradeDetails)
            } ?: let {
                var errorInfo = context.getString(R.string.load_failed)
                result.message?.let { errorInfo += " $it" }
                ToastUtil.error(errorInfo)
            }
        }
        loading.value = false
    }

    init {
        loadHistoryData()

        viewModelScope.apply {
            launch {
                historyData.collect {
                    historyAdapter.changeDataItems { adapterItems ->
                        adapterItems.clear()
                        it.forEach {
                            adapterItems.add(HistoryItem(it))
                        }
                    }
                }
            }
        }
    }


}
