package com.coshopcode.coshopapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        progressBar.setVisibility(View.INVISIBLE);
        mFirebaseAuth = FirebaseAuth.getInstance();
        if(mFirebaseAuth.getCurrentUser() != null)
        {
            finish();
        }
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
        mFirebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task)
            {
                progressBar.setVisibility(View.GONE);
                if(task.isSuccessful())
                {
                    mFirebaseAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task)
                        {
                            if(task.isSuccessful())
                            {
                                Toast.makeText(SignUpActivity.this, "Registration has been successful.", Toast.LENGTH_LONG).show();
                                emailText.setText("");
                                signUpPasswordText.setText("");
                                signUpConfirmPasswordText.setText("");
                            }

                            else
                            {
                                Toast.makeText(SignUpActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            }


                        }
                    });
                }

            }
        });



    }
}
