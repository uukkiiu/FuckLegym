package legym.fuck.widget.views

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView
import legym.fuck.R


/**
 * @author ldh
 * 时间: 2022/1/29 10:08
 *
 *
 * 可以定义最大高度的RecyclerView
 */
class MaxHeightRecyclerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = -1
) : RecyclerView(
    context,
    attrs,
    defStyleAttr
) {

    private val maxHeight: Int

    init {
        val a = context.obtainStyledAttributes(attrs, R.styleable.MaxHeightRecyclerView)
        maxHeight = a.getLayoutDimension(R.styleable.MaxHeightRecyclerView_maxHeight, -1)
        a.recycle()
    }

    override fun onMeasure(widthSpec: Int, heightSpec: Int) {
        if (maxHeight > 0) {
            super.onMeasure(widthSpec, MeasureSpec.makeMeasureSpec(maxHeight, MeasureSpec.AT_MOST))
        } else
            super.onMeasure(widthSpec, heightSpec)
    }

}