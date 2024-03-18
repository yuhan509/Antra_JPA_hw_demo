package com.example.hibernatespringdatajpademo.jpademo.exception;

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
