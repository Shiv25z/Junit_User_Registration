package com.uservalidation;

import com.uservalidation.UserValidationMainException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public void firstName() throws UserValidationMainException{
        Assertions.assertTrue(UserValidationMain.firstName(""));
    }

    @Test
    void lastName() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.lastName(""));
    }

    @Test
    void email() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.email(""));
    }

    @Test
    void phoneNumber() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.phoneNumber(""));
    }

    @Test
    void passwordRule() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.passwordRule(""));
    }
}
