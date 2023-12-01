package com.example.practica5_di_2;

public class ItemSolar {
    private String nombre;
    private int imagen;

    public ItemSolar(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagen() {
        return imagen;
    }
}
