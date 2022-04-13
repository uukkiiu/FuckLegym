package legym.fuck.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.angcyo.dsladapter.DslAdapter
import com.liangguo.androidkit.commons.CalendarUtil
import com.liangguo.androidkit.commons.cnDate
import com.liangguo.androidkit.commons.getTimeOfDay
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import legym.fuck.logic.OnlineData
import legym.fuck.logic.legym.network.NetworkRepository
import legym.fuck.logic.legym.network.model.running.dailyMileageOrDefault
import legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningRequestBean


/**
 * @author ldh
 * 时间: 2022/3/18 21:56
 *
 */
class MainViewModel : ViewModel() {

    /**
     * 这学期已经跑的数
     */
    val totalRunned = MutableLiveData("")

    /**
     * 这学期总共要跑多少公里
     */
    val semTotalMils = MutableLiveData(0)

    /**
     * 当前已经跑了多少（整数）
     */
    val currentMilsInt = MutableLiveData(0)

    val runningRulesAdapter by lazy {
        DslAdapter().apply {
            OnlineData.runningLimitFlow.value?.let { limit ->
                with(limit) {
                    val km = "km"
                    renderData {
                        RunningRulesItemModel("跑步限制", isDriver = true)()
                        RunningRulesItemModel(
                            "跑步有效范围",
                            "$effectiveMileageStart 至 $effectiveMileageEnd $km"
                        )()
                        RunningRulesItemModel("每日上限", "$dailyMileageOrDefault $km")()
                        RunningRulesItemModel("每周上限", "$weeklyMileage $km")()
                        RunningRulesItemModel("每学期上限", "$semesterMileage $km")()
                        RunningRulesItemModel("开放时间", isDriver = true)()
                        runningTimeLimit?.let {
                            RunningRulesItemModel(
                                "开放日期",
                                "从 ${CalendarUtil.getCalendarByTimeMills(runningTimeLimit.startTime.toLong()).cnDate}"
                            )()
                            RunningRulesItemModel(
                                "开放日期", " 至 ${
                                    CalendarUtil.getCalendarByTimeMills(runningTimeLimit.endTime.toLong()).cnDate
                                }"
                            )()
                            runningTimeLimit.openTimes.forEach {
                                RunningRulesItemModel(
                                    "每天开放时间",
                                    "${getTimeOfDay(it.dayStartTime.toLong())} 至 ${
                                        getTimeOfDay(
                                            it.dayEndTime.toLong()
                                        )
                                    }"
                                )()
                            }
                            runningTimeLimit.weekOpenTimes.forEach {
                                RunningRulesItemModel(
                                    "每周开放时间", it.week
                                )()
                            }
                        }
                    }
                }

            }
        }
    }

    /**
     * 加载已经跑了多少数
     */
    fun loadHasRun() {
        viewModelScope.launch {
            OnlineData.currentData.value?.let { resultBean ->
                NetworkRepository.getTotalRunning(
                    TotalRunningRequestBean(
                        true,
                        resultBean.id
                    )
                ).apply {
                    OnlineData.totalRunning.emit(this.data)
                }
            }
        }
    }

    init {
        viewModelScope.apply {
            launch(Dispatchers.IO) {
                OnlineData.runningLimitFlow.collect {
                    semTotalMils.postValue(it?.semesterMileage?.toInt())
                }
            }

            launch {
                OnlineData.totalRunning.collect { result ->
                    result?.totalMileage?.let { it ->
                        totalRunned.postValue(it)
                        it.toFloatOrNull()?.apply {
                            currentMilsInt.value = this.toInt()
                        }
                    }
                }
            }

            launch {
                OnlineData.loadDocInfo()
            }

        }
    }

}