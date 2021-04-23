package com.company;

public class Estudiante extends Persona {

    // ATRIBUTOS \\

    private int anioDeIngreso;
    private double coutaMensual;
    private String carrera;

    // CONSTRUCTORES \\

    public Estudiante(int dni, String nombre, String apellido, String email, String direccion, int anioDeIngreso, double coutaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioDeIngreso = anioDeIngreso;
        this.coutaMensual = coutaMensual;
        this.carrera = carrera;
    }

    // GETTERS Y SETTERS

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public double getCoutaMensual() {
        return coutaMensual;
    }

    public void setCoutaMensual(double coutaMensual) {
        this.coutaMensual = coutaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // METODOS \\

    @Override
    public String toString() {
        return "Estudiante [" +
                "Anio de ingreso: " + anioDeIngreso +
                ", Couta mensual: " + coutaMensual +
                ", Carrera: '" + carrera + '\'' +
                ", DNI: " + dni +
                ", Nombre: '" + nombre + '\'' +
                ", Apellido: '" + apellido + '\'' +
                ", Email: '" + email + '\'' +
                ", Direccion: '" + direccion + '\'' +
                ']';
    }
}