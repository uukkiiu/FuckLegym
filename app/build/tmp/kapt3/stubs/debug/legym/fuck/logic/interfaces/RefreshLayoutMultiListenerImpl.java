package legym.fuck.logic.interfaces;

import java.lang.System;

/**
 * 由于使用接口需要实现接口里所有抽象函数，所以这里写了一个实现类，想用接口里的哪一个方法用那一个就行
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J:\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\"\u0010\u0011\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\"\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0016J:\u0010\u0016\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\"\u0010\u0018\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J \u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0017\u00a8\u0006\""}, d2 = {"Llegym/fuck/logic/interfaces/RefreshLayoutMultiListenerImpl;", "Lcom/scwang/smart/refresh/layout/listener/OnMultiListener;", "()V", "onFooterFinish", "", "footer", "Lcom/scwang/smart/refresh/layout/api/RefreshFooter;", "success", "", "onFooterMoving", "isDragging", "percent", "", "offset", "", "footerHeight", "maxDragHeight", "onFooterReleased", "onFooterStartAnimator", "onHeaderFinish", "header", "Lcom/scwang/smart/refresh/layout/api/RefreshHeader;", "onHeaderMoving", "headerHeight", "onHeaderReleased", "onHeaderStartAnimator", "onLoadMore", "refreshLayout", "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "onRefresh", "onStateChanged", "oldState", "Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "newState", "app_debug"})
abstract class RefreshLayoutMultiListenerImpl implements com.scwang.smart.refresh.layout.listener.OnMultiListener {
    
    public RefreshLayoutMultiListenerImpl() {
        super();
    }
    
    @java.lang.Override()
    public void onRefresh(@org.jetbrains.annotations.NotNull()
    com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout) {
    }
    
    @java.lang.Override()
    public void onLoadMore(@org.jetbrains.annotations.NotNull()
    com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override()
    public void onStateChanged(@org.jetbrains.annotations.NotNull()
    com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout, @org.jetbrains.annotations.NotNull()
    com.scwang.smart.refresh.layout.constant.RefreshState oldState, @org.jetbrains.annotations.NotNull()
    com.scwang.smart.refresh.layout.constant.RefreshState newState) {
    }
    
    @java.lang.Override()
    public void onHeaderMoving(@org.jetbrains.annotations.Nullable()
    com.scwang.smart.refresh.layout.api.RefreshHeader header, boolean isDragging, float percent, int offset, int headerHeight, int maxDragHeight) {
    }
    
    @java.lang.Override()
    public void onHeaderReleased(@org.jetbrains.annotations.Nullable()
    com.scwang.smart.refresh.layout.api.RefreshHeader header, int headerHeight, int maxDragHeight) {
    }
    
    @java.lang.Override()
    public void onHeaderStartAnimator(@org.jetbrains.annotations.Nullable()
    com.scwang.smart.refresh.layout.api.RefreshHeader header, int headerHeight, int maxDragHeight) {
    }
    
    @java.lang.Override()
    public void onHeaderFinish(@org.jetbrains.annotations.Nullable()
    com.scwang.smart.refresh.layout.api.RefreshHeader header, boolean success) {
    }
    
    @java.lang.Override()
    public void onFooterMoving(@org.jetbrains.annotations.Nullable()
    com.scwang.smart.refresh.layout.api.RefreshFooter footer, boolean isDragging, float percent, int offset, int footerHeight, int maxDragHeight) {
    }
    
    @java.lang.Override()
    public void onFooterReleased(@org.jetbrains.annotations.Nullable()
    com.scwang.smart.refresh.layout.api.RefreshFooter footer, int footerHeight, int maxDragHeight) {
    }
    
    @java.lang.Override()
    public void onFooterStartAnimator(@org.jetbrains.annotations.Nullable()
    com.scwang.smart.refresh.layout.api.RefreshFooter footer, int footerHeight, int maxDragHeight) {
    }
    
    @java.lang.Override()
    public void onFooterFinish(@org.jetbrains.annotations.Nullable()
    com.scwang.smart.refresh.layout.api.RefreshFooter footer, boolean success) {
    }
}