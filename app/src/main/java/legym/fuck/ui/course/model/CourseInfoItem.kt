package legym.fuck.ui.course.model

import android.annotation.SuppressLint
import androidx.databinding.DataBindingUtil
import com.angcyo.dsladapter.DslAdapterItem
import com.angcyo.dsladapter.DslViewHolder
import legym.fuck.R
import legym.fuck.databinding.ItemCourseInfoCardBinding
import legym.fuck.logic.legym.network.model.course.info.CourseInfoListItem
import java.text.SimpleDateFormat
import java.util.*


/**
 * @ClassName CourseInfoItem
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月30日 22:55
 **/
class CourseInfoItem(
    val info: CourseInfoListItem
) : DslAdapterItem() {

    override var itemLayoutId = R.layout.item_course_info_card

    init {
        itemData = info
        thisAreContentsTheSame = { fromItem, newItem, _, _ ->
            fromItem?.itemData == newItem.itemData
        }
        thisAreItemsTheSame = { fromItem, newItem, _, _ ->
            fromItem?.itemData == newItem.itemData
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onItemBind(
        itemHolder: DslViewHolder,
        itemPosition: Int,
        adapterItem: DslAdapterItem,
        payloads: List<Any>
    ) {
        super.onItemBind(itemHolder, itemPosition, adapterItem, payloads)
        itemHolder.view(R.id.item_course_info)?.let {
            DataBindingUtil.bind<ItemCourseInfoCardBinding>(it)?.apply {
                val formatter = SimpleDateFormat("MM/dd", Locale.CHINA)
                courseInfoWeek.text = "第${info.weekNumber}周"
                courseInfoDate.text = info.startSignDate?.let { date ->
                    formatter.format(date)
                }
                courseInfoStatus.setImageResource(
                    if (info.startSignDataStatus!!) {
                        if (info.startSignNumber == info.signNumber) {
                            //已签
                            R.drawable.ic_baseline_check_circle_24
                        } else {
                            //未签
                            R.drawable.ic_baseline_cancel_24
                        }
                    } else {
                        R.drawable.ic_baseline_access_time_24
                    }
                )
//                val calendar = CalendarUtil.getCalendarByTimeMills(gradeDetail.startTime.toLong())
//                textDate.text = calendar.toNearDayString()?.let { nearDay ->
//                    nearDay + " " + calendar.dayOfWeek
//                } ?: CalendarUtil.toCompleteDateString(calendar)
                invalidateAll()
            }
        }
    }

}