package com.julen.ejercicio2_tyv;

/**
 * Clase que representa una carta con una imagen y un título
 * @author Julen Redondo Perez
 * @version 1.0
 * @see CardAdapter
 */
public class Card {

    private int imagen;
    private String titulo;

    public Card(int imagen, String titulo){
        this.imagen = imagen;
        this.titulo = titulo;
    }

    public int getImagen(){
        return imagen;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setImagen(int imagen){
        this.imagen = imagen;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

}
