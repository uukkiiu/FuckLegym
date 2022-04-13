package legym.fuck.logic.legym.network.model.signin.signin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b@\b\u0086\b\u0018\u00002\u00020\u0001B\u00d9\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\tH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0007H\u00c6\u0003J\t\u0010?\u001a\u00020\tH\u00c6\u0003J\t\u0010@\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\u00dd\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010E\u001a\u00020\t2\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010G\u001a\u00020\u0007H\u00d6\u0001J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\"R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001b\u00a8\u0006I"}, d2 = {"Llegym/fuck/logic/legym/network/model/signin/signin/ItemsItem;", "", "address", "", "signTime", "endRegisterTime", "limitPeopleNumber", "", "isSign", "", "registerPeople", "performSignType", "performTime", "stateName", "name", "signType", "startTime", "departureStartTime", "id", "state", "endTime", "openSignTimes", "startRegisterTime", "isRegister", "bgUrl", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;IZILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getBgUrl", "getDepartureStartTime", "()Ljava/lang/Object;", "getEndRegisterTime", "getEndTime", "getId", "()Z", "getLimitPeopleNumber", "()I", "getName", "getOpenSignTimes", "getPerformSignType", "getPerformTime", "getRegisterPeople", "getSignTime", "getSignType", "getStartRegisterTime", "getStartTime", "getState", "getStateName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"})
public final class ItemsItem {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object signTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String endRegisterTime = null;
    private final int limitPeopleNumber = 0;
    private final boolean isSign = false;
    private final int registerPeople = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object performSignType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object performTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String stateName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object signType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String startTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object departureStartTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final int state = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String endTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object openSignTimes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String startRegisterTime = null;
    private final boolean isRegister = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String bgUrl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.signin.signin.ItemsItem copy(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.Object signTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endRegisterTime, int limitPeopleNumber, boolean isSign, int registerPeople, @org.jetbrains.annotations.Nullable()
    java.lang.Object performSignType, @org.jetbrains.annotations.Nullable()
    java.lang.Object performTime, @org.jetbrains.annotations.NotNull()
    java.lang.String stateName, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Object signType, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.Object departureStartTime, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int state, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.Nullable()
    java.lang.Object openSignTimes, @org.jetbrains.annotations.NotNull()
    java.lang.String startRegisterTime, boolean isRegister, @org.jetbrains.annotations.NotNull()
    java.lang.String bgUrl) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ItemsItem() {
        super();
    }
    
    public ItemsItem(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.Object signTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endRegisterTime, int limitPeopleNumber, boolean isSign, int registerPeople, @org.jetbrains.annotations.Nullable()
    java.lang.Object performSignType, @org.jetbrains.annotations.Nullable()
    java.lang.Object performTime, @org.jetbrains.annotations.NotNull()
    java.lang.String stateName, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Object signType, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.Object departureStartTime, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int state, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.Nullable()
    java.lang.Object openSignTimes, @org.jetbrains.annotations.NotNull()
    java.lang.String startRegisterTime, boolean isRegister, @org.jetbrains.annotations.NotNull()
    java.lang.String bgUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSignTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndRegisterTime() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getLimitPeopleNumber() {
        return 0;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean isSign() {
        return false;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getRegisterPeople() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPerformSignType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPerformTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStateName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSignType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDepartureStartTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getState() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOpenSignTimes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartRegisterTime() {
        return null;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean isRegister() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBgUrl() {
        return null;
    }
}