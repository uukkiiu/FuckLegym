package legym.fuck.base;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/1/25 18:21
 *
 *
 * 背景有图片的CollapsingToolbar的父Activity。
 *
 * 背景图片基于[BlurImageView]，滚动时会伴随背景图变化。
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\u0018\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004H\u0014J\u0012\u00103\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u000105H\u0014J\u0018\u00106\u001a\u00020.2\u0006\u00102\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0006H\u0014J\u0010\u00108\u001a\u00020.2\u0006\u00107\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u0014\u0010\u0018\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u001b\u0010\u001a\u001a\u00020\u001b8TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u0004X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u000e\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b*\u0010+\u00a8\u00069"}, d2 = {"Llegym/fuck/base/ParallaxImageActivity;", "Llegym/fuck/base/CollapsingToolbarActivity;", "()V", "_headerCollapsePercent", "", "blurRadius", "", "getBlurRadius", "()I", "chipIntegral", "Lcom/google/android/material/chip/Chip;", "getChipIntegral", "()Lcom/google/android/material/chip/Chip;", "chipIntegral$delegate", "Lkotlin/Lazy;", "compressScale", "getCompressScale", "()F", "containerRoundCornerRadius", "getContainerRoundCornerRadius", "headerCollapsePercent", "getHeaderCollapsePercent", "layoutResID", "getLayoutResID", "parallaxImageMaxAlpha", "getParallaxImageMaxAlpha", "parallaxImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "getParallaxImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "parallaxImageView$delegate", "parallaxTranslationRate", "getParallaxTranslationRate", "setParallaxTranslationRate", "(F)V", "smartRefreshLayout", "Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;", "getSmartRefreshLayout", "()Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;", "smartRefreshLayout$delegate", "subTitleTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "getSubTitleTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "subTitleTextView$delegate", "initDataListener", "", "initViews", "onCollapsing", "dependencyY", "percent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onHeaderDrag", "offset", "onUpdateParallaxImageHeight", "app_release"})
public abstract class ParallaxImageActivity extends legym.fuck.base.CollapsingToolbarActivity {
    private final int layoutResID = legym.fuck.R.layout.activity_parallax_image;
    
    /**
     * 背景视差图[parallaxImageView]最大能显示的alpha
     */
    private final float parallaxImageMaxAlpha = 0.5F;
    
    /**
     * 装照片的容器的切割圆角半径，这个值的单位是dp
     */
    private final float containerRoundCornerRadius = 17.5F;
    
    /**
     * 背景图相对滑动的比例
     */
    private float parallaxTranslationRate = 0.6F;
    
    /**
     * 背景图的模糊半径
     */
    private final int blurRadius = 10;
    
    /**
     * 背景图的压缩倍率
     */
    private final float compressScale = 0.3F;
    
    /**
     * 为了解决[CollapsingToolbarLayout]显示不出副标题的问题，这里我自己造了一个副标题控件
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy subTitleTextView$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy smartRefreshLayout$delegate = null;
    
    /**
     * 当前显示积分的框框
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy chipIntegral$delegate = null;
    
    /**
     * 背景滑动图的ImageView
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy parallaxImageView$delegate = null;
    private float _headerCollapsePercent = 0.0F;
    
    public ParallaxImageActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutResID() {
        return 0;
    }
    
    protected float getParallaxImageMaxAlpha() {
        return 0.0F;
    }
    
    protected float getContainerRoundCornerRadius() {
        return 0.0F;
    }
    
    protected float getParallaxTranslationRate() {
        return 0.0F;
    }
    
    protected void setParallaxTranslationRate(float p0) {
    }
    
    protected int getBlurRadius() {
        return 0;
    }
    
    protected float getCompressScale() {
        return 0.0F;
    }
    
    /**
     * 为了解决[CollapsingToolbarLayout]显示不出副标题的问题，这里我自己造了一个副标题控件
     */
    @org.jetbrains.annotations.NotNull()
    protected androidx.appcompat.widget.AppCompatTextView getSubTitleTextView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected com.scwang.smart.refresh.layout.SmartRefreshLayout getSmartRefreshLayout() {
        return null;
    }
    
    /**
     * 当前显示积分的框框
     */
    @org.jetbrains.annotations.NotNull()
    protected com.google.android.material.chip.Chip getChipIntegral() {
        return null;
    }
    
    /**
     * 背景滑动图的ImageView
     */
    @org.jetbrains.annotations.NotNull()
    protected androidx.appcompat.widget.AppCompatImageView getParallaxImageView() {
        return null;
    }
    
    protected final float getHeaderCollapsePercent() {
        return 0.0F;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    /**
     * 顶部[CollapsingToolbarLayout]向上坍塌时调用的函数
     * @param dependencyY [CollapsingToolbarLayout]当前的Y值
     * @param percent 坍塌的百分比
     */
    protected void onCollapsing(float dependencyY, float percent) {
    }
    
    /**
     * 向下过度拖拽时调用的函数
     */
    protected void onHeaderDrag(float percent, int offset) {
    }
    
    /**
     * 根据[AppBarLayout]的高度动态调整视察背景图的高度
     * @param offset 向下拉的高度差
     */
    protected void onUpdateParallaxImageHeight(int offset) {
    }
    
    private final void initDataListener() {
    }
}