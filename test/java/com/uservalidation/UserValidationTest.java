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
    @Test
    void lastName() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.lastName("Zagade"));
        Assertions.assertFalse(UserValidationMain.lastName("las"));
    }

    @Test
    void email() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.email("shivam@gamil.com"));
        Assertions.assertFalse(UserValidationMain.email("sjaks"));
    }
    @Test
    void phoneNumber() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.phoneNumber("91 1111111111"));
        Assertions.assertFalse(UserValidationMain.phoneNumber("911561561156"));
    }
    @Test
    void passwordRule1() throws UserValidationMainException{
        Assertions.assertTrue(UserValidationMain.passwordRule1("f4#561AS"));
        Assertions.assertFalse(UserValidationMain.passwordRule1("esf523S"));
    }

    @Test
    void passwordRule2() throws UserValidationMainException{
        Assertions.assertTrue(UserValidationMain.passwordRule2("f4#561AS"));
        Assertions.assertFalse(UserValidationMain.passwordRule2("esf523S"));
    }

    @Test
    void passwordRule3() throws UserValidationMainException{
        Assertions.assertTrue(UserValidationMain.passwordRule3("f4#561AS"));
        Assertions.assertFalse(UserValidationMain.passwordRule3("esf523S"));
    }
    @Test
    void passwordRule4() throws UserValidationMainException{
        Assertions.assertTrue(UserValidationMain.passwordRule4("f4#561AS"));
        Assertions.assertFalse(UserValidationMain.passwordRule4("esf523S"));
    }

    @Test
    void emailIdValidator() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.emailIdValidator("abc.100@abc.com.au"));
        Assertions.assertFalse(UserValidationMain.emailIdValidator("abc@gmail.com.aa.au"));
    }
}
