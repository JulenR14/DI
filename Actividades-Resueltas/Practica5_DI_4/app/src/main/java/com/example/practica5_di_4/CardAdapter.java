package com.example.practica5_di_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{
    private List<Product> datos;
    public CardAdapter(List<Product> datos) {
        this.datos = datos;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        protected ImageView imagen;
        protected RatingBar valoracion;
        protected TextView textValoracion;
        protected TextView nombre;
        public CardViewHolder(View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imageView);
            valoracion = itemView.findViewById(R.id.ratingBar);
            nombre = itemView.findViewById(R.id.textViewNombre);
            textValoracion = itemView.findViewById(R.id.textViewValoracion);
        }
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Product product = datos.get(position);
        holder.imagen.setImageResource(product.getImagen());
        holder.nombre.setText(product.getNombre());
        holder.valoracion.setRating((float) product.getValoracion());

        holder.valoracion.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float valor, boolean fromUser) {
                product.setValoracion(valor);
                holder.textValoracion.setText(String.valueOf(product.getValoracion()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
