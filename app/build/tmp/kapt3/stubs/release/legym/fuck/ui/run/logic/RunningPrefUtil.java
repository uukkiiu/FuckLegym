package legym.fuck.ui.run.logic;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/17 14:57
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Llegym/fuck/ui/run/logic/RunningPrefUtil;", "", "()V", "DEFAULT_DISTANCE_RANGE_FROM", "", "DEFAULT_DISTANCE_RANGE_TO", "localRunningType", "Llegym/fuck/ui/run/logic/RunningType;", "getLocalRunningType", "()Llegym/fuck/ui/run/logic/RunningType;", "value", "", "prefDistanceRange", "getPrefDistanceRange", "()Ljava/util/List;", "setPrefDistanceRange", "(Ljava/util/List;)V", "", "prefRunningMap", "getPrefRunningMap", "()Ljava/lang/String;", "setPrefRunningMap", "(Ljava/lang/String;)V", "prefRunningType", "getPrefRunningType", "setPrefRunningType", "app_release"})
public final class RunningPrefUtil {
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.ui.run.logic.RunningPrefUtil INSTANCE = null;
    
    /**
     * 默认的距离，目前定为 2.5~4 km
     */
    public static final float DEFAULT_DISTANCE_RANGE_FROM = 2.5F;
    public static final float DEFAULT_DISTANCE_RANGE_TO = 4.0F;
    
    private RunningPrefUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.ui.run.logic.RunningType getLocalRunningType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Float> getPrefDistanceRange() {
        return null;
    }
    
    public final void setPrefDistanceRange(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Float> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefRunningType() {
        return null;
    }
    
    public final void setPrefRunningType(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrefRunningMap() {
        return null;
    }
    
    public final void setPrefRunningMap(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
}