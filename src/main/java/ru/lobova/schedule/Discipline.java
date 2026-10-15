package ru.lobova.schedule;

/**
 * Учебная дисциплина.
 *
 * @param name название
 */
public record Discipline(String name) {
    public Discipline {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название дисциплины не может быть пустым");
        }
    }
}