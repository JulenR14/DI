package com.example.ejercicio1_di;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GenerosAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<String> generos;
    private Context cont;

    public GenerosAdapter(ArrayList<String> generos, Context c){
        this.generos = generos;
        this.cont = c;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.generos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String genero = generos.get(position);
        holder.textView.setText(genero);

        holder.textView.setOnClickListener(view ->
                Toast.makeText(cont, genero, Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return generos == null ? 0 : generos.size();
    }
}
