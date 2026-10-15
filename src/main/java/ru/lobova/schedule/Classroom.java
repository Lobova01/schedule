package ru.lobova.schedule;

/**
 * Аудитория.
 *
 * @param name     название (например, "101")
 * @param capacity число мест
 */
public record Classroom(String name, int capacity) {
    public Classroom {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название аудитории не может быть пустым");
        }
        if (capacity <= 0) {
            throw new IllegalArgumentException("Вместимость должна быть положительной");
        }
    }
}