package com.example.ejercicio1_di;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GenerosViewHolder extends RecyclerView.ViewHolder {
    protected TextView textView;

    public GenerosViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.textoGenero);
    }


}
