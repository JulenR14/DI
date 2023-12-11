package com.example.examendi_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.ViewHolder>{

    List<Hotel> listaHoteles;

    public HotelsAdapter(List<Hotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView nombreHotel;
        private TextView direccion;
        private Button favorito;

        public ViewHolder(View itemView) {
            super(itemView);

            this.imageView = itemView.findViewById(R.id.imageView);
            this.nombreHotel = itemView.findViewById(R.id.nombre);
            this.direccion = itemView.findViewById(R.id.ubicacion);
            this.favorito = itemView.findViewById(R.id.favorito);
        }
    }
    @NonNull
    @Override
    public HotelsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hotel, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelsAdapter.ViewHolder holder, int position) {

        Hotel hotel = listaHoteles.get(position);
        holder.imageView.setImageResource(hotel.getImagen());
        holder.nombreHotel.setText(hotel.getNombre());
        holder.direccion.setText(hotel.getUbicacion());

        holder.favorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Se ha añadido "+hotel.getNombre()+" a favoritos", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaHoteles != null ? listaHoteles.size() : 0;
    }
}
