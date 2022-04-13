package legym.fuck.logic.legym.network;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/17 17:32
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a2\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010&\u001a\u00020\'H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(JE\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H*0$\"\u0004\b\u0000\u0010*2$\u0010+\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H*0$0-\u0012\u0006\u0012\u0004\u0018\u00010\u00010,H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.JM\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H*0$\"\u0004\b\u0000\u0010*2\u0006\u00100\u001a\u0002012$\u0010+\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H*0$0-\u0012\u0006\u0012\u0004\u0018\u00010\u00010,H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J!\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040$2\u0006\u0010&\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J!\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080$2\u0006\u0010&\u001a\u000209H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J\u001f\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020=\u0018\u00010<0$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J!\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0$2\u0006\u0010A\u001a\u000201H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ!\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0$2\u0006\u0010A\u001a\u000201H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u001f\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020F\u0018\u00010<0$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u0019\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J!\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040$2\u0006\u0010&\u001a\u00020JH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010KJ\u0019\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J!\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0$2\u0006\u0010&\u001a\u00020PH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ!\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0$2\u0006\u0010&\u001a\u00020TH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010UJ!\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0$2\u0006\u0010&\u001a\u00020XH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010YJ!\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010[\u001a\u000201H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ-\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0$2\b\u0010^\u001a\u0004\u0018\u0001012\b\u0010_\u001a\u0004\u0018\u000101H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010`J!\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010$2\u0006\u0010b\u001a\u00020cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ!\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010$2\u0006\u0010&\u001a\u00020fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010gJ!\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0$2\u0006\u0010&\u001a\u00020iH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010jJ!\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010l0$2\u0006\u0010&\u001a\u00020\'H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0019\u0010k\u001a\u00020m2\u0006\u0010&\u001a\u00020nH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010oJ5\u0010p\u001a\u00020q2\b\u0010r\u001a\u0004\u0018\u0001012\u0006\u0010s\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u0001012\u0006\u0010v\u001a\u00020wH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010xJ!\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010$2\u0006\u0010&\u001a\u00020yH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010zR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u001d\u001a\u00020\u001e8BX\u0083\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\"\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006{"}, d2 = {"Llegym/fuck/logic/legym/network/NetworkRepository;", "", "()V", "activityService", "Llegym/fuck/logic/legym/network/service/ActivityService;", "getActivityService", "()Llegym/fuck/logic/legym/network/service/ActivityService;", "activityService$delegate", "Lkotlin/Lazy;", "courseService", "Llegym/fuck/logic/legym/network/service/CourseService;", "getCourseService", "()Llegym/fuck/logic/legym/network/service/CourseService;", "courseService$delegate", "educationService", "Llegym/fuck/logic/legym/network/service/EducationService;", "getEducationService", "()Llegym/fuck/logic/legym/network/service/EducationService;", "educationService$delegate", "loginService", "Llegym/fuck/logic/legym/network/service/LoginService;", "getLoginService", "()Llegym/fuck/logic/legym/network/service/LoginService;", "loginService$delegate", "runningService", "Llegym/fuck/logic/legym/network/service/RunningService;", "getRunningService", "()Llegym/fuck/logic/legym/network/service/RunningService;", "runningService$delegate", "signInService", "Llegym/fuck/logic/legym/network/service/SignInService;", "getSignInService$annotations", "getSignInService", "()Llegym/fuck/logic/legym/network/service/SignInService;", "signInService$delegate", "cancelSignUpActivity", "Llegym/fuck/logic/legym/network/model/HttpResult;", "", "requestBean", "Llegym/fuck/logic/legym/network/model/huodong/signup/SignUpRequestBean;", "(Llegym/fuck/logic/legym/network/model/huodong/signup/SignUpRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "catchError", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "catchErrorAndUpload", "tag", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActivities", "Llegym/fuck/logic/legym/network/model/huodong/ActivitiesResultBean;", "Llegym/fuck/logic/legym/network/model/huodong/AllActivitiesRequestBean;", "(Llegym/fuck/logic/legym/network/model/huodong/AllActivitiesRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActivityList", "Llegym/fuck/logic/legym/network/model/signin/AcitivityListResultBean;", "Llegym/fuck/logic/legym/network/model/signin/ActivityListRequestBean;", "(Llegym/fuck/logic/legym/network/model/signin/ActivityListRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCampus", "", "Llegym/fuck/logic/legym/network/model/huodong/CampusItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseDetails", "Llegym/fuck/logic/legym/network/model/course/CourseDetailResultBean;", "courseId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseInfo", "Llegym/fuck/logic/legym/network/model/course/info/CourseInfoResultBean;", "getCourseList", "Llegym/fuck/logic/legym/network/model/course/CourseListResultBean;", "getCurrentSemesterId", "Llegym/fuck/logic/legym/network/model/current/GetCurrentResultBean;", "getMyActivities", "Llegym/fuck/logic/legym/network/model/huodong/MyActivityRequestBean;", "(Llegym/fuck/logic/legym/network/model/huodong/MyActivityRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyStatistics", "Llegym/fuck/logic/legym/network/model/huodong/MyStatisticsResultBean;", "getRunningHistory", "Llegym/fuck/logic/legym/network/model/running/runningHistory/RunningHistoryResultBean;", "Llegym/fuck/logic/legym/network/model/running/runningHistory/RunningHistoryRequestBean;", "(Llegym/fuck/logic/legym/network/model/running/runningHistory/RunningHistoryRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRunningLimit", "Llegym/fuck/logic/legym/network/model/running/RunningLimitResultBean;", "Llegym/fuck/logic/legym/network/model/running/RunningLimitRequestBean;", "(Llegym/fuck/logic/legym/network/model/running/RunningLimitRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTotalRunning", "Llegym/fuck/logic/legym/network/model/running/totalRunning/TotalRunningResultBean;", "Llegym/fuck/logic/legym/network/model/running/totalRunning/TotalRunningRequestBean;", "(Llegym/fuck/logic/legym/network/model/running/totalRunning/TotalRunningRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isActivityConflict", "activityId", "login", "Llegym/fuck/logic/legym/network/model/login/LoginResult;", "userId", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signForCourse", "signCourseRequestBean", "Llegym/fuck/logic/legym/network/model/course/SignCourseRequestBean;", "(Llegym/fuck/logic/legym/network/model/course/SignCourseRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInActivity", "Llegym/fuck/logic/legym/network/model/huodong/signin/ActivitySignInRequestBean;", "(Llegym/fuck/logic/legym/network/model/huodong/signin/ActivitySignInRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llegym/fuck/logic/legym/network/model/signin/signin/ActivitySignInResultBean;", "Llegym/fuck/logic/legym/network/model/signin/signin/ActivitySignInRequestBean;", "(Llegym/fuck/logic/legym/network/model/signin/signin/ActivitySignInRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpActivity", "Llegym/fuck/logic/legym/network/model/huodong/signup/SignUpResultBean;", "Llegym/fuck/logic/legym/network/model/signin/signup/ActivitySignUpResultBean;", "Llegym/fuck/logic/legym/network/model/signin/signup/ActivitySignUpRequestBean;", "(Llegym/fuck/logic/legym/network/model/signin/signup/ActivitySignUpRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadRunningDetail", "Llegym/fuck/logic/legym/network/model/running/UploadRunningDetailsResult;", "map", "targetMileage", "", "limitationsGoalsSexInfoId", "type", "Llegym/fuck/ui/run/logic/RunningType;", "(Ljava/lang/String;FLjava/lang/String;Llegym/fuck/ui/run/logic/RunningType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llegym/fuck/logic/legym/network/model/running/UploadRunningDetailsRequestBean;", "(Llegym/fuck/logic/legym/network/model/running/UploadRunningDetailsRequestBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class NetworkRepository {
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.logic.legym.network.NetworkRepository INSTANCE = null;
    private static final kotlin.Lazy loginService$delegate = null;
    private static final kotlin.Lazy runningService$delegate = null;
    private static final kotlin.Lazy educationService$delegate = null;
    @java.lang.Deprecated()
    private static final kotlin.Lazy signInService$delegate = null;
    private static final kotlin.Lazy activityService$delegate = null;
    private static final kotlin.Lazy courseService$delegate = null;
    
    private NetworkRepository() {
        super();
    }
    
    private final legym.fuck.logic.legym.network.service.LoginService getLoginService() {
        return null;
    }
    
    private final legym.fuck.logic.legym.network.service.RunningService getRunningService() {
        return null;
    }
    
    private final legym.fuck.logic.legym.network.service.EducationService getEducationService() {
        return null;
    }
    
    @java.lang.Deprecated()
    private final legym.fuck.logic.legym.network.service.SignInService getSignInService() {
        return null;
    }
    
    @java.lang.Deprecated()
    private static void getSignInService$annotations() {
    }
    
    private final legym.fuck.logic.legym.network.service.ActivityService getActivityService() {
        return null;
    }
    
    private final legym.fuck.logic.legym.network.service.CourseService getCourseService() {
        return null;
    }
    
    /**
     * 进行登录
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.login.LoginResult>> continuation) {
        return null;
    }
    
    /**
     * 上传跑步数据
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadRunningDetail(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.running.UploadRunningDetailsRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.lang.String>> continuation) {
        return null;
    }
    
    /**
     * 用以前的旧代码上传跑步数据
     *
     * 这个函数会判断要上传的成绩是否达到限制，若超过限制，则会截取一部分有效的上传为有效成绩，然后这个试图上传的成绩会加一个随机数作为总成绩
     *
     * @param targetMileage 试图要上传的成绩
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadRunningDetail(@org.jetbrains.annotations.Nullable()
    java.lang.String map, float targetMileage, @org.jetbrains.annotations.Nullable()
    java.lang.String limitationsGoalsSexInfoId, @org.jetbrains.annotations.NotNull()
    legym.fuck.ui.run.logic.RunningType type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.running.UploadRunningDetailsResult> continuation) {
        return null;
    }
    
    /**
     * 获取当前学期信息
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentSemesterId(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.current.GetCurrentResultBean>> continuation) {
        return null;
    }
    
    /**
     * 获取跑步的规则限制
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRunningLimit(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.running.RunningLimitRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.running.RunningLimitResultBean>> continuation) {
        return null;
    }
    
    /**
     * 获取已经跑了多少公里了
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTotalRunning(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.running.totalRunning.TotalRunningResultBean>> continuation) {
        return null;
    }
    
    /**
     * 获取跑步历史记录
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRunningHistory(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.running.runningHistory.RunningHistoryRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.running.runningHistory.RunningHistoryResultBean>> continuation) {
        return null;
    }
    
    /**
     * 获取我自己的活动
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMyActivities(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.huodong.MyActivityRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.huodong.ActivitiesResultBean>> continuation) {
        return null;
    }
    
    /**
     * 获取我的活动统计
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMyStatistics(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.huodong.MyStatisticsResultBean>> continuation) {
        return null;
    }
    
    /**
     * 获取学校的活动
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getActivities(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.huodong.AllActivitiesRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.huodong.ActivitiesResultBean>> continuation) {
        return null;
    }
    
    /**
     * 获取所有的校区
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCampus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.util.List<legym.fuck.logic.legym.network.model.huodong.CampusItem>>> continuation) {
        return null;
    }
    
    /**
     * 活动报名
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signUpActivity(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.huodong.signup.SignUpRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.huodong.signup.SignUpResultBean>> continuation) {
        return null;
    }
    
    /**
     * 取消活动报名
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cancelSignUpActivity(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.huodong.signup.SignUpRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.lang.Boolean>> continuation) {
        return null;
    }
    
    /**
     * 判断活动是否冲突
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isActivityConflict(@org.jetbrains.annotations.NotNull()
    java.lang.String activityId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.lang.Boolean>> continuation) {
        return null;
    }
    
    /**
     * ddb活动签到
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signInActivity(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.huodong.signin.ActivitySignInRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * 获取活动列表
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Deprecated()
    public final java.lang.Object getActivityList(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.signin.ActivityListRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.signin.AcitivityListResultBean>> continuation) {
        return null;
    }
    
    /**
     * 活动签到
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Deprecated()
    public final java.lang.Object signInActivity(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.signin.signin.ActivitySignInRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.signin.signin.ActivitySignInResultBean>> continuation) {
        return null;
    }
    
    /**
     * 获取课程列表
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCourseList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.util.List<legym.fuck.logic.legym.network.model.course.CourseListResultBean>>> continuation) {
        return null;
    }
    
    /**
     * 获取课程信息
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCourseInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String courseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.course.info.CourseInfoResultBean>> continuation) {
        return null;
    }
    
    /**
     * 获取单个课程详情
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCourseDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String courseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<legym.fuck.logic.legym.network.model.course.CourseDetailResultBean>> continuation) {
        return null;
    }
    
    /**
     * 课程签到
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signForCourse(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.course.SignCourseRequestBean signCourseRequestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<java.lang.Object>> continuation) {
        return null;
    }
    
    /**
     * 活动报名
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Deprecated()
    public final java.lang.Object signUpActivity(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.signin.signup.ActivitySignUpRequestBean requestBean, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.signin.signup.ActivitySignUpResultBean> continuation) {
        return null;
    }
    
    /**
     * 所有的网络请求都统一经过这个函数
     */
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object catchError(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<T>>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<T>> continuation) {
        return null;
    }
    
    /**
     * 所有的网络请求都统一经过这个函数
     *
     * 这是专门为网络请求失败专门进行上报的
     */
    private final <T extends java.lang.Object>java.lang.Object catchErrorAndUpload(java.lang.String tag, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<T>>, ? extends java.lang.Object> block, kotlin.coroutines.Continuation<? super legym.fuck.logic.legym.network.model.HttpResult<T>> continuation) {
        return null;
    }
}