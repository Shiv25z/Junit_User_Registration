package com.uservalidation;

import java.util.regex.Pattern;

public class UserValidationMain {
    public String firstName(String firstName) throws UserValidationMainException{

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        try {
            Pattern pattern = Pattern.compile(regex);
            if(firstName.isEmpty())
                throw new UserValidationMainException("Enter valid First Name!" , UserValidationMainException.ExceptionType.INVALID_FIRST_NAME);

            Validate fNameValidate = (fName) -> pattern.matcher(fName).matches() ? "Valid" : "Invalid";
            return fNameValidate.validate(firstName);
        } catch(Exception e) {
            throw new UserValidationMainException("Enter valid First Name!" , UserValidationMainException.ExceptionType.INVALID_FIRST_NAME);
        }
    }

    public String lastName(String lastName) throws UserValidationMainException{
        //regex pattern
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        try {
            Pattern pattern = Pattern.compile(regex);
            if(lastName.isEmpty())
                throw new UserValidationMainException("Enter valid Last Name!" , UserValidationMainException.ExceptionType.INVALID_LAST_NAME);

            Validate fNameValidate = (fName) -> pattern.matcher(fName).matches() ? "Valid" : "Invalid";
            return fNameValidate.validate(lastName);
        } catch(Exception e) {
            throw new UserValidationMainException("Enter valid First Name!" , UserValidationMainException.ExceptionType.INVALID_LAST_NAME);
        }
    }

    public String email(String emailId) throws UserValidationMainException {
        String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        try {
            if(emailId.isEmpty())
                throw new UserValidationMainException("Enter valid Email ID!" , UserValidationMainException.ExceptionType.INVALID_EMAIL_ID);

            Validate fNameValidate = (fName) -> Pattern.compile(regex).matcher(fName).matches() ? "Valid" : "Invalid";
            return fNameValidate.validate(emailId);
        } catch(Exception e) {
            throw new UserValidationMainException("Enter valid Email ID!" , UserValidationMainException.ExceptionType.INVALID_EMAIL_ID);
        }
    }

    public String phoneNumber(String mobNum) throws UserValidationMainException {
        String regex = "^[0-9]{1,3}-[0-9]{10}$";
        try {
            if(mobNum.isEmpty())
                throw new UserValidationMainException("Enter valid Mobile Number!" , UserValidationMainException.ExceptionType.INVALID_MOBILE_NUMBER);

            Validate fNameValidate = (fName) -> Pattern.compile(regex).matcher(fName).matches() ? "Valid" : "Invalid";
            return fNameValidate.validate(mobNum);
        } catch(Exception e) {
            throw new UserValidationMainException("Enter valid Mobile Number!" , UserValidationMainException.ExceptionType.INVALID_MOBILE_NUMBER);
        }
    }

    public String passwordRule(String pswrd) throws UserValidationMainException {
        String regex = "^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
        try {
            if(pswrd.isEmpty())
                throw new UserValidationMainException("Enter valid Password!" , UserValidationMainException.ExceptionType.INVALID_PASSWORD);

            Validate fNameValidate = (fName) -> Pattern.compile(regex).matcher(fName).matches() ? "Valid" : "Invalid";
            return fNameValidate.validate(pswrd);
        } catch(Exception e) {
            throw new UserValidationMainException("Enter valid Password!" , UserValidationMainException.ExceptionType.INVALID_PASSWORD);
        }
    }
}
