package ru.lobova.schedule;

import java.time.DayOfWeek;
import java.time.Duration;
import java.util.Set;

/**
 * Контракт для любого занятия в расписании.
 * Определяет полиморфные методы, общие для всех видов занятий.
 */
public interface Schedulable {

    /** @return день недели занятия */
    DayOfWeek getDayOfWeek();

    /** @return номер пары */
    PairNumber getPairNumber();

    /** @return преподаватель */
    Teacher getTeacher();

    /** @return аудитория */
    Classroom getClassroom();

    /** @return множество групп, участвующих в занятии */
    Set<Group> getGroups();

    /**
     * Длительность занятия как Duration.
     * Значение по умолчанию — разница между началом и концом пары.
     */
    default Duration getDuration() {
        return Duration.between(getPairNumber().getStartTime(), getPairNumber().getEndTime());
    }

    /**
     * Проверяет, пересекается ли это занятие с другим по времени
     * (один и тот же день недели и одна и та же пара).
     */
    default boolean overlapsInTime(Schedulable other) {
        return this.getDayOfWeek() == other.getDayOfWeek()
                && this.getPairNumber() == other.getPairNumber();
    }
}