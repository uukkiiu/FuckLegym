package legym.fuck.ui.signin.model;

import java.lang.System;

/**
 * @ClassName ActivityItem
 * @author ForeverDdB   
 * @Description
 * @createTime 2022年 03月26日 23:28
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J.\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Llegym/fuck/ui/signin/model/ActivityItem;", "Lcom/angcyo/dsladapter/DslAdapterItem;", "info", "Llegym/fuck/logic/legym/network/model/signin/signin/ItemsItem;", "mViewModel", "Llegym/fuck/ui/signin/SignInViewModel;", "(Llegym/fuck/logic/legym/network/model/signin/signin/ItemsItem;Llegym/fuck/ui/signin/SignInViewModel;)V", "getInfo", "()Llegym/fuck/logic/legym/network/model/signin/signin/ItemsItem;", "itemLayoutId", "", "getItemLayoutId", "()I", "setItemLayoutId", "(I)V", "getMViewModel", "()Llegym/fuck/ui/signin/SignInViewModel;", "onItemBind", "", "itemHolder", "Lcom/angcyo/dsladapter/DslViewHolder;", "itemPosition", "adapterItem", "payloads", "", "", "app_debug"})
public final class ActivityItem extends com.angcyo.dsladapter.DslAdapterItem {
    @org.jetbrains.annotations.NotNull()
    private final legym.fuck.logic.legym.network.model.signin.signin.ItemsItem info = null;
    @org.jetbrains.annotations.NotNull()
    private final legym.fuck.ui.signin.SignInViewModel mViewModel = null;
    private int itemLayoutId = legym.fuck.R.layout.item_activity_card;
    
    public ActivityItem(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.signin.signin.ItemsItem info, @org.jetbrains.annotations.NotNull()
    legym.fuck.ui.signin.SignInViewModel mViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.signin.signin.ItemsItem getInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.ui.signin.SignInViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setItemLayoutId(int p0) {
    }
    
    @java.lang.Override()
    public void onItemBind(@org.jetbrains.annotations.NotNull()
    com.angcyo.dsladapter.DslViewHolder itemHolder, int itemPosition, @org.jetbrains.annotations.NotNull()
    com.angcyo.dsladapter.DslAdapterItem adapterItem, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> payloads) {
    }
}