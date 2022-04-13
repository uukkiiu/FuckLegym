package legym.fuck.ui.courseDetail

import android.os.Bundle
import androidx.activity.viewModels
import com.liangguo.androidkit.app.startNewActivity
import legym.fuck.base.CollapsingToolbarActivity
import legym.fuck.databinding.ActivityCourseDetailBinding
import java.text.SimpleDateFormat
import java.util.*

class CourseDetailActivity : CollapsingToolbarActivity() {

    private lateinit var courseId: String

    private lateinit var courseName: String

    val mViewModel by viewModels<CourseDetailViewModel>()

    val formatter = SimpleDateFormat("yyyy/MM/dd", Locale.CHINA)

    val binding by lazy {
        ActivityCourseDetailBinding.inflate(layoutInflater, contentViewContainer, true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent?.getStringExtra(INTENT_KEY_COURSE_ID)?.let {
            courseId = it
            courseName = intent.getStringExtra(INTENT_KEY_COURSE_NAME)!!
        } ?: finish()
        initViews()
        initDataListeners()
    }

    private fun initViews() {
        binding.courseDetailNameTitle.text = courseName
        with(mViewModel) {
            courseDetail.observe(this@CourseDetailActivity) {
                binding.detail = it
                binding.courseDetailStartDate.text = formatter.format(it?.startDate)
                binding.courseDetailEndDate.text = formatter.format(it?.endDate)
            }
        }
    }

    private fun initDataListeners() {
        with(binding) {

        }
        mViewModel.loadDetails(courseId ?: "")
    }

    companion object {
        private const val INTENT_KEY_COURSE_ID = "INTENT_KEY_COURSE_ID"
        private const val INTENT_KEY_COURSE_NAME = "INTENT_KEY_COURSE_NAME"

        fun startActivity(courseId: String, courseName: String) {
            CourseDetailActivity::class.startNewActivity {
                putExtra(INTENT_KEY_COURSE_ID, courseId)
                putExtra(INTENT_KEY_COURSE_NAME, courseName)
            }
        }
    }

}