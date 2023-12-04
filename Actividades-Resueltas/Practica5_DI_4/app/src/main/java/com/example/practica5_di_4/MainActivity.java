package com.example.practica5_di_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> productos = new ArrayList<>();
        productos.add(new Product(R.drawable.images, "Galleta Style"));
        productos.add(new Product(R.drawable.images1, "Galletas rosas"));
        productos.add(new Product(R.drawable.images2, "Pasteles"));
        productos.add(new Product(R.drawable.images3, "Magdalenas"));
        productos.add(new Product(R.drawable.images4, "Cafe especial"));
        productos.add(new Product(R.drawable.images5, "Capuchino"));
        productos.add(new Product(R.drawable.images6, "Coca"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CardAdapter cardAdapter = new CardAdapter(productos);

        recyclerView.setAdapter(cardAdapter);

        //recyclerView.setAdapter(new CardAdapter(productos));

    }
}