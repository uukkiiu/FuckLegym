package legym.fuck.logic.interfaces

import android.annotation.SuppressLint
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.scwang.smart.refresh.layout.api.RefreshFooter
import com.scwang.smart.refresh.layout.api.RefreshHeader
import com.scwang.smart.refresh.layout.api.RefreshLayout
import com.scwang.smart.refresh.layout.constant.RefreshState
import com.scwang.smart.refresh.layout.listener.OnMultiListener


/**
 * @author ldh
 * 时间: 2022/2/20 19:05
 *
 */

/**
 * 为[SmartRefreshLayout]仅添加头部的监听
 */
fun SmartRefreshLayout.setOnHeaderMovingListener(
    listener: (
        header: RefreshHeader?,
        isDragging: Boolean,
        percent: Float,
        offset: Int,
        headerHeight: Int,
        maxDragHeight: Int
    ) -> Unit
): RefreshLayout =
    setOnMultiListener(object : RefreshLayoutMultiListenerImpl() {
        override fun onHeaderMoving(
            header: RefreshHeader?,
            isDragging: Boolean,
            percent: Float,
            offset: Int,
            headerHeight: Int,
            maxDragHeight: Int
        ) {
            listener(header, isDragging, percent, offset, headerHeight, maxDragHeight)
        }
    })

/**
 * 由于使用接口需要实现接口里所有抽象函数，所以这里写了一个实现类，想用接口里的哪一个方法用那一个就行
 */
private abstract class RefreshLayoutMultiListenerImpl : OnMultiListener {
    override fun onRefresh(refreshLayout: RefreshLayout) {

    }

    override fun onLoadMore(refreshLayout: RefreshLayout) {

    }

    @SuppressLint("RestrictedApi")
    override fun onStateChanged(
        refreshLayout: RefreshLayout,
        oldState: RefreshState,
        newState: RefreshState
    ) {
    }

    override fun onHeaderMoving(
        header: RefreshHeader?,
        isDragging: Boolean,
        percent: Float,
        offset: Int,
        headerHeight: Int,
        maxDragHeight: Int
    ) {
    }

    override fun onHeaderReleased(header: RefreshHeader?, headerHeight: Int, maxDragHeight: Int) {
    }

    override fun onHeaderStartAnimator(
        header: RefreshHeader?,
        headerHeight: Int,
        maxDragHeight: Int
    ) {
    }

    override fun onHeaderFinish(header: RefreshHeader?, success: Boolean) {
    }

    override fun onFooterMoving(
        footer: RefreshFooter?,
        isDragging: Boolean,
        percent: Float,
        offset: Int,
        footerHeight: Int,
        maxDragHeight: Int
    ) {
    }

    override fun onFooterReleased(footer: RefreshFooter?, footerHeight: Int, maxDragHeight: Int) {
    }

    override fun onFooterStartAnimator(
        footer: RefreshFooter?,
        footerHeight: Int,
        maxDragHeight: Int
    ) {
    }

    override fun onFooterFinish(footer: RefreshFooter?, success: Boolean) {
    }

}
