package com.example.ejercicio1_di;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Plataformas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generos);
       List<String> generos = new ArrayList<String>(){{
            add("Accion");
            add("Aventuras");
            add("Deportes");
            add("Estrategia");
            add("Rol");
            add("Simulacion");
            add("Terror");
            add("Gracia");
            add("Comedia");
            add("Otros");
        }};

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView reciclerView = findViewById(R.id.reciclerView);
        reciclerView.setLayoutManager(layoutManager);

        GenerosAdapter adapter = new GenerosAdapter(generos, this);

        reciclerView.setAdapter(adapter);


    }
}