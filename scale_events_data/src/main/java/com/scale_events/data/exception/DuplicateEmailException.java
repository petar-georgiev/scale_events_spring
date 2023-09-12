package com.scale_events.data.exception;

public class DuplicateEmailException extends RuntimeException {
    public DuplicateEmailException(String errorMessage) {
        super(errorMessage);
    }
}
