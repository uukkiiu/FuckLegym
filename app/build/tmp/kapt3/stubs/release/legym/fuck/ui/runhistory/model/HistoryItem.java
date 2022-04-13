package legym.fuck.ui.runhistory.model;

import java.lang.System;

/**
 * @author ldh
 * 时间: 2022/3/21 10:09
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Llegym/fuck/ui/runhistory/model/HistoryItem;", "Lcom/angcyo/dsladapter/DslAdapterItem;", "gradeDetail", "Llegym/fuck/logic/legym/network/model/running/runningHistory/GradeDetail;", "(Llegym/fuck/logic/legym/network/model/running/runningHistory/GradeDetail;)V", "getGradeDetail", "()Llegym/fuck/logic/legym/network/model/running/runningHistory/GradeDetail;", "itemLayoutId", "", "getItemLayoutId", "()I", "setItemLayoutId", "(I)V", "onItemBind", "", "itemHolder", "Lcom/angcyo/dsladapter/DslViewHolder;", "itemPosition", "adapterItem", "payloads", "", "", "app_release"})
public final class HistoryItem extends com.angcyo.dsladapter.DslAdapterItem {
    @org.jetbrains.annotations.NotNull()
    private final legym.fuck.logic.legym.network.model.running.runningHistory.GradeDetail gradeDetail = null;
    private int itemLayoutId = legym.fuck.R.layout.item_running_history;
    
    public HistoryItem(@org.jetbrains.annotations.NotNull()
    legym.fuck.logic.legym.network.model.running.runningHistory.GradeDetail gradeDetail) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.running.runningHistory.GradeDetail getGradeDetail() {
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