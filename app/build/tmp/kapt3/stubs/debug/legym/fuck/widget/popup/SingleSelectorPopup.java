package legym.fuck.widget.popup;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/27 16:25
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0002$%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u0007H\u0014J\b\u0010\u001d\u001a\u00020\bH\u0014J\b\u0010\u001e\u001a\u00020\bH\u0014J\u001e\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006&"}, d2 = {"Llegym/fuck/widget/popup/SingleSelectorPopup;", "Lcom/lxj/xpopup/impl/PartShadowPopupView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clickListener", "Lkotlin/Function1;", "", "", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "setClickListener", "(Lkotlin/jvm/functions/Function1;)V", "mAdapter", "Lcom/angcyo/dsladapter/DslAdapter;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView$delegate", "Lkotlin/Lazy;", "onDismissListener", "Lkotlin/Function0;", "getOnDismissListener", "()Lkotlin/jvm/functions/Function0;", "setOnDismissListener", "(Lkotlin/jvm/functions/Function0;)V", "getImplLayoutId", "onCreate", "onDismiss", "setData", "selected", "data", "", "", "Companion", "Item", "app_debug"})
public final class SingleSelectorPopup extends com.lxj.xpopup.impl.PartShadowPopupView {
    private final com.angcyo.dsladapter.DslAdapter mAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> clickListener;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onDismissListener;
    private final kotlin.Lazy mRecyclerView$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final legym.fuck.widget.popup.SingleSelectorPopup.Companion Companion = null;
    
    public SingleSelectorPopup(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getClickListener() {
        return null;
    }
    
    public final void setClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDismissListener() {
        return null;
    }
    
    public final void setOnDismissListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    private final androidx.recyclerview.widget.RecyclerView getMRecyclerView() {
        return null;
    }
    
    @java.lang.Override()
    protected int getImplLayoutId() {
        return 0;
    }
    
    public final void setData(int selected, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> data) {
    }
    
    @java.lang.Override()
    protected void onCreate() {
    }
    
    @java.lang.Override()
    protected void onDismiss() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ.\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0017R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Llegym/fuck/widget/popup/SingleSelectorPopup$Item;", "Lcom/angcyo/dsladapter/DslAdapterItem;", "title", "", "selectedIndex", "", "clickListener", "Lkotlin/Function1;", "", "(Llegym/fuck/widget/popup/SingleSelectorPopup;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "setClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getSelectedIndex", "()I", "onItemBind", "itemHolder", "Lcom/angcyo/dsladapter/DslViewHolder;", "itemPosition", "adapterItem", "payloads", "", "", "app_debug"})
    public final class Item extends com.angcyo.dsladapter.DslAdapterItem {
        private final java.lang.String title = null;
        private final int selectedIndex = 0;
        @org.jetbrains.annotations.NotNull()
        private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> clickListener;
        
        public Item(@org.jetbrains.annotations.NotNull()
        java.lang.String title, int selectedIndex, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> clickListener) {
            super();
        }
        
        public final int getSelectedIndex() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public final void setClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
        }
        
        @android.annotation.SuppressLint(value = {"PrivateResource"})
        @java.lang.Override()
        public void onItemBind(@org.jetbrains.annotations.NotNull()
        com.angcyo.dsladapter.DslViewHolder itemHolder, int itemPosition, @org.jetbrains.annotations.NotNull()
        com.angcyo.dsladapter.DslAdapterItem adapterItem, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> payloads) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a8\u0006\r"}, d2 = {"Llegym/fuck/widget/popup/SingleSelectorPopup$Companion;", "", "()V", "create", "Llegym/fuck/widget/popup/SingleSelectorPopup;", "activity", "Landroid/app/Activity;", "anchor", "Landroid/view/View;", "clickListener", "Lkotlin/Function1;", "", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final legym.fuck.widget.popup.SingleSelectorPopup create(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        android.view.View anchor, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> clickListener) {
            return null;
        }
    }
}