package com.example.practica5_di;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageViewHolder>{
    private List<Integer> imagenes;
    private Context context;

    public ImageAdapter(List<Integer> imagenes, Context context) {
        this.imagenes = imagenes;
        this.context = context;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.imagen, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        int imagen = imagenes.get(position);
        holder.imagenview.setImageResource(imagen);
        holder.imagenview.setOnClickListener(view ->
                Toast.makeText(context, "PRUEBA", Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
