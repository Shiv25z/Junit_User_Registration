package com.uservalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationMain {
    public static boolean firstName(String firstName) throws UserValidationMainException {
        if (firstName == null) {
            throw new UserValidationMainException(UserValidationMainException.ExceptionType.NULL, "Input cannot be Null");
        } else if (firstName.length() == 0) {
            throw new UserValidationMainException(UserValidationMainException.ExceptionType.EMPTY, "Invalid Input");
        }
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
    }
    public static boolean lastName(String lastName) throws UserValidationMainException {
        if (lastName == null) {
            throw new UserValidationMainException(UserValidationMainException.ExceptionType.NULL, "Input cannot be Null");
        } else if (lastName.length() == 0) {
            throw new UserValidationMainException(UserValidationMainException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public static boolean email(String email) throws UserValidationMainException {
        if (email == null) {
            throw new UserValidationMainException(UserValidationMainException.ExceptionType.NULL, " Input can't be Null");
        } else if (email.length() == 0) {
            throw new UserValidationMainException(UserValidationMainException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^[a-z]{3,}([_+-.]?[a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+([.,][a-z]{2,3}+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean phoneNumber(String phoneNumber) throws UserValidationMainException {
        if (phoneNumber == null) {
            throw new UserValidationMainException(UserValidationMainException.ExceptionType.NULL, " Input can't be Null");
        } else if (phoneNumber.length() == 0) {
            throw new UserValidationMainException(UserValidationMainException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^(0|91)?[\\s][0-9]{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean passwordRule2(String password) throws UserValidationMainException{
        if (password == null) {
            throw new UserValidationMainException(UserValidationMainException.ExceptionType.NULL, " Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserValidationMainException(UserValidationMainException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }


    public static void main(String[] args) {
        System.out.println("_________________ Welcome to Junit User Registration Problem! _________________");

    }
}
