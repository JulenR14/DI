package com.julen.tema5menu_ej2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{

    private List<Card> cards;

    public static class CardViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView titulo;
        public CardViewHolder(View v) {
            super(v);
            imagen = v.findViewById(R.id.item_imagen);
            titulo = v.findViewById(R.id.nombreCard);
        }

        public void bindCard(Card card){
            imagen.setImageResource(card.getImagen());
            titulo.setText(card.getTitulo());
        }
    }

    public CardAdapter(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, parent, false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.bindCard(cards.get(position));
    }

    @Override
    public int getItemCount() {
        return this.cards.size();
    }
}
