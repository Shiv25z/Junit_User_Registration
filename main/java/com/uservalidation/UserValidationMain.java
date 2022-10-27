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
    }public static boolean lastName(String lastName) throws UserValidationMainException {
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


    public static void main(String[] args) {
        System.out.println("_________________ Welcome to Junit User Registration Problem! _________________");

    }
}
