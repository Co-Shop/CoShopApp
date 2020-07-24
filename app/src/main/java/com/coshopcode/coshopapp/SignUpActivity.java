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
import android.widget.TextView;
import android.widget.Toast;

import com.coshopcode.coshopapp.data.User;
import com.google.firebase.auth.FirebaseAuth;

import org.json.JSONException;

public class SignUpActivity extends AppCompatActivity
{
    private FirebaseAuth mFirebaseAuth;
    EditText userNameText = findViewById(R.id.username);
    EditText emailText = findViewById(R.id.emailEntry);
    EditText signUpPasswordText = findViewById(R.id.signupPassword);
    EditText signUpConfirmPasswordText = findViewById(R.id.signUpPasswordConfirm);
    CheckBox hideEmailCheckBox = findViewById(R.id.hideEmail);
    CheckBox newsletterCheckBox = findViewById(R.id.newsletter);
    ProgressBar progressBar = findViewById(R.id.signUpProgressBar);
    ConnectivityManager connectivityManager;
    String baseURL = "http://api.coshop.org/";
    TextView PasswordsDontMatch = findViewById(R.id.passwordCheck);
    TextView UsernameExists = findViewById(R.id.usernameCheck);
    TextView EmailExists = findViewById(R.id.emailCheck);


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


    public void onClickRegisterUser(View view) throws JSONException {
        String userName = userNameText.getText().toString();
        String email = emailText.getText().toString();
        String password = signUpPasswordText.getText().toString();
        String confirmPassword = signUpConfirmPasswordText.getText().toString();
        boolean hideEmail = hideEmailCheckBox.isChecked();
        boolean newsletter = newsletterCheckBox.isChecked();

        checkPasswordLength(password);


        if(isConnected())
        {
            if(!password.equals(confirmPassword))
            {
                PasswordsDontMatch.setVisibility(View.VISIBLE);
                return;
            }


            User user = new User(SignUpActivity.this.getApplication());
            user.registerUser(userName, email, password, hideEmail, newsletter);
        }







        //User model = new User();





    }

    public boolean checkIfUserNameExists()
    {
        String URL = baseURL += "/users/";


        

        return false;
    }


    private boolean isConnected()
    {
        connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkCapabilities isConnectedToInternet = connectivityManager.getNetworkCapabilities(Network.fromNetworkHandle(NetworkCapabilities.NET_CAPABILITY_INTERNET));
        return isConnectedToInternet.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
    }

    private void checkPasswordLength(String password)
    {
        if(password.length() < 8)
        {
            signUpPasswordText.setError("The password is less than character");
        }

    }



}
