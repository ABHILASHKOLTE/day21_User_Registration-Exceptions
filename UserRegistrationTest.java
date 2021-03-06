package com.userregistrationucTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstname_WhenProper_ShouldReturnFirstNameisValid() {
//         UserRegistration input = new UserRegistration();
//          String actualresult = input.validFirstName("Abhilash");
//           Assertions.assertEquals("First Name is Valid", actualresult);
    }

    @Test
    public void givenLastname_WhenProper_ShouldReturnLastNameisValid() {
//           UserRegistration input = new UserRegistration();
//           String actualresult = input.validLastName("kolte");
//           Assertions.assertEquals("Last Name is Valid", actualresult);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnEmailisValid() {
//            UserRegistration input = new UserRegistration();
//            String actualresult = input.validEmail("abhilsh.kolte@gmail.com");
//           Assertions.assertEquals("Email is Valid", actualresult);
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnPhoneNoisValid() {
//            UserRegistration input = new UserRegistration();
//            String actualresult = input.validMobileNumber("91 88303164445");
//            Assertions.assertEquals("Phone number is Valid", actualresult);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnPasswordisValid() {
//           UserRegistration input = new UserRegistration();
//           String actualresult = input.validPassword("BridgeLabz@12");
//           Assertions.assertEquals("Password is Valid", actualresult);
    }

    @Test
    public void givenFirstname_WhenNull_ShouldReturnEnteredInvalidName() throws UserRegistrationException {
        UserRegistration input = new UserRegistration(null);
        try {
            String actualresult = input.validFirstName();
            Assertions.assertEquals("First Name is Valid", actualresult);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }
}