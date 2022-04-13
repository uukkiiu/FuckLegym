package legym.fuck.widget.behavior

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.appbar.AppBarLayout

private typealias DependentViewChangedListener = (
    dependencyY: Float,
    parent: CoordinatorLayout,
    child: View,
    dependency: View
) -> Unit

/**
 * @author ldh
 * 时间: 2022/1/26 15:49
 *
 *
 * 本质上还是[AppBarLayout.ScrollingViewBehavior]，只不过可以添加监听了
 */
class ObservableScrollingViewBehavior constructor(
    context: Context? = null,
    attrs: AttributeSet? = null
) : AppBarLayout.ScrollingViewBehavior(context, attrs) {

    private val mOnDependentViewChangedListeners = mutableListOf<DependentViewChangedListener>()

    fun addOnDependentViewChangedListener(listener: DependentViewChangedListener) {
        mOnDependentViewChangedListeners.add(listener)
    }

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        mOnDependentViewChangedListeners.forEach {
            it(dependency.y, parent, child, dependency)
        }
        return super.onDependentViewChanged(parent, child, dependency)
    }


}