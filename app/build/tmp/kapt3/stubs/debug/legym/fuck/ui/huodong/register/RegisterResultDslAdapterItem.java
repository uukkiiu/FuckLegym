package legym.fuck.ui.huodong.register;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/29 19:25
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ.\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Llegym/fuck/ui/huodong/register/RegisterResultDslAdapterItem;", "Lcom/angcyo/dsladapter/DslAdapterItem;", "activity", "Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;", "failedReason", "", "exceptionResult", "Llegym/fuck/logic/legym/network/model/HttpResult;", "", "(Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;Ljava/lang/String;Llegym/fuck/logic/legym/network/model/HttpResult;)V", "getActivity", "()Llegym/fuck/logic/legym/network/model/huodong/HuodongItem;", "getExceptionResult", "()Llegym/fuck/logic/legym/network/model/HttpResult;", "getFailedReason", "()Ljava/lang/String;", "itemLayoutId", "", "getItemLayoutId", "()I", "setItemLayoutId", "(I)V", "onItemBind", "", "itemHolder", "Lcom/angcyo/dsladapter/DslViewHolder;", "itemPosition", "adapterItem", "payloads", "", "app_debug"})
public final class RegisterResultDslAdapterItem extends com.angcyo.dsladapter.DslAdapterItem {
    @org.jetbrains.annotations.NotNull()
    private final legym.fuck.logic.legym.network.model.huodong.HuodongItem activity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String failedReason = null;
    @org.jetbrains.annotations.Nullable()
    private final legym.fuck.logic.legym.network.model.HttpResult<? extends java.lang.Object> exceptionResult = null;
    private int itemLayoutId = legym.fuck.R.layout.item_register_result;
    
    public RegisterResultDslAdapterItem(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.huodong.HuodongItem activity, @org.jetbrains.annotations.Nullable()
    java.lang.String failedReason, @org.jetbrains.annotations.Nullable()
    legym.fuck.logic.legym.network.model.HttpResult<? extends java.lang.Object> exceptionResult) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.huodong.HuodongItem getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFailedReason() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final legym.fuck.logic.legym.network.model.HttpResult<? extends java.lang.Object> getExceptionResult() {
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