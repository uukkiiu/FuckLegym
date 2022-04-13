package legym.fuck.logic.legym.network.service;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/18 17:13
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Llegym/fuck/logic/legym/network/service/EducationService;", "", "getCurrent", "Llegym/fuck/logic/legym/network/model/HttpResult;", "Llegym/fuck/logic/legym/network/model/current/GetCurrentResultBean;", "headerMap", "", "", "Llegym/fuck/logic/legym/network/LegymHeaderMap;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface EducationService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/education/semester/getCurrent")
    public abstract java.lang.Object getCurrent(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.current.GetCurrentResultBean>> continuation);
}