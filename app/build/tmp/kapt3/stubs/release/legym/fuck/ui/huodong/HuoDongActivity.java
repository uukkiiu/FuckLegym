package legym.fuck.ui.huodong;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/27 14:08
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\f\u0010\'\u001a\u00020\u001c*\u00020\u0014H\u0003J\f\u0010(\u001a\u00020\u001c*\u00020\bH\u0003R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006)"}, d2 = {"Llegym/fuck/ui/huodong/HuoDongActivity;", "Llegym/fuck/base/CollapsingToolbarActivity;", "()V", "layoutResID", "", "getLayoutResID", "()I", "mDataBinding", "Llegym/fuck/databinding/ActivityHuodongBinding;", "kotlin.jvm.PlatformType", "getMDataBinding", "()Llegym/fuck/databinding/ActivityHuodongBinding;", "mDataBinding$delegate", "Lkotlin/Lazy;", "mSelectorPopup", "Llegym/fuck/widget/popup/SingleSelectorPopup;", "getMSelectorPopup", "()Llegym/fuck/widget/popup/SingleSelectorPopup;", "mSelectorPopup$delegate", "mViewModel", "Llegym/fuck/ui/huodong/HuoDongViewModel;", "getMViewModel", "()Llegym/fuck/ui/huodong/HuoDongViewModel;", "mViewModel$delegate", "findFilterItemGroup", "Landroid/view/ViewGroup;", "index", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "initDataListeners", "initViews", "app_release"})
public final class HuoDongActivity extends legym.fuck.base.CollapsingToolbarActivity {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy mSelectorPopup$delegate = null;
    private final int layoutResID = legym.fuck.R.layout.activity_huodong;
    private final kotlin.Lazy mDataBinding$delegate = null;
    
    public HuoDongActivity() {
        super();
    }
    
    private final legym.fuck.ui.huodong.HuoDongViewModel getMViewModel() {
        return null;
    }
    
    private final legym.fuck.widget.popup.SingleSelectorPopup getMSelectorPopup() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutResID() {
        return 0;
    }
    
    private final legym.fuck.databinding.ActivityHuodongBinding getMDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"PrivateResource"})
    private final void initViews(legym.fuck.databinding.ActivityHuodongBinding $this$initViews) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initDataListeners(legym.fuck.ui.huodong.HuoDongViewModel $this$initDataListeners) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    /**
     * 查找顶部过滤栏的某一项
     */
    private final android.view.ViewGroup findFilterItemGroup(int index) {
        return null;
    }
}