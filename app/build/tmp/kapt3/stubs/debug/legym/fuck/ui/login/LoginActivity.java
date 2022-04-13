package legym.fuck.ui.login;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/17 21:52
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u001a\u0010\u0014\u001a\u00020\u00102\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0015R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Llegym/fuck/ui/login/LoginActivity;", "Llegym/fuck/base/BaseActivity;", "()V", "mDataBinding", "Llegym/fuck/databinding/ActivityLoginBinding;", "kotlin.jvm.PlatformType", "getMDataBinding", "()Llegym/fuck/databinding/ActivityLoginBinding;", "mDataBinding$delegate", "Lkotlin/Lazy;", "mViewModel", "Llegym/fuck/ui/login/LoginViewModel;", "getMViewModel", "()Llegym/fuck/ui/login/LoginViewModel;", "mViewModel$delegate", "checkButtonEnable", "", "finishAndStart", "initNetwork", "initUI", "login", "onFailed", "Lkotlin/Function0;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class LoginActivity extends legym.fuck.base.BaseActivity {
    private final kotlin.Lazy mDataBinding$delegate = null;
    private final kotlin.Lazy mViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.ui.login.LoginActivity.Companion Companion = null;
    private static final java.lang.String INTENT_SIGN_OUT = "INTENT_SIGN_OUT";
    
    public LoginActivity() {
        super();
    }
    
    private final legym.fuck.databinding.ActivityLoginBinding getMDataBinding() {
        return null;
    }
    
    private final legym.fuck.ui.login.LoginViewModel getMViewModel() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 初始化网络模块，这里主要是这些内容：
     *
     * - 根据本地账号密码进行登录并初化用户信息。
     * - 获取的版本停用信息，看看当前版本是否已经被停用了，若被停用，登录功能直接失效。
     */
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    private final void initNetwork() {
    }
    
    private final void initUI() {
    }
    
    private final void checkButtonEnable() {
    }
    
    /**
     * 根据本地数据直接进行登录
     */
    private final void login(kotlin.jvm.functions.Function0<kotlin.Unit> onFailed) {
    }
    
    /**
     * 登录成功，结束本Activity并打开新的Activity
     */
    private final void finishAndStart() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Llegym/fuck/ui/login/LoginActivity$Companion;", "", "()V", "INTENT_SIGN_OUT", "", "startAndClear", "", "fromActivity", "Landroid/app/Activity;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void startAndClear(@org.jetbrains.annotations.Nullable()
        android.app.Activity fromActivity) {
        }
    }
}