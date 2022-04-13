package legym.fuck.ui.huodong.register;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/29 14:58
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020&R\'\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00190\u00190\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006("}, d2 = {"Llegym/fuck/ui/huodong/register/AutoRegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "exceptionTasks", "", "Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;", "Llegym/fuck/logic/legym/network/model/HttpResult;", "", "getExceptionTasks", "()Ljava/util/Map;", "failedTasks", "", "getFailedTasks", "finished", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getFinished", "()Landroidx/lifecycle/MutableLiveData;", "maxActivityNum", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getMaxActivityNum", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "progress", "Ljava/util/concurrent/atomic/AtomicInteger;", "getProgress", "successTasks", "", "getSuccessTasks", "()Ljava/util/Set;", "validActivities", "", "getValidActivities", "()Ljava/util/List;", "setValidActivities", "(Ljava/util/List;)V", "doRegister", "", "doUnregister", "app_release"})
public final class AutoRegisterViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * 选中的并且可以报名的活动列表
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.List<legym.fuck.logic.legym.network.model.huodong.HuodongItem> validActivities;
    
    /**
     * 报名成功的活动
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<legym.fuck.logic.legym.network.model.huodong.HuodongItem> successTasks = null;
    
    /**
     * 报名失败的活动
     * 用活动去映射原因
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<legym.fuck.logic.legym.network.model.huodong.HuodongItem, java.lang.String> failedTasks = null;
    
    /**
     * 网络异常的活动
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<legym.fuck.logic.legym.network.model.huodong.HuodongItem, legym.fuck.logic.legym.network.model.HttpResult<? extends java.lang.Object>> exceptionTasks = null;
    
    /**
     * 进度 0 ~ 100 整数
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.concurrent.atomic.AtomicInteger> progress = null;
    
    /**
     * 总活动数
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> maxActivityNum = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> finished = null;
    
    public AutoRegisterViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<legym.fuck.logic.legym.network.model.huodong.HuodongItem> getValidActivities() {
        return null;
    }
    
    public final void setValidActivities(@org.jetbrains.annotations.NotNull()
    java.util.List<legym.fuck.logic.legym.network.model.huodong.HuodongItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<legym.fuck.logic.legym.network.model.huodong.HuodongItem> getSuccessTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<legym.fuck.logic.legym.network.model.huodong.HuodongItem, java.lang.String> getFailedTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<legym.fuck.logic.legym.network.model.huodong.HuodongItem, legym.fuck.logic.legym.network.model.HttpResult<? extends java.lang.Object>> getExceptionTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.concurrent.atomic.AtomicInteger> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> getMaxActivityNum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFinished() {
        return null;
    }
    
    /**
     * 一键报名所有
     */
    public final void doRegister() {
    }
    
    /**
     * 一键取消报名所有
     */
    public final void doUnregister() {
    }
}