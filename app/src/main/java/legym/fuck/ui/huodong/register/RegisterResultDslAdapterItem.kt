package legym.fuck.ui.huodong.register

import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.angcyo.dsladapter.DslAdapterItem
import com.angcyo.dsladapter.DslViewHolder
import legym.fuck.R
import legym.fuck.databinding.ItemRegisterResultBinding
import legym.fuck.logic.legym.network.model.HttpResult
import legym.fuck.logic.legym.network.model.errorString
import legym.fuck.logic.legym.network.model.huodong.HuodongItem
import legym.fuck.ui.huodong.HuoDongBindingAdapter.setActivityDate


/**
 * @author ldh
 * 时间: 2022/3/29 19:25
 *
 */
class RegisterResultDslAdapterItem(
    val activity: HuodongItem,
    val failedReason: String? = null,
    val exceptionResult: HttpResult<out Any?>? = null
) : DslAdapterItem() {

    override var itemLayoutId = R.layout.item_register_result

    override fun onItemBind(
        itemHolder: DslViewHolder,
        itemPosition: Int,
        adapterItem: DslAdapterItem,
        payloads: List<Any>
    ) {
        super.onItemBind(itemHolder, itemPosition, adapterItem, payloads)
        with(itemHolder) {
            val binding = DataBindingUtil.bind<ItemRegisterResultBinding>(itemView)!!
            binding.apply {
                title.text = activity.name
                subtitle2.setActivityDate(activity)
                iconCheck.isVisible = true
                textReason.isVisible = false
                iconSad.isVisible = false
                failedReason?.let {
                    iconCheck.isVisible = false
                    iconSad.isVisible = true
                    textReason.isVisible = true
                    textReason.setTextColor(context.getColor(R.color.orange_500))
                    textReason.text = it
                }
                exceptionResult?.let {
                    iconCheck.isVisible = false
                    iconSad.isVisible = true
                    textReason.isVisible = true
                    textReason.setTextColor(context.getColor(R.color.deep_orange_500))
                    textReason.text = it.errorString
                }
            }
            binding.invalidateAll()
        }
    }

}