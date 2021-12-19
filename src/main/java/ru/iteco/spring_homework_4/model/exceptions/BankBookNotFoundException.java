package ru.iteco.spring_homework_4.model.exceptions;

public class BankBookNotFoundException extends RuntimeException {
    public BankBookNotFoundException(String message) {
        super(message);
    }
}
