package legym.fuck.ui.run.logic;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/17 14:55
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0004\n\u000b\f\rB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0003\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Llegym/fuck/ui/run/logic/RunningType;", "", "()V", "prefValue", "", "kotlin.jvm.PlatformType", "getPrefValue", "()Ljava/lang/String;", "title", "getTitle", "Companion", "Free", "Point", "Range", "Llegym/fuck/ui/run/logic/RunningType$Free;", "Llegym/fuck/ui/run/logic/RunningType$Point;", "Llegym/fuck/ui/run/logic/RunningType$Range;", "app_release"})
public abstract class RunningType {
    
    /**
     * 储存在Preference的值
     */
    private final java.lang.String prefValue = null;
    
    /**
     * 给用户显示的文字，同时也是json传的文字
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = "";
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.ui.run.logic.RunningType.Companion Companion = null;
    
    private RunningType() {
        super();
    }
    
    public final java.lang.String getPrefValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getTitle() {
        return null;
    }
    
    /**
     * 自由跑
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Llegym/fuck/ui/run/logic/RunningType$Free;", "Llegym/fuck/ui/run/logic/RunningType;", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "app_release"})
    public static final class Free extends legym.fuck.ui.run.logic.RunningType {
        @org.jetbrains.annotations.NotNull()
        public static final legym.fuck.ui.run.logic.RunningType.Free INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String title = "\u81ea\u7531\u8dd1";
        
        private Free() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getTitle() {
            return null;
        }
    }
    
    /**
     * 定点跑
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Llegym/fuck/ui/run/logic/RunningType$Point;", "Llegym/fuck/ui/run/logic/RunningType;", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "app_release"})
    public static final class Point extends legym.fuck.ui.run.logic.RunningType {
        @org.jetbrains.annotations.NotNull()
        public static final legym.fuck.ui.run.logic.RunningType.Point INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String title = "\u5b9a\u70b9\u8dd1";
        
        private Point() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getTitle() {
            return null;
        }
    }
    
    /**
     * 范围跑
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Llegym/fuck/ui/run/logic/RunningType$Range;", "Llegym/fuck/ui/run/logic/RunningType;", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "app_release"})
    public static final class Range extends legym.fuck.ui.run.logic.RunningType {
        @org.jetbrains.annotations.NotNull()
        public static final legym.fuck.ui.run.logic.RunningType.Range INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String title = "\u8303\u56f4\u8dd1";
        
        private Range() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getTitle() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Llegym/fuck/ui/run/logic/RunningType$Companion;", "", "()V", "allTypes", "", "Llegym/fuck/ui/run/logic/RunningType;", "getAllTypes", "()Ljava/util/List;", "getRunningTypeByPrefValue", "value", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 通过Preference储存的值来找到对应的类型。与上边[prefValue]相对应。
         */
        @org.jetbrains.annotations.NotNull()
        public final legym.fuck.ui.run.logic.RunningType getRunningTypeByPrefValue(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<legym.fuck.ui.run.logic.RunningType> getAllTypes() {
            return null;
        }
    }
}