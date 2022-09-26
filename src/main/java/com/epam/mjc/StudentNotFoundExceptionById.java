package com.epam.mjc;

public class StudentNotFoundExceptionById extends IllegalArgumentException {
    public StudentNotFoundExceptionById(String message) {
        super(message);
    }
}
