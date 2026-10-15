package ru.lobova.schedule;

import java.time.DayOfWeek;

/**
 * Временной слот: день недели + номер пары.
 *
 * @param dayOfWeek  день недели
 * @param pairNumber номер пары
 */
public record TimeSlot(DayOfWeek dayOfWeek, PairNumber pairNumber) {}