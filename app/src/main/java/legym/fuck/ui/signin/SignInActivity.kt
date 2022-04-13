package legym.fuck.ui.signin

import android.os.Bundle
import androidx.activity.viewModels
import legym.fuck.R
import legym.fuck.databinding.ActivitySignInBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.liangguo.androidkit.app.ToastUtil
import legym.fuck.base.CollapsingToolbarActivity

/**
 * 活动签到Activity
 * @author Foreverddb   
 * @Date 2022.3.20 15:35
 */
class SignInActivity : CollapsingToolbarActivity() {

    companion object{
        var position: Int = 0
    }

    private val mDataBinding by lazy {
        ActivitySignInBinding.inflate(layoutInflater, contentViewContainer, true)
    }

    private val mViewModel by viewModels<SignInViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initDataListeners()
    }

    fun initDataListeners() {
        //当查看页数改变时先加载再启用按钮
        mViewModel.pageNum.observe(this) {
            mDataBinding.buttonBeforePage.isEnabled = false
            mDataBinding.buttonNextPage.isEnabled = false

            mViewModel.loadActivities(it)

            mDataBinding.buttonBeforePage.isEnabled = true
            mDataBinding.buttonNextPage.isEnabled = true
        }
        mViewModel.total.observe(this) {
            mViewModel.pageTotalNum.postValue(it / 10 + 1)
        }
        mViewModel.errorMap.observe(this) {
            if (it.size > 0) {
                val s: StringBuilder = StringBuilder()
                it.forEach { error ->
                    s.append("$error \n")
                }
                MaterialAlertDialogBuilder(this, R.style.MaterialAlertDialog_Material3)
                    .setTitle(R.string.sign_error_title)
                    .setMessage(s)
                    .setPositiveButton(R.string.confirm, null)
                    .create().show()
            }
        }
    }

    fun initViews() {
        mDataBinding.apply {

            var adapter = mViewModel.activityAdapter
            selectionCardListRecyclerView.adapter = adapter
            buttonUploadSignUp.setOnClickListener {
                mViewModel.signUpWithActivities()
            }
            buttonUploadSignIn.setOnClickListener {
                mViewModel.signInWithActivities()
            }
            switchAutoSignIn.setOnCheckedChangeListener { _, b ->
                mViewModel.autoSignIn.postValue(b)
            }
            buttonBeforePage.setOnClickListener {
                if (mViewModel.pageNum.value!! - 1 > 0) mViewModel.pageNum.postValue(mViewModel.pageNum.value!! - 1)
                else ToastUtil.info(getString(R.string.page_to_bottom))
            }
            buttonNextPage.setOnClickListener {

                if (mViewModel.pageNum.value!! < mViewModel.pageTotalNum.value!!) mViewModel.pageNum.postValue(
                    mViewModel.pageNum.value!! + 1
                )
                else ToastUtil.info(getString(R.string.page_to_bottom))
            }
        }
        mViewModel.loadActivities()
    }
}