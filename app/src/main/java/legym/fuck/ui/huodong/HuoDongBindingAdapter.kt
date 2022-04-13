package legym.fuck.ui.huodong

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.liangguo.androidkit.commons.CalendarUtil
import com.liangguo.androidkit.commons.CalendarUtil.toNearDayString
import com.liangguo.androidkit.commons.dayOfWeek
import com.liangguo.androidkit.commons.toHHMM
import legym.fuck.logic.legym.network.model.huodong.HuodongItem


/**
 * @author ldh
 * 时间: 2022/3/29 19:39
 *
 */
object HuoDongBindingAdapter {

    /**
     * 适配活动时间的文字
     */
    @JvmStatic
    @BindingAdapter("setActivityDate")
    fun TextView.setActivityDate(activity: HuodongItem?) {
        activity?.apply {
            try {
                val start = CalendarUtil.getCalendarByTimeMills(
                    startTime.toLong()
                )
                val end =
                    CalendarUtil.getCalendarByTimeMills(endTime.toLong())
                val textStr = StringBuilder()
                    .apply {
                        val cal = CalendarUtil.getCalendarByTimeMills(startTime.toLong())
                        append(cal.toNearDayString() ?: cal.dayOfWeek)
                    }
                    .append(" (")
                    .append(start.get(java.util.Calendar.MONTH) + 1)
                    .append("月")
                    .append(start.get(java.util.Calendar.DAY_OF_MONTH))
                    .append("号) ")
                    .append(start.toHHMM())
                    .append('~')
                    .append(end.toHHMM())
                text = textStr
            } catch (e: Exception) {
            }
        }
    }



}