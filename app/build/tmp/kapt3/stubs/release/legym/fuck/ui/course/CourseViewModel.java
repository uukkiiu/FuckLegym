package legym.fuck.ui.course;

import java.lang.System;

/**
 * @ClassName CourseViewModel
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月29日 17:12
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bR\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\b\u00a8\u0006\u001e"}, d2 = {"Llegym/fuck/ui/course/CourseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "attainabilityNumber", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getAttainabilityNumber", "()Landroidx/lifecycle/MutableLiveData;", "courseInfo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Llegym/fuck/logic/legym/network/model/course/info/CourseInfoListItem;", "getCourseInfo", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "courseInfoAdapter", "Lcom/angcyo/dsladapter/DslAdapter;", "getCourseInfoAdapter", "()Lcom/angcyo/dsladapter/DslAdapter;", "courseList", "Llegym/fuck/logic/legym/network/model/course/CourseListResultBean;", "getCourseList", "currentCourse", "getCurrentCourse", "signNumber", "getSignNumber", "loadCourseInfo", "", "loadCurrentCourse", "sign", "app_release"})
public final class CourseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<legym.fuck.logic.legym.network.model.course.CourseListResultBean> currentCourse = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.legym.network.model.course.info.CourseInfoListItem>> courseInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> signNumber = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> attainabilityNumber = null;
    @org.jetbrains.annotations.NotNull()
    private final com.angcyo.dsladapter.DslAdapter courseInfoAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.legym.network.model.course.CourseListResultBean>> courseList = null;
    
    public CourseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<legym.fuck.logic.legym.network.model.course.CourseListResultBean> getCurrentCourse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.legym.network.model.course.info.CourseInfoListItem>> getCourseInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSignNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getAttainabilityNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.angcyo.dsladapter.DslAdapter getCourseInfoAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.legym.network.model.course.CourseListResultBean>> getCourseList() {
        return null;
    }
    
    /**
     * 加载当前有的课程
     */
    public final void loadCurrentCourse() {
    }
    
    /**
     * 加载课程的每周信息
     */
    public final void loadCourseInfo() {
    }
    
    /**
     * 课程签到
     */
    public final void sign() {
    }
}