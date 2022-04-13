package legym.fuck.ui.signin;

import java.lang.System;

/**
 * @ClassName SignUpViewModel
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月20日 22:42
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u001aJ\u0006\u0010&\u001a\u00020$J\u0006\u0010\'\u001a\u00020$R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R4\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015 \n*\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00140\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001a0\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001a0\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\fR7\u0010\u001e\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015 \n*\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001f0\u001f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u001f\u0010!\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001a0\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\f\u00a8\u0006("}, d2 = {"Llegym/fuck/ui/signin/SignInViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "activityAdapter", "Lcom/angcyo/dsladapter/DslAdapter;", "getActivityAdapter", "()Lcom/angcyo/dsladapter/DslAdapter;", "autoSignIn", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getAutoSignIn", "()Landroidx/lifecycle/MutableLiveData;", "currentActivities", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Llegym/fuck/logic/legym/network/model/signin/signin/ItemsItem;", "getCurrentActivities", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "errorMap", "", "", "getErrorMap", "setErrorMap", "(Landroidx/lifecycle/MutableLiveData;)V", "pageNum", "", "getPageNum", "pageTotalNum", "getPageTotalNum", "selectActivities", "", "getSelectActivities", "total", "getTotal", "loadActivities", "", "page", "signInWithActivities", "signUpWithActivities", "app_release"})
public final class SignInViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> autoSignIn = null;
    
    /**
     * 当前可显示的活动
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.legym.network.model.signin.signin.ItemsItem>> currentActivities = null;
    
    /**
     * 选中的活动
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.String>> selectActivities = null;
    
    /**
     * 总活动数
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> total = null;
    
    /**
     * 总页数
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> pageTotalNum = null;
    
    /**
     * 当前页数
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> pageNum = null;
    
    /**
     * 错误原因
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> errorMap;
    @org.jetbrains.annotations.NotNull()
    private final com.angcyo.dsladapter.DslAdapter activityAdapter = null;
    
    public SignInViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAutoSignIn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<legym.fuck.logic.legym.network.model.signin.signin.ItemsItem>> getCurrentActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.String>> getSelectActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPageTotalNum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPageNum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getErrorMap() {
        return null;
    }
    
    public final void setErrorMap(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.angcyo.dsladapter.DslAdapter getActivityAdapter() {
        return null;
    }
    
    /**
     * 加载活动
     * @param page 加载页数
     */
    public final void loadActivities(int page) {
    }
    
    /**
     * 对选中活动进行报名
     */
    public final void signUpWithActivities() {
    }
    
    /**
     * 对选中活动进行签到
     */
    public final void signInWithActivities() {
    }
}