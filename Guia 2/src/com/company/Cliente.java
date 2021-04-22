package com.company;

import java.util.UUID;

public class Cliente {

    private UUID id;
    private String nombre;
    private String email;
    private double descuento;

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public double getDescuento() {
        return descuento;
    }

    public Cliente(String nombre, String email, double descuento) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return " \n[" +
                "ID: " + id +
                ", Nombre: '" + nombre + '\'' +
                ", Email: '" + email + '\'' +
                ", Descuento: " + descuento +
                ']';
    }
}