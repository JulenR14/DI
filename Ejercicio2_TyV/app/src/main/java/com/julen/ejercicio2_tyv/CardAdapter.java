package com.julen.ejercicio2_tyv;

import android.app.Activity;
import android.content.Context;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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

        Context context = holder.itemView.getContext();


        holder.imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Activity activity = (Activity) context;
                ActionMode actionMode = activity.startActionMode(new ActionMode.Callback() {
                    @Override
                    public boolean onCreateActionMode(ActionMode mode, android.view.Menu menu) {
                        return true;
                    }

                    @Override
                    public boolean onPrepareActionMode(ActionMode mode, android.view.Menu menu) {
                        return false;
                    }

                    @Override
                    public boolean onActionItemClicked(ActionMode mode, android.view.MenuItem item) {
                        return false;
                    }

                    @Override
                    public void onDestroyActionMode(ActionMode mode) {

                    }
                });
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.cards.size();
    }
}
