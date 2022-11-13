package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OTP_new_password extends AppCompatActivity {

    ImageButton Confirm_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_new_password);

        Confirm_btn = (ImageButton) findViewById(R.id.imageButton6);

        Confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(OTP_new_password.this, Login.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}