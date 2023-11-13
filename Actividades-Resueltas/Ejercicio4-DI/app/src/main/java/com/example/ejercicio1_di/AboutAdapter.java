package com.example.ejercicio1_di;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AboutAdapter extends RecyclerView.Adapter<AboutViewHolder>{

    private List<ItemAbout> aboutData;
    private Context context;

    public AboutAdapter(List<ItemAbout> aboutData, Context context) {
        this.aboutData = aboutData;
        this.context = context;
    }

    @NonNull
    @Override
    public AboutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_about, parent, false);
        return new AboutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AboutViewHolder holder, int position) {
        ItemAbout item = aboutData.get(position);
        holder.nameview.setText(aboutData.get(position).getNombre());
        holder.yearview.setText(aboutData.get(position).getYear());
        holder.imageview.setImageResource(aboutData.get(position).getImagen());
        holder.layout.setOnClickListener(view ->
                Toast.makeText(context, item.getNombre(), Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return aboutData == null ? 0 : aboutData.size();
    }
}
