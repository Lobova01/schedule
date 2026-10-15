package ru.lobova.schedule;

/**
 * Учебная группа.
 *
 * @param name название (например, "ПИ-21-1")
 * @param size число студентов
 */
public record Group(String name, int size) {
    public Group {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название группы не может быть пустым");
        }
        if (size <= 0) {
            throw new IllegalArgumentException("Размер группы должен быть положительным");
        }
    }
}