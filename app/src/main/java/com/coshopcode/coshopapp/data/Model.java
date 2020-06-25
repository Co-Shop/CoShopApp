package com.coshopcode.coshopapp.data;

import com.android.volley.RequestQueue;
import com.google.android.gms.common.api.Api;


public class Model implements API
{
    public static final String BASE_URL = "http://api.coshop.org/";

    private RequestQueue requestQueue;

    @Override
    public void registerUser(String email, String password) {

    }

    @Override
    public void loginUser(String email, String password) {

    }

    @Override
    public void logoutUser() {

    }

    @Override
    public void updatePassword(String password) {

    }
}
