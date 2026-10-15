package ru.lobova.schedule;

import java.time.DayOfWeek;
import java.util.Objects;
import java.util.Set;

/**
 * Занятие для работы подгруппы одной группы.
 */
public final class Lab extends Lesson {

    private final Group group;
    private final String subGroupName;

    public Lab(DayOfWeek dayOfWeek, PairNumber pairNumber, Discipline discipline,
               Teacher teacher, Classroom classroom, WeekParity weekParity,
               Group group, String subGroupName) {
        super(dayOfWeek, pairNumber, discipline, teacher, classroom, weekParity);
        this.group = Objects.requireNonNull(group, "group");
        if (subGroupName == null || subGroupName.isBlank()) {
            throw new IllegalArgumentException("Название подгруппы не может быть пустым");
        }
        this.subGroupName = subGroupName;
    }

    /** @return группа */
    public Group getGroup() { return group; }

    /** @return название подгруппы */
    public String getSubGroupName() { return subGroupName; }

    @Override
    public Set<Group> getGroups() {
        return Set.of(group);
    }
}