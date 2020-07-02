package com.coshopcode.coshopapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.coshopcode.coshopapp.data.Model;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity
{
    private FirebaseAuth mFirebaseAuth;
    EditText emailText = findViewById(R.id.emailEntry);
    EditText signUpPasswordText = findViewById(R.id.signupPassword);
    EditText signUpConfirmPasswordText = findViewById(R.id.signUpPasswordConfirm);
    ProgressBar progressBar = findViewById(R.id.signUpProgressBar);
    String URL = "";


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
        progressBar.setVisibility(View.VISIBLE);
        final String email = emailText.getText().toString();
        final String password = signUpPasswordText.getText().toString();
        final String confirmPassword = signUpConfirmPasswordText.getText().toString();
        if(!password.equals(confirmPassword))
        {
            Toast.makeText(this, "The password and the confirmation do not match!", Toast.LENGTH_LONG);
        }

        //Model model = new Model();





    }
}
