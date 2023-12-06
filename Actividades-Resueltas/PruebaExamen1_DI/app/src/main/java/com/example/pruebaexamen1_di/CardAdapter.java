package com.example.pruebaexamen1_di;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{
private List<Card> datos;

    public static class CardViewHolder extends RecyclerView.ViewHolder{
        private ImageView imagen;

        public CardViewHolder(View itemView){
            super(itemView);
            imagen = itemView.findViewById(R.id.item_imagen);
        }

        public void bindCard(Card c){
            imagen.setImageResource(c.getImagen());
        }
    }

    public CardAdapter(List<Card> datos){
        this.datos = datos;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position){
        holder.bindCard(datos.get(position));
    }

    @Override
    public int getItemCount(){
        return datos.size();
    }
}
