package legym.fuck.ui.huodong.register

import android.annotation.SuppressLint
import android.os.Build
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.asLiveData
import legym.fuck.R
import legym.fuck.databinding.FragmentAutoRegisterBinding
import com.angcyo.dsladapter.DslAdapter
import com.liangguo.androidkit.app.ToastUtil
import legym.fuck.base.BaseBindingBottomSheetFragment
import legym.fuck.logic.legym.network.model.huodong.HuodongItem
import legym.fuck.ui.huodong.HuoDongViewModel


/**
 * @author ldh
 * 时间: 2022/4/5 16:24
 *
 */
class AutoUnregisterFragment : BaseBindingBottomSheetFragment<FragmentAutoRegisterBinding>() {

    override val layoutResId = R.layout.fragment_auto_register

    private val activityViewModel by activityViewModels<HuoDongViewModel>()

    private val viewModel by viewModels<AutoRegisterViewModel>()

    init {
        isCancelable = false
    }

    override fun FragmentAutoRegisterBinding.initViews() {
        title.setText(R.string.activity_quickly_unregister)
        buttonClose.setOnClickListener {
            dismiss()
        }
    }

    override fun FragmentAutoRegisterBinding.initData() {
        val selectedActivities = mutableListOf<HuodongItem>()
        selectedActivities.addAll(activityViewModel.activities.value)
        selectedActivities.retainAll { activityViewModel.selectedActivities.value!!.contains(it.id) }
        selectedActivities.retainAll { it.isRegister }
        viewModel.validActivities = selectedActivities
        if (viewModel.validActivities.isEmpty()) {
            ToastUtil.info("当前选中的已报名的活动为0")
            dismiss()
        }
        else viewModel.doUnregister()
    }

    @SuppressLint("SetTextI18n")
    override fun FragmentAutoRegisterBinding.initDataListeners() {
        viewModel.maxActivityNum.asLiveData().observe(viewLifecycleOwner) {
            progress.max = it
            textAllActivities.text = "选择的活动：$it 个"
        }
        viewModel.progress.observe(viewLifecycleOwner) {
            if (progress.max == 0) return@observe
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                progress.setProgress(it.get(), true)
            } else progress.progress = it.get()

            textProgress.text = "${(progress.progress * 100 / progress.max)}%"

            (progress.progress == progress.max).let { man ->
                checkProgress.isVisible = man
                textProgress.isVisible = !man
            }

            textExceptionNum.text = viewModel.exceptionTasks.size.toString()
            textFailedNum.text = viewModel.failedTasks.size.toString()
            textSuccessNum.text = viewModel.successTasks.size.toString()
        }
        viewModel.finished.observe(viewLifecycleOwner) {
            buttonClose.isVisible = it
            isCancelable = it
            activityViewModel.refreshing.tryEmit(true)
            activityViewModel.selectOrCancelAll(false)
            viewModel.apply {
                recyclerView.adapter = DslAdapter().apply {
                    renderHeader {
                        successTasks.forEach { activity ->
                            RegisterResultDslAdapterItem(activity)()
                        }
                    }
                    renderData {
                        failedTasks.forEach { pair ->
                            RegisterResultDslAdapterItem(pair.key, pair.value)()
                        }
                    }
                    renderFooter {
                        exceptionTasks.forEach { pair ->
                            RegisterResultDslAdapterItem(pair.key, exceptionResult = pair.value)()
                        }
                    }
                }
            }
        }
    }

}