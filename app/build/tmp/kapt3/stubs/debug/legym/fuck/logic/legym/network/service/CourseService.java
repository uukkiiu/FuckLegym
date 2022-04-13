package legym.fuck.logic.legym.network.service;

import java.lang.System;

/**
 * @Name CourseService
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月29日 18:36
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ=\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\t\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ9\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J=\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Llegym/fuck/logic/legym/network/service/CourseService;", "", "getCourseDetail", "Llegym/fuck/logic/legym/network/model/HttpResult;", "Llegym/fuck/logic/legym/network/model/course/CourseDetailResultBean;", "headerMap", "", "", "Llegym/fuck/logic/legym/network/LegymHeaderMap;", "courseId", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseInfo", "Llegym/fuck/logic/legym/network/model/course/info/CourseInfoResultBean;", "getCourseList", "", "Llegym/fuck/logic/legym/network/model/course/CourseListResultBean;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signForCourse", "requestBean", "Llegym/fuck/logic/legym/network/model/course/SignCourseRequestBean;", "(Ljava/util/Map;Llegym/fuck/logic/legym/network/model/course/SignCourseRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CourseService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/education/course/app/forStudent/list")
    public abstract java.lang.Object getCourseList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.util.List<legym.fuck.logic.legym.network.model.course.CourseListResultBean>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "/education/course/app/forStudent/sign")
    public abstract java.lang.Object signForCourse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    legym.fuck.logic.legym.network.model.course.SignCourseRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/education/course/app/forStudent/attainability/info")
    public abstract java.lang.Object getCourseInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "courseId")
    java.lang.String courseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.course.info.CourseInfoResultBean>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/education/course/app/forStudent/info")
    public abstract java.lang.Object getCourseDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headerMap, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "courseId")
    java.lang.String courseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.course.CourseDetailResultBean>> continuation);
}