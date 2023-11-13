package com.example.ejercicio1_di;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GenerosAdapter extends RecyclerView.Adapter<GenerosViewHolder> {

    private List<String> generos;
    private Context cont;

    public GenerosAdapter(List<String> generos, Context c){
        this.generos = generos;
        this.cont = c;
    }

    @NonNull
    @Override
    public GenerosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item, parent, false);
        return new GenerosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GenerosViewHolder holder, int position) {
        String genero = generos.get(position);
        holder.textView.setText(generos.get(position));

        holder.textView.setOnClickListener(view ->
                Toast.makeText(cont, genero, Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return generos == null ? 0 : generos.size();
    }
}
