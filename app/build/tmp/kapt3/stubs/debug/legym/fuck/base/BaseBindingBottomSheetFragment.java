package legym.fuck.base;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/29 14:14
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!J\u0011\u0010\"\u001a\u00020\u001d*\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010#\u001a\u00020\u001d*\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010$\u001a\u00020\u001d*\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010\u000eR\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u0011X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006%"}, d2 = {"Llegym/fuck/base/BaseBindingBottomSheetFragment;", "BD", "Landroidx/viewbinding/ViewBinding;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "layoutResId", "", "getLayoutResId", "()I", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showIfNeeded", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "initData", "initDataListeners", "initViews", "app_debug"})
public abstract class BaseBindingBottomSheetFragment<BD extends androidx.viewbinding.ViewBinding> extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private final java.lang.String TAG = null;
    protected BD binding;
    private final int layoutResId = -1;
    
    public BaseBindingBottomSheetFragment() {
        super();
    }
    
    protected java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final BD getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    BD p0) {
    }
    
    protected int getLayoutResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    protected void initViews(@org.jetbrains.annotations.NotNull()
    BD $this$initViews) {
    }
    
    protected void initDataListeners(@org.jetbrains.annotations.NotNull()
    BD $this$initDataListeners) {
    }
    
    protected void initData(@org.jetbrains.annotations.NotNull()
    BD $this$initData) {
    }
    
    public final void showIfNeeded(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity fragmentActivity) {
    }
    
    public final void showIfNeeded(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
    }
}