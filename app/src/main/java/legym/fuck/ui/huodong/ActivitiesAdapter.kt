package legym.fuck.ui.huodong

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.liangguo.androidkit.color.resolveColor
import legym.fuck.R
import legym.fuck.config.AppConfig.ENABLE_SIGN_ADVANCE
import legym.fuck.databinding.ItemHuodongBinding
import legym.fuck.logic.legym.network.model.huodong.HuodongItem
import legym.fuck.logic.legym.network.model.huodong.isTimeRegisterAble
import legym.fuck.ui.huodong.model.UiAction


/**
 * @author ldh
 * 时间: 2022/3/28 10:39
 *
 */
class ActivitiesAdapter(
    private val selectedActivities: MutableSet<String>,
    private val onActionCallback: (UiAction) -> Unit
) :
    RecyclerView.Adapter<ActivitiesAdapter.ViewHolder>() {

    var activities = mutableListOf<HuodongItem>()
        set(value) {
            val result = DiffUtil.calculateDiff(ActivitiesDiffCallback(field, value))
            field = value
            result.dispatchUpdatesTo(this)
        }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = DataBindingUtil.bind<ItemHuodongBinding>(itemView)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_huodong, parent, false)
        ).apply {
            binding.clickView.setOnClickListener {
                it.tag?.toString()?.toIntOrNull()?.let { index ->
                    onActionCallback(UiAction.OnActivityClick(activities[index], index))
                }
            }
        }
    }

    override fun getItemCount() = activities.size

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.binding) {
            activities[position].apply {
                activity = activities[position]
                clickView.tag = position

                val selected = selectedActivities.contains(id)
                viewSelected.isVisible = selected
                viewSelectedBackground.isVisible = selected

                textLimitPeople.text = "/$limitPeopleNumber"
                textPeople.apply {
                    text = registerPeople.toString()
                    val retain = limitPeopleNumber - registerPeople
                    when {
                        retain <= 0 -> R.color.deep_orange_500
                        retain <= 30 -> R.color.orange_500
                        else -> R.color.green_500
                    }.let { setTextColor(context.getColor(it)) }
                }
                textState.apply {
                    text = stateName
                    val color = when (state) {
                        4 -> context.getColor(R.color.green_500)
                        else -> context.resolveColor(R.attr.colorSurface)
                    }
                    setTextColor(color)
                }

                bgUrl?.let {
                    com.bumptech.glide.Glide.with(imageCover)
                        .load(it)
                        .placeholder(R.drawable.home_bg_defalt_today_plan)
                        .into(imageCover)
                }
                widgetEndButton.apply {
                    setOnClickListener { }
                    alpha = 1f
                    isVisible = true
                    isEnabled = true
                    icon = null
                    text = ""
                    try {
                        when (state) {
                            0, 1 -> {
                                if (!ENABLE_SIGN_ADVANCE && (state == 0 && isTimeRegisterAble)) {
                                    text = "报名未开始"
                                    isEnabled = false
                                    return
                                }
                                //报名还未开始，正在报名中
                                text = if (isRegister) {
                                    setOnClickListener {
                                        onActionCallback(UiAction.CancelSignUp(activities[position].id))
                                    }
                                    alpha = 0.7f
                                    "取消报名"
                                } else {
                                    setOnClickListener {
                                        onActionCallback(UiAction.GoSignUp(activities[position]))
                                    }
                                    isInvisible = registerPeople >= limitPeopleNumber
                                    "去报名"
                                }

                            }

                            2 -> {
                                //报名已结束但活动还未开始
                                text = "活动即将开始"
                                isEnabled = false
                            }

                            4 -> {
                                //活动正在进行中
                                text = if (isRegister) {
                                    //报名了，就去签到
                                    if (isSign == true) {
                                        setOnClickListener {
                                            onActionCallback(UiAction.ActivitySignIn(activities[position].id))
                                        }
                                        if (signTime != null && openSignTimes != null) "签到 $signTime/$openSignTimes"
                                        else "去签到"
                                    } else {
                                        isEnabled = false
                                        setIconResource(R.drawable.ic_baseline_check_24)
                                        "已签到"
                                    }
                                } else {
                                    //若仍在报名时间段内，则可去报名
                                    val currentTime = System.currentTimeMillis()
                                    if (currentTime <= endRegisterTime.toLong()) {
                                        setOnClickListener {
                                            onActionCallback(UiAction.GoSignUp(activities[position]))
                                        }
                                        "去报名"
                                    } else {
                                        isEnabled = false
                                        "进行中"
                                    }
                                }
                            }

                            5 -> {
                                //活动已结束
                                isEnabled = false
                                text = "已结束"
                                if (isRegister) {
                                    setIconResource(R.drawable.ic_emoticon_sad_outline)
                                    text = "未签到"
                                    if (openSignTimes != null && openSignTimes == signTime) {
                                        setIconResource(R.drawable.ic_baseline_check_24)
                                        text = "已签"
                                    }
                                }
                            }

                        }
                    } catch (e: Exception) {
                    }
                }
                invalidateAll()
            }
        }
    }

}

private class ActivitiesDiffCallback(
    private val mOldList: MutableList<HuodongItem>,
    private val mNewList: MutableList<HuodongItem>
) : DiffUtil.Callback() {

    override fun getOldListSize() = mOldList.size

    override fun getNewListSize() = mNewList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        mOldList[oldItemPosition].id == mNewList[newItemPosition].id

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        mOldList[oldItemPosition].toString() == mNewList[newItemPosition].toString() && oldItemPosition == newItemPosition

}
