package ru.lobova.schedule;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Календарь праздничных дней. Хранит набор нерабочих дат.
 * Возвращает неизменяемую копию множества — внутреннее состояние наружу не утекает.
 */
public class HolidayCalendar {

    private final Set<LocalDate> holidays = new HashSet<>();

    /**
     * Добавляет праздничный день.
     *
     * @param date дата
     * @throws IllegalArgumentException если date == null
     */
    public void addHoliday(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Дата не может быть null");
        }
        holidays.add(date);
    }

    /** @return true, если дата является праздником */
    public boolean isHoliday(LocalDate date) {
        return holidays.contains(date);
    }

    /** @return неизменяемая копия множества праздников */
    public Set<LocalDate> getHolidays() {
        return Set.copyOf(holidays);
    }
}