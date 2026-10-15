package ru.lobova.schedule;

/**
 * Исключение, выбрасываемое при конфликте расписания.
 */
public class ScheduleConflictException extends RuntimeException {
    public ScheduleConflictException(String message) {
        super(message);
    }
}