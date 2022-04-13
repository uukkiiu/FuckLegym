package legym.fuck.ui.main;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/18 21:56
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00120\u00120\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\b\u00a8\u0006\u0016"}, d2 = {"Llegym/fuck/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "currentMilsInt", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getCurrentMilsInt", "()Landroidx/lifecycle/MutableLiveData;", "runningRulesAdapter", "Lcom/angcyo/dsladapter/DslAdapter;", "getRunningRulesAdapter", "()Lcom/angcyo/dsladapter/DslAdapter;", "runningRulesAdapter$delegate", "Lkotlin/Lazy;", "semTotalMils", "getSemTotalMils", "totalRunned", "", "getTotalRunned", "loadHasRun", "", "app_release"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * 这学期已经跑的数
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> totalRunned = null;
    
    /**
     * 这学期总共要跑多少公里
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> semTotalMils = null;
    
    /**
     * 当前已经跑了多少（整数）
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> currentMilsInt = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy runningRulesAdapter$delegate = null;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTotalRunned() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSemTotalMils() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCurrentMilsInt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.angcyo.dsladapter.DslAdapter getRunningRulesAdapter() {
        return null;
    }
    
    /**
     * 加载已经跑了多少数
     */
    public final void loadHasRun() {
    }
}