package ru.lobova.schedule;

import java.time.LocalDate;
import java.time.temporal.WeekFields;

/**
 * Утилита для определения чётности учебной недели.
 */
public final class WeekParityUtils {

    private WeekParityUtils() {}

    /**
     * Определяет чётность недели для заданной даты по ISO-нумерации.
     *
     * @param date дата
     */
    public static WeekParity parityOf(LocalDate date) {
        int week = date.get(WeekFields.ISO.weekOfWeekBasedYear());
        return (week % 2 == 0) ? WeekParity.EVEN : WeekParity.ODD;
    }
}