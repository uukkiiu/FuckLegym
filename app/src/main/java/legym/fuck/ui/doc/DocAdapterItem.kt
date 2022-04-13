package legym.fuck.ui.doc

import com.angcyo.dsladapter.DslAdapterItem
import com.angcyo.dsladapter.DslViewHolder
import legym.fuck.R
import legym.fuck.logic.clouds.model.DocInfo


/**
 * @author ldh
 * 时间: 2022/3/21 23:00
 *
 */
class DocAdapterItem(val doc: DocInfo, val clickListener: (DocInfo) -> Unit) : DslAdapterItem() {

    override var itemLayoutId = R.layout.item_doc_list

    init {
        itemData = doc.url
    }

    override fun onItemBind(
        itemHolder: DslViewHolder,
        itemPosition: Int,
        adapterItem: DslAdapterItem,
        payloads: List<Any>
    ) {
        super.onItemBind(itemHolder, itemPosition, adapterItem, payloads)
        with(itemHolder) {
            click(itemView) {
                clickListener(doc)
            }
            tv(R.id.title)?.text = doc.title
            tv(R.id.subtitle)?.text = doc.summary
            tv(R.id.text_index)?.text = (itemPosition + 1).toString()

        }
    }

}