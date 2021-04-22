package com.company;

import java.util.UUID;

public class ItemDeVenta {

    private UUID id;
    private String nombre;
    private String descripcion;
    private double pUnitario;
    private int cantidad;

    public ItemDeVenta(String nombre, String descripcion, double pUnitario, int cantidad) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pUnitario = pUnitario;
        this.cantidad = cantidad;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return pUnitario * cantidad;
    }

    @Override
    public String toString() {
        return "  \n[" +
                "ID: " + id +
                ", Nombre: '" + nombre + '\'' +
                ", Descripcion: '" + descripcion + '\'' +
                ", Precio unitario: " + pUnitario +
                ", Cantidad: " + cantidad +
                ']';
    }
}