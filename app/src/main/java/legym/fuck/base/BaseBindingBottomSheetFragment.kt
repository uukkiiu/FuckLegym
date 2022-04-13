package legym.fuck.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewbinding.ViewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


/**
 * @author ldh
 * 时间: 2022/3/29 14:14
 *
 */
abstract class BaseBindingBottomSheetFragment<BD : ViewBinding> : BottomSheetDialogFragment() {

    protected open val TAG = javaClass.simpleName

    protected lateinit var binding: BD

    protected open val layoutResId = -1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        require(layoutResId != -1) { "layoutResId或onCreateView必须重写其中一个" }
        binding = DataBindingUtil.inflate(
            inflater,
            layoutResId,
            container,
            false
        )
        if (binding is ViewDataBinding) {
            (binding as ViewDataBinding).lifecycleOwner = viewLifecycleOwner
        }
        binding.initViews()
        binding.initDataListeners()
        binding.initData()
        return binding.root
    }

    protected open fun BD.initViews() {}

    protected open fun BD.initDataListeners() {}

    protected open fun BD.initData() {}

    fun showIfNeeded(fragmentActivity: FragmentActivity) =
        showIfNeeded(fragmentActivity.supportFragmentManager)

    fun showIfNeeded(fragmentManager: FragmentManager) {
        if (fragmentManager.findFragmentByTag(TAG) != null) return
        showNow(fragmentManager, TAG)
    }

}