package com.example.ejercicio1_di;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Plataformas extends AppCompatActivity {

    private ArrayList<String> generos = new ArrayList<String>(){{
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
    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plataformas);


    }
}