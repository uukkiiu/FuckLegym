package legym.fuck.ui.runhistory.model

import androidx.databinding.DataBindingUtil

import com.angcyo.dsladapter.DslAdapterItem
import com.angcyo.dsladapter.DslViewHolder
import com.liangguo.androidkit.commons.CalendarUtil
import com.liangguo.androidkit.commons.CalendarUtil.toCompleteDateString
import com.liangguo.androidkit.commons.CalendarUtil.toNearDayString
import com.liangguo.androidkit.commons.dayOfWeek
import legym.fuck.R
import legym.fuck.databinding.ItemRunningHistoryBinding
import legym.fuck.logic.legym.network.model.running.runningHistory.GradeDetail


/**
 * @author ldh
 * 时间: 2022/3/21 10:09
 *
 */
class HistoryItem(
    val gradeDetail: GradeDetail
) : DslAdapterItem() {

    override var itemLayoutId = R.layout.item_running_history

    init {
        itemData = gradeDetail.id
        thisAreContentsTheSame = { fromItem, newItem, _, _ ->
            fromItem?.itemData == newItem.itemData
        }
        thisAreItemsTheSame ={ fromItem, newItem, _, _ ->
            fromItem?.itemData == newItem.itemData
        }
    }

    override fun onItemBind(
        itemHolder: DslViewHolder,
        itemPosition: Int,
        adapterItem: DslAdapterItem,
        payloads: List<Any>
    ) {
        super.onItemBind(itemHolder, itemPosition, adapterItem, payloads)
        itemHolder.view(R.id.item_running_history)?.let {
            DataBindingUtil.bind<ItemRunningHistoryBinding>(it)?.apply {
                grade = gradeDetail
                val calendar = CalendarUtil.getCalendarByTimeMills(gradeDetail.startTime.toLong())
                 textDate.text = calendar.toNearDayString()?.let { nearDay ->
                    nearDay + " " + calendar.dayOfWeek
                } ?: toCompleteDateString(calendar)
                invalidateAll()
            }
        }
    }

}