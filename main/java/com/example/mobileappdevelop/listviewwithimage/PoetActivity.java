package com.example.mobileappdevelop.listviewwithimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class PoetActivity extends AppCompatActivity {

    TextView textViewName, textViewCountry, textViewDistrict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poet);

        textViewName = (TextView) findViewById(R.id.TextViewName);
        textViewCountry = (TextView) findViewById(R.id.TextViewCountry);
        textViewDistrict = (TextView) findViewById(R.id.TextViewDistrict);

        String name = getIntent().getStringExtra("name");
        String country = getIntent().getStringExtra("country");
        String district = getIntent().getStringExtra("district");



        textViewName.setText(name);
        textViewCountry.setText(country);
        textViewDistrict.setText(district);
    }
}
