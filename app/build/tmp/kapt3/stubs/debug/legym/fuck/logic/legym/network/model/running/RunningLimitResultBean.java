package legym.fuck.logic.legym.network.model.running;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b_\b\u0087\b\u0018\u00002\u00020\u0001B\u00d7\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\'\u001a\u0004\u0018\u00010\n\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010)J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010U\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\t\u0010^\u001a\u00020\u0018H\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010`\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u0010\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u0010\u0010g\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010h\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010l\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u0010\u0010n\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010o\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010s\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010t\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u0010\u0010u\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00103J\u00a4\u0003\u0010v\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010wJ\u0013\u0010x\u001a\u00020\u00182\b\u0010y\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010z\u001a\u00020\u0003H\u00d6\u0001J\t\u0010{\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0015\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\b6\u00103R\u0015\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\b7\u00103R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00109R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b?\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00109R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\bA\u0010+R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010/R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010/R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\bI\u0010+R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\bJ\u0010+R\u0015\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\bK\u0010+R\u0015\u0010!\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\bL\u00103R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00109R\u0013\u0010#\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010/R\u0015\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\bO\u0010+R\u0013\u0010%\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010/R\u0015\u0010&\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\bQ\u0010+R\u0015\u0010\'\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00104\u001a\u0004\bR\u00103R\u0013\u0010(\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00109\u00a8\u0006|"}, d2 = {"Llegym/fuck/logic/legym/network/model/running/RunningLimitResultBean;", "", "averageCadenceEnd", "", "averageCadenceStart", "averageSpeedEnd", "", "averageSpeedStart", "currentTimeStamp", "dailyMileage", "", "dailyParagraph", "effectiveMileageEnd", "effectiveMileageStart", "effectiveParagraphEnd", "effectiveParagraphMileage", "effectiveParagraphStart", "enableStatus", "fixedPointNumber", "fixedPointOrder", "fixedPointPattern", "fixedPointPercentage", "freePattern", "hasRule", "", "limitationsGoalsSexInfoId", "notice", "patternId", "runningTimeLimit", "Llegym/fuck/logic/legym/network/model/running/RunningTimeLimit;", "scopePattern", "scopePercentage", "scoringType", "semesterMileage", "semesterParagraph", "totalDayMileage", "totalDayPart", "totalWeekMileage", "totalWeekPart", "weeklyMileage", "weeklyParagraph", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Llegym/fuck/logic/legym/network/model/running/RunningTimeLimit;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Object;)V", "getAverageCadenceEnd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAverageCadenceStart", "getAverageSpeedEnd", "()Ljava/lang/String;", "getAverageSpeedStart", "getCurrentTimeStamp", "getDailyMileage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDailyParagraph", "getEffectiveMileageEnd", "getEffectiveMileageStart", "getEffectiveParagraphEnd", "()Ljava/lang/Object;", "getEffectiveParagraphMileage", "getEffectiveParagraphStart", "getEnableStatus", "getFixedPointNumber", "getFixedPointOrder", "getFixedPointPattern", "getFixedPointPercentage", "getFreePattern", "getHasRule", "()Z", "getLimitationsGoalsSexInfoId", "getNotice", "getPatternId", "getRunningTimeLimit", "()Llegym/fuck/logic/legym/network/model/running/RunningTimeLimit;", "getScopePattern", "getScopePercentage", "getScoringType", "getSemesterMileage", "getSemesterParagraph", "getTotalDayMileage", "getTotalDayPart", "getTotalWeekMileage", "getTotalWeekPart", "getWeeklyMileage", "getWeeklyParagraph", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Llegym/fuck/logic/legym/network/model/running/RunningTimeLimit;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Object;)Llegym/fuck/logic/legym/network/model/running/RunningLimitResultBean;", "equals", "other", "hashCode", "toString", "app_debug"})
@kotlinx.serialization.Serializable()
public final class RunningLimitResultBean {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer averageCadenceEnd = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer averageCadenceStart = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String averageSpeedEnd = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String averageSpeedStart = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String currentTimeStamp = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double dailyMileage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dailyParagraph = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double effectiveMileageEnd = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double effectiveMileageStart = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object effectiveParagraphEnd = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object effectiveParagraphMileage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object effectiveParagraphStart = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object enableStatus = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object fixedPointNumber = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object fixedPointOrder = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer fixedPointPattern = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object fixedPointPercentage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer freePattern = null;
    private final boolean hasRule = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String limitationsGoalsSexInfoId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object notice = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String patternId = null;
    @org.jetbrains.annotations.Nullable()
    private final legym.fuck.logic.legym.network.model.running.RunningTimeLimit runningTimeLimit = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer scopePattern = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer scopePercentage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer scoringType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double semesterMileage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object semesterParagraph = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String totalDayMileage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer totalDayPart = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String totalWeekMileage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer totalWeekPart = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double weeklyMileage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object weeklyParagraph = null;
    
    @org.jetbrains.annotations.NotNull()
    public final legym.fuck.logic.legym.network.model.running.RunningLimitResultBean copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer averageCadenceEnd, @org.jetbrains.annotations.Nullable()
    java.lang.Integer averageCadenceStart, @org.jetbrains.annotations.Nullable()
    java.lang.String averageSpeedEnd, @org.jetbrains.annotations.Nullable()
    java.lang.String averageSpeedStart, @org.jetbrains.annotations.Nullable()
    java.lang.String currentTimeStamp, @org.jetbrains.annotations.Nullable()
    java.lang.Double dailyMileage, @org.jetbrains.annotations.Nullable()
    java.lang.String dailyParagraph, @org.jetbrains.annotations.Nullable()
    java.lang.Double effectiveMileageEnd, @org.jetbrains.annotations.Nullable()
    java.lang.Double effectiveMileageStart, @org.jetbrains.annotations.Nullable()
    java.lang.Object effectiveParagraphEnd, @org.jetbrains.annotations.Nullable()
    java.lang.Object effectiveParagraphMileage, @org.jetbrains.annotations.Nullable()
    java.lang.Object effectiveParagraphStart, @org.jetbrains.annotations.Nullable()
    java.lang.Object enableStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Object fixedPointNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object fixedPointOrder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer fixedPointPattern, @org.jetbrains.annotations.Nullable()
    java.lang.Object fixedPointPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer freePattern, boolean hasRule, @org.jetbrains.annotations.Nullable()
    java.lang.String limitationsGoalsSexInfoId, @org.jetbrains.annotations.Nullable()
    java.lang.Object notice, @org.jetbrains.annotations.Nullable()
    java.lang.String patternId, @org.jetbrains.annotations.Nullable()
    legym.fuck.logic.legym.network.model.running.RunningTimeLimit runningTimeLimit, @org.jetbrains.annotations.Nullable()
    java.lang.Integer scopePattern, @org.jetbrains.annotations.Nullable()
    java.lang.Integer scopePercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer scoringType, @org.jetbrains.annotations.Nullable()
    java.lang.Double semesterMileage, @org.jetbrains.annotations.Nullable()
    java.lang.Object semesterParagraph, @org.jetbrains.annotations.Nullable()
    java.lang.String totalDayMileage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalDayPart, @org.jetbrains.annotations.Nullable()
    java.lang.String totalWeekMileage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalWeekPart, @org.jetbrains.annotations.Nullable()
    java.lang.Double weeklyMileage, @org.jetbrains.annotations.Nullable()
    java.lang.Object weeklyParagraph) {
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
    
    public RunningLimitResultBean(@org.jetbrains.annotations.Nullable()
    java.lang.Integer averageCadenceEnd, @org.jetbrains.annotations.Nullable()
    java.lang.Integer averageCadenceStart, @org.jetbrains.annotations.Nullable()
    java.lang.String averageSpeedEnd, @org.jetbrains.annotations.Nullable()
    java.lang.String averageSpeedStart, @org.jetbrains.annotations.Nullable()
    java.lang.String currentTimeStamp, @org.jetbrains.annotations.Nullable()
    java.lang.Double dailyMileage, @org.jetbrains.annotations.Nullable()
    java.lang.String dailyParagraph, @org.jetbrains.annotations.Nullable()
    java.lang.Double effectiveMileageEnd, @org.jetbrains.annotations.Nullable()
    java.lang.Double effectiveMileageStart, @org.jetbrains.annotations.Nullable()
    java.lang.Object effectiveParagraphEnd, @org.jetbrains.annotations.Nullable()
    java.lang.Object effectiveParagraphMileage, @org.jetbrains.annotations.Nullable()
    java.lang.Object effectiveParagraphStart, @org.jetbrains.annotations.Nullable()
    java.lang.Object enableStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Object fixedPointNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object fixedPointOrder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer fixedPointPattern, @org.jetbrains.annotations.Nullable()
    java.lang.Object fixedPointPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer freePattern, boolean hasRule, @org.jetbrains.annotations.Nullable()
    java.lang.String limitationsGoalsSexInfoId, @org.jetbrains.annotations.Nullable()
    java.lang.Object notice, @org.jetbrains.annotations.Nullable()
    java.lang.String patternId, @org.jetbrains.annotations.Nullable()
    legym.fuck.logic.legym.network.model.running.RunningTimeLimit runningTimeLimit, @org.jetbrains.annotations.Nullable()
    java.lang.Integer scopePattern, @org.jetbrains.annotations.Nullable()
    java.lang.Integer scopePercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer scoringType, @org.jetbrains.annotations.Nullable()
    java.lang.Double semesterMileage, @org.jetbrains.annotations.Nullable()
    java.lang.Object semesterParagraph, @org.jetbrains.annotations.Nullable()
    java.lang.String totalDayMileage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalDayPart, @org.jetbrains.annotations.Nullable()
    java.lang.String totalWeekMileage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalWeekPart, @org.jetbrains.annotations.Nullable()
    java.lang.Double weeklyMileage, @org.jetbrains.annotations.Nullable()
    java.lang.Object weeklyParagraph) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAverageCadenceEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAverageCadenceStart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAverageSpeedEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAverageSpeedStart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentTimeStamp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDailyMileage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDailyParagraph() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getEffectiveMileageEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getEffectiveMileageStart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEffectiveParagraphEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEffectiveParagraphMileage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEffectiveParagraphStart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEnableStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFixedPointNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFixedPointOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFixedPointPattern() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFixedPointPercentage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFreePattern() {
        return null;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean getHasRule() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLimitationsGoalsSexInfoId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNotice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatternId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final legym.fuck.logic.legym.network.model.running.RunningTimeLimit component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final legym.fuck.logic.legym.network.model.running.RunningTimeLimit getRunningTimeLimit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getScopePattern() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getScopePercentage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getScoringType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSemesterMileage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSemesterParagraph() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalDayMileage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalDayPart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalWeekMileage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalWeekPart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWeeklyMileage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeeklyParagraph() {
        return null;
    }
}