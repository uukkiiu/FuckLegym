package legym.fuck.ui.runhistory;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/21 9:50
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Llegym/fuck/ui/runhistory/RunningHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "historyAdapter", "Lcom/angcyo/dsladapter/DslAdapter;", "getHistoryAdapter", "()Lcom/angcyo/dsladapter/DslAdapter;", "historyData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Llegym/fuck/logic/legym/network/model/running/runningHistory/GradeDetail;", "getHistoryData", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "loading", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getLoading", "()Landroidx/lifecycle/MutableLiveData;", "loadHistoryData", "", "app_debug"})
public final class RunningHistoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.legym.network.model.running.runningHistory.GradeDetail>> historyData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final com.angcyo.dsladapter.DslAdapter historyAdapter = null;
    
    public RunningHistoryViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.legym.network.model.running.runningHistory.GradeDetail>> getHistoryData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.angcyo.dsladapter.DslAdapter getHistoryAdapter() {
        return null;
    }
    
    public final void loadHistoryData() {
    }
}