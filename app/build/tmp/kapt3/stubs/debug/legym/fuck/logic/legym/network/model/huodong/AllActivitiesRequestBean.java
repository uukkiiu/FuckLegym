package legym.fuck.logic.legym.network.model.huodong;

import java.lang.System;

/**
 * @param campus 对应的校区id，空则为全部
 * @param state 当前活动所处状态：0代表报名未开始，1代表报名中，2代表报名结束，4代表进行中，空则为全部
 * @param week 代表筛选星期几的活动，1代表星期一以此类推，空则为全部
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006\""}, d2 = {"Llegym/fuck/logic/legym/network/model/huodong/AllActivitiesRequestBean;", "", "campus", "", "name", "page", "", "size", "state", "topicId", "week", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampus", "()Ljava/lang/String;", "getName", "getPage", "()I", "getSize", "getState", "getTopicId", "getWeek", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class AllActivitiesRequestBean {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String campus = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int page = 0;
    private final int size = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String state = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String topicId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String week = null;
    
    /**
     * @param campus 对应的校区id，空则为全部
     * @param state 当前活动所处状态：0代表报名未开始，1代表报名中，2代表报名结束，4代表进行中，空则为全部
     * @param week 代表筛选星期几的活动，1代表星期一以此类推，空则为全部
     */
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.huodong.AllActivitiesRequestBean copy(@org.jetbrains.annotations.NotNull()
    java.lang.String campus, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int page, int size, @org.jetbrains.annotations.NotNull()
    java.lang.String state, @org.jetbrains.annotations.NotNull()
    java.lang.String topicId, @org.jetbrains.annotations.NotNull()
    java.lang.String week) {
        return null;
    }
    
    /**
     * @param campus 对应的校区id，空则为全部
     * @param state 当前活动所处状态：0代表报名未开始，1代表报名中，2代表报名结束，4代表进行中，空则为全部
     * @param week 代表筛选星期几的活动，1代表星期一以此类推，空则为全部
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * @param campus 对应的校区id，空则为全部
     * @param state 当前活动所处状态：0代表报名未开始，1代表报名中，2代表报名结束，4代表进行中，空则为全部
     * @param week 代表筛选星期几的活动，1代表星期一以此类推，空则为全部
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param campus 对应的校区id，空则为全部
     * @param state 当前活动所处状态：0代表报名未开始，1代表报名中，2代表报名结束，4代表进行中，空则为全部
     * @param week 代表筛选星期几的活动，1代表星期一以此类推，空则为全部
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AllActivitiesRequestBean(@org.jetbrains.annotations.NotNull()
    java.lang.String campus, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int page, int size, @org.jetbrains.annotations.NotNull()
    java.lang.String state, @org.jetbrains.annotations.NotNull()
    java.lang.String topicId, @org.jetbrains.annotations.NotNull()
    java.lang.String week) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCampus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTopicId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeek() {
        return null;
    }
}