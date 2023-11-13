package com.example.ejercicio1_di;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class ItemAbout {

    private int imagen;
    private String nombre;
    private String year;

    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getYear() {
        return year;
    }

    public ItemAbout(String nombre, String year, int imagen){
        this.imagen = imagen;
        this.nombre = nombre;
        this.year = year;
    }
}
