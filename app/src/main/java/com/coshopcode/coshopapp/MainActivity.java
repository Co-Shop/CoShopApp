package com.coshopcode.coshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
   TextView tagline= findViewById(R.id.tagline);
   String URL = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fixing the Tagline textview
        tagline.setElegantTextHeight(true);
        tagline.setSingleLine(false);

        //FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        //FirebaseUser user = firebaseAuth.getCurrentUser();

        /*if(user != null && user.isEmailVerified())
        {
            //TODO: Take the User Straight to the HomeActivity page
        }*/


    }

    private void ConnectToTheInternet()
    {

    }

    public void onClickStartingSignupButton(View view)
    {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    public void onClickStartingLoginButton(View view)
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


}
