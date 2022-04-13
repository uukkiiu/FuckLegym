package legym.fuck.logic.clouds.service;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/19 8:52
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Llegym/fuck/logic/clouds/service/CloudConfigService;", "", "getAppOLConfig", "Llegym/fuck/logic/clouds/model/AppOLConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocs", "", "Llegym/fuck/logic/clouds/model/DocInfo;", "getMaps", "Llegym/fuck/logic/clouds/model/RunningMap;", "getNotices", "Llegym/fuck/logic/clouds/model/Notice;", "getStopConfig", "Llegym/fuck/logic/clouds/model/StopConfig;", "getUploadLogCinfig", "Llegym/fuck/logic/clouds/model/UploadLogBean;", "app_debug"})
public abstract interface CloudConfigService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "config/stop.json")
    public abstract java.lang.Object getStopConfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.clouds.model.StopConfig> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "config/notice.json")
    public abstract java.lang.Object getNotices(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<legym.fuck.logic.clouds.model.Notice>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "config/log.json")
    public abstract java.lang.Object getUploadLogCinfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.clouds.model.UploadLogBean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "config/appconfig.json")
    public abstract java.lang.Object getAppOLConfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.clouds.model.AppOLConfig> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "config/docs.json")
    public abstract java.lang.Object getDocs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<legym.fuck.logic.clouds.model.DocInfo>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "docs/maps-new.json")
    public abstract java.lang.Object getMaps(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<legym.fuck.logic.clouds.model.RunningMap>> continuation);
}