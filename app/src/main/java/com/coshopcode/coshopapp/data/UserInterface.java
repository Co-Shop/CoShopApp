package com.coshopcode.coshopapp.data;

import org.json.JSONException;

public interface UserInterface
{
    void registerUser(String username, String email, String password, boolean emailHidden, boolean newsLetter) throws JSONException;

    void loginUser(String email, String password);

    void logoutUser();

    void updatePassword(String password);
}
