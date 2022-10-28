package com.uservalidation;

import java.util.Scanner;

public class UserInfo {
    Scanner sc = new Scanner(System.in);
    UserValidationMain validUserInfo = new UserValidationMain();

    public String userFirstName() throws UserValidationMainException {
        System.out.println("Enter Your First Name : ");
        String firstName = sc.next();
        return validUserInfo.firstName(firstName);
    }

    public String userLastName() throws UserValidationMainException {
        System.out.println("Enter Your Last Name : ");
        String lastName = sc.next();
        return validUserInfo.lastName(lastName);
    }

    public String userEmailId() throws UserValidationMainException {
        System.out.println("Enter Your Email : ");
        String emailID = sc.next();
        return validUserInfo.email(emailID);
    }

    public String userMobNum() throws UserValidationMainException {
        System.out.println("Enter Your Mobile Number : ");
        String mobileNum = sc.next();
        return validUserInfo.phoneNumber(mobileNum);
    }

    public String userPassword() throws UserValidationMainException {
        System.out.println("Enter Your Password : ");
        String passWord = sc.next();
        return validUserInfo.passwordRule(passWord);
    }
}
