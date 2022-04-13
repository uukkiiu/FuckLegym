package legym.fuck.ui.doc;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/21 23:00
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J.\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Llegym/fuck/ui/doc/DocAdapterItem;", "Lcom/angcyo/dsladapter/DslAdapterItem;", "doc", "Llegym/fuck/logic/clouds/model/DocInfo;", "clickListener", "Lkotlin/Function1;", "", "(Llegym/fuck/logic/clouds/model/DocInfo;Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "getDoc", "()Llegym/fuck/logic/clouds/model/DocInfo;", "itemLayoutId", "", "getItemLayoutId", "()I", "setItemLayoutId", "(I)V", "onItemBind", "itemHolder", "Lcom/angcyo/dsladapter/DslViewHolder;", "itemPosition", "adapterItem", "payloads", "", "", "app_debug"})
public final class DocAdapterItem extends com.angcyo.dsladapter.DslAdapterItem {
    @org.jetbrains.annotations.NotNull()
    private final legym.fuck.logic.clouds.model.DocInfo doc = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<legym.fuck.logic.clouds.model.DocInfo, kotlin.Unit> clickListener = null;
    private int itemLayoutId = legym.fuck.R.layout.item_doc_list;
    
    public DocAdapterItem(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.clouds.model.DocInfo doc, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super legym.fuck.logic.clouds.model.DocInfo, kotlin.Unit> clickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.clouds.model.DocInfo getDoc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<legym.fuck.logic.clouds.model.DocInfo, kotlin.Unit> getClickListener() {
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