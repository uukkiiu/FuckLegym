package legym.fuck.ui.signin.model

import androidx.databinding.DataBindingUtil
import legym.fuck.R
import legym.fuck.databinding.ItemActivityCardBinding
import com.angcyo.dsladapter.DslAdapterItem
import com.angcyo.dsladapter.DslViewHolder
import legym.fuck.logic.legym.network.model.signin.signin.ItemsItem
import legym.fuck.ui.signin.SignInViewModel
import java.text.SimpleDateFormat
import java.util.*


/**
 * @ClassName ActivityItem
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月26日 23:28
 **/
class ActivityItem(
    val info: ItemsItem,
    val mViewModel: SignInViewModel
) : DslAdapterItem() {

    override var itemLayoutId = R.layout.item_activity_card

    init {
        itemData = info
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
        itemHolder.view(R.id.item_activity_card)?.let {
            DataBindingUtil.bind<ItemActivityCardBinding>(it)?.apply {
                val formatter = SimpleDateFormat("MM月dd日 HH:mm", Locale.CHINA)

                //处理选中事件
                cardView.apply {
                    if(mViewModel.selectActivities.value!!.contains((adapterItem.itemData as ItemsItem).id)) isChecked = true
                    setOnClickListener {
                        isChecked = !isChecked
                        if(isChecked)
                            mViewModel.selectActivities.value?.put((adapterItem.itemData as ItemsItem).id, (adapterItem.itemData as ItemsItem).name)
                        else mViewModel.selectActivities.value?.remove((adapterItem.itemData as ItemsItem).id)
                    }
                }

                titleTextView.text = info.name
                stateTextView.text = info.stateName
                timeTextView.text = "${formatter.format(info.startTime?.toLong())} - ${formatter.format(info.endTime?.toLong())}"
                isRegister.text = if (info.isRegister) "已报名" else "未报名"
                isSign.text = if (info.isSign) "已签到" else "未签到"

            }
        }
    }
}