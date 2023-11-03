package com.example.ejercicio1_di;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jugar = findViewById(R.id.button);
        Button jugador = findViewById(R.id.button2);
        Button preferencias = findViewById(R.id.button3);

        jugador.setOnClickListener(v -> {
            Intent i = new Intent(this, NewPlayer.class);
            startActivity(i);
        });

        preferencias.setOnClickListener(v -> {
            Intent i = new Intent(this, Preferencias.class);
            startActivity(i);
        });

        jugar.setOnClickListener(v -> {
            Intent i = new Intent(this, Play.class);
            startActivity(i);
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.action_buscar){
            Toast.makeText(this, "Busqueda", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}