package com.example.ejercicio1_di;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        List<ItemAbout> aboutData = new ArrayList<>();
        aboutData.add(new ItemAbout("Julen Redondo", "2015", R.drawable.image1));
        aboutData.add(new ItemAbout("María Mata", "256", R.drawable.image2));
        aboutData.add(new ItemAbout("Antonio Sanz", "1999", R.drawable.image3));
        aboutData.add(new ItemAbout("Carlos", "2563", R.drawable.image4));
        aboutData.add(new ItemAbout("Berta", "1111", R.drawable.image5));
        aboutData.add(new ItemAbout("Héctor Campos", "615", R.drawable.image6));
        aboutData.add(new ItemAbout("Ismael", "1586", R.drawable.image7));
        aboutData.add(new ItemAbout("Pedro", "1997", R.drawable.image8));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView reciclerView = findViewById(R.id.reciclerViewAbout);
        reciclerView.setLayoutManager(layoutManager);

        AboutAdapter adapter = new AboutAdapter(aboutData, this);

        reciclerView.setAdapter(adapter);
    }
}