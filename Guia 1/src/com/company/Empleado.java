package com.company;

public class Empleado {

    private String dni;
    private String nombre;
    private String apellido;
    private float salario;

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcularSalarioAnual () {
        return this.salario * 12;
    }

    public void aumentarSalario (float porcentaje) {
        this.salario = this.salario + (this.salario * (porcentaje / 100));
    }

    public void imprimirEmpleado () {
        System.out.println("Empleado[DNI=" + dni + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Salario=" + salario + "]");
    }
}