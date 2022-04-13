package legym.fuck.logic.legym.network.service;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/18 12:54
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Llegym/fuck/logic/legym/network/service/LoginService;", "", "login", "Llegym/fuck/logic/legym/network/model/HttpResult;", "Llegym/fuck/logic/legym/network/model/login/LoginResult;", "requestBean", "Llegym/fuck/logic/legym/network/model/login/LoginRequestBean;", "(Llegym/fuck/logic/legym/network/model/login/LoginRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LoginService {
    
    /**
     * 登录
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/authorization/user/manage/login")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.login.LoginRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.login.LoginResult>> continuation);
}