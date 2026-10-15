package ru.lobova.schedule;

/**
 * Преподаватель.
 *
 * @param fullName ФИО
 */
public record Teacher(String fullName) {
    public Teacher {
        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("ФИО не может быть пустым");
        }
    }
}