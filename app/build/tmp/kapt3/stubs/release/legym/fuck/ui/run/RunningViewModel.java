package legym.fuck.ui.run;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/17 13:27
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0014J\u0006\u0010$\u001a\u00020\"J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u001aJ\u0011\u0010\'\u001a\u00020(H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)R+\u0010\u0003\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\tR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Llegym/fuck/ui/run/RunningViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "distanceRange", "Landroidx/lifecycle/MutableLiveData;", "", "", "kotlin.jvm.PlatformType", "getDistanceRange", "()Landroidx/lifecycle/MutableLiveData;", "loadingOnlineMaps", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getLoadingOnlineMaps", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "onlineMaps", "Llegym/fuck/logic/clouds/model/RunningMap;", "getOnlineMaps", "runningMaps", "", "", "getRunningMaps", "()Ljava/util/Set;", "setRunningMaps", "(Ljava/util/Set;)V", "runningType", "Llegym/fuck/ui/run/logic/RunningType;", "getRunningType", "selectedMap", "getSelectedMap", "totalMaps", "", "getTotalMaps", "onMapSelected", "", "map", "updateRunningMap", "updateRunningType", "type", "uploadRunningData", "Llegym/fuck/logic/legym/network/model/running/UploadRunningDetailsResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class RunningViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * 每次跑步的距离的随机区间
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Float>> distanceRange = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<legym.fuck.ui.run.logic.RunningType> runningType = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> selectedMap = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<java.lang.String> runningMaps;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> loadingOnlineMaps = null;
    
    /**
     * 在线的地图
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.clouds.model.RunningMap>> onlineMaps = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> totalMaps = null;
    
    public RunningViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Float>> getDistanceRange() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<legym.fuck.ui.run.logic.RunningType> getRunningType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSelectedMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getRunningMaps() {
        return null;
    }
    
    public final void setRunningMaps(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getLoadingOnlineMaps() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.clouds.model.RunningMap>> getOnlineMaps() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> getTotalMaps() {
        return null;
    }
    
    /**
     * 更新跑步类型的数据
     */
    public final void updateRunningType(@org.jetbrains.annotations.NotNull()
    legym.fuck.ui.run.logic.RunningType type) {
    }
    
    /**
     * 上传跑步数据
     * @return 返回本次上传有效里程是多少，空就是上传失败
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadRunningData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.running.UploadRunningDetailsResult> continuation) {
        return null;
    }
    
    public final void onMapSelected(@org.jetbrains.annotations.NotNull()
    java.lang.String map) {
    }
    
    /**
     * 更新一次地图。
     * 包括当前所有的地图数据以及用户偏好的哪一个地图。
     */
    public final void updateRunningMap() {
    }
}