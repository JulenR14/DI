package com.julen.tema5menu_ej2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.julen.tema5menu_ej2.databinding.FragmentGaleriaBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link galeria#newInstance} factory method to
 * create an instance of this fragment.
 */
public class galeria extends Fragment {

    FragmentGaleriaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_galeria, container, false);
    }
}