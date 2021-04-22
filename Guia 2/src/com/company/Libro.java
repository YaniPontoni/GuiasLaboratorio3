package com.company;

import java.util.Arrays;

public class Libro {

    private String titulo;
    private float precio;
    private int stock;
    private Autor[] autores;

    public Libro(String titulo, float precio, int stock, Autor[] autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor[] getAutor() {
        return autores;
    }

    public String imprimirMensaje () {
        StringBuilder nombres = new StringBuilder();
        for (Autor autor : autores) {
            if (autor != null) {
                nombres.append(autor.getNombre());
                nombres.append(" ");
                nombres.append(autor.getApellido());
                nombres.append(", ");
            }
        }
        return "El libro, " + this.titulo + " de " + nombres + "se vende a " + this.precio + " pesos.";
    }

    @Override
    public String toString() {
        return "Libro [" +
                "Titulo: '" + titulo + '\'' +
                ", Precio: " + precio +
                ", Stock: " + stock +
                ", " + Arrays.toString(autores) +
                ']';
    }
}