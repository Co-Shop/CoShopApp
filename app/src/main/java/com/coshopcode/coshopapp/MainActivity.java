package com.coshopcode.coshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import de.hdodenhof.circleimageview.CircleImageView;
import okhttp3.OkHttp;

public class MainActivity extends AppCompatActivity {
   TextView tagline= findViewById(R.id.tagline);
   String URL = "http://api.coshop.org/";
   //TODO: Add the URL and use the Rest API to Log In and Register.
   private ConnectivityManager cManager;
   private ConnectivityManager.NetworkCallback mCallback;
   private AlertDialog mDialog;



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
       if(isNetworkAvailable())
       {

       }
       else
       {

       }

    }

    private boolean isNetworkAvailable()
    {
        cManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cManager.isDefaultNetworkActive();
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
