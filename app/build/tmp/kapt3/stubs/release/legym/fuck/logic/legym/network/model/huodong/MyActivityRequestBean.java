package legym.fuck.logic.legym.network.model.huodong;

import java.lang.System;

/**
 * @param state 活动状态，4代表查询进行中的活动，5代表查询已结束的活动，3代表查询未开始的活动
 * @param day 代表需要查询多少天的活动，如7代表近7天
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Llegym/fuck/logic/legym/network/model/huodong/MyActivityRequestBean;", "", "day", "", "page", "semesterId", "", "size", "state", "(IILjava/lang/String;II)V", "getDay", "()I", "getPage", "getSemesterId", "()Ljava/lang/String;", "getSize", "getState", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class MyActivityRequestBean {
    private final int day = 0;
    private final int page = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String semesterId = null;
    private final int size = 0;
    private final int state = 0;
    
    /**
     * @param state 活动状态，4代表查询进行中的活动，5代表查询已结束的活动，3代表查询未开始的活动
     * @param day 代表需要查询多少天的活动，如7代表近7天
     */
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.huodong.MyActivityRequestBean copy(int day, int page, @org.jetbrains.annotations.NotNull()
    java.lang.String semesterId, int size, int state) {
        return null;
    }
    
    /**
     * @param state 活动状态，4代表查询进行中的活动，5代表查询已结束的活动，3代表查询未开始的活动
     * @param day 代表需要查询多少天的活动，如7代表近7天
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * @param state 活动状态，4代表查询进行中的活动，5代表查询已结束的活动，3代表查询未开始的活动
     * @param day 代表需要查询多少天的活动，如7代表近7天
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @param state 活动状态，4代表查询进行中的活动，5代表查询已结束的活动，3代表查询未开始的活动
     * @param day 代表需要查询多少天的活动，如7代表近7天
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MyActivityRequestBean(int day, int page, @org.jetbrains.annotations.NotNull()
    java.lang.String semesterId, int size, int state) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getDay() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSemesterId() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getSize() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getState() {
        return 0;
    }
}