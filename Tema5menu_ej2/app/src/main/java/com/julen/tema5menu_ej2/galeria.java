package com.julen.tema5menu_ej2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class galeria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        List<Card> datos = new ArrayList<Card>(){{
            add(new Card(R.drawable.image1, "Imagen 1"));
            add(new Card(R.drawable.image2, "Imagen 2"));
            add(new Card(R.drawable.image3, "Imagen 3"));
            add(new Card(R.drawable.image4, "Imagen 4"));
            add(new Card(R.drawable.image5, "Imagen 5"));
            add(new Card(R.drawable.image6, "Imagen 6"));
            add(new Card(R.drawable.image7, "Imagen 7"));
            add(new Card(R.drawable.image8, "Imagen 8"));
            add(new Card(R.drawable.image9, "Imagen 9"));
        }};

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        CardAdapter adaptador = new CardAdapter(datos);

        recyclerView.setAdapter(adaptador);

    }
}