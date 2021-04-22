package com.company;

import java.util.UUID;

public class Titular {

    private UUID id;
    private String nombre;
    private char genero;

    public Titular(String nombre, char genero) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Titular [" +
                "ID: " + id +
                ", Nombre: '" + nombre + '\'' +
                ", Genero: " + genero +
                ']';
    }
}