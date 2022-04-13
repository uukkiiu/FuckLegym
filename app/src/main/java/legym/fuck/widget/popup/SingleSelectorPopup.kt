package legym.fuck.widget.popup

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import legym.fuck.R
import com.angcyo.dsladapter.DslAdapter
import com.angcyo.dsladapter.DslAdapterItem
import com.angcyo.dsladapter.DslViewHolder
import com.liangguo.androidkit.color.resolveColor
import com.lxj.xpopup.XPopup
import com.lxj.xpopup.enums.PopupPosition
import com.lxj.xpopup.impl.PartShadowPopupView
import legym.fuck.utils.isMaterialDarkTheme


/**
 * @author ldh
 * 时间: 2022/3/27 16:25
 *
 */
class SingleSelectorPopup(context: Context) : PartShadowPopupView(context) {

    private val mAdapter = DslAdapter()

    var clickListener: (Int) -> Unit = {}

    var onDismissListener: () -> Unit = {}

    private val mRecyclerView by lazy {
        findViewById<RecyclerView>(R.id.recyclerView)
    }

    override fun getImplLayoutId() = R.layout.popup_single_selector

    fun setData(selected: Int = 0, data: MutableList<String>) {
        mAdapter.changeDataItems { list ->
            list.clear()
            data.forEach {
                list.add(Item(it, selected, clickListener))
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        popupContentView.setBackgroundColor(Color.TRANSPARENT)
        mRecyclerView.adapter = mAdapter
    }

    override fun onDismiss() {
        super.onDismiss()
        onDismissListener()
    }

    companion object {
        fun create(
            activity: Activity,
            anchor: View,
            clickListener: (Int) -> Unit
        ): SingleSelectorPopup {
            return (XPopup.Builder(activity)
                .atView(anchor)
                .popupPosition(PopupPosition.Bottom)
                .asCustom(SingleSelectorPopup(activity))
                    as SingleSelectorPopup).also {
                it.clickListener = clickListener
            }
        }
    }

    inner class Item(
        private val title: String,
        val selectedIndex: Int,
        var clickListener: (Int) -> Unit
    ) : DslAdapterItem() {
        init {
            itemLayoutId = R.layout.item_single_selector
        }

        @SuppressLint("PrivateResource")
        override fun onItemBind(
            itemHolder: DslViewHolder,
            itemPosition: Int,
            adapterItem: DslAdapterItem,
            payloads: List<Any>
        ) {
            super.onItemBind(itemHolder, itemPosition, adapterItem, payloads)
            val isSelected = selectedIndex == itemPosition
            val selectedColor =
                if (context.isMaterialDarkTheme) R.attr.colorSecondary else R.attr.colorPrimary
            itemHolder.tv(R.id.title)?.apply {
                text = title
                setTextColor(
                    context.resolveColor(
                        if (isSelected) selectedColor
                        else R.attr.colorOutline
                    )
                )
            }
            itemHolder.img(R.id.check)?.isVisible = isSelected
            itemHolder.click(itemHolder.itemView) {
                clickListener(itemPosition)
                dismiss()
            }
        }
    }
}