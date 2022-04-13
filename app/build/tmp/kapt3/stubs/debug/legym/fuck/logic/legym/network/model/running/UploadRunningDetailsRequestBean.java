package legym.fuck.logic.legym.network.model.running;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00cf\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001eJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0007H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0007H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0007H\u00c6\u0003J\u0081\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010U\u001a\u00020\u0007H\u00d6\u0001J\t\u0010V\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010$R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010 \u00a8\u0006W"}, d2 = {"Llegym/fuck/logic/legym/network/model/running/UploadRunningDetailsRequestBean;", "", "appVersion", "", "avePace", "", "calorie", "", "deviceType", "effectiveMileage", "effectivePart", "endTime", "gpsMileage", "keepTime", "limitationsGoalsSexInfoId", "paceNumber", "paceRange", "routineLine", "", "Llegym/fuck/logic/legym/network/model/running/RoutineLine;", "scoringType", "semesterId", "signDigital", "signPoint", "startTime", "systemVersion", "totalMileage", "totalPart", "type", "uneffectiveReason", "(Ljava/lang/String;DILjava/lang/String;DILjava/lang/String;DILjava/lang/String;IDLjava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "getAvePace", "()D", "getCalorie", "()I", "getDeviceType", "getEffectiveMileage", "getEffectivePart", "getEndTime", "getGpsMileage", "getKeepTime", "getLimitationsGoalsSexInfoId", "getPaceNumber", "getPaceRange", "getRoutineLine", "()Ljava/util/List;", "getScoringType", "getSemesterId", "getSignDigital", "getSignPoint", "getStartTime", "getSystemVersion", "getTotalMileage", "getTotalPart", "getType", "getUneffectiveReason", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class UploadRunningDetailsRequestBean {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appVersion = null;
    private final double avePace = 0.0;
    private final int calorie = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String deviceType = null;
    private final double effectiveMileage = 0.0;
    private final int effectivePart = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String endTime = null;
    private final double gpsMileage = 0.0;
    private final int keepTime = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String limitationsGoalsSexInfoId = null;
    private final int paceNumber = 0;
    private final double paceRange = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<legym.fuck.logic.legym.network.model.running.RoutineLine> routineLine = null;
    private final int scoringType = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String semesterId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String signDigital = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<legym.fuck.logic.legym.network.model.running.RoutineLine> signPoint = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String startTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String systemVersion = null;
    private final double totalMileage = 0.0;
    private final double totalPart = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String uneffectiveReason = null;
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.running.UploadRunningDetailsRequestBean copy(@org.jetbrains.annotations.NotNull()
    java.lang.String appVersion, double avePace, int calorie, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceType, double effectiveMileage, int effectivePart, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, double gpsMileage, int keepTime, @org.jetbrains.annotations.Nullable()
    java.lang.String limitationsGoalsSexInfoId, int paceNumber, double paceRange, @org.jetbrains.annotations.NotNull()
    java.util.List<legym.fuck.logic.legym.network.model.running.RoutineLine> routineLine, int scoringType, @org.jetbrains.annotations.Nullable()
    java.lang.String semesterId, @org.jetbrains.annotations.NotNull()
    java.lang.String signDigital, @org.jetbrains.annotations.NotNull()
    java.util.List<legym.fuck.logic.legym.network.model.running.RoutineLine> signPoint, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String systemVersion, double totalMileage, double totalPart, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String uneffectiveReason) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UploadRunningDetailsRequestBean(@org.jetbrains.annotations.NotNull()
    java.lang.String appVersion, double avePace, int calorie, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceType, double effectiveMileage, int effectivePart, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, double gpsMileage, int keepTime, @org.jetbrains.annotations.Nullable()
    java.lang.String limitationsGoalsSexInfoId, int paceNumber, double paceRange, @org.jetbrains.annotations.NotNull()
    java.util.List<legym.fuck.logic.legym.network.model.running.RoutineLine> routineLine, int scoringType, @org.jetbrains.annotations.Nullable()
    java.lang.String semesterId, @org.jetbrains.annotations.NotNull()
    java.lang.String signDigital, @org.jetbrains.annotations.NotNull()
    java.util.List<legym.fuck.logic.legym.network.model.running.RoutineLine> signPoint, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String systemVersion, double totalMileage, double totalPart, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String uneffectiveReason) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppVersion() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getAvePace() {
        return 0.0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getCalorie() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceType() {
        return null;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getEffectiveMileage() {
        return 0.0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getEffectivePart() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndTime() {
        return null;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getGpsMileage() {
        return 0.0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getKeepTime() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLimitationsGoalsSexInfoId() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getPaceNumber() {
        return 0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double getPaceRange() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<legym.fuck.logic.legym.network.model.running.RoutineLine> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<legym.fuck.logic.legym.network.model.running.RoutineLine> getRoutineLine() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getScoringType() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSemesterId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSignDigital() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<legym.fuck.logic.legym.network.model.running.RoutineLine> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<legym.fuck.logic.legym.network.model.running.RoutineLine> getSignPoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSystemVersion() {
        return null;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double getTotalMileage() {
        return 0.0;
    }
    
    public final double component21() {
        return 0.0;
    }
    
    public final double getTotalPart() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUneffectiveReason() {
        return null;
    }
}