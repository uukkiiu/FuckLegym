package legym.fuck.logic.bmob;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/19 16:08
 *
 *
 * 每一个乐健账号会对应一个Bmob账号，Bmob账号比乐健的多一些属性。
 *
 * 记录了学校，学院，年级等信息方便查看app流通情况。
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u000bH\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Llegym/fuck/logic/bmob/BmobSdkUser;", "Lcn/bmob/v3/BmobObject;", "userId", "", "integral", "", "vipDate", "", "schoolName", "organizationName", "year", "", "(Ljava/lang/String;FJLjava/lang/String;Ljava/lang/String;I)V", "getIntegral", "()F", "getOrganizationName", "()Ljava/lang/String;", "getSchoolName", "getUserId", "getVipDate", "()J", "setVipDate", "(J)V", "getYear", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class BmobSdkUser extends cn.bmob.v3.BmobObject {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userId = null;
    
    /**
     * 账号余额
     */
    private final float integral = 0.0F;
    
    /**
     * Vip到期时间
     */
    private long vipDate;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String schoolName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String organizationName = null;
    private final int year = 0;
    
    /**
     * @author ldh
     * 时间: 2022/3/19 16:08
     *
     *
     * 每一个乐健账号会对应一个Bmob账号，Bmob账号比乐健的多一些属性。
     *
     * 记录了学校，学院，年级等信息方便查看app流通情况。
     */
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.bmob.BmobSdkUser copy(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, float integral, long vipDate, @org.jetbrains.annotations.NotNull()
    java.lang.String schoolName, @org.jetbrains.annotations.NotNull()
    java.lang.String organizationName, int year) {
        return null;
    }
    
    /**
     * @author ldh
     * 时间: 2022/3/19 16:08
     *
     *
     * 每一个乐健账号会对应一个Bmob账号，Bmob账号比乐健的多一些属性。
     *
     * 记录了学校，学院，年级等信息方便查看app流通情况。
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * @author ldh
     * 时间: 2022/3/19 16:08
     *
     *
     * 每一个乐健账号会对应一个Bmob账号，Bmob账号比乐健的多一些属性。
     *
     * 记录了学校，学院，年级等信息方便查看app流通情况。
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @author ldh
     * 时间: 2022/3/19 16:08
     *
     *
     * 每一个乐健账号会对应一个Bmob账号，Bmob账号比乐健的多一些属性。
     *
     * 记录了学校，学院，年级等信息方便查看app流通情况。
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public BmobSdkUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, float integral, long vipDate, @org.jetbrains.annotations.NotNull()
    java.lang.String schoolName, @org.jetbrains.annotations.NotNull()
    java.lang.String organizationName, int year) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    /**
     * 账号余额
     */
    public final float component2() {
        return 0.0F;
    }
    
    /**
     * 账号余额
     */
    public final float getIntegral() {
        return 0.0F;
    }
    
    /**
     * Vip到期时间
     */
    public final long component3() {
        return 0L;
    }
    
    /**
     * Vip到期时间
     */
    public final long getVipDate() {
        return 0L;
    }
    
    /**
     * Vip到期时间
     */
    public final void setVipDate(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSchoolName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrganizationName() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getYear() {
        return 0;
    }
}