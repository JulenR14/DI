package com.julen.ejercicio2_tyv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * Clase que representa el fragmento 1 de la aplicación
 * @author Julen Redondo Perez
 * @version 1.0
 */
public class Fragment1 extends Fragment {
    public Fragment1() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }
}
