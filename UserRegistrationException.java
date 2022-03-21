package com.userregistrationucTest;


public class UserRegistrationException extends Exception{
    public String name;

    public  UserRegistrationException(String name){
        super(name);
    }
}