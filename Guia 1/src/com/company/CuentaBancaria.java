package com.company;

public class CuentaBancaria {

    private int id;
    private String nombre;
    private float balance;

    public CuentaBancaria (int id, String nombre, float balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float creditoCuenta (float cantidad) {
        this.balance = this.balance + cantidad;
        return this.balance;
    }

    public float debitoCuenta (float cantidad) {

        if (this.balance < cantidad) {
            mensajeErrorSustraccion();
        } else {
            this.balance = this.balance - cantidad;
        }

        return this.balance;
    }

    public void mensajeErrorSustraccion () {
        System.out.println("\nUsted está intentando extraer más dinero del que tiene disponible!");
    }

    public void imprimirBalance () {
        System.out.println("\nBalance[id=" + id + ", Nombre=" + nombre + ", Balance=" + balance + "]");
    }
}
