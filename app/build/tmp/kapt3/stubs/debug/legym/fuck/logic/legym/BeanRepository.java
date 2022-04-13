package legym.fuck.logic.legym;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/18 15:57
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Llegym/fuck/logic/legym/BeanRepository;", "", "()V", "CALORIE_PER_MILEAGE", "", "generateRunningDetails", "Llegym/fuck/logic/legym/network/model/running/UploadRunningDetailsRequestBean;", "distanceRange", "", "map", "", "limitationsGoalsSexInfoId", "type", "Llegym/fuck/ui/run/logic/RunningType;", "app_debug"})
public final class BeanRepository {
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.logic.legym.BeanRepository INSTANCE = null;
    
    /**
     * 每公里消耗卡路里
     */
    private static final float CALORIE_PER_MILEAGE = 58.3F;
    
    private BeanRepository() {
        super();
    }
    
    /**
     * 生成跑步数据
     */
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.running.UploadRunningDetailsRequestBean generateRunningDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Float> distanceRange, @org.jetbrains.annotations.Nullable()
    java.lang.String map, @org.jetbrains.annotations.Nullable()
    java.lang.String limitationsGoalsSexInfoId, @org.jetbrains.annotations.NotNull()
    legym.fuck.ui.run.logic.RunningType type) {
        return null;
    }
}