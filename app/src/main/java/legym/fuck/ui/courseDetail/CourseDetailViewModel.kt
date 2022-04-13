package legym.fuck.ui.courseDetail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import legym.fuck.logic.legym.network.NetworkRepository
import legym.fuck.logic.legym.network.model.course.CourseDetailResultBean


/**
 * @ClassName CourseDetailViewModel
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月30日 17:18
 **/
class CourseDetailViewModel : ViewModel() {

    val courseDetail = MutableLiveData<CourseDetailResultBean?>()

    fun loadDetails(courseId: String){
        viewModelScope.launch {
            NetworkRepository.getCourseDetails(
                courseId = courseId
            ).apply {
                data?.let {
                    courseDetail.postValue(it)
                }
            }
        }
    }

}