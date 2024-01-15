package com.julen.tema5menu_ej2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_gallery#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_gallery extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

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



        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }
}