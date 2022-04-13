package legym.fuck.ui.courseDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Llegym/fuck/ui/courseDetail/CourseDetailActivity;", "Llegym/fuck/base/CollapsingToolbarActivity;", "()V", "binding", "Llegym/fuck/databinding/ActivityCourseDetailBinding;", "getBinding", "()Llegym/fuck/databinding/ActivityCourseDetailBinding;", "binding$delegate", "Lkotlin/Lazy;", "courseId", "", "courseName", "formatter", "Ljava/text/SimpleDateFormat;", "getFormatter", "()Ljava/text/SimpleDateFormat;", "mViewModel", "Llegym/fuck/ui/courseDetail/CourseDetailViewModel;", "getMViewModel", "()Llegym/fuck/ui/courseDetail/CourseDetailViewModel;", "mViewModel$delegate", "initDataListeners", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"})
public final class CourseDetailActivity extends legym.fuck.base.CollapsingToolbarActivity {
    private java.lang.String courseId;
    private java.lang.String courseName;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat formatter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.ui.courseDetail.CourseDetailActivity.Companion Companion = null;
    private static final java.lang.String INTENT_KEY_COURSE_ID = "INTENT_KEY_COURSE_ID";
    private static final java.lang.String INTENT_KEY_COURSE_NAME = "INTENT_KEY_COURSE_NAME";
    
    public CourseDetailActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.ui.courseDetail.CourseDetailViewModel getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getFormatter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.databinding.ActivityCourseDetailBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final void initDataListeners() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Llegym/fuck/ui/courseDetail/CourseDetailActivity$Companion;", "", "()V", "INTENT_KEY_COURSE_ID", "", "INTENT_KEY_COURSE_NAME", "startActivity", "", "courseId", "courseName", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void startActivity(@org.jetbrains.annotations.NotNull()
        java.lang.String courseId, @org.jetbrains.annotations.NotNull()
        java.lang.String courseName) {
        }
    }
}