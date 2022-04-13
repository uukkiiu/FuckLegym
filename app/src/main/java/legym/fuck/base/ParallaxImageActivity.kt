package legym.fuck.base

import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.isVisible
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.chip.Chip
import com.liangguo.androidkit.app.clipRoundCorner
import com.liangguo.androidkit.app.dp2px
import com.liangguo.androidkit.app.startNewActivity
import com.liangguo.imageblur.BlurImageView
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import legym.fuck.R
import legym.fuck.config.AppConfig
import legym.fuck.logic.OnlineData
import legym.fuck.logic.interfaces.setOnHeaderMovingListener
import legym.fuck.ui.login.LoginActivity
import legym.fuck.utils.toTypeOrNull
import legym.fuck.widget.behavior.ObservableScrollingViewBehavior


/**
 * @author ldh
 * 时间: 2022/1/25 18:21
 *
 *
 * 背景有图片的CollapsingToolbar的父Activity。
 *
 * 背景图片基于[BlurImageView]，滚动时会伴随背景图变化。
 */
abstract class ParallaxImageActivity : CollapsingToolbarActivity() {

    override val layoutResID: Int = R.layout.activity_parallax_image

    /**
     * 背景视差图[parallaxImageView]最大能显示的alpha
     */
    protected open val parallaxImageMaxAlpha = 0.5f

    /**
     * 装照片的容器的切割圆角半径，这个值的单位是dp
     */
    protected open val containerRoundCornerRadius = 17.5f

    /**
     * 背景图相对滑动的比例
     */
    protected open var parallaxTranslationRate = 0.6f

    /**
     * 背景图的模糊半径
     */
    protected open val blurRadius = 10

    /**
     * 背景图的压缩倍率
     */
    protected open val compressScale = 0.3f


    /**
     * 为了解决[CollapsingToolbarLayout]显示不出副标题的问题，这里我自己造了一个副标题控件
     */
    protected open val subTitleTextView: AppCompatTextView by lazy {
        findViewById(R.id.textView_subtitle)
    }

    protected open val smartRefreshLayout: SmartRefreshLayout by lazy {
        findViewById(R.id.refreshLayout)
    }

    /**
     * 当前显示积分的框框
     */
    protected open val chipIntegral: Chip by lazy {
        findViewById(R.id.chip_integral)
    }

    /**
     * 背景滑动图的ImageView
     */
    protected open val parallaxImageView: AppCompatImageView by lazy {
        findViewById(R.id.parallaxImageView)
    }

    //当前头部[CollapsingToolbarLayout]塌陷的百分比
    private var _headerCollapsePercent = 0f

    /**
     * 当前头部[CollapsingToolbarLayout]塌陷的百分比
     */
    protected val headerCollapsePercent
        get() = _headerCollapsePercent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initDataListener()
    }

    private fun initViews() {
        //要发射一个post才能更新ImageView的高度，因为此时View还没测量出来
        appbarLayout.post { onUpdateParallaxImageHeight(0) }
        parallaxImageView.alpha = parallaxImageMaxAlpha
        ((smartRefreshLayout.layoutParams as CoordinatorLayout.LayoutParams).behavior as ObservableScrollingViewBehavior).apply {
            addOnDependentViewChangedListener { dependencyY, _, _, _ ->
                //用CollapsingToolbarLayout的高度减去ToolBar的高度就能算出这个吸顶可变化的最大高度
                _headerCollapsePercent =
                    -dependencyY / (collapsingToolbarLayout.height - toolbar.height)
                onCollapsing(dependencyY, _headerCollapsePercent)
            }
        }
        smartRefreshLayout.clipRoundCorner(containerRoundCornerRadius.dp2px)
            .setOnHeaderMovingListener { _, _, percent, offset, _, _ ->
                onHeaderDrag(percent = percent, offset = offset)
            }
        parallaxImageView.toTypeOrNull<BlurImageView>()
            ?.setBlurAndCompress(blurRadius, compressScale)
    }

    /**
     * 顶部[CollapsingToolbarLayout]向上坍塌时调用的函数
     * @param dependencyY [CollapsingToolbarLayout]当前的Y值
     * @param percent 坍塌的百分比
     */
    protected open fun onCollapsing(dependencyY: Float, percent: Float) {
        parallaxImageView.alpha = (1 - percent) * parallaxImageMaxAlpha
        parallaxImageView.translationY = dependencyY * parallaxTranslationRate
        subTitleTextView.alpha = 1 - percent
    }

    /**
     * 向下过度拖拽时调用的函数
     */
    protected open fun onHeaderDrag(percent: Float, offset: Int) {
        onUpdateParallaxImageHeight(offset)
        (1f - percent.coerceAtMost(1f)).also { reversePercent ->
            //这才是百分比反转同时控制范围在0到1之间
            appbarLayout.alpha = reversePercent
            parallaxImageView.toTypeOrNull<BlurImageView>()?.setBlurAndCompress(
                ((reversePercent * blurRadius).toInt()),
                1f - (1f - compressScale) * reversePercent
            )
            //这句判断一定要加，SmartRefreshLayout有个bug，拉到底也会触发头部监听的回调
            if (headerCollapsePercent != 1f) {
                parallaxImageView.alpha = 1f - (1f - parallaxImageMaxAlpha) * reversePercent
            }
        }
    }

    /**
     * 根据[AppBarLayout]的高度动态调整视察背景图的高度
     * @param offset 向下拉的高度差
     */
    protected open fun onUpdateParallaxImageHeight(offset: Int) {
        parallaxImageView.layoutParams =
            parallaxImageView.layoutParams.apply { height = appbarLayout.height + offset }
    }

    private fun initDataListener() {
        AppConfig.onLineConfig.asLiveData(lifecycleScope.coroutineContext).observe(this) {
            chipIntegral.isVisible = it.enableConsumeIntegral
        }
        OnlineData.bmobUser.observe(this) {
            it?.let { bmobUser ->
                chipIntegral.text = AppConfig.FLOAT_FORMAT_INTEGRAL.format(bmobUser.integral)
            } ?: let {
                chipIntegral.setText(R.string.please_relogin)
                chipIntegral.setOnClickListener {
                    LoginActivity.startAndClear(this)
                }
            }
        }
    }

}

