package com.company;

public class ItemDeVenta {

    private int id;
    private   String descripcion;
    private int cantidad;
    private float pUnitario;

    public ItemDeVenta (int id, String descripcion, int cantidad, float pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getpUnitario() {
        return pUnitario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setpUnitario(float pUnitario) {
        this.pUnitario = pUnitario;
    }

    public float precioTotal () {
        return this.pUnitario * this.cantidad;
    }

    public void imprimirItemDeVenta () {
        System.out.println("ItemVenta[id=" + id + ", Descripción=" + descripcion + ", Cantidad=" + cantidad + ", pUnitario=" + pUnitario + ", pTotal=" + precioTotal() + "]");
    }

}
