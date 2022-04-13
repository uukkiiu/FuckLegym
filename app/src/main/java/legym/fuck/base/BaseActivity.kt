package legym.fuck.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.liangguo.androidkit.app.contentView
import com.liangguo.androidkit.app.matchParent
import com.liangguo.androidkit.color.ColorUtil
import com.liangguo.androidkit.color.resolveColor
import com.tencent.bugly.beta.Beta
import com.zackratos.ultimatebarx.ultimatebarx.statusBarOnly
import kotlinx.coroutines.launch
import legym.fuck.R
import legym.fuck.config.AppConfig
import legym.fuck.config.defaultMMKV
import legym.fuck.config.initOnlineData
import legym.fuck.config.loadStopInfo
import legym.fuck.databinding.ActivityStopBinding
import legym.fuck.databinding.DialogLoadingBinding
import legym.fuck.logic.OnlineData
import legym.fuck.logic.clouds.CloudsNetworkRepository
import legym.fuck.logic.clouds.NoticeLogic.onNoticeButtonClick
import legym.fuck.logic.clouds.model.Notice
import legym.fuck.logic.clouds.model.StopConfig


/**
 * @author ldh
 * 时间: 2022/3/17 16:54
 *
 */
abstract class BaseActivity : AppCompatActivity() {

    protected val noticeKey: String
        get() = "NoticeKey - " + javaClass.simpleName

    protected open val stopBinding by lazy {
        DataBindingUtil.bind<ActivityStopBinding>(
            LayoutInflater.from(this).inflate(R.layout.activity_stop, null)
        )!!
    }

    protected val loadingDialogBinding by lazy {
        DataBindingUtil.bind<DialogLoadingBinding>(
            layoutInflater.inflate(
                R.layout.dialog_loading,
                null
            )
        )!!
    }

    protected val loadingDialog by lazy {
        MaterialAlertDialogBuilder(this, R.style.MaterialAlertDialog_Material3)
            .setView(loadingDialogBinding.root)
            .setCancelable(false)
            .create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //接收通知信息
        initNotices()
        //接收停止的配置
        loadStopInfo()
        initOnlineData()
        super.onCreate(savedInstanceState)
        runOnUiThread {
            kotlin.runCatching {
                Beta.checkUpgrade(false, true)
            }
        }
        OnlineData.getUserDataOrRelogin { }
        //适配状态栏
        statusBarOnly {
            //布局是否侵入状态栏（true 不侵入，false 侵入）
            fitWindow = false
            light = ColorUtil.isColorLight(resolveColor(R.attr.colorSurface))
        }

        window.decorView.post {
            contentView?.setBackgroundColor(resolveColor(R.attr.colorSurface))
        }

        runOnUiThread {
            initStopListener()
        }

    }

    protected fun initStopListener() {
        AppConfig.stopInfo.observe(this) {
            it?.apply {
                //处理停用信息
                if (deprecatedVersion >= AppConfig.versionCode) {
                    //该版本可能停用，在saveVersions里面找找该版本是否需要保留
                    if (!saveVersion.contains(AppConfig.versionCode)) {
                        //该版本停用，显示停用对话框
                        setContentView(stopBinding.root)
                        stopBinding.tvTitle.text = info.title
                        stopBinding.tvMessage.text = info.message
                        button?.let {
                            stopBinding.button.text = button.text
                            stopBinding.button.isVisible = true
                            stopBinding.button.setOnClickListener {
                                onNoticeButtonClick(button)
                            }
                        } ?: let { stopBinding.button.isVisible = false }
                    }
                }
            }
        }

    }

    /**
     * 停用
     */
    private fun showStopInfo(stopConfig: StopConfig) {
        MaterialAlertDialogBuilder(this, R.style.MaterialAlertDialog_Material3)
            .setTitle(stopConfig.info.title)
            .setMessage(stopConfig.info.message)
            .apply {
                stopConfig.button?.let { button ->
                    setPositiveButton(button.text) { _, _ ->
                        onNoticeButtonClick(button)
                    }
                }
            }
            .setCancelable(false)
            .show()
    }


    protected open fun initNotices() {
        lifecycleScope.launch {
            CloudsNetworkRepository.getNotices()?.forEach { notice ->
                if (notice.show && notice.targetActivity == this@BaseActivity.javaClass.simpleName) {
                    if (notice.alwaysShow || defaultMMKV.getString(noticeKey, null) != notice.id) {
                        //需要通知
                        onShowNotice(notice)
                        defaultMMKV.putString(noticeKey, notice.id)
                    }
                }
            }
        }
    }

    protected open fun onShowNotice(notice: Notice) {
        with(notice) {
            MaterialAlertDialogBuilder(this@BaseActivity, R.style.MaterialAlertDialog_Material3)
                .setTitle(title)
                .setCancelable(cancelable)
                .setMessage(message)
                .apply {
                    buttons.forEachIndexed { index, button ->
                        when (index) {
                            0 -> setPositiveButton(button.text) { _, _ ->
                                onNoticeButtonClick(button)
                            }

                            1 -> setNegativeButton(button.text) { _, _ ->
                                onNoticeButtonClick(button)
                            }

                            2 -> setNeutralButton(button.text) { _, _ ->
                                onNoticeButtonClick(button)
                            }
                        }
                    }
                }.show()
        }
    }


    protected fun appCompatOnCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}