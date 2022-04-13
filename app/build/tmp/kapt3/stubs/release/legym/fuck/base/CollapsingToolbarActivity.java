package legym.fuck.base;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/2/20 12:56
 */
@android.annotation.SuppressLint(value = {"InflateParams"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001c\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u000f8TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u0018\u0010\u0011R\u001b\u0010\u001a\u001a\u00020\u001b8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006("}, d2 = {"Llegym/fuck/base/CollapsingToolbarActivity;", "Llegym/fuck/base/BaseActivity;", "()V", "appbarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppbarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "appbarLayout$delegate", "Lkotlin/Lazy;", "collapsingToolbarLayout", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "getCollapsingToolbarLayout", "()Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbarLayout$delegate", "contentViewContainer", "Landroid/view/ViewGroup;", "getContentViewContainer", "()Landroid/view/ViewGroup;", "contentViewContainer$delegate", "layoutResID", "", "getLayoutResID", "()I", "rootLayout", "getRootLayout", "rootLayout$delegate", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "getToolbar", "()Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setContentView", "view", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "app_release"})
public abstract class CollapsingToolbarActivity extends legym.fuck.base.BaseActivity {
    
    /**
     * 布局的Id，
     * 子类布局可以自定义，不过要保证父类基本的布局元素都在，不然这些View会找不到
     */
    private final int layoutResID = legym.fuck.R.layout.activity_collapsing_toolbar;
    
    /**
     * 这个Activity的ContentView里塞的真正的东西，也是相当于这个Activity的布局文件转化出来的根布局
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy rootLayout$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy toolbar$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy collapsingToolbarLayout$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appbarLayout$delegate = null;
    
    /**
     * 子类用来装ContentView的容器
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy contentViewContainer$delegate = null;
    
    public CollapsingToolbarActivity() {
        super();
    }
    
    public int getLayoutResID() {
        return 0;
    }
    
    /**
     * 这个Activity的ContentView里塞的真正的东西，也是相当于这个Activity的布局文件转化出来的根布局
     */
    @org.jetbrains.annotations.NotNull()
    protected android.view.ViewGroup getRootLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.google.android.material.appbar.MaterialToolbar getToolbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.google.android.material.appbar.CollapsingToolbarLayout getCollapsingToolbarLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.google.android.material.appbar.AppBarLayout getAppbarLayout() {
        return null;
    }
    
    /**
     * 子类用来装ContentView的容器
     */
    @org.jetbrains.annotations.NotNull()
    protected android.view.ViewGroup getContentViewContainer() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setContentView(int layoutResID) {
    }
    
    @java.lang.Override()
    public void setContentView(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void setContentView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup.LayoutParams params) {
    }
}