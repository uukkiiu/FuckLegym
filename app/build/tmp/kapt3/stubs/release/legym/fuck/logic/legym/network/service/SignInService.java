package legym.fuck.logic.legym.network.service;

import java.lang.System;

/**
 * @Name SignInService
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月21日 15:20
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ=\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ5\u0010\u0010\u001a\u00020\u00112\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Llegym/fuck/logic/legym/network/service/SignInService;", "", "getActivityList", "Llegym/fuck/logic/legym/network/model/HttpResult;", "Llegym/fuck/logic/legym/network/model/signin/AcitivityListResultBean;", "headerMap", "", "", "Llegym/fuck/logic/legym/network/LegymHeaderMap;", "requestBean", "Llegym/fuck/logic/legym/network/model/signin/ActivityListRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/signin/ActivityListRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "Llegym/fuck/logic/legym/network/model/signin/signin/ActivitySignInResultBean;", "Llegym/fuck/logic/legym/network/model/signin/signin/ActivitySignInRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/signin/signin/ActivitySignInRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Llegym/fuck/logic/legym/network/model/signin/signup/ActivitySignUpResultBean;", "Llegym/fuck/logic/legym/network/model/signin/signup/ActivitySignUpRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/signin/signup/ActivitySignUpRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
@java.lang.Deprecated()
public abstract interface SignInService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/education/app/activity/getActivityList")
    public abstract java.lang.Object getActivityList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.signin.ActivityListRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.signin.AcitivityListResultBean>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "/education/activity/app/attainability/sign")
    public abstract java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.signin.signin.ActivitySignInRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.signin.signin.ActivitySignInResultBean>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/education/app/activity/signUp")
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.signin.signup.ActivitySignUpRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.signin.signup.ActivitySignUpResultBean> continuation);
}