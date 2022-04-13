package legym.fuck.widget.adapters.binding;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/2/5 18:25
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\b\u001a\u00020\u0004*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Llegym/fuck/widget/adapters/binding/ViewBindingAdapter;", "", "()V", "clipRoundCornerDp", "", "Landroid/view/View;", "dp", "", "setLegymHeader", "Landroid/widget/ImageView;", "user", "Llegym/fuck/logic/legym/network/model/login/LoginResult;", "app_debug"})
public final class ViewBindingAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.widget.adapters.binding.ViewBindingAdapter INSTANCE = null;
    
    private ViewBindingAdapter() {
        super();
    }
    
    /**
     * View切割圆角，单位是dp
     */
    @androidx.databinding.BindingAdapter(value = {"clipRoundCorner"})
    @kotlin.jvm.JvmStatic()
    public static final void clipRoundCornerDp(@org.jetbrains.annotations.NotNull()
    android.view.View $this$clipRoundCornerDp, float dp) {
    }
    
    /**
     * 加载乐健的头像
     */
    @androidx.databinding.BindingAdapter(value = {"setLegymHeader"})
    @kotlin.jvm.JvmStatic()
    public static final void setLegymHeader(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setLegymHeader, @org.jetbrains.annotations.Nullable()
    legym.fuck.logic.legym.network.model.login.LoginResult user) {
    }
}