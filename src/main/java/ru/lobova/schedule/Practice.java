package ru.lobova.schedule;

import java.time.DayOfWeek;
import java.util.Objects;
import java.util.Set;

/**
 * Практическое занятие для одной группы.
 */
public final class Practice extends Lesson {

    private final Group group;

    public Practice(DayOfWeek dayOfWeek, PairNumber pairNumber, Discipline discipline,
                    Teacher teacher, Classroom classroom, WeekParity weekParity,
                    Group group) {
        super(dayOfWeek, pairNumber, discipline, teacher, classroom, weekParity);
        this.group = Objects.requireNonNull(group, "group");
    }

    /** @return группа */
    public Group getGroup() { return group; }

    @Override
    public Set<Group> getGroups() {
        return Set.of(group);
    }
}