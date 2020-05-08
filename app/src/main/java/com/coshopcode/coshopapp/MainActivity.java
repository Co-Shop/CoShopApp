package com.coshopcode.coshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
   @BindView(R.id.tagline) TextView tagline;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Fixing the Tagline textview
        tagline.setElegantTextHeight(true);
        tagline.setSingleLine(false);


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
