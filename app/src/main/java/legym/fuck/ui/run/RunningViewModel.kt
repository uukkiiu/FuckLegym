package legym.fuck.ui.run

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import legym.fuck.R
import com.liangguo.easyingcontext.EasyingContext.context
import fucklegym.top.entropy.PathGenerator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import legym.fuck.logic.OnlineData
import legym.fuck.logic.OnlineData.runningLimitFlow
import legym.fuck.logic.clouds.CloudsNetworkRepository
import legym.fuck.logic.clouds.model.RunningMap
import legym.fuck.logic.legym.network.NetworkRepository
import legym.fuck.ui.run.logic.RunningPrefUtil
import legym.fuck.ui.run.logic.RunningPrefUtil.DEFAULT_DISTANCE_RANGE_FROM
import legym.fuck.ui.run.logic.RunningPrefUtil.DEFAULT_DISTANCE_RANGE_TO
import legym.fuck.ui.run.logic.RunningType
import legym.fuck.utils.MatchUtils.sortBySchoolName
import maputil.MapData
import kotlin.random.Random


/**
 * @author ldh
 * 时间: 2022/3/17 13:27
 *
 */
class RunningViewModel : ViewModel() {

    /**
     * 每次跑步的距离的随机区间
     */
    val distanceRange =
        MutableLiveData(listOf(DEFAULT_DISTANCE_RANGE_FROM, DEFAULT_DISTANCE_RANGE_TO))

    val runningType = MutableLiveData<RunningType>()

    val selectedMap = MutableLiveData<String>()

    var runningMaps = mutableSetOf<String>()

    val loadingOnlineMaps = MutableStateFlow(false)

    /**
     * 在线的地图
     */
    val onlineMaps = MutableStateFlow(listOf<RunningMap>())

    val totalMaps = MutableStateFlow(mutableListOf<String>())

    init {
        runningType.value = RunningType.getRunningTypeByPrefValue(RunningPrefUtil.prefRunningType)
    }

    /**
     * 更新跑步类型的数据
     */
    fun updateRunningType(type: RunningType) {
        RunningPrefUtil.prefRunningType = type.prefValue
        runningType.value = RunningType.getRunningTypeByPrefValue(RunningPrefUtil.prefRunningType)
    }

    /**
     * 上传跑步数据
     * @return 返回本次上传有效里程是多少，空就是上传失败
     */
    suspend fun uploadRunningData() = withContext(Dispatchers.IO) {
        val result = NetworkRepository.uploadRunningDetail(
            map = RunningPrefUtil.prefRunningMap,
            targetMileage = RunningPrefUtil.prefDistanceRange.let {
                val min = minOf(it.first(), it.last())
                val max = maxOf(it.first(), it.last())
                if (min != max)
                    Random.nextDouble(
                        min.toDouble(),
                        max.toDouble()
                    ) else min
            }.toFloat(),
            limitationsGoalsSexInfoId = runningLimitFlow.value!!.limitationsGoalsSexInfoId,
            type = RunningType.getRunningTypeByPrefValue(RunningPrefUtil.prefRunningType)
        )
        result
    }

    fun onMapSelected(map: String) {
        onlineMaps.value.find { it.name == map }?.apply {
            MapData.saveMap(name, latitude, longitude)
        }
        RunningPrefUtil.prefRunningMap = map
        updateRunningMap()
    }

    /**
     * 更新一次地图。
     * 包括当前所有的地图数据以及用户偏好的哪一个地图。
     */
    fun updateRunningMap() {
        viewModelScope.launch(Dispatchers.IO) {
            PathGenerator.getLocalMaps(
                context.getSharedPreferences(
                    context.getString(R.string.local_maps_path),
                    Context.MODE_PRIVATE
                )
            )
            runningMaps = PathGenerator.RunMaps.keys
            RunningPrefUtil.prefRunningMap?.let {
                //用户选择过，就直接用了
                withContext(Dispatchers.Main) {
                    selectedMap.value = it
                }
            } ?: let {
                //用户第一次进来，就加载一次地图
                loadingOnlineMaps.emit(true)
            }
        }
    }

    init {
        viewModelScope.apply {
            loadingOnlineMaps.tryEmit(true)

            launch {
                loadingOnlineMaps.collect {
                    if (it) {
                        //加载一次在线地图
                        CloudsNetworkRepository.getMaps()?.let { maps ->
                            //获取到在线地图后与学校名称进行排序
                            onlineMaps.emit(maps.sortBySchoolName(OnlineData.getUserDataAsync().schoolName))
                        }
                    }
                }
            }

            launch {
                onlineMaps.collectLatest { maps ->
                    //如果地图有了，此时用户还未选择任何地图，则自动设置
                    if (selectedMap.value == null && maps.isNotEmpty()) {
                        onMapSelected(maps.first().name)
                    }
                    loadingOnlineMaps.emit(false)
                }
            }

            launch {
                onlineMaps.collectLatest { maps ->
                    val newMaps = mutableListOf<String>()
                    if (MapData.hasDIYPath()) {
                        newMaps.add(context.getString(R.string.diy_path))
                    }
                    maps.forEach {
                        newMaps.add(it.name)
                    }
                    totalMaps.emit(newMaps)
                }
            }
        }


        updateRunningMap()
    }


}