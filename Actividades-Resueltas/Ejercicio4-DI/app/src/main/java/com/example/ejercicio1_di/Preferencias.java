package com.example.ejercicio1_di;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Preferencias extends AppCompatActivity {

    String textoRadioButon = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        SeekBar seekBar = findViewById(R.id.seekBar);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) FloatingActionButton fab = findViewById(R.id.fab);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                int indiceRadioButon = radioGroup.indexOfChild(findViewById(checkedId));
                switch (indiceRadioButon) {
                    case 0:
                        textoRadioButon = "Angry Birds";
                        break;
                    case 1:
                        textoRadioButon = "Dragon Fly";
                        break;
                    case 2:
                        textoRadioButon = "Hill Climbing Racing";
                        break;
                    case 3:
                        textoRadioButon = "Pocket Soccer";
                        break;
                    case 4:
                        textoRadioButon = "Radiant Defense";
                        break;
                }
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                seekBar.setProgress((int) rating);
            }
        });

        seekBar.setMax(5);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ratingBar.setRating(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textoRadioButon.equals("") && ratingBar.getRating()==0 && seekBar.getProgress()==0){
                    Toast.makeText(Preferencias.this, "No has pulsado ninguna opción.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Preferencias.this, "Juego : "+ textoRadioButon +" - Valoración: " + ratingBar.getRating(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}