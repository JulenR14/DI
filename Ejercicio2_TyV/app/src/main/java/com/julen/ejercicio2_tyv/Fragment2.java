package com.julen.ejercicio2_tyv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el fragmento 2 de la aplicación
 * @author Julen Redondo Perez
 * @version 1.0
 */
public class Fragment2 extends Fragment {

    public Fragment2() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Card> imagenes = new ArrayList<Card>(){{
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

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewHome);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        CardAdapter adaptador = new CardAdapter(imagenes);

        recyclerView.setAdapter(adaptador);

    }
}
