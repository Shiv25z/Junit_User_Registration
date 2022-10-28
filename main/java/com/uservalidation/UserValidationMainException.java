package com.uservalidation;

public class UserValidationMainException extends Exception {// UC12 Custom Exception Handling
    public ExceptionType type;
    public enum ExceptionType {
        INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_MOBILE_NUMBER, INVALID_EMAIL_ID, INVALID_PASSWORD;
    }

    public UserValidationMainException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

}
