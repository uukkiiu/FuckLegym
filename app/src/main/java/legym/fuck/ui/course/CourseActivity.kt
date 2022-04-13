package legym.fuck.ui.course

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.viewModels
import legym.fuck.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import legym.fuck.base.ParallaxImageActivity
import legym.fuck.databinding.ActivityCourseBinding
import legym.fuck.logic.legym.network.model.course.CourseListResultBean
import legym.fuck.ui.courseDetail.CourseDetailActivity

class CourseActivity : ParallaxImageActivity() {

    private val mViewModel by viewModels<CourseViewModel>()

    private val binding by lazy {
        ActivityCourseBinding.inflate(layoutInflater, contentViewContainer, true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initDataListeners()
    }

    @SuppressLint("SetTextI18n")
    private fun initDataListeners() {
        with(mViewModel) {
            currentCourse.observe(this@CourseActivity) {
                binding.courseName.text = it.name
                loadCourseInfo()
            }
            signNumber.observe(this@CourseActivity) {
                binding.courseInfoSignPurpose.text =
                    "${signNumber.value}/${attainabilityNumber.value}"
            }
            attainabilityNumber.observe(this@CourseActivity) {
                binding.courseInfoSignPurpose.text =
                    "${signNumber.value}/${attainabilityNumber.value}"
            }
        }
    }

    private fun initViews() {
        with(binding) {
            buttonCourseSign.setOnClickListener {
                mViewModel.sign()
            }
            buttonAllCourse.setOnClickListener {
                val courses = mutableListOf<CourseListResultBean>()
                courses.addAll(mViewModel.courseList.value)
                val items = mutableListOf<String>()
                courses.forEach {
                    items.add(it.name)
                }
                MaterialAlertDialogBuilder(
                    this@CourseActivity,
                    R.style.MaterialAlertDialog_Material3
                )
                    .setTitle(getString(R.string.my_course_list))
                    .setItems(items.toTypedArray()) { _, index ->
                        mViewModel.currentCourse.value = courses[index]
                    }
                    .show()
            }
            courseDetailContainer.setOnClickListener {
                if (mViewModel.currentCourse.value?.id != null && mViewModel.currentCourse.value?.name != null) {
                    CourseDetailActivity.startActivity(
                        mViewModel.currentCourse.value?.id!!,
                        mViewModel.currentCourse.value?.name!!
                    )
                }
            }
            courseInfoRecyclerView.adapter = mViewModel.courseInfoAdapter
        }
        mViewModel.loadCurrentCourse()
    }
}