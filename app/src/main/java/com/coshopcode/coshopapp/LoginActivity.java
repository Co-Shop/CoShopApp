package com.coshopcode.coshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Initalize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onStart()
    {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }






    public void onClickSignInToSignUp(View view)
    {
        //TODO Take the User to the Sign Up Page
        //Intent intent = new Intent(SignUpActivity.class)
    }

    public void onClickSignInUser(View view)
    {
        //TODO: Sign the User using Firebase Technology

    }
}
