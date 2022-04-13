package legym.fuck.ui.main

import android.annotation.SuppressLint
import legym.fuck.R
import com.angcyo.dsladapter.DslAdapterItem
import com.angcyo.dsladapter.DslViewHolder


/**
 * @author ldh
 * 时间: 2022/3/20 20:41
 *
 */
class RunningRulesItemModel(
    val title: String,
    val summary: String = "",
    val isDriver: Boolean = false
) : DslAdapterItem() {

    override var itemLayoutId = R.layout.item_running_rules

    init {
        itemData = title
    }

    @SuppressLint("SetTextI18n")
    override fun onItemBind(
        itemHolder: DslViewHolder,
        itemPosition: Int,
        adapterItem: DslAdapterItem,
        payloads: List<Any>
    ) {
        super.onItemBind(itemHolder, itemPosition, adapterItem, payloads)
        if (isDriver) {
            itemHolder.tv(R.id.driver)?.text = title
        } else {
            itemHolder.tv(R.id.title)?.text = "$title: "
            itemHolder.tv(R.id.subtitle)?.text = summary
        }
    }


}