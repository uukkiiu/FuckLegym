package legym.fuck.ui.huodong.model;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/28 11:05
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Llegym/fuck/ui/huodong/model/UiAction;", "", "()V", "ActivitySignIn", "CancelSignUp", "GoSignUp", "OnActivityClick", "Llegym/fuck/ui/huodong/model/UiAction$GoSignUp;", "Llegym/fuck/ui/huodong/model/UiAction$CancelSignUp;", "Llegym/fuck/ui/huodong/model/UiAction$ActivitySignIn;", "Llegym/fuck/ui/huodong/model/UiAction$OnActivityClick;", "app_release"})
public abstract class UiAction {
    
    private UiAction() {
        super();
    }
    
    /**
     * 去报名
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Llegym/fuck/ui/huodong/model/UiAction$GoSignUp;", "Llegym/fuck/ui/huodong/model/UiAction;", "activity", "Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;", "(Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;)V", "getActivity", "()Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;", "app_release"})
    public static final class GoSignUp extends legym.fuck.ui.huodong.model.UiAction {
        @org.jetbrains.annotations.NotNull()
        private final legym.fuck.logic.legym.network.model.huodong.HuodongItem activity = null;
        
        public GoSignUp(@org.jetbrains.annotations.NotNull()
        legym.fuck.logic.legym.network.model.huodong.HuodongItem activity) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final legym.fuck.logic.legym.network.model.huodong.HuodongItem getActivity() {
            return null;
        }
    }
    
    /**
     * 取消报名
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Llegym/fuck/ui/huodong/model/UiAction$CancelSignUp;", "Llegym/fuck/ui/huodong/model/UiAction;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "app_release"})
    public static final class CancelSignUp extends legym.fuck.ui.huodong.model.UiAction {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        
        public CancelSignUp(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
    }
    
    /**
     * 活动签到
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Llegym/fuck/ui/huodong/model/UiAction$ActivitySignIn;", "Llegym/fuck/ui/huodong/model/UiAction;", "activityId", "", "(Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "app_release"})
    public static final class ActivitySignIn extends legym.fuck.ui.huodong.model.UiAction {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String activityId = null;
        
        public ActivitySignIn(@org.jetbrains.annotations.NotNull()
        java.lang.String activityId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getActivityId() {
            return null;
        }
    }
    
    /**
     * 点击活动项之后
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Llegym/fuck/ui/huodong/model/UiAction$OnActivityClick;", "Llegym/fuck/ui/huodong/model/UiAction;", "activity", "Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;", "index", "", "(Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;I)V", "getActivity", "()Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;", "getIndex", "()I", "app_release"})
    public static final class OnActivityClick extends legym.fuck.ui.huodong.model.UiAction {
        @org.jetbrains.annotations.NotNull()
        private final legym.fuck.logic.legym.network.model.huodong.HuodongItem activity = null;
        private final int index = 0;
        
        public OnActivityClick(@org.jetbrains.annotations.NotNull()
        legym.fuck.logic.legym.network.model.huodong.HuodongItem activity, int index) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final legym.fuck.logic.legym.network.model.huodong.HuodongItem getActivity() {
            return null;
        }
        
        public final int getIndex() {
            return 0;
        }
    }
}