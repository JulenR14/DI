package com.example.ejercicio1_di;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AboutViewHolder extends RecyclerView.ViewHolder{

    protected ImageView imageview;
    protected TextView nameview;
    protected TextView yearview;
    protected LinearLayout layout;


    public ImageView getImageview() {
        return imageview;
    }

    public TextView getNameview() {
        return nameview;
    }

    public TextView getYearview() {
        return yearview;
    }

    public AboutViewHolder(@NonNull View itemView) {
        super(itemView);

        imageview = itemView.findViewById(R.id.imagenAbout);
        nameview = itemView.findViewById(R.id.nombreAbout);
        yearview = itemView.findViewById(R.id.yearAbout);
        layout = itemView.findViewById(R.id.layoutAbout);
    }
}
