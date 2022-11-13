package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Weather extends AppCompatActivity {

    ImageButton Burger_Weather;
    ImageButton Weather_single;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        Burger_Weather = (ImageButton) findViewById(R.id.burger_btn_weather);

        Burger_Weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Weather.this, Burger_Menu.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Weather_single = (ImageButton) findViewById(R.id.imageButton28);

        Weather_single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Weather.this, Weather_single_page.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}