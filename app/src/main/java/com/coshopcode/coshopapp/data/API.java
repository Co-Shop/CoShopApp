package com.coshopcode.coshopapp.data;

public interface API
{
    void registerUser(String username, String email, String password, boolean emailHidden, boolean newsLetter);

    void loginUser(String email, String password);

    void logoutUser();

    void updatePassword(String password);



}
