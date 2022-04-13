package legym.fuck.logic.legym.network.service;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/18 15:32
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ=\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ=\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J=\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Llegym/fuck/logic/legym/network/service/RunningService;", "", "getDetails", "Llegym/fuck/logic/legym/network/model/HttpResult;", "Llegym/fuck/logic/legym/network/model/running/runningHistory/RunningHistoryResultBean;", "headerMap", "", "", "Llegym/fuck/logic/legym/network/LegymHeaderMap;", "requestBean", "Llegym/fuck/logic/legym/network/model/running/runningHistory/RunningHistoryRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/running/runningHistory/RunningHistoryRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningLimit", "Llegym/fuck/logic/legym/network/model/running/RunningLimitResultBean;", "Llegym/fuck/logic/legym/network/model/running/RunningLimitRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/running/RunningLimitRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTotalRunning", "Llegym/fuck/logic/legym/network/model/running/totalRunning/TotalRunningResultBean;", "Llegym/fuck/logic/legym/network/model/running/totalRunning/TotalRunningRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/running/totalRunning/TotalRunningRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadRunningDetails", "Llegym/fuck/logic/legym/network/model/running/UploadRunningDetailsRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/running/UploadRunningDetailsRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface RunningService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "running/app/uploadRunningDetails")
    public abstract java.lang.Object uploadRunningDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.running.UploadRunningDetailsRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "running/app/getRunningLimit")
    public abstract java.lang.Object getRunningLimit(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.running.RunningLimitRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.running.RunningLimitResultBean>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/running/app/getTotalRunning")
    public abstract java.lang.Object getTotalRunning(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningResultBean>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/running/app/getDetails")
    public abstract java.lang.Object getDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.running.runningHistory.RunningHistoryRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.running.runningHistory.RunningHistoryResultBean>> continuation);
}