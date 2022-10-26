package com.uservalidation;

import com.uservalidation.UserValidationMainException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    void firstName() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.firstName("Shivam"));
        Assertions.assertFalse(UserValidationMain.firstName("shivam"));
    }

}
