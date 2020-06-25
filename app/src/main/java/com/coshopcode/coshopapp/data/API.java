package com.coshopcode.coshopapp.data;

public interface API
{
    void registerUser(String email, String password);

    void loginUser(String email, String password);

    void logoutUser();

    void updatePassword(String password);


}
