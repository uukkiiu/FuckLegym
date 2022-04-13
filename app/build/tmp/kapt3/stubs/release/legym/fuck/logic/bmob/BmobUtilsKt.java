package legym.fuck.logic.bmob;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086\b\u00f8\u0001\u0000\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0010\u001a\'\u0010\u0013\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0002*\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u000f*\u00020\u0002H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u001b\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\b\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"bmobQuery", "Lcn/bmob/v3/BmobQuery;", "Llegym/fuck/logic/bmob/BmobSdkUser;", "getBmobQuery", "()Lcn/bmob/v3/BmobQuery;", "isVip", "", "Llegym/fuck/core/model/BmobUser;", "(Llegym/fuck/core/model/BmobUser;)Z", "checkHasIntegral", "brake", "Lkotlin/Function0;", "", "getBmobDataByLegymId", "legymId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBmobUserByObjectId", "objectId", "consume", "consumption", "", "refresh", "(Llegym/fuck/core/model/BmobUser;FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateBmobUser", "Llegym/fuck/logic/legym/network/model/login/LoginResult;", "suspendSaveSync", "(Llegym/fuck/logic/bmob/BmobSdkUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class BmobUtilsKt {
    
    private static final cn.bmob.v3.BmobQuery<legym.fuck.logic.bmob.BmobSdkUser> getBmobQuery() {
        return null;
    }
    
    /**
     * 通过乐健的账号找到Bmob的账号
     *
     * 同步阻塞的方式
     *
     * 返回可能为空
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object getBmobDataByLegymId(@org.jetbrains.annotations.NotNull()
    java.lang.String legymId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.bmob.BmobSdkUser> continuation) {
        return null;
    }
    
    /**
     * 通过objectId查找Bmob用户
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object getBmobUserByObjectId(@org.jetbrains.annotations.NotNull()
    java.lang.String objectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.bmob.BmobSdkUser> continuation) {
        return null;
    }
    
    /**
     * 用挂起函数来同步注册新用户
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object suspendSaveSync(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.bmob.BmobSdkUser $this$suspendSaveSync, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    /**
     * 基于账号和登录结果生成Bmob新用户
     */
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.logic.bmob.BmobSdkUser generateBmobUser(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.login.LoginResult $this$generateBmobUser, @org.jetbrains.annotations.NotNull()
    java.lang.String legymId) {
        return null;
    }
    
    /**
     * 检查账户是否还有积分
     */
    @org.jetbrains.annotations.Nullable()
    public static final legym.fuck.core.model.BmobUser checkHasIntegral(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> brake) {
        return null;
    }
    
    /**
     * 挂起函数为Bmob用户扣费
     * @param consumption 要扣多少
     * @param refresh 扣费之前是否再同步一次数据
     * @return 这次操作是否成功
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object consume(@org.jetbrains.annotations.NotNull()
    legym.fuck.core.model.BmobUser $this$consume, float consumption, boolean refresh, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p3) {
        return null;
    }
    
    public static final boolean isVip(@org.jetbrains.annotations.NotNull()
    legym.fuck.core.model.BmobUser $this$isVip) {
        return false;
    }
}