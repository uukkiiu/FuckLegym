package legym.fuck.ui.course

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import com.angcyo.dsladapter.DslAdapter
import com.liangguo.androidkit.app.ToastUtil
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import legym.fuck.config.AppConfig
import legym.fuck.logic.OnlineData
import legym.fuck.logic.legym.network.NetworkRepository
import legym.fuck.logic.legym.network.model.course.CourseListResultBean
import legym.fuck.logic.legym.network.model.course.SignCourseRequestBean
import legym.fuck.logic.legym.network.model.course.info.CourseInfoListItem
import legym.fuck.ui.course.model.CourseInfoItem


/**
 * @ClassName CourseViewModel
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月29日 17:12
 **/
class CourseViewModel : ViewModel() {

    val currentCourse = MutableLiveData<CourseListResultBean>()

    val courseInfo = MutableStateFlow(listOf<CourseInfoListItem>())

    val signNumber = MutableLiveData(0)

    val attainabilityNumber = MutableLiveData(0)

    val courseInfoAdapter = DslAdapter()

    val courseList = MutableStateFlow(listOf<CourseListResultBean>())

    init {
        viewModelScope.launch {
            courseInfo.collect {
                courseInfoAdapter.changeDataItems { adapterItems ->
                    adapterItems.clear()
                    it.forEach {
                        adapterItems.add(CourseInfoItem(it))
                    }
                }
            }
        }
    }

    /**
     * 加载当前有的课程
     */
    fun loadCurrentCourse() {
        viewModelScope.launch {
            NetworkRepository.getCourseList().apply {
                data?.let { list ->
                    courseList.emit(list)
                    list.firstOrNull()?.let {
                        currentCourse.value = it
                    } ?: ToastUtil.info("没有课程信息")
                } ?: ToastUtil.info("课程信息加载失败  $message")
            }
        }
    }

    /**
     * 加载课程的每周信息
     */
    fun loadCourseInfo(){
        viewModelScope.launch {
            NetworkRepository.getCourseInfo(
                currentCourse.value?.id ?: ""
            ).apply {
                this.data?.let {
                    it.attainabilityList?.let {
                        var tmpSignNumber = 0
                        var tmpAttainabilityNumber = 0
                        it.forEach {
                            if(it.startSignDataStatus!!) {
                                tmpAttainabilityNumber ++
                                if(it.startSignNumber == it.signNumber){
                                    tmpSignNumber ++
                                }
                            }
                        }
                        //赋值已签到数和总考勤数
                        signNumber.postValue(tmpSignNumber)
                        attainabilityNumber.postValue(tmpAttainabilityNumber)

                        courseInfo.emit(it)
                    }
                }
            }
        }
    }

    /**
     * 课程签到
     */
    fun sign() {
        viewModelScope.launch {
            NetworkRepository.getCurrentSemesterId().apply {
                this.data?.let {
                    NetworkRepository.signForCourse(
                        SignCourseRequestBean(
                            courseId = currentCourse.value?.id ?: "",
                            userId = OnlineData.getUserDataAsync().id,
                            weekNumber = it.weekIndex
                        )
                    ).apply {
                        var resData = JSONObject()

                        try {
                            resData = JSON.parseObject(message)
                        }catch (e: Exception){
                            resData["message"] = "乐健服务器错误，请稍候重试"
                        }
                        val msg = resData.getString("message")

                        if (message?.contains("成功") == true) {
                            ToastUtil.success("签到成功")
                        } else {
                            ToastUtil.error("失败！$msg")
                        }
                    }
                }
            }

        }
    }

}