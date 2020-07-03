package com.coshopcode.coshopapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.coshopcode.coshopapp.data.User;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity
{
    private FirebaseAuth mFirebaseAuth;
    EditText userNameText = findViewById(R.id.username);
    EditText emailText = findViewById(R.id.emailEntry);
    EditText signUpPasswordText = findViewById(R.id.signupPassword);
    EditText signUpConfirmPasswordText = findViewById(R.id.signUpPasswordConfirm);
    CheckBox hideEmail = findViewById(R.id.hideEmail);
    CheckBox newsletter = findViewById(R.id.newsletter);
    ProgressBar progressBar = findViewById(R.id.signUpProgressBar);
    ConnectivityManager connectivityManager;
    String URL = "http://api.coshop.org/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        progressBar.setVisibility(View.INVISIBLE);

    }

    public void onClickSignUpToLogIn(View view)
    {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);

    }


    public void onClickRegisterUser(View view)
    {
        if(isConnected())
        {
            //User user = new User();
        }





        //User model = new User();





    }

    private boolean isConnected()
    {
        connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkCapabilities isConnectedToInternet = connectivityManager.getNetworkCapabilities(Network.fromNetworkHandle(NetworkCapabilities.NET_CAPABILITY_INTERNET));
        return isConnectedToInternet.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
    }



}
