package legym.fuck.ui.huodong;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/29 19:39
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Llegym/fuck/ui/huodong/HuoDongBindingAdapter;", "", "()V", "setActivityDate", "", "Landroid/widget/TextView;", "activity", "Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;", "app_debug"})
public final class HuoDongBindingAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.ui.huodong.HuoDongBindingAdapter INSTANCE = null;
    
    private HuoDongBindingAdapter() {
        super();
    }
    
    /**
     * 适配活动时间的文字
     */
    @androidx.databinding.BindingAdapter(value = {"setActivityDate"})
    @kotlin.jvm.JvmStatic()
    public static final void setActivityDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setActivityDate, @org.jetbrains.annotations.Nullable()
    legym.fuck.logic.legym.network.model.huodong.HuodongItem activity) {
    }
}