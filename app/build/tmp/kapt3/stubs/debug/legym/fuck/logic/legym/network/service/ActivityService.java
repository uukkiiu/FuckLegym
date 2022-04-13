package legym.fuck.logic.legym.network.service;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/27 18:03
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ=\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ9\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J=\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J3\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ=\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\u001eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ=\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Llegym/fuck/logic/legym/network/service/ActivityService;", "", "cancelSignUpActivity", "Llegym/fuck/logic/legym/network/model/HttpResult;", "", "headerMap", "", "", "Llegym/fuck/logic/legym/network/LegymHeaderMap;", "requestBean", "Llegym/fuck/logic/legym/network/model/huodong/signup/SignUpRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/huodong/signup/SignUpRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActivities", "Llegym/fuck/logic/legym/network/model/huodong/ActivitiesResultBean;", "Llegym/fuck/logic/legym/network/model/huodong/AllActivitiesRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/huodong/AllActivitiesRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCampus", "", "Llegym/fuck/logic/legym/network/model/huodong/CampusItem;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyActivities", "Llegym/fuck/logic/legym/network/model/huodong/MyActivityRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/huodong/MyActivityRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyStatistics", "Llegym/fuck/logic/legym/network/model/huodong/MyStatisticsResultBean;", "isActivityConflict", "", "activityId", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInActivity", "Llegym/fuck/logic/legym/network/model/huodong/signin/ActivitySignInRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/huodong/signin/ActivitySignInRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpActivity", "Llegym/fuck/logic/legym/network/model/huodong/signup/SignUpResultBean;", "app_debug"})
public abstract interface ActivityService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/education/app/activity/my/getActivityList")
    public abstract java.lang.Object getMyActivities(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.huodong.MyActivityRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.huodong.ActivitiesResultBean>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/education/app/activity/getActivityList")
    public abstract java.lang.Object getActivities(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.huodong.AllActivitiesRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.huodong.ActivitiesResultBean>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/education/campus/queryAll")
    public abstract java.lang.Object getCampus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.util.List<legym.fuck.logic.legym.network.model.huodong.CampusItem>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/education/app/activity/signUp")
    public abstract java.lang.Object signUpActivity(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.huodong.signup.SignUpRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.huodong.signup.SignUpResultBean>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/education/app/activity/cancelSignUp")
    public abstract java.lang.Object cancelSignUpActivity(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.huodong.signup.SignUpRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.lang.Boolean>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "/education/activity/app/attainability/sign")
    public abstract java.lang.Object signInActivity(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.huodong.signin.ActivitySignInRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/education/app/activity/signUpStatistics")
    public abstract java.lang.Object getMyStatistics(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.huodong.MyStatisticsResultBean>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/education/app/activity/checkConflict")
    public abstract java.lang.Object isActivityConflict(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "activityId")
    java.lang.String activityId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.lang.Boolean>> continuation);
}