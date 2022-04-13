package legym.fuck.logic.legym.network.model.course.info;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b;\b\u0086\b\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0016J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u00102\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u00104\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u00107\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010:\u001a\u00020\bH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010?\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u00ca\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00052\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\bH\u00d6\u0001J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b!\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\"\u0010\u0018R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\'\u0010\u001eR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b(\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b+\u0010\u0018R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b,\u0010$R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/\u00a8\u0006F"}, d2 = {"Llegym/fuck/logic/legym/network/model/course/info/CourseInfoListItem;", "", "attainabilityId", "", "allowSureSign", "", "allowSign", "weekNumber", "", "organizationId", "startDayOfWeek", "", "currentSureWeek", "startSignDataStatus", "signNumber", "startSignDate", "signType", "currentWeek", "attainabilityType", "courseId", "endDayOfWeek", "startSignNumber", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;JLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "getAllowSign", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowSureSign", "getAttainabilityId", "()Ljava/lang/String;", "getAttainabilityType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCourseId", "getCurrentSureWeek", "getCurrentWeek", "getEndDayOfWeek", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOrganizationId", "getSignNumber", "getSignType", "getStartDayOfWeek", "()J", "getStartSignDataStatus", "getStartSignDate", "getStartSignNumber", "getWeekNumber", "()I", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;JLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Llegym/fuck/logic/legym/network/model/course/info/CourseInfoListItem;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class CourseInfoListItem {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String attainabilityId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean allowSureSign = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean allowSign = null;
    private final int weekNumber = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String organizationId = null;
    private final long startDayOfWeek = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean currentSureWeek = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean startSignDataStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer signNumber = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long startSignDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer signType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean currentWeek = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer attainabilityType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String courseId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long endDayOfWeek = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer startSignNumber = null;
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.course.info.CourseInfoListItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.String attainabilityId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allowSureSign, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allowSign, int weekNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String organizationId, long startDayOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean currentSureWeek, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean startSignDataStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Integer signNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Long startSignDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer signType, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean currentWeek, @org.jetbrains.annotations.Nullable()
    java.lang.Integer attainabilityType, @org.jetbrains.annotations.Nullable()
    java.lang.String courseId, @org.jetbrains.annotations.Nullable()
    java.lang.Long endDayOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.Integer startSignNumber) {
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
    
    public CourseInfoListItem() {
        super();
    }
    
    public CourseInfoListItem(@org.jetbrains.annotations.Nullable()
    java.lang.String attainabilityId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allowSureSign, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allowSign, int weekNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String organizationId, long startDayOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean currentSureWeek, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean startSignDataStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Integer signNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Long startSignDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer signType, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean currentWeek, @org.jetbrains.annotations.Nullable()
    java.lang.Integer attainabilityType, @org.jetbrains.annotations.Nullable()
    java.lang.String courseId, @org.jetbrains.annotations.Nullable()
    java.lang.Long endDayOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.Integer startSignNumber) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAttainabilityId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAllowSureSign() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAllowSign() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getWeekNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrganizationId() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getStartDayOfWeek() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCurrentSureWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getStartSignDataStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSignNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getStartSignDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSignType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCurrentWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAttainabilityType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCourseId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEndDayOfWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStartSignNumber() {
        return null;
    }
}