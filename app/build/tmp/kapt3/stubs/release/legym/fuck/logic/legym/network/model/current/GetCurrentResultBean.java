package legym.fuck.logic.legym.network.model.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jj\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\bH\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f\u00a8\u0006*"}, d2 = {"Llegym/fuck/logic/legym/network/model/current/GetCurrentResultBean;", "", "current", "", "endDate", "", "id", "index", "", "organizationId", "startDate", "weekIndex", "yearRange", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "getCurrent", "()Ljava/lang/String;", "getEndDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrganizationId", "getStartDate", "getWeekIndex", "getYearRange", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)Llegym/fuck/logic/legym/network/model/current/GetCurrentResultBean;", "equals", "", "other", "hashCode", "toString", "app_release"})
@kotlinx.serialization.Serializable()
public final class GetCurrentResultBean {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String current = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long endDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer index = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String organizationId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long startDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer weekIndex = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String yearRange = null;
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.current.GetCurrentResultBean copy(@org.jetbrains.annotations.Nullable()
    java.lang.String current, @org.jetbrains.annotations.Nullable()
    java.lang.Long endDate, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer index, @org.jetbrains.annotations.NotNull()
    java.lang.String organizationId, @org.jetbrains.annotations.Nullable()
    java.lang.Long startDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer weekIndex, @org.jetbrains.annotations.Nullable()
    java.lang.String yearRange) {
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
    
    public GetCurrentResultBean(@org.jetbrains.annotations.Nullable()
    java.lang.String current, @org.jetbrains.annotations.Nullable()
    java.lang.Long endDate, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer index, @org.jetbrains.annotations.NotNull()
    java.lang.String organizationId, @org.jetbrains.annotations.Nullable()
    java.lang.Long startDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer weekIndex, @org.jetbrains.annotations.Nullable()
    java.lang.String yearRange) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEndDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrganizationId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getStartDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWeekIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYearRange() {
        return null;
    }
}