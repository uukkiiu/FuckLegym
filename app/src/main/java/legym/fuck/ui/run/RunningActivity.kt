package legym.fuck.ui.run

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import legym.fuck.R
import legym.fuck.databinding.ActivityRunningBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.slider.RangeSlider
import com.liangguo.androidkit.app.ToastUtil
import com.liangguo.androidkit.app.startNewActivity
import com.liangguo.androidkit.string.ChineseStringMatcher
import com.liangguo.easyingcontext.EasyingContext
import com.xeinebiu.suspend.dialogs.confirm
import kotlinx.coroutines.*
import legym.fuck.base.ParallaxImageActivity
import legym.fuck.config.AppConfig
import legym.fuck.config.AppConfig.FLOAT_FORMAT_DOUBLE
import legym.fuck.logic.OnlineData
import legym.fuck.logic.legym.network.model.running.dailyMileageOrDefault
import legym.fuck.logic.legym.network.model.running.weeklyMileageOrDefault
import legym.fuck.ui.run.logic.RunningPrefUtil
import legym.fuck.ui.run.logic.RunningType
import maputil.MapSelector
import kotlin.math.max


/**
 * @author ldh
 * 时间: 2022/3/17 11:25
 *
 */
class RunningActivity : ParallaxImageActivity() {

    private val mDataBinding by lazy {
        ActivityRunningBinding.inflate(layoutInflater, contentViewContainer, true)
    }

    private val mViewModel by viewModels<RunningViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initDataListeners()
        initData()
    }

    private fun initData() {
        lifecycleScope.launch(Dispatchers.IO) {
            val range = RunningPrefUtil.prefDistanceRange
            withContext(Dispatchers.Main) {
                mDataBinding.rangeSlider.values = range
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun initDataListeners() {
        mViewModel.distanceRange.observe(this) {
            mDataBinding.textSliderValue.text = RANGE_FORMAT.format(it.first(), it.last())
        }
        mViewModel.runningType.observe(this) {
            mDataBinding.settingChooseType.subtitleTextView.text = it.title
        }
        mViewModel.selectedMap.observe(this) {
            mDataBinding.settingChooseArea.subtitleTextView.text = it
        }

        OnlineData.runningLimitFlow.asLiveData().observe(this) {
            if (it == null) return@observe

            with(mDataBinding) {
                cardDayProgress.isVisible = it.hasRule
                cardWeekProgress.isVisible = it.hasRule
                if (!it.hasRule) return@observe
                val progressDayMax = (it.dailyMileageOrDefault * 100).toInt()
                progressDay.max = progressDayMax
                val totalDayMileage = it.totalDayMileage?.toFloatOrNull() ?: 0f
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    progressDay.setProgress((totalDayMileage * 100).toInt(), true)
                } else {
                    progressDay.progress = (totalDayMileage * 100).toInt()
                }
                todayHasRun.text = "${it.totalDayMileage} km"
                val dayProgress = with(progressDayMax) {
                    if (this == 0) 0 else progressDay.progress * 100 / this
                }
                textProgressDay.text = "${dayProgress}%"
                with(dayProgress == 100) {
                    checkProgressDay.isVisible = this
                    textProgressDay.isVisible = !this
                    if (this) progressDay.hide() else progressDay.show()
                }

                val progressWeekMax = (it.weeklyMileageOrDefault * 100).toInt()
                progressWeek.max = progressWeekMax
                val totalWeekMileage = it.totalWeekMileage?.toFloatOrNull() ?: 0f
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    progressWeek.setProgress((totalWeekMileage * 100).toInt(), true)
                } else {
                    progressWeek.progress = (totalWeekMileage * 100).toInt()
                }
                weekHasRun.text = "${it.totalWeekMileage} km"
                val weekProgress = with(progressWeekMax) {
                    if (this == 0) 0 else progressWeek.progress * 100 / this
                }
                textProgressWeek.text = "${weekProgress}%"
                with(weekProgress == 100) {
                    checkProgressWeek.isVisible = this
                    textProgressWeek.isVisible = !this
                    if (this) progressWeek.hide() else progressWeek.show()
                }
            }
        }
    }

    private fun initViews() {
        with(mDataBinding) {
            //选择跑步路程范围
            rangeSlider.addOnChangeListener { slider, _, _ ->
                mViewModel.distanceRange.value = slider.values
            }

            rangeSlider.addOnSliderTouchListener(object :
                RangeSlider.OnSliderTouchListener {
                override fun onStartTrackingTouch(slider: RangeSlider) {}
                override fun onStopTrackingTouch(slider: RangeSlider) {
                    RunningPrefUtil.prefDistanceRange =
                        listOf(slider.values.first(), slider.values.last())
                }
            })

            //选择跑步类型
            settingChooseType.setOnClickListener {
                val titles = mutableListOf<String>()
                RunningType.allTypes.forEach {
                    titles.add(it.title)
                }
                MaterialAlertDialogBuilder(
                    this@RunningActivity,
                    R.style.MaterialAlertDialog_Material3
                )
                    .setTitle(R.string.running_type)
                    .setItems(titles.toTypedArray()) { _, witch ->
                        mViewModel.updateRunningType(RunningType.allTypes[witch])
                    }
                    .show()
            }


            //选择跑步的地图
            settingChooseArea.setOnClickListener {
                val maps = mViewModel.totalMaps.value
                MaterialAlertDialogBuilder(
                    this@RunningActivity,
                    R.style.MaterialAlertDialog_Material3
                )
                    .setTitle(R.string.running_type)
                    .setPositiveButton(R.string.draw_map_by_self) { _, _ ->
                        MapSelector::class.startNewActivity()
                    }
                    .setItems(maps.toTypedArray()) { _, witch ->
                        mViewModel.onMapSelected(maps[witch])
                    }
                    .show()
            }


            //点击上传数据
            buttonUpload.setOnClickListener {
                lifecycleScope.launch {
                    checkSchoolMatch { return@launch }
                    checkDateLimit { return@launch }
                    loadingDialog.show()
                    val result = mViewModel.uploadRunningData()
                    if (result.success) {
                        //上传成功后要重新加载跑步限制
                        OnlineData.loadRunningLimitData(OnlineData.currentData.value!!)
                        ToastUtil.success(
                            EasyingContext.context.getString(R.string.upload_success) + "  本次有效${
                                FLOAT_FORMAT_DOUBLE.format(result.effectiveMileage)
                            } km， 总共${FLOAT_FORMAT_DOUBLE.format(result.totalMileage)} km",
                            duration = Toast.LENGTH_LONG
                        )
                        loadingDialog.dismiss()
                    } else {
                        ToastUtil.error(EasyingContext.context.getString(R.string.upload_failed))
                    }
                }
            }
        }
    }

    //检查用户选择的学校匹不匹配
    private suspend inline fun checkSchoolMatch(brake: () -> Unit) {
        //通过中文匹配度判定有没有选错学校
        val matchResult1 = ChineseStringMatcher(
            RunningPrefUtil.prefRunningMap ?: OnlineData.getUserDataAsync().schoolName,
            OnlineData.getUserDataAsync().schoolName
        )
        val matchResult2 = ChineseStringMatcher(
            RunningPrefUtil.prefRunningMap ?: EasyingContext.context.getString(R.string.diy_path),
            EasyingContext.context.getString(R.string.diy_path)
        )

        //匹配度低于40%才会弹出对话框询问,否则直接运行起走
        if (max(matchResult1.matchingRate, matchResult2.matchingRate) < 40) {
            val result = MaterialAlertDialogBuilder(
                this@RunningActivity,
                R.style.MaterialAlertDialog_Material3
            )
                .setTitle(R.string.alert)
                .setMessage(getString(R.string.map_not_match_alert))
                .confirm(
                    positiveButtonText = getString(R.string.still_upload),
                    negativeButtonText = getString(R.string.cancel)
                )
            if (result.toString() != getString(R.string.confirm)) brake()
        }
    }

    //检查当前时间是否在跑步日期之内
    private suspend inline fun checkDateLimit(brake: () -> Unit) {
        OnlineData.runningLimitFlow.value?.runningTimeLimit?.let {
            val start = it.startTime.toLongOrNull()
            val end = it.endTime.toLongOrNull()
            if (start == null || end == null) return@let
            if (start > System.currentTimeMillis() || end < System.currentTimeMillis()) {
                //这个时候就说明有问题了,跑步日期还未开始或者已经结束了
                val result = MaterialAlertDialogBuilder(
                    this@RunningActivity,
                    R.style.MaterialAlertDialog_Material3
                )
                    .setTitle(R.string.alert)
                    .setMessage(getString(R.string.running_date_invaild))
                    .confirm(
                        positiveButtonText = getString(R.string.confirm),
                        negativeButtonText = getString(R.string.cancel)
                    )

                if (result.toString() != getString(R.string.confirm)) brake()
            }
        }
    }

    companion object {
        private const val RANGE_FORMAT = "从:%.2f\n到:%.2f"
    }

}