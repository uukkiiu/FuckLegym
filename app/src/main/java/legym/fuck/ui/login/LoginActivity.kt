package legym.fuck.ui.login

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import legym.fuck.R
import legym.fuck.databinding.ActivityLoginBinding
import com.liangguo.androidkit.app.ToastUtil
import com.liangguo.androidkit.app.startNewActivity
import com.liangguo.androidkit.commons.smartNotifyValue
import com.liangguo.easyingcontext.EasyingContext
import com.zackratos.ultimatebarx.ultimatebarx.statusBarOnly
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import legym.fuck.base.BaseActivity
import legym.fuck.logic.LocalUserData.password
import legym.fuck.logic.LocalUserData.userId
import legym.fuck.logic.OnlineData
import legym.fuck.ui.main.MainActivity


/**
 * @author ldh
 * 时间: 2022/3/17 21:52
 *
 */
class LoginActivity : BaseActivity() {

    private val mDataBinding by lazy {
        DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
    }

    private val mViewModel by viewModels<LoginViewModel>()

    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        appCompatOnCreate(savedInstanceState)
        if (intent.getBooleanExtra(INTENT_SIGN_OUT, false)) {
            //是通过退出登录进来的，直接初始化UI
            initUI()
            mDataBinding.apply {
                root.post {
                    mViewModel.dontPublic.value = true
                    mViewModel.responsibleSelf.value = true
                }
            }
        } else {
            //是通过桌面启动，先进行登录
            initNetwork()
        }
        statusBarOnly {
            fitWindow = false
            light = false
        }


    }

    /**
     * 初始化网络模块，这里主要是这些内容：
     *
     * - 根据本地账号密码进行登录并初化用户信息。
     * - 获取的版本停用信息，看看当前版本是否已经被停用了，若被停用，登录功能直接失效。
     */
    @OptIn(ExperimentalCoroutinesApi::class)
    private fun initNetwork() {
        lifecycleScope.launch(Dispatchers.IO) {
            OnlineData.asyncLogin().apply {
                withContext(Dispatchers.Main) {
                    data?.let {
                        finishAndStart()
                    } ?: initUI()
                }
            }
        }
    }


    private fun initUI() {
        mDataBinding.apply {
            edit1.setText(userId)
            edit2.setText(password)

            buttonLogin.setOnClickListener {
                userId = edit1.text.toString()
                password = edit2.text.toString()
                login {
                    ToastUtil.error(getString(R.string.login_failed))
                }
            }

            mViewModel.dontPublic.observe(this@LoginActivity) {
                checkbox1.isChecked = it
                checkButtonEnable()
            }

            mViewModel.responsibleSelf.observe(this@LoginActivity) {
                checkbox2.isChecked = it
                checkButtonEnable()
            }

            checkbox1.setOnCheckedChangeListener { _, checked ->
                mViewModel.dontPublic.smartNotifyValue = checked
            }

            checkbox2.setOnCheckedChangeListener { _, checked ->
                mViewModel.responsibleSelf.smartNotifyValue = checked
            }
            root.post {
                initStopListener()
            }
        }
    }

    private fun checkButtonEnable() {
        mDataBinding.buttonLogin.isEnabled =
            (mViewModel.dontPublic.value == true && mViewModel.responsibleSelf.value == true)
    }

    /**
     * 根据本地数据直接进行登录
     */
    private fun login(onFailed: (() -> Unit)? = null) {
        loadingDialog.show()
        lifecycleScope.launch(Dispatchers.IO) {
            OnlineData.asyncLogin().apply {
                withContext(Dispatchers.Main) {
                    loadingDialog.dismiss()
                    data?.let {
                        finishAndStart()
                    } ?: let {
                        onFailed?.invoke()
                    }
                }
            }
        }
    }


    /**
     * 登录成功，结束本Activity并打开新的Activity
     */
    private fun finishAndStart() {
        MainActivity::class.startNewActivity()
        finish()
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    companion object {
        private const val INTENT_SIGN_OUT = "INTENT_SIGN_OUT"
        fun startAndClear(fromActivity: Activity? = null) {
            LoginActivity::class.startNewActivity(
                intent = Intent(
                    fromActivity ?: EasyingContext.currentActivity ?: EasyingContext.context,
                    LoginActivity::class.java
                )
            ) {
                putExtra(INTENT_SIGN_OUT, true)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            }
        }
    }

}