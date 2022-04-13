package legym.fuck.ui.huodong.mydeatils

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.activityViewModels
import legym.fuck.R
import legym.fuck.databinding.FragmentMineActivitiesBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import legym.fuck.ui.huodong.HuoDongViewModel


/**
 * @author ldh
 * 时间: 2022/3/29 9:50
 *
 */

/*
在fragment或activity中使用协程用lifeCycleOwner.lifecycleScope.launch ，否则容易造成内存泄漏等问题
activity和Fragment本身就是LifeCycleOwner
Fragment生命周期和其中view的生命周期不一致，view相关的生命周期用viewLifecycleOwner
 */

//使用Fragment一定用空的公开的构造函数，不要自己加参数进去
class MyActivityDetailsBottomFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentMineActivitiesBottomSheetBinding

    //用这种方式获取Activity的ViewModel，fragment本身就是承载在Activity上的
    private val mActivityViewModel by activityViewModels<HuoDongViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_mine_activities_bottom_sheet,
            container,
            false
        )
        binding.lifecycleOwner = viewLifecycleOwner
        binding.initViews()
        mActivityViewModel.initDataListeners()
        return binding.root
    }

    private fun FragmentMineActivitiesBottomSheetBinding.initViews() {

    }

    @SuppressLint("SetTextI18n")
    private fun HuoDongViewModel.initDataListeners() {
        with(binding) {
            statistic.observe(viewLifecycleOwner) {
                activityPurpose.text = "${it.signedTimes} / ${it.totalTimes} 次"
                activitySigned.text = it.signedTimes.toString()
                activityRegistered.text = it.registerNumber.toString()
                activitySignedNoGrade.text = it.signedTimesNoGrade.toString()
                activityRegisteredNoGrade.text = it.registerNoGradeNumber.toString()
                activityPurposeProgress.progress = (it.signedTimes.toFloat() / it.totalTimes.toFloat() * 100).toInt()
            }
        }
    }

    fun showIfNeeded(fragmentManager: FragmentManager) {
        if (fragmentManager.findFragmentByTag(TAG) != null) return
        showNow(fragmentManager, TAG)
    }

    companion object {
        private val TAG: String = MyActivityDetailsBottomFragment::class.java.simpleName
    }
}