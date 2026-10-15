package ru.lobova.schedule;

import java.time.DayOfWeek;
import java.util.Set;

/**
 * Лекция — занятие для нескольких групп одновременно.
 */
public final class Lecture extends Lesson {

    private final Set<Group> groups;

    /**
     * @param groups непустое множество групп потока
     * @throws IllegalArgumentException если groups == null или пусто
     */
    public Lecture(DayOfWeek dayOfWeek, PairNumber pairNumber, Discipline discipline,
                   Teacher teacher, Classroom classroom, WeekParity weekParity,
                   Set<Group> groups) {
        super(dayOfWeek, pairNumber, discipline, teacher, classroom, weekParity);
        if (groups == null || groups.isEmpty()) {
            throw new IllegalArgumentException("У лекции должна быть хотя бы одна группа");
        }
        this.groups = Set.copyOf(groups);
    }

    @Override
    public Set<Group> getGroups() {
        return groups;
    }
}