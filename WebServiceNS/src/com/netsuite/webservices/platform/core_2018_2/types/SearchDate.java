
package com.netsuite.webservices.platform.core_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchDate的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SearchDate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fiscalHalfBeforeLast"/>
 *     &lt;enumeration value="fiscalHalfBeforeLastToDate"/>
 *     &lt;enumeration value="fiscalQuarterBeforeLast"/>
 *     &lt;enumeration value="fiscalQuarterBeforeLastToDate"/>
 *     &lt;enumeration value="fiscalYearBeforeLast"/>
 *     &lt;enumeration value="fiscalYearBeforeLastToDate"/>
 *     &lt;enumeration value="fiveDaysAgo"/>
 *     &lt;enumeration value="fiveDaysFromNow"/>
 *     &lt;enumeration value="fourDaysAgo"/>
 *     &lt;enumeration value="fourDaysFromNow"/>
 *     &lt;enumeration value="fourWeeksStartingThisWeek"/>
 *     &lt;enumeration value="lastBusinessWeek"/>
 *     &lt;enumeration value="lastFiscalHalf"/>
 *     &lt;enumeration value="lastFiscalHalfOneFiscalYearAgo"/>
 *     &lt;enumeration value="lastFiscalHalfToDate"/>
 *     &lt;enumeration value="lastFiscalQuarter"/>
 *     &lt;enumeration value="lastFiscalQuarterOneFiscalYearAgo"/>
 *     &lt;enumeration value="lastFiscalQuarterToDate"/>
 *     &lt;enumeration value="lastFiscalQuarterTwoFiscalYearsAgo"/>
 *     &lt;enumeration value="lastFiscalYear"/>
 *     &lt;enumeration value="lastFiscalYearToDate"/>
 *     &lt;enumeration value="lastMonth"/>
 *     &lt;enumeration value="lastMonthOneFiscalQuarterAgo"/>
 *     &lt;enumeration value="lastMonthOneFiscalYearAgo"/>
 *     &lt;enumeration value="lastMonthToDate"/>
 *     &lt;enumeration value="lastMonthTwoFiscalQuartersAgo"/>
 *     &lt;enumeration value="lastMonthTwoFiscalYearsAgo"/>
 *     &lt;enumeration value="lastRollingHalf"/>
 *     &lt;enumeration value="lastRollingQuarter"/>
 *     &lt;enumeration value="lastRollingYear"/>
 *     &lt;enumeration value="lastWeek"/>
 *     &lt;enumeration value="lastWeekToDate"/>
 *     &lt;enumeration value="monthAfterNext"/>
 *     &lt;enumeration value="monthAfterNextToDate"/>
 *     &lt;enumeration value="monthBeforeLast"/>
 *     &lt;enumeration value="monthBeforeLastToDate"/>
 *     &lt;enumeration value="nextBusinessWeek"/>
 *     &lt;enumeration value="nextFiscalHalf"/>
 *     &lt;enumeration value="nextFiscalQuarter"/>
 *     &lt;enumeration value="nextFiscalYear"/>
 *     &lt;enumeration value="nextFourWeeks"/>
 *     &lt;enumeration value="nextMonth"/>
 *     &lt;enumeration value="nextOneHalf"/>
 *     &lt;enumeration value="nextOneMonth"/>
 *     &lt;enumeration value="nextOneQuarter"/>
 *     &lt;enumeration value="nextOneWeek"/>
 *     &lt;enumeration value="nextOneYear"/>
 *     &lt;enumeration value="nextWeek"/>
 *     &lt;enumeration value="ninetyDaysAgo"/>
 *     &lt;enumeration value="ninetyDaysFromNow"/>
 *     &lt;enumeration value="oneYearBeforeLast"/>
 *     &lt;enumeration value="previousFiscalQuartersLastFiscalYear"/>
 *     &lt;enumeration value="previousFiscalQuartersThisFiscalYear"/>
 *     &lt;enumeration value="previousMonthsLastFiscalHalf"/>
 *     &lt;enumeration value="previousMonthsLastFiscalQuarter"/>
 *     &lt;enumeration value="previousMonthsLastFiscalYear"/>
 *     &lt;enumeration value="previousMonthsSameFiscalHalfLastFiscalYear"/>
 *     &lt;enumeration value="previousMonthsSameFiscalQuarterLastFiscalYear"/>
 *     &lt;enumeration value="previousMonthsThisFiscalHalf"/>
 *     &lt;enumeration value="previousMonthsThisFiscalQuarter"/>
 *     &lt;enumeration value="previousMonthsThisFiscalYear"/>
 *     &lt;enumeration value="previousOneDay"/>
 *     &lt;enumeration value="previousOneHalf"/>
 *     &lt;enumeration value="previousOneMonth"/>
 *     &lt;enumeration value="previousOneQuarter"/>
 *     &lt;enumeration value="previousOneWeek"/>
 *     &lt;enumeration value="previousOneYear"/>
 *     &lt;enumeration value="previousRollingHalf"/>
 *     &lt;enumeration value="previousRollingQuarter"/>
 *     &lt;enumeration value="previousRollingYear"/>
 *     &lt;enumeration value="sameDayFiscalQuarterBeforeLast"/>
 *     &lt;enumeration value="sameDayFiscalYearBeforeLast"/>
 *     &lt;enumeration value="sameDayLastFiscalQuarter"/>
 *     &lt;enumeration value="sameDayLastFiscalYear"/>
 *     &lt;enumeration value="sameDayLastMonth"/>
 *     &lt;enumeration value="sameDayLastWeek"/>
 *     &lt;enumeration value="sameDayMonthBeforeLast"/>
 *     &lt;enumeration value="sameDayWeekBeforeLast"/>
 *     &lt;enumeration value="sameFiscalHalfLastFiscalYear"/>
 *     &lt;enumeration value="sameFiscalHalfLastFiscalYearToDate"/>
 *     &lt;enumeration value="sameFiscalQuarterFiscalYearBeforeLast"/>
 *     &lt;enumeration value="sameFiscalQuarterLastFiscalYear"/>
 *     &lt;enumeration value="sameFiscalQuarterLastFiscalYearToDate"/>
 *     &lt;enumeration value="sameMonthFiscalQuarterBeforeLast"/>
 *     &lt;enumeration value="sameMonthFiscalYearBeforeLast"/>
 *     &lt;enumeration value="sameMonthLastFiscalQuarter"/>
 *     &lt;enumeration value="sameMonthLastFiscalQuarterToDate"/>
 *     &lt;enumeration value="sameMonthLastFiscalYear"/>
 *     &lt;enumeration value="sameMonthLastFiscalYearToDate"/>
 *     &lt;enumeration value="sameWeekFiscalYearBeforeLast"/>
 *     &lt;enumeration value="sameWeekLastFiscalYear"/>
 *     &lt;enumeration value="sixtyDaysAgo"/>
 *     &lt;enumeration value="sixtyDaysFromNow"/>
 *     &lt;enumeration value="startOfFiscalHalfBeforeLast"/>
 *     &lt;enumeration value="startOfFiscalQuarterBeforeLast"/>
 *     &lt;enumeration value="startOfFiscalYearBeforeLast"/>
 *     &lt;enumeration value="startOfLastBusinessWeek"/>
 *     &lt;enumeration value="startOfLastFiscalHalf"/>
 *     &lt;enumeration value="startOfLastFiscalHalfOneFiscalYearAgo"/>
 *     &lt;enumeration value="startOfLastFiscalQuarter"/>
 *     &lt;enumeration value="startOfLastFiscalQuarterOneFiscalYearAgo"/>
 *     &lt;enumeration value="startOfLastFiscalYear"/>
 *     &lt;enumeration value="startOfLastMonth"/>
 *     &lt;enumeration value="startOfLastMonthOneFiscalQuarterAgo"/>
 *     &lt;enumeration value="startOfLastMonthOneFiscalYearAgo"/>
 *     &lt;enumeration value="startOfLastRollingHalf"/>
 *     &lt;enumeration value="startOfLastRollingQuarter"/>
 *     &lt;enumeration value="startOfLastRollingYear"/>
 *     &lt;enumeration value="startOfLastWeek"/>
 *     &lt;enumeration value="startOfMonthBeforeLast"/>
 *     &lt;enumeration value="startOfNextBusinessWeek"/>
 *     &lt;enumeration value="startOfNextFiscalHalf"/>
 *     &lt;enumeration value="startOfNextFiscalQuarter"/>
 *     &lt;enumeration value="startOfNextFiscalYear"/>
 *     &lt;enumeration value="startOfNextMonth"/>
 *     &lt;enumeration value="startOfNextWeek"/>
 *     &lt;enumeration value="startOfPreviousRollingHalf"/>
 *     &lt;enumeration value="startOfPreviousRollingQuarter"/>
 *     &lt;enumeration value="startOfPreviousRollingYear"/>
 *     &lt;enumeration value="startOfSameFiscalHalfLastFiscalYear"/>
 *     &lt;enumeration value="startOfSameFiscalQuarterLastFiscalYear"/>
 *     &lt;enumeration value="startOfSameMonthLastFiscalQuarter"/>
 *     &lt;enumeration value="startOfSameMonthLastFiscalYear"/>
 *     &lt;enumeration value="startOfThisBusinessWeek"/>
 *     &lt;enumeration value="startOfThisFiscalHalf"/>
 *     &lt;enumeration value="startOfThisFiscalQuarter"/>
 *     &lt;enumeration value="startOfThisFiscalYear"/>
 *     &lt;enumeration value="startOfThisMonth"/>
 *     &lt;enumeration value="startOfThisWeek"/>
 *     &lt;enumeration value="startOfThisYear"/>
 *     &lt;enumeration value="startOfWeekBeforeLast"/>
 *     &lt;enumeration value="tenDaysAgo"/>
 *     &lt;enumeration value="tenDaysFromNow"/>
 *     &lt;enumeration value="thirtyDaysAgo"/>
 *     &lt;enumeration value="thirtyDaysFromNow"/>
 *     &lt;enumeration value="thisBusinessWeek"/>
 *     &lt;enumeration value="thisFiscalHalf"/>
 *     &lt;enumeration value="thisFiscalHalfToDate"/>
 *     &lt;enumeration value="thisFiscalQuarter"/>
 *     &lt;enumeration value="thisFiscalQuarterToDate"/>
 *     &lt;enumeration value="thisFiscalYear"/>
 *     &lt;enumeration value="thisFiscalYearToDate"/>
 *     &lt;enumeration value="thisMonth"/>
 *     &lt;enumeration value="thisMonthToDate"/>
 *     &lt;enumeration value="thisRollingHalf"/>
 *     &lt;enumeration value="thisRollingQuarter"/>
 *     &lt;enumeration value="thisRollingYear"/>
 *     &lt;enumeration value="thisWeek"/>
 *     &lt;enumeration value="thisWeekToDate"/>
 *     &lt;enumeration value="thisYear"/>
 *     &lt;enumeration value="threeDaysAgo"/>
 *     &lt;enumeration value="threeDaysFromNow"/>
 *     &lt;enumeration value="threeFiscalQuartersAgo"/>
 *     &lt;enumeration value="threeFiscalQuartersAgoToDate"/>
 *     &lt;enumeration value="threeFiscalYearsAgo"/>
 *     &lt;enumeration value="threeFiscalYearsAgoToDate"/>
 *     &lt;enumeration value="threeMonthsAgo"/>
 *     &lt;enumeration value="threeMonthsAgoToDate"/>
 *     &lt;enumeration value="today"/>
 *     &lt;enumeration value="tomorrow"/>
 *     &lt;enumeration value="twoDaysAgo"/>
 *     &lt;enumeration value="twoDaysFromNow"/>
 *     &lt;enumeration value="weekAfterNext"/>
 *     &lt;enumeration value="weekAfterNextToDate"/>
 *     &lt;enumeration value="weekBeforeLast"/>
 *     &lt;enumeration value="weekBeforeLastToDate"/>
 *     &lt;enumeration value="yesterday"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchDate", namespace = "urn:types.core_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchDate {

    @XmlEnumValue("fiscalHalfBeforeLast")
    FISCAL_HALF_BEFORE_LAST("fiscalHalfBeforeLast"),
    @XmlEnumValue("fiscalHalfBeforeLastToDate")
    FISCAL_HALF_BEFORE_LAST_TO_DATE("fiscalHalfBeforeLastToDate"),
    @XmlEnumValue("fiscalQuarterBeforeLast")
    FISCAL_QUARTER_BEFORE_LAST("fiscalQuarterBeforeLast"),
    @XmlEnumValue("fiscalQuarterBeforeLastToDate")
    FISCAL_QUARTER_BEFORE_LAST_TO_DATE("fiscalQuarterBeforeLastToDate"),
    @XmlEnumValue("fiscalYearBeforeLast")
    FISCAL_YEAR_BEFORE_LAST("fiscalYearBeforeLast"),
    @XmlEnumValue("fiscalYearBeforeLastToDate")
    FISCAL_YEAR_BEFORE_LAST_TO_DATE("fiscalYearBeforeLastToDate"),
    @XmlEnumValue("fiveDaysAgo")
    FIVE_DAYS_AGO("fiveDaysAgo"),
    @XmlEnumValue("fiveDaysFromNow")
    FIVE_DAYS_FROM_NOW("fiveDaysFromNow"),
    @XmlEnumValue("fourDaysAgo")
    FOUR_DAYS_AGO("fourDaysAgo"),
    @XmlEnumValue("fourDaysFromNow")
    FOUR_DAYS_FROM_NOW("fourDaysFromNow"),
    @XmlEnumValue("fourWeeksStartingThisWeek")
    FOUR_WEEKS_STARTING_THIS_WEEK("fourWeeksStartingThisWeek"),
    @XmlEnumValue("lastBusinessWeek")
    LAST_BUSINESS_WEEK("lastBusinessWeek"),
    @XmlEnumValue("lastFiscalHalf")
    LAST_FISCAL_HALF("lastFiscalHalf"),
    @XmlEnumValue("lastFiscalHalfOneFiscalYearAgo")
    LAST_FISCAL_HALF_ONE_FISCAL_YEAR_AGO("lastFiscalHalfOneFiscalYearAgo"),
    @XmlEnumValue("lastFiscalHalfToDate")
    LAST_FISCAL_HALF_TO_DATE("lastFiscalHalfToDate"),
    @XmlEnumValue("lastFiscalQuarter")
    LAST_FISCAL_QUARTER("lastFiscalQuarter"),
    @XmlEnumValue("lastFiscalQuarterOneFiscalYearAgo")
    LAST_FISCAL_QUARTER_ONE_FISCAL_YEAR_AGO("lastFiscalQuarterOneFiscalYearAgo"),
    @XmlEnumValue("lastFiscalQuarterToDate")
    LAST_FISCAL_QUARTER_TO_DATE("lastFiscalQuarterToDate"),
    @XmlEnumValue("lastFiscalQuarterTwoFiscalYearsAgo")
    LAST_FISCAL_QUARTER_TWO_FISCAL_YEARS_AGO("lastFiscalQuarterTwoFiscalYearsAgo"),
    @XmlEnumValue("lastFiscalYear")
    LAST_FISCAL_YEAR("lastFiscalYear"),
    @XmlEnumValue("lastFiscalYearToDate")
    LAST_FISCAL_YEAR_TO_DATE("lastFiscalYearToDate"),
    @XmlEnumValue("lastMonth")
    LAST_MONTH("lastMonth"),
    @XmlEnumValue("lastMonthOneFiscalQuarterAgo")
    LAST_MONTH_ONE_FISCAL_QUARTER_AGO("lastMonthOneFiscalQuarterAgo"),
    @XmlEnumValue("lastMonthOneFiscalYearAgo")
    LAST_MONTH_ONE_FISCAL_YEAR_AGO("lastMonthOneFiscalYearAgo"),
    @XmlEnumValue("lastMonthToDate")
    LAST_MONTH_TO_DATE("lastMonthToDate"),
    @XmlEnumValue("lastMonthTwoFiscalQuartersAgo")
    LAST_MONTH_TWO_FISCAL_QUARTERS_AGO("lastMonthTwoFiscalQuartersAgo"),
    @XmlEnumValue("lastMonthTwoFiscalYearsAgo")
    LAST_MONTH_TWO_FISCAL_YEARS_AGO("lastMonthTwoFiscalYearsAgo"),
    @XmlEnumValue("lastRollingHalf")
    LAST_ROLLING_HALF("lastRollingHalf"),
    @XmlEnumValue("lastRollingQuarter")
    LAST_ROLLING_QUARTER("lastRollingQuarter"),
    @XmlEnumValue("lastRollingYear")
    LAST_ROLLING_YEAR("lastRollingYear"),
    @XmlEnumValue("lastWeek")
    LAST_WEEK("lastWeek"),
    @XmlEnumValue("lastWeekToDate")
    LAST_WEEK_TO_DATE("lastWeekToDate"),
    @XmlEnumValue("monthAfterNext")
    MONTH_AFTER_NEXT("monthAfterNext"),
    @XmlEnumValue("monthAfterNextToDate")
    MONTH_AFTER_NEXT_TO_DATE("monthAfterNextToDate"),
    @XmlEnumValue("monthBeforeLast")
    MONTH_BEFORE_LAST("monthBeforeLast"),
    @XmlEnumValue("monthBeforeLastToDate")
    MONTH_BEFORE_LAST_TO_DATE("monthBeforeLastToDate"),
    @XmlEnumValue("nextBusinessWeek")
    NEXT_BUSINESS_WEEK("nextBusinessWeek"),
    @XmlEnumValue("nextFiscalHalf")
    NEXT_FISCAL_HALF("nextFiscalHalf"),
    @XmlEnumValue("nextFiscalQuarter")
    NEXT_FISCAL_QUARTER("nextFiscalQuarter"),
    @XmlEnumValue("nextFiscalYear")
    NEXT_FISCAL_YEAR("nextFiscalYear"),
    @XmlEnumValue("nextFourWeeks")
    NEXT_FOUR_WEEKS("nextFourWeeks"),
    @XmlEnumValue("nextMonth")
    NEXT_MONTH("nextMonth"),
    @XmlEnumValue("nextOneHalf")
    NEXT_ONE_HALF("nextOneHalf"),
    @XmlEnumValue("nextOneMonth")
    NEXT_ONE_MONTH("nextOneMonth"),
    @XmlEnumValue("nextOneQuarter")
    NEXT_ONE_QUARTER("nextOneQuarter"),
    @XmlEnumValue("nextOneWeek")
    NEXT_ONE_WEEK("nextOneWeek"),
    @XmlEnumValue("nextOneYear")
    NEXT_ONE_YEAR("nextOneYear"),
    @XmlEnumValue("nextWeek")
    NEXT_WEEK("nextWeek"),
    @XmlEnumValue("ninetyDaysAgo")
    NINETY_DAYS_AGO("ninetyDaysAgo"),
    @XmlEnumValue("ninetyDaysFromNow")
    NINETY_DAYS_FROM_NOW("ninetyDaysFromNow"),
    @XmlEnumValue("oneYearBeforeLast")
    ONE_YEAR_BEFORE_LAST("oneYearBeforeLast"),
    @XmlEnumValue("previousFiscalQuartersLastFiscalYear")
    PREVIOUS_FISCAL_QUARTERS_LAST_FISCAL_YEAR("previousFiscalQuartersLastFiscalYear"),
    @XmlEnumValue("previousFiscalQuartersThisFiscalYear")
    PREVIOUS_FISCAL_QUARTERS_THIS_FISCAL_YEAR("previousFiscalQuartersThisFiscalYear"),
    @XmlEnumValue("previousMonthsLastFiscalHalf")
    PREVIOUS_MONTHS_LAST_FISCAL_HALF("previousMonthsLastFiscalHalf"),
    @XmlEnumValue("previousMonthsLastFiscalQuarter")
    PREVIOUS_MONTHS_LAST_FISCAL_QUARTER("previousMonthsLastFiscalQuarter"),
    @XmlEnumValue("previousMonthsLastFiscalYear")
    PREVIOUS_MONTHS_LAST_FISCAL_YEAR("previousMonthsLastFiscalYear"),
    @XmlEnumValue("previousMonthsSameFiscalHalfLastFiscalYear")
    PREVIOUS_MONTHS_SAME_FISCAL_HALF_LAST_FISCAL_YEAR("previousMonthsSameFiscalHalfLastFiscalYear"),
    @XmlEnumValue("previousMonthsSameFiscalQuarterLastFiscalYear")
    PREVIOUS_MONTHS_SAME_FISCAL_QUARTER_LAST_FISCAL_YEAR("previousMonthsSameFiscalQuarterLastFiscalYear"),
    @XmlEnumValue("previousMonthsThisFiscalHalf")
    PREVIOUS_MONTHS_THIS_FISCAL_HALF("previousMonthsThisFiscalHalf"),
    @XmlEnumValue("previousMonthsThisFiscalQuarter")
    PREVIOUS_MONTHS_THIS_FISCAL_QUARTER("previousMonthsThisFiscalQuarter"),
    @XmlEnumValue("previousMonthsThisFiscalYear")
    PREVIOUS_MONTHS_THIS_FISCAL_YEAR("previousMonthsThisFiscalYear"),
    @XmlEnumValue("previousOneDay")
    PREVIOUS_ONE_DAY("previousOneDay"),
    @XmlEnumValue("previousOneHalf")
    PREVIOUS_ONE_HALF("previousOneHalf"),
    @XmlEnumValue("previousOneMonth")
    PREVIOUS_ONE_MONTH("previousOneMonth"),
    @XmlEnumValue("previousOneQuarter")
    PREVIOUS_ONE_QUARTER("previousOneQuarter"),
    @XmlEnumValue("previousOneWeek")
    PREVIOUS_ONE_WEEK("previousOneWeek"),
    @XmlEnumValue("previousOneYear")
    PREVIOUS_ONE_YEAR("previousOneYear"),
    @XmlEnumValue("previousRollingHalf")
    PREVIOUS_ROLLING_HALF("previousRollingHalf"),
    @XmlEnumValue("previousRollingQuarter")
    PREVIOUS_ROLLING_QUARTER("previousRollingQuarter"),
    @XmlEnumValue("previousRollingYear")
    PREVIOUS_ROLLING_YEAR("previousRollingYear"),
    @XmlEnumValue("sameDayFiscalQuarterBeforeLast")
    SAME_DAY_FISCAL_QUARTER_BEFORE_LAST("sameDayFiscalQuarterBeforeLast"),
    @XmlEnumValue("sameDayFiscalYearBeforeLast")
    SAME_DAY_FISCAL_YEAR_BEFORE_LAST("sameDayFiscalYearBeforeLast"),
    @XmlEnumValue("sameDayLastFiscalQuarter")
    SAME_DAY_LAST_FISCAL_QUARTER("sameDayLastFiscalQuarter"),
    @XmlEnumValue("sameDayLastFiscalYear")
    SAME_DAY_LAST_FISCAL_YEAR("sameDayLastFiscalYear"),
    @XmlEnumValue("sameDayLastMonth")
    SAME_DAY_LAST_MONTH("sameDayLastMonth"),
    @XmlEnumValue("sameDayLastWeek")
    SAME_DAY_LAST_WEEK("sameDayLastWeek"),
    @XmlEnumValue("sameDayMonthBeforeLast")
    SAME_DAY_MONTH_BEFORE_LAST("sameDayMonthBeforeLast"),
    @XmlEnumValue("sameDayWeekBeforeLast")
    SAME_DAY_WEEK_BEFORE_LAST("sameDayWeekBeforeLast"),
    @XmlEnumValue("sameFiscalHalfLastFiscalYear")
    SAME_FISCAL_HALF_LAST_FISCAL_YEAR("sameFiscalHalfLastFiscalYear"),
    @XmlEnumValue("sameFiscalHalfLastFiscalYearToDate")
    SAME_FISCAL_HALF_LAST_FISCAL_YEAR_TO_DATE("sameFiscalHalfLastFiscalYearToDate"),
    @XmlEnumValue("sameFiscalQuarterFiscalYearBeforeLast")
    SAME_FISCAL_QUARTER_FISCAL_YEAR_BEFORE_LAST("sameFiscalQuarterFiscalYearBeforeLast"),
    @XmlEnumValue("sameFiscalQuarterLastFiscalYear")
    SAME_FISCAL_QUARTER_LAST_FISCAL_YEAR("sameFiscalQuarterLastFiscalYear"),
    @XmlEnumValue("sameFiscalQuarterLastFiscalYearToDate")
    SAME_FISCAL_QUARTER_LAST_FISCAL_YEAR_TO_DATE("sameFiscalQuarterLastFiscalYearToDate"),
    @XmlEnumValue("sameMonthFiscalQuarterBeforeLast")
    SAME_MONTH_FISCAL_QUARTER_BEFORE_LAST("sameMonthFiscalQuarterBeforeLast"),
    @XmlEnumValue("sameMonthFiscalYearBeforeLast")
    SAME_MONTH_FISCAL_YEAR_BEFORE_LAST("sameMonthFiscalYearBeforeLast"),
    @XmlEnumValue("sameMonthLastFiscalQuarter")
    SAME_MONTH_LAST_FISCAL_QUARTER("sameMonthLastFiscalQuarter"),
    @XmlEnumValue("sameMonthLastFiscalQuarterToDate")
    SAME_MONTH_LAST_FISCAL_QUARTER_TO_DATE("sameMonthLastFiscalQuarterToDate"),
    @XmlEnumValue("sameMonthLastFiscalYear")
    SAME_MONTH_LAST_FISCAL_YEAR("sameMonthLastFiscalYear"),
    @XmlEnumValue("sameMonthLastFiscalYearToDate")
    SAME_MONTH_LAST_FISCAL_YEAR_TO_DATE("sameMonthLastFiscalYearToDate"),
    @XmlEnumValue("sameWeekFiscalYearBeforeLast")
    SAME_WEEK_FISCAL_YEAR_BEFORE_LAST("sameWeekFiscalYearBeforeLast"),
    @XmlEnumValue("sameWeekLastFiscalYear")
    SAME_WEEK_LAST_FISCAL_YEAR("sameWeekLastFiscalYear"),
    @XmlEnumValue("sixtyDaysAgo")
    SIXTY_DAYS_AGO("sixtyDaysAgo"),
    @XmlEnumValue("sixtyDaysFromNow")
    SIXTY_DAYS_FROM_NOW("sixtyDaysFromNow"),
    @XmlEnumValue("startOfFiscalHalfBeforeLast")
    START_OF_FISCAL_HALF_BEFORE_LAST("startOfFiscalHalfBeforeLast"),
    @XmlEnumValue("startOfFiscalQuarterBeforeLast")
    START_OF_FISCAL_QUARTER_BEFORE_LAST("startOfFiscalQuarterBeforeLast"),
    @XmlEnumValue("startOfFiscalYearBeforeLast")
    START_OF_FISCAL_YEAR_BEFORE_LAST("startOfFiscalYearBeforeLast"),
    @XmlEnumValue("startOfLastBusinessWeek")
    START_OF_LAST_BUSINESS_WEEK("startOfLastBusinessWeek"),
    @XmlEnumValue("startOfLastFiscalHalf")
    START_OF_LAST_FISCAL_HALF("startOfLastFiscalHalf"),
    @XmlEnumValue("startOfLastFiscalHalfOneFiscalYearAgo")
    START_OF_LAST_FISCAL_HALF_ONE_FISCAL_YEAR_AGO("startOfLastFiscalHalfOneFiscalYearAgo"),
    @XmlEnumValue("startOfLastFiscalQuarter")
    START_OF_LAST_FISCAL_QUARTER("startOfLastFiscalQuarter"),
    @XmlEnumValue("startOfLastFiscalQuarterOneFiscalYearAgo")
    START_OF_LAST_FISCAL_QUARTER_ONE_FISCAL_YEAR_AGO("startOfLastFiscalQuarterOneFiscalYearAgo"),
    @XmlEnumValue("startOfLastFiscalYear")
    START_OF_LAST_FISCAL_YEAR("startOfLastFiscalYear"),
    @XmlEnumValue("startOfLastMonth")
    START_OF_LAST_MONTH("startOfLastMonth"),
    @XmlEnumValue("startOfLastMonthOneFiscalQuarterAgo")
    START_OF_LAST_MONTH_ONE_FISCAL_QUARTER_AGO("startOfLastMonthOneFiscalQuarterAgo"),
    @XmlEnumValue("startOfLastMonthOneFiscalYearAgo")
    START_OF_LAST_MONTH_ONE_FISCAL_YEAR_AGO("startOfLastMonthOneFiscalYearAgo"),
    @XmlEnumValue("startOfLastRollingHalf")
    START_OF_LAST_ROLLING_HALF("startOfLastRollingHalf"),
    @XmlEnumValue("startOfLastRollingQuarter")
    START_OF_LAST_ROLLING_QUARTER("startOfLastRollingQuarter"),
    @XmlEnumValue("startOfLastRollingYear")
    START_OF_LAST_ROLLING_YEAR("startOfLastRollingYear"),
    @XmlEnumValue("startOfLastWeek")
    START_OF_LAST_WEEK("startOfLastWeek"),
    @XmlEnumValue("startOfMonthBeforeLast")
    START_OF_MONTH_BEFORE_LAST("startOfMonthBeforeLast"),
    @XmlEnumValue("startOfNextBusinessWeek")
    START_OF_NEXT_BUSINESS_WEEK("startOfNextBusinessWeek"),
    @XmlEnumValue("startOfNextFiscalHalf")
    START_OF_NEXT_FISCAL_HALF("startOfNextFiscalHalf"),
    @XmlEnumValue("startOfNextFiscalQuarter")
    START_OF_NEXT_FISCAL_QUARTER("startOfNextFiscalQuarter"),
    @XmlEnumValue("startOfNextFiscalYear")
    START_OF_NEXT_FISCAL_YEAR("startOfNextFiscalYear"),
    @XmlEnumValue("startOfNextMonth")
    START_OF_NEXT_MONTH("startOfNextMonth"),
    @XmlEnumValue("startOfNextWeek")
    START_OF_NEXT_WEEK("startOfNextWeek"),
    @XmlEnumValue("startOfPreviousRollingHalf")
    START_OF_PREVIOUS_ROLLING_HALF("startOfPreviousRollingHalf"),
    @XmlEnumValue("startOfPreviousRollingQuarter")
    START_OF_PREVIOUS_ROLLING_QUARTER("startOfPreviousRollingQuarter"),
    @XmlEnumValue("startOfPreviousRollingYear")
    START_OF_PREVIOUS_ROLLING_YEAR("startOfPreviousRollingYear"),
    @XmlEnumValue("startOfSameFiscalHalfLastFiscalYear")
    START_OF_SAME_FISCAL_HALF_LAST_FISCAL_YEAR("startOfSameFiscalHalfLastFiscalYear"),
    @XmlEnumValue("startOfSameFiscalQuarterLastFiscalYear")
    START_OF_SAME_FISCAL_QUARTER_LAST_FISCAL_YEAR("startOfSameFiscalQuarterLastFiscalYear"),
    @XmlEnumValue("startOfSameMonthLastFiscalQuarter")
    START_OF_SAME_MONTH_LAST_FISCAL_QUARTER("startOfSameMonthLastFiscalQuarter"),
    @XmlEnumValue("startOfSameMonthLastFiscalYear")
    START_OF_SAME_MONTH_LAST_FISCAL_YEAR("startOfSameMonthLastFiscalYear"),
    @XmlEnumValue("startOfThisBusinessWeek")
    START_OF_THIS_BUSINESS_WEEK("startOfThisBusinessWeek"),
    @XmlEnumValue("startOfThisFiscalHalf")
    START_OF_THIS_FISCAL_HALF("startOfThisFiscalHalf"),
    @XmlEnumValue("startOfThisFiscalQuarter")
    START_OF_THIS_FISCAL_QUARTER("startOfThisFiscalQuarter"),
    @XmlEnumValue("startOfThisFiscalYear")
    START_OF_THIS_FISCAL_YEAR("startOfThisFiscalYear"),
    @XmlEnumValue("startOfThisMonth")
    START_OF_THIS_MONTH("startOfThisMonth"),
    @XmlEnumValue("startOfThisWeek")
    START_OF_THIS_WEEK("startOfThisWeek"),
    @XmlEnumValue("startOfThisYear")
    START_OF_THIS_YEAR("startOfThisYear"),
    @XmlEnumValue("startOfWeekBeforeLast")
    START_OF_WEEK_BEFORE_LAST("startOfWeekBeforeLast"),
    @XmlEnumValue("tenDaysAgo")
    TEN_DAYS_AGO("tenDaysAgo"),
    @XmlEnumValue("tenDaysFromNow")
    TEN_DAYS_FROM_NOW("tenDaysFromNow"),
    @XmlEnumValue("thirtyDaysAgo")
    THIRTY_DAYS_AGO("thirtyDaysAgo"),
    @XmlEnumValue("thirtyDaysFromNow")
    THIRTY_DAYS_FROM_NOW("thirtyDaysFromNow"),
    @XmlEnumValue("thisBusinessWeek")
    THIS_BUSINESS_WEEK("thisBusinessWeek"),
    @XmlEnumValue("thisFiscalHalf")
    THIS_FISCAL_HALF("thisFiscalHalf"),
    @XmlEnumValue("thisFiscalHalfToDate")
    THIS_FISCAL_HALF_TO_DATE("thisFiscalHalfToDate"),
    @XmlEnumValue("thisFiscalQuarter")
    THIS_FISCAL_QUARTER("thisFiscalQuarter"),
    @XmlEnumValue("thisFiscalQuarterToDate")
    THIS_FISCAL_QUARTER_TO_DATE("thisFiscalQuarterToDate"),
    @XmlEnumValue("thisFiscalYear")
    THIS_FISCAL_YEAR("thisFiscalYear"),
    @XmlEnumValue("thisFiscalYearToDate")
    THIS_FISCAL_YEAR_TO_DATE("thisFiscalYearToDate"),
    @XmlEnumValue("thisMonth")
    THIS_MONTH("thisMonth"),
    @XmlEnumValue("thisMonthToDate")
    THIS_MONTH_TO_DATE("thisMonthToDate"),
    @XmlEnumValue("thisRollingHalf")
    THIS_ROLLING_HALF("thisRollingHalf"),
    @XmlEnumValue("thisRollingQuarter")
    THIS_ROLLING_QUARTER("thisRollingQuarter"),
    @XmlEnumValue("thisRollingYear")
    THIS_ROLLING_YEAR("thisRollingYear"),
    @XmlEnumValue("thisWeek")
    THIS_WEEK("thisWeek"),
    @XmlEnumValue("thisWeekToDate")
    THIS_WEEK_TO_DATE("thisWeekToDate"),
    @XmlEnumValue("thisYear")
    THIS_YEAR("thisYear"),
    @XmlEnumValue("threeDaysAgo")
    THREE_DAYS_AGO("threeDaysAgo"),
    @XmlEnumValue("threeDaysFromNow")
    THREE_DAYS_FROM_NOW("threeDaysFromNow"),
    @XmlEnumValue("threeFiscalQuartersAgo")
    THREE_FISCAL_QUARTERS_AGO("threeFiscalQuartersAgo"),
    @XmlEnumValue("threeFiscalQuartersAgoToDate")
    THREE_FISCAL_QUARTERS_AGO_TO_DATE("threeFiscalQuartersAgoToDate"),
    @XmlEnumValue("threeFiscalYearsAgo")
    THREE_FISCAL_YEARS_AGO("threeFiscalYearsAgo"),
    @XmlEnumValue("threeFiscalYearsAgoToDate")
    THREE_FISCAL_YEARS_AGO_TO_DATE("threeFiscalYearsAgoToDate"),
    @XmlEnumValue("threeMonthsAgo")
    THREE_MONTHS_AGO("threeMonthsAgo"),
    @XmlEnumValue("threeMonthsAgoToDate")
    THREE_MONTHS_AGO_TO_DATE("threeMonthsAgoToDate"),
    @XmlEnumValue("today")
    TODAY("today"),
    @XmlEnumValue("tomorrow")
    TOMORROW("tomorrow"),
    @XmlEnumValue("twoDaysAgo")
    TWO_DAYS_AGO("twoDaysAgo"),
    @XmlEnumValue("twoDaysFromNow")
    TWO_DAYS_FROM_NOW("twoDaysFromNow"),
    @XmlEnumValue("weekAfterNext")
    WEEK_AFTER_NEXT("weekAfterNext"),
    @XmlEnumValue("weekAfterNextToDate")
    WEEK_AFTER_NEXT_TO_DATE("weekAfterNextToDate"),
    @XmlEnumValue("weekBeforeLast")
    WEEK_BEFORE_LAST("weekBeforeLast"),
    @XmlEnumValue("weekBeforeLastToDate")
    WEEK_BEFORE_LAST_TO_DATE("weekBeforeLastToDate"),
    @XmlEnumValue("yesterday")
    YESTERDAY("yesterday");
    private final String value;

    SearchDate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchDate fromValue(String v) {
        for (SearchDate c: SearchDate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
