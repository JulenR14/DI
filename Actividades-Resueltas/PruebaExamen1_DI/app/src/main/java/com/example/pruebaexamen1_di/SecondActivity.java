package com.example.pruebaexamen1_di;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_PruebaExamen1_DI_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }
}