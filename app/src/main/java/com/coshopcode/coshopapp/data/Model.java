package com.coshopcode.coshopapp.data;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;


public class Model implements UserInterface
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
        //TODO: Create a JSON Object

        //TODO: Check if any of the values are null or in anyway lacking.

        //TODO: Send the JSON Object to the URL

        //TODO: Look at the Volume

        //TODO: Let the user know that user has been accepted.


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
