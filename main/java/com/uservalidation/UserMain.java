package com.uservalidation;

public class UserMain {
    public static void main(String[] args) throws UserValidationMainException {
        System.out.println("_________________ Welcome to Junit User Registration Problem! _________________");

        UserInfo userInformation = new UserInfo();
        System.out.println(userInformation.userFirstName());
        System.out.println(userInformation.userLastName());
        System.out.println(userInformation.userEmailId());
        System.out.println(userInformation.userMobNum());
        System.out.println(userInformation.userPassword());
    }

}
