package com.coshopcode.coshopapp.data;

import com.coshopcode.coshopapp.SignUpActivity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("User Tests")
class UserTest {

    @BeforeEach
    void setUp()
    {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("The user cannot have an empty username")
    void emptyUsername()
    {
        //User user = new User(UserTest.this.getApplication());

    }

    @Test
    @DisplayName("The User cannot have an empty e-mail")
    void emptyEmail()
    {

    }

    @Test
    @DisplayName("The User cannot have an empty password")
    void emptyPassword()
    {

    }

    @Test
    @DisplayName("The User cannot have an empty confirmation password")
    void didNotEnterPasswordConfirmation()
    {

    }

    @Test
    @DisplayName("Register the User")
    void registerUser() {
    }

    @Test
    void loginUser() {
    }

    @Test
    void logoutUser() {
    }

    @Test
    void updatePassword() {
    }
}