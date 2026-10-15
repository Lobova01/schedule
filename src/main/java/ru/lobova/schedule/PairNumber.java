package ru.lobova.schedule;

import java.time.LocalTime;

/**
 * Перечисление номеров пар с временем начала и конца.
 */
public enum PairNumber {
    FIRST(LocalTime.of(8, 30), LocalTime.of(10, 0)),
    SECOND(LocalTime.of(10, 10), LocalTime.of(11, 40)),
    THIRD(LocalTime.of(12, 10), LocalTime.of(13, 40)),
    FOURTH(LocalTime.of(14, 0), LocalTime.of(15, 30)),
    FIFTH(LocalTime.of(15, 40), LocalTime.of(17, 10));

    private final LocalTime startTime;
    private final LocalTime endTime;

    PairNumber(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() { return startTime; }
    public LocalTime getEndTime() { return endTime; }
}