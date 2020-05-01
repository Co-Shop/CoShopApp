package com.coshopcode.coshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    TextView title = findViewById(R.id.title);
    CircleImageView imageView = findViewById(R.id.circleImageView);
    TextView tagline = findViewById(R.id.tagline);
    Button startingSignupButton = findViewById(R.id.startingSignup);
    Button startingLoginButton = findViewById(R.id.startinglogin);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickStartingSignupButton(View view)
    {
        //TODO: Move the Activity to the SignUp Page upon Login
    }

    public void onClickStartingLoginButton(View view)
    {
        //TODO: Transfer to the Login Page.
    }


}
