package com.coshopcode.coshopapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import de.hdodenhof.circleimageview.CircleImageView;
import okhttp3.OkHttp;

public class MainActivity extends AppCompatActivity {
   TextView tagline= findViewById(R.id.tagline);
   String URL = "http://api.coshop.org/";

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

    ConnectivityManager.NetworkCallback callback = new ConnectivityManager.NetworkCallback()
    {
        @Override
        public void onAvailable(@NonNull Network network)
        {
            //
            // Toast.makeText(this, "Welcome to the CoshopApp", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onLost(@NonNull Network network) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("No Internet").setMessage("You need to have Internet Access in order to access this application.").setNegativeButton("I don't care, kick me out!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).setPositiveButton("Connect me to the Internet", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    try {
                        wifiManager.wait(100, 300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            });

        }
    };

    private void kickUserOut()
    {
        finish();
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
