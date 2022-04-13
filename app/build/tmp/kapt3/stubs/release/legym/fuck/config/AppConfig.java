package legym.fuck.config;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/18 15:37
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010%\u00a8\u0006\'"}, d2 = {"Llegym/fuck/config/AppConfig;", "", "()V", "DEFAULT_DAILY_RUNNING_LIMIT", "", "DEFAULT_WEEKLY_RUNNING_LIMIT", "ENABLE_SIGN_ADVANCE", "", "getENABLE_SIGN_ADVANCE", "()Z", "FLOAT_FORMAT_DOUBLE", "", "FLOAT_FORMAT_INTEGRAL", "LEGYM_APP_VERSION", "legymDateStringFormatter", "Ljava/text/SimpleDateFormat;", "getLegymDateStringFormatter", "()Ljava/text/SimpleDateFormat;", "noRunningLimit", "getNoRunningLimit", "setNoRunningLimit", "(Z)V", "onLineConfig", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Llegym/fuck/logic/clouds/model/AppOLConfig;", "getOnLineConfig", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setOnLineConfig", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "stopInfo", "Landroidx/lifecycle/MutableLiveData;", "Llegym/fuck/logic/clouds/model/StopConfig;", "getStopInfo", "()Landroidx/lifecycle/MutableLiveData;", "versionCode", "", "getVersionCode", "()I", "IntegralRules", "app_release"})
public final class AppConfig {
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.config.AppConfig INSTANCE = null;
    
    /**
     * 允许提前报名
     */
    private static final boolean ENABLE_SIGN_ADVANCE = legym.fuck.BuildConfig.DEBUG;
    
    /**
     * 乐健体育的版本号
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LEGYM_APP_VERSION = "3.1.0";
    
    /**
     * App在线数据配置
     */
    @org.jetbrains.annotations.NotNull()
    private static kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.clouds.model.AppOLConfig> onLineConfig;
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private static final java.text.SimpleDateFormat legymDateStringFormatter = null;
    
    /**
     * 默认每日里程上限，当获取runningLimit有问题的时候就用这个
     */
    public static final double DEFAULT_DAILY_RUNNING_LIMIT = 6.0;
    
    /**
     * 默认每周里程上限，当获取runningLimit有问题的时候就用这个
     */
    public static final double DEFAULT_WEEKLY_RUNNING_LIMIT = 30.0;
    
    /**
     * 若为true，则上传跑步成绩时不限制有效里程
     */
    private static boolean noRunningLimit = false;
    
    /**
     * 余额的格式化的规则：保留一位小数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FLOAT_FORMAT_INTEGRAL = "%.1f";
    
    /**
     * 保留两位小数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FLOAT_FORMAT_DOUBLE = "%.2f";
    
    /**
     * 停用信息
     */
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<legym.fuck.logic.clouds.model.StopConfig> stopInfo = null;
    
    private AppConfig() {
        super();
    }
    
    public final boolean getENABLE_SIGN_ADVANCE() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.clouds.model.AppOLConfig> getOnLineConfig() {
        return null;
    }
    
    public final void setOnLineConfig(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<legym.fuck.logic.clouds.model.AppOLConfig> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getLegymDateStringFormatter() {
        return null;
    }
    
    public final int getVersionCode() {
        return 0;
    }
    
    public final boolean getNoRunningLimit() {
        return false;
    }
    
    public final void setNoRunningLimit(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<legym.fuck.logic.clouds.model.StopConfig> getStopInfo() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Llegym/fuck/config/AppConfig$IntegralRules;", "", "()V", "CONSUMPTION_PER_ACTIVITY_SIGN", "", "CONSUMPTION_PER_COURSE_SIGN", "CONSUMPTION_PER_MILEAGE", "app_release"})
    public static final class IntegralRules {
        @org.jetbrains.annotations.NotNull()
        public static final legym.fuck.config.AppConfig.IntegralRules INSTANCE = null;
        
        /**
         * 每跑1有效里程扣费1积分
         */
        public static final int CONSUMPTION_PER_MILEAGE = 1;
        
        /**
         * 每活动签到一次扣费2积分
         */
        public static final int CONSUMPTION_PER_ACTIVITY_SIGN = 2;
        
        /**
         * 每课程签到一次扣费2积分
         */
        public static final int CONSUMPTION_PER_COURSE_SIGN = 2;
        
        private IntegralRules() {
            super();
        }
    }
}