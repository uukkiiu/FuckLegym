package legym.fuck.ui.huodong;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/28 10:39
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0017J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Llegym/fuck/ui/huodong/ActivitiesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Llegym/fuck/ui/huodong/ActivitiesAdapter$ViewHolder;", "selectedActivities", "", "", "onActionCallback", "Lkotlin/Function1;", "Llegym/fuck/ui/huodong/model/UiAction;", "", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "value", "", "Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;", "activities", "getActivities", "()Ljava/util/List;", "setActivities", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ActivitiesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<legym.fuck.ui.huodong.ActivitiesAdapter.ViewHolder> {
    private final java.util.Set<java.lang.String> selectedActivities = null;
    private final kotlin.jvm.functions.Function1<legym.fuck.ui.huodong.model.UiAction, kotlin.Unit> onActionCallback = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<legym.fuck.logic.legym.network.model.huodong.HuodongItem> activities;
    
    public ActivitiesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> selectedActivities, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super legym.fuck.ui.huodong.model.UiAction, kotlin.Unit> onActionCallback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<legym.fuck.logic.legym.network.model.huodong.HuodongItem> getActivities() {
        return null;
    }
    
    public final void setActivities(@org.jetbrains.annotations.NotNull()
    java.util.List<legym.fuck.logic.legym.network.model.huodong.HuodongItem> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public legym.fuck.ui.huodong.ActivitiesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    legym.fuck.ui.huodong.ActivitiesAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Llegym/fuck/ui/huodong/ActivitiesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Llegym/fuck/ui/huodong/ActivitiesAdapter;Landroid/view/View;)V", "binding", "Llegym/fuck/databinding/ItemHuodongBinding;", "getBinding", "()Llegym/fuck/databinding/ItemHuodongBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final legym.fuck.databinding.ItemHuodongBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final legym.fuck.databinding.ItemHuodongBinding getBinding() {
            return null;
        }
    }
}