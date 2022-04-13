package legym.fuck.widget.behavior;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/1/26 15:49
 *
 *
 * 本质上还是[AppBarLayout.ScrollingViewBehavior]，只不过可以添加监听了
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006Jl\u0010\u0014\u001a\u00020\u00132d\u0010\u0015\u001a`\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\tj\u0002`\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016Rn\u0010\u0007\u001ab\u0012^\u0012\\\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Llegym/fuck/widget/behavior/ObservableScrollingViewBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mOnDependentViewChangedListeners", "", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "dependencyY", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "Landroid/view/View;", "child", "dependency", "", "addOnDependentViewChangedListener", "listener", "Llegym/fuck/widget/behavior/DependentViewChangedListener;", "onDependentViewChanged", "", "app_debug"})
public final class ObservableScrollingViewBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {
    private final java.util.List<kotlin.jvm.functions.Function4<java.lang.Float, androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, kotlin.Unit>> mOnDependentViewChangedListeners = null;
    
    public ObservableScrollingViewBehavior() {
        super();
    }
    
    public ObservableScrollingViewBehavior(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super();
    }
    
    public final void addOnDependentViewChangedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super java.lang.Float, ? super androidx.coordinatorlayout.widget.CoordinatorLayout, ? super android.view.View, ? super android.view.View, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public boolean onDependentViewChanged(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    android.view.View child, @org.jetbrains.annotations.NotNull()
    android.view.View dependency) {
        return false;
    }
}