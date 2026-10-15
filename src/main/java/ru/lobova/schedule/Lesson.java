package ru.lobova.schedule;

import java.time.DayOfWeek;
import java.util.Objects;

/**
 * Базовый класс всех видов занятий.
 */
public sealed abstract class Lesson implements Schedulable
        permits Lecture, Practice, Lab {

    private final DayOfWeek dayOfWeek;
    private final PairNumber pairNumber;
    private final Discipline discipline;
    private final Teacher teacher;
    private final Classroom classroom;
    private final WeekParity weekParity;

    /**
     * @param dayOfWeek  день недели
     * @param pairNumber номер пары
     * @param discipline дисциплина
     * @param teacher    преподаватель
     * @param classroom  аудитория
     * @param weekParity чётность недели
     */
    protected Lesson(DayOfWeek dayOfWeek, PairNumber pairNumber, Discipline discipline,
                     Teacher teacher, Classroom classroom, WeekParity weekParity) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "dayOfWeek");
        this.pairNumber = Objects.requireNonNull(pairNumber, "pairNumber");
        this.discipline = Objects.requireNonNull(discipline, "discipline");
        this.teacher = Objects.requireNonNull(teacher, "teacher");
        this.classroom = Objects.requireNonNull(classroom, "classroom");
        this.weekParity = (weekParity == null) ? WeekParity.ANY : weekParity;
    }

    @Override public DayOfWeek getDayOfWeek()   { return dayOfWeek; }
    @Override public PairNumber getPairNumber() { return pairNumber; }
    @Override public Teacher getTeacher()       { return teacher; }
    @Override public Classroom getClassroom()   { return classroom; }

    /** @return дисциплина */
    public Discipline getDiscipline() { return discipline; }

    /** @return чётность недели */
    public WeekParity getWeekParity() { return weekParity; }
}