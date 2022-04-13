package legym.fuck.base;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/17 16:54
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0004J\b\u0010\u001b\u001a\u00020\u0018H\u0014J\b\u0010\u001c\u001a\u00020\u0018H\u0004J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\'H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006("}, d2 = {"Llegym/fuck/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "loadingDialog", "Landroidx/appcompat/app/AlertDialog;", "getLoadingDialog", "()Landroidx/appcompat/app/AlertDialog;", "loadingDialog$delegate", "Lkotlin/Lazy;", "loadingDialogBinding", "Llegym/fuck/databinding/DialogLoadingBinding;", "getLoadingDialogBinding", "()Llegym/fuck/databinding/DialogLoadingBinding;", "loadingDialogBinding$delegate", "noticeKey", "", "getNoticeKey", "()Ljava/lang/String;", "stopBinding", "Llegym/fuck/databinding/ActivityStopBinding;", "getStopBinding", "()Llegym/fuck/databinding/ActivityStopBinding;", "stopBinding$delegate", "appCompatOnCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initNotices", "initStopListener", "onCreate", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onShowNotice", "notice", "Llegym/fuck/logic/clouds/model/Notice;", "showStopInfo", "stopConfig", "Llegym/fuck/logic/clouds/model/StopConfig;", "app_release"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy stopBinding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loadingDialogBinding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loadingDialog$delegate = null;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getNoticeKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected legym.fuck.databinding.ActivityStopBinding getStopBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final legym.fuck.databinding.DialogLoadingBinding getLoadingDialogBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.appcompat.app.AlertDialog getLoadingDialog() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected final void initStopListener() {
    }
    
    /**
     * 停用
     */
    private final void showStopInfo(legym.fuck.logic.clouds.model.StopConfig stopConfig) {
    }
    
    protected void initNotices() {
    }
    
    protected void onShowNotice(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.clouds.model.Notice notice) {
    }
    
    protected final void appCompatOnCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}