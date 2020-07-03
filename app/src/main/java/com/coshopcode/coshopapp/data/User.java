package com.coshopcode.coshopapp.data;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


public class User implements UserInterface
{
    public static final String BASE_URL = "http://api.coshop.org/";

    private RequestQueue mRequestQueue;
    private Application mApplication;

    public User(Application application)
    {
        mApplication = application;
        mRequestQueue = Volley.newRequestQueue(application);
    }

    @Override
    public void registerUser(String username, String email, String password, boolean emailHidden, boolean newsLetter) throws JSONException {
        //TODO: Create a JSON Object


        //Creating the JSON Object based on the API Specifications.
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Username", username);
        jsonObject.put("Email", email);
        jsonObject.put("Password", password);
        jsonObject.put("EmailHidden", emailHidden);
        jsonObject.put("Newsletter", newsLetter);


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
