package legym.fuck.logic.clouds;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/19 8:48
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J9\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\u001e\u0010\u000b\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Llegym/fuck/logic/clouds/CloudsNetworkRepository;", "", "()V", "cloudConfigService", "Llegym/fuck/logic/clouds/service/CloudConfigService;", "getCloudConfigService", "()Llegym/fuck/logic/clouds/service/CloudConfigService;", "cloudConfigService$delegate", "Lkotlin/Lazy;", "catchError", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppOLConfig", "Llegym/fuck/logic/clouds/model/AppOLConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocs", "", "Llegym/fuck/logic/clouds/model/DocInfo;", "getMaps", "Llegym/fuck/logic/clouds/model/RunningMap;", "getNotices", "Llegym/fuck/logic/clouds/model/Notice;", "getStopConfig", "Llegym/fuck/logic/clouds/model/StopConfig;", "getUploadLogCinfig", "Llegym/fuck/logic/clouds/model/UploadLogBean;", "app_release"})
public final class CloudsNetworkRepository {
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.logic.clouds.CloudsNetworkRepository INSTANCE = null;
    private static final kotlin.Lazy cloudConfigService$delegate = null;
    
    private CloudsNetworkRepository() {
        super();
    }
    
    private final legym.fuck.logic.clouds.service.CloudConfigService getCloudConfigService() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStopConfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.clouds.model.StopConfig> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNotices(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<legym.fuck.logic.clouds.model.Notice>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUploadLogCinfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.clouds.model.UploadLogBean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAppOLConfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.clouds.model.AppOLConfig> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDocs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<legym.fuck.logic.clouds.model.DocInfo>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMaps(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<legym.fuck.logic.clouds.model.RunningMap>> continuation) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object catchError(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block, kotlin.coroutines.Continuation<? super T> continuation) {
        return null;
    }
}