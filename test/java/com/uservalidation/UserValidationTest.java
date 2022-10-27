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


    void firstNameSadTest() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.firstName("Sh"));
        Assertions.assertFalse(UserValidationMain.firstName("sbi"));
    }
    @Test
    void lastNameSadTest() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.lastName("zagade"));
        Assertions.assertFalse(UserValidationMain.lastName("Flask"));
    }

    @Test
    void emailSadTest() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.email("shivgamil.com"));
        Assertions.assertFalse(UserValidationMain.email("sjaks@gmail.com"));
    }
    @Test
    void phoneNumberSad() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.phoneNumber("91 111111"));
        Assertions.assertFalse(UserValidationMain.phoneNumber("91 1561561156"));
    }
    @Test
    void passwordRule1SadTest() throws UserValidationMainException{
        Assertions.assertTrue(UserValidationMain.passwordRule1("f61AS"));
        Assertions.assertFalse(UserValidationMain.passwordRule1("#esf523S"));
    }

    @Test
    void passwordRule2SadTest() throws UserValidationMainException{
        Assertions.assertTrue(UserValidationMain.passwordRule2("f4#5"));
        Assertions.assertFalse(UserValidationMain.passwordRule2("esf#523S"));
    }

    @Test
    void passwordRule3SadTest() throws UserValidationMainException{
        Assertions.assertTrue(UserValidationMain.passwordRule3("61AS"));
        Assertions.assertFalse(UserValidationMain.passwordRule3("e@sf523S"));
    }
    @Test
    void passwordRule4SadTest() throws UserValidationMainException{
        Assertions.assertTrue(UserValidationMain.passwordRule4("561S"));
        Assertions.assertFalse(UserValidationMain.passwordRule4("es#f523S"));
    }

    @Test
    void emailIdValidatorSadTest() throws UserValidationMainException {
        Assertions.assertTrue(UserValidationMain.emailIdValidator("abc.100@au"));
        Assertions.assertFalse(UserValidationMain.emailIdValidator("abcgmail.au"));
    }
}
