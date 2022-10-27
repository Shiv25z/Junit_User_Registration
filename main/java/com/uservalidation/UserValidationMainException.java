package com.uservalidation;

public class UserValidationMainException extends Exception {
    String message;
    static ExceptionType type;
    enum ExceptionType {
        NULL, EMPTY;
    }
    public UserValidationMainException(ExceptionType type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

}
