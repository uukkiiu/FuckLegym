package legym.fuck.ui.about

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import com.liangguo.androidkit.app.ToastUtil
import com.liangguo.claritypermission.requestPermissionsWithCallback
import com.pgyersdk.feedback.PgyFeedback
import legym.fuck.R
import legym.fuck.base.BaseActivity
import legym.fuck.config.AppConfig
import legym.fuck.databinding.ActivityAboutBinding
import legym.fuck.utils.AppUtils
import kotlin.random.Random


/**
 * @author ldh
 * 时间: 2022/4/13 23:24
 * 邮箱: 2637614077@qq.com
 */
class AboutActivity : BaseActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityAboutBinding>(
            this,
            R.layout.activity_about
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.initViews()
    }


    private fun ActivityAboutBinding.initViews() {
        AppUtils.getVersionName(this@AboutActivity)?.let {
            textAppVersion.text = it
        }
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        settingItemFeedback.setOnClickListener {
            requestPermissionsWithCallback(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.RECORD_AUDIO
            ) {
                PgyFeedback.getInstance().showDialog(this@AboutActivity)
            }
        }
        settingItemGithub.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/Foreverddb/FuckLegym")
            startActivity(intent)
        }
        settingItemAddGroup.setOnClickListener {
            joinQQGroup("3dn-XpcrTeB-GwI_okqjI0vezMqrET6b")
        }
        imageDrCode.setImageResource(if (Random.nextBoolean()) R.drawable.img_dr_code_ldh else R.drawable.img_dr_code_ddb)
        window.clearFlags(WindowManager.LayoutParams.FLAG_SECURE)

        AppConfig.onLineConfig.asLiveData(lifecycleScope.coroutineContext).observe(this@AboutActivity) { config ->
            config.aboutBegText?.let {
                textBeg.text = it
            }
        }
    }

    fun joinQQGroup(key: String): Boolean {
        val intent = Intent()
        intent.data =
            Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26jump_from%3Dwebapi%26k%3D$key")
        // 此Flag可根据具体产品需要自定义，如设置，则在加群界面按返回，返回手Q主界面，不设置，按返回会返回到呼起产品界面    //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        return try {
            startActivity(intent)
            true
        } catch (e: Exception) {
            // 未安装手Q或安装的版本不支持
            ToastUtil.warning("未安装手Q或安装的版本不支持")
            false
        }
    }

}