package com.example.ejercicio1_di;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Preferencias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        RatingBar ratingBar = findViewById(R.id.ratingBar);
        SeekBar seekBar = findViewById(R.id.seekBar);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) FloatingActionButton fab = findViewById(R.id.fab);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                //Método llamado cuando se llama el progreso de la RatingBar
            }
        });
        
    }
}