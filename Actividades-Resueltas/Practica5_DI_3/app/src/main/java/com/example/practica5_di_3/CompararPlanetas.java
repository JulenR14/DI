package com.example.practica5_di_3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica5_di_3.databinding.CompararPlanetasBinding;

import java.util.ArrayList;
import java.util.List;

public class CompararPlanetas extends AppCompatActivity {

    CompararPlanetasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = CompararPlanetasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Planeta> listaPlanetas = new ArrayList<>();
        listaPlanetas.add(new Planeta("Mercurio", 0.382, 57.9, 5.43));
        listaPlanetas.add(new Planeta("Venus", 0.949, 108.2, 5.24));
        listaPlanetas.add(new Planeta("Tierra", 1, 149.6, 5.52));
        listaPlanetas.add(new Planeta("Marte", 0.53, 227.9, 3.94));
        listaPlanetas.add(new Planeta("Jupiter", 11.2, 778.6, 1.33));
        listaPlanetas.add(new Planeta("Saturno", 9.41, 1433.5, 0.69));
        listaPlanetas.add(new Planeta("Urano", 3.38, 2872.5, 1.27));
        listaPlanetas.add(new Planeta("Neptuno", 3.81, 4495.1, 1.64));
        listaPlanetas.add(new Planeta("Pluton", 0, 5906.4, 2.03));
        ArrayAdapter<Planeta> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, listaPlanetas);

        binding.autoCompleteTextViewPlaneta1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Planeta planeta = (Planeta) parent.getItemAtPosition(position);
                binding.diametro1.setText(String.valueOf(planeta.getDiametro()));
                binding.distancia1.setText(String.valueOf(planeta.getDistanciaSol()));
                binding.densidad1.setText(String.valueOf(planeta.getDensidad()));
            }
        });

        binding.autoCompleteTextViewPlaneta2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Planeta planeta = (Planeta) parent.getItemAtPosition(position);
                binding.diametro2.setText(String.valueOf(planeta.getDiametro()));
                binding.distancia2.setText(String.valueOf(planeta.getDistanciaSol()));
                binding.densidad2.setText(String.valueOf(planeta.getDensidad()));
            }
        });
    }
}
