package com.example.ejercicio1_di;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jugador = findViewById(R.id.button2);

        jugador.setOnClickListener(v -> {

            Intent i = new Intent(this, NewPlayer.class);
            startActivity(i);
        });
    }
}