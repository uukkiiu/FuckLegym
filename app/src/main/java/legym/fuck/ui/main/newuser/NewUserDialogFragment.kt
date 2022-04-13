package legym.fuck.ui.main.newuser

import android.content.DialogInterface
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import legym.fuck.R
import legym.fuck.databinding.FragmentNewUserBinding
import com.liangguo.androidkit.app.ToastUtil
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import legym.fuck.base.BaseBindingBottomSheetFragment
import legym.fuck.core.export.BmobUserStore.changeIntegral
import legym.fuck.logic.OnlineData


/**
 * @author ldh
 * 时间: 2022/3/24 21:40
 *
 */
class NewUserDialogFragment : BaseBindingBottomSheetFragment<FragmentNewUserBinding>() {

    private val mViewModel by viewModels<NewUserViewModel>()

    override val layoutResId = R.layout.fragment_new_user

    init {
        isCancelable = false
    }


    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        CoroutineScope(Dispatchers.Main).launch {
            OnlineData.firstRegister.emit(false)
        }
    }

    override fun FragmentNewUserBinding.initViews() {
        buttonConfirm.setOnClickListener {
            mViewModel.inputInviteCode = edit.text.toString()
            if (mViewModel.inputInviteCode.isEmpty()) ToastUtil.error(getString(R.string.please_input_invite_code))
            else mViewModel.confirming.tryEmit(true)
        }
    }

    override fun FragmentNewUserBinding.initDataListeners() {
        buttonSkip.setOnClickListener {
            dismiss()
        }

        viewLifecycleOwner.lifecycleScope.apply {
            launch {
                mViewModel.confirming.collect { loading ->
                    if (loading) progress.show() else progress.hide()
                    buttonConfirm.isEnabled = !loading
                    viewShelter.isClickable = loading
                    contentContainer.alpha = if (loading) 0.2f else 1f
                    if (loading) {
                        withContext(Dispatchers.IO) {
                            //去加载
                            mViewModel.getTargetUser()?.let { user ->
                                user.changeIntegral(20f, false).apply {
                                    withContext(Dispatchers.Main) {
                                        data?.let {
                                            ToastUtil.success(getString(R.string.thank_you))
                                            dismiss()
                                        } ?: let {
                                            ToastUtil.error(getString(R.string.network_exception) + exception)
                                        }
                                        mViewModel.confirming.emit(false)
                                    }
                                }
                            } ?: withContext(Dispatchers.Main) {
                                ToastUtil.error(getString(R.string.invite_code_invaild_or_network_exception))
                                mViewModel.confirming.emit(false)
                            }
                        }
                    }
                }
            }
        }
    }

}