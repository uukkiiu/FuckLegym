package legym.fuck.ui.main

import android.Manifest
import android.Manifest.permission.READ_EXTERNAL_STORAGE
import android.Manifest.permission.WRITE_EXTERNAL_STORAGE
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import legym.fuck.R
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.badge.BadgeUtils
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.liangguo.androidkit.app.ToastUtil
import com.liangguo.androidkit.app.startNewActivity
import com.liangguo.androidkit.color.resolveColor
import com.liangguo.claritypermission.requestPermissionsWithCallback
import com.pgyersdk.feedback.PgyFeedback
import kotlinx.coroutines.flow.collectLatest
import legym.fuck.base.BaseActivity
import legym.fuck.config.AppConfig
import legym.fuck.logic.LocalUserData
import legym.fuck.logic.OnlineData
import legym.fuck.ui.course.CourseActivity
import legym.fuck.ui.doc.DocActivity
import legym.fuck.ui.huodong.HuoDongActivity
import legym.fuck.ui.login.LoginActivity
import legym.fuck.ui.main.newuser.NewUserDialogFragment
import legym.fuck.ui.run.RunningActivity
import legym.fuck.ui.runhistory.RunningHistoryActivity
import legym.fuck.utils.AppUtils


/**
 * @author ldh
 * 时间: 2022/3/18 11:30
 *
 */
@SuppressLint("InflateParams")
class MainActivity : BaseActivity(), View.OnClickListener {

    private lateinit var binding: legym.fuck.databinding.ActivityMainBinding

    private val mBadgeDrawable by lazy {
        BadgeDrawable.create(this@MainActivity).apply {
            badgeGravity = BadgeDrawable.TOP_END
            backgroundColor = resolveColor(R.attr.colorError)
        }
    }

    private val mRulesDialog by lazy {
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_running_rules, null)
        view.findViewById<RecyclerView>(R.id.recyclerView)?.adapter = mViewModel.runningRulesAdapter
        MaterialAlertDialogBuilder(this, R.style.MaterialAlertDialog_Material3)
            .setTitle(R.string.running_rules)
            .setView(view)
            .setPositiveButton(R.string.confirm, null)
            .create()
    }


    private val mViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        OnlineData.userData.value ?: let {
            LoginActivity.startAndClear(this)
            return
        }
        binding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
            )
        initViews()
        initDataListeners()
        checkFirstRegister()

    }

    private fun checkFirstRegister() {
        OnlineData.firstRegister.asLiveData(lifecycleScope.coroutineContext)
            .observe(this) {
                if (it) {
                    //是新用户注册
                    NewUserDialogFragment().showIfNeeded(supportFragmentManager)
                }
            }
    }

    @SuppressLint("SetTextI18n", "UnsafeOptInUsageError")
    private fun initDataListeners() {
        mViewModel.semTotalMils.observe(this) {
            it?.let {
                binding.textSemesterMileageTotal.text = "/" + it + "km"
                binding.progress.max = it
                mViewModel.currentMilsInt.apply {
                    value = value
                }
            }
        }

        AppConfig.onLineConfig.asLiveData(lifecycleScope.coroutineContext).observe(this) {
            binding.containerSubtitle.isInvisible = !it.enableConsumeIntegral
        }

        mViewModel.totalRunned.observe(this) {
            binding.textSemesterMileageCurrent.text = it
        }

        mViewModel.currentMilsInt.observe(this) {
            it?.let {
                binding.progress.setProgressCompat(it, true)
            }
        }

        OnlineData.unreadDocList.asLiveData().observe(this) {
            BadgeUtils.attachBadgeDrawable(
                mBadgeDrawable.apply {
                    setVisible(it.isNotEmpty(), true)
                    number = it.size
                }, binding.toolbar, R.id.menu_item_doc
            )

            if (it.isEmpty())
                BadgeUtils.detachBadgeDrawable(null, binding.toolbar, R.id.menu_item_doc)
        }

        OnlineData.runningLimitFlow.asLiveData().observe(this) { limit ->
            limit?.let { limit ->
                binding.buttonRunning.setOnClickListener {
                    RunningActivity::class.startNewActivity()
                }
                kotlin.runCatching {
                    val current = System.currentTimeMillis()
                    limit.runningTimeLimit?.startTime?.toLong()!! <= current && current <= limit.runningTimeLimit.endTime.toLong()
                }.getOrNull()?.let {
                    if (!it) {
                        binding.buttonRunning.setOnClickListener {
                            ToastUtil.warning(getString(R.string.running_time_illeagal))
                        }
                    }
                }
                if (!limit.hasRule) {
                    binding.textSemesterMileageTotal.text = "/无限制"
                }
                binding.chipRule.isVisible = limit.hasRule
            }
        }
        OnlineData.userData.asLiveData(lifecycleScope.coroutineContext).observe(this) { result ->
            binding.user = result
        }


    }

    private fun initViews() {
        binding.lifecycleOwner = this
        binding.apply {
            containerSubtitle.setOnClickListener {
            }
            AppUtils.getVersionName()?.let {
                textVersion.text = it
            }
            toolbar.inflateMenu(R.menu.menu_main)
            toolbar.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.sign_out -> {
                        LocalUserData.password = ""
                        LoginActivity.startAndClear(this@MainActivity)
                    }
                    R.id.feedback -> {
                        requestPermissionsWithCallback(
                            WRITE_EXTERNAL_STORAGE,
                            READ_EXTERNAL_STORAGE,
                            Manifest.permission.RECORD_AUDIO
                        ) {
                            PgyFeedback.getInstance().showDialog(this@MainActivity)
                        }
                    }
                    R.id.menu_item_doc -> DocActivity::class.startNewActivity()

                }
                true
            }

            buttonSignActivity.setOnClickListener(this@MainActivity)
            buttonSignCourse.setOnClickListener(this@MainActivity)
            chipRule.setOnClickListener(this@MainActivity)
            cardContainer.setOnClickListener(this@MainActivity)
        }

    }

    override fun onClick(p0: View?) {
        binding.apply {
            when (p0) {
                buttonSignActivity -> HuoDongActivity::class.startNewActivity()
                buttonSignCourse -> CourseActivity::class.startNewActivity()
                chipRule -> mRulesDialog.show()
                cardContainer -> RunningHistoryActivity::class.startNewActivity()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        mViewModel.loadHasRun()
    }

}
