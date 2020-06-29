package com.coshopcode.coshopapp.data;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


public class Model implements API
{
    public static final String BASE_URL = "http://api.coshop.org/";

    private RequestQueue mRequestQueue;
    private Application mApplication;

    public Model(Application application)
    {
        mApplication = application;
        mRequestQueue = Volley.newRequestQueue(application);
    }

    @Override
    public void registerUser(String username, String email, String password, boolean emailHidden, boolean newsLetter)
    {



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
