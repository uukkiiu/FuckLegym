package legym.fuck.logic;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/17 17:24
 * `
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u001b\u0010\'\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001e0(H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0011\u0010*\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001a\u0010+\u001a\u00020,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020,0.J\u0019\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0(H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u00100\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J!\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150(2\u0006\u00102\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\fR\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001b0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\"\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Llegym/fuck/logic/OnlineData;", "", "()V", "bmobUser", "Landroidx/lifecycle/MutableLiveData;", "Llegym/fuck/core/model/BmobUser;", "getBmobUser", "()Landroidx/lifecycle/MutableLiveData;", "currentData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Llegym/fuck/logic/legym/network/model/current/GetCurrentResultBean;", "getCurrentData", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "docInfoList", "", "Llegym/fuck/logic/clouds/model/DocInfo;", "getDocInfoList", "firstRegister", "", "getFirstRegister", "runningLimitFlow", "Llegym/fuck/logic/legym/network/model/running/RunningLimitResultBean;", "getRunningLimitFlow", "totalRunning", "Llegym/fuck/logic/legym/network/model/running/totalRunning/TotalRunningResultBean;", "getTotalRunning", "unreadDocList", "", "getUnreadDocList", "userData", "Llegym/fuck/logic/legym/network/model/login/LoginResult;", "getUserData", "setUserData", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "asyncBmobData", "legymId", "", "loginResult", "(Ljava/lang/String;Llegym/fuck/logic/legym/network/model/login/LoginResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asyncLogin", "Llegym/fuck/logic/legym/network/model/HttpResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserDataAsync", "getUserDataOrRelogin", "", "success", "Lkotlin/Function1;", "loadCurrentData", "loadDocInfo", "loadRunningLimitData", "currentResultBean", "(Llegym/fuck/logic/legym/network/model/current/GetCurrentResultBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class OnlineData {
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.logic.OnlineData INSTANCE = null;
    
    /**
     * 当前的用户
     */
    @org.jetbrains.annotations.NotNull()
    private static kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.legym.network.model.login.LoginResult> userData;
    
    /**
     * 有的账号可能获取不到跑步的限制
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.legym.network.model.running.RunningLimitResultBean> runningLimitFlow = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.legym.network.model.current.GetCurrentResultBean> currentData = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<legym.fuck.core.model.BmobUser> bmobUser = null;
    
    /**
     * 是否是新用户注册
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> firstRegister = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningResultBean> totalRunning = null;
    
    /**
     * 文档列表
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.clouds.model.DocInfo>> docInfoList = null;
    
    /**
     * 未读文档
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.clouds.model.DocInfo>> unreadDocList = null;
    
    private OnlineData() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.legym.network.model.login.LoginResult> getUserData() {
        return null;
    }
    
    public final void setUserData(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.legym.network.model.login.LoginResult> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.legym.network.model.running.RunningLimitResultBean> getRunningLimitFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.legym.network.model.current.GetCurrentResultBean> getCurrentData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<legym.fuck.core.model.BmobUser> getBmobUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getFirstRegister() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningResultBean> getTotalRunning() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.clouds.model.DocInfo>> getDocInfoList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.clouds.model.DocInfo>> getUnreadDocList() {
        return null;
    }
    
    /**
     * 获取当前登录的用户，若当前用户为null，则重新打开登录界面，否则直接调用[success]。
     */
    public final void getUserDataOrRelogin(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super legym.fuck.logic.legym.network.model.login.LoginResult, kotlin.Unit> success) {
    }
    
    /**
     * 同步的方式获取当前用户
     *
     * 如果当前用户不为空则直接返回
     *
     * 如果当前用户为空，则再登录一次，登录成功则返回新的结果，登录失败则抛异常
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserDataAsync(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.login.LoginResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object asyncLogin(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<? extends legym.fuck.logic.legym.network.model.login.LoginResult>> continuation) {
        return null;
    }
    
    /**
     * 同步更新Bmob的数据
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object asyncBmobData(@org.jetbrains.annotations.NotNull()
    java.lang.String legymId, @org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.login.LoginResult loginResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.core.model.BmobUser> continuation) {
        return null;
    }
    
    /**
     * 重新加载一次当前用户状态的数据
     *
     * 若是第一次加载则会新生成一个Flow对象
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadCurrentData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.current.GetCurrentResultBean>> continuation) {
        return null;
    }
    
    /**
     * 重新加载一次跑步限制的数据
     *
     * 若是第一次加载则会新生成一个Flow对象
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadRunningLimitData(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.current.GetCurrentResultBean currentResultBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.running.RunningLimitResultBean>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadDocInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<legym.fuck.logic.clouds.model.DocInfo>> continuation) {
        return null;
    }
}