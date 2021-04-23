package com.company;

public class Staff extends Persona {

    // ATRIBUTOS \\

    private double salario;
    private String turno;

    // CONSTRUCTOR \\

    public Staff(int dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    // GETTERS Y SETTERS

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double salarioAnual () {
        return this.salario * 12;
    }

    // METODOS \\

    @Override
    public String toString() {
        return "Staff [" +
                "DNI: " + dni +
                ", Nombre: '" + nombre + '\'' +
                ", Apellido: '" + apellido + '\'' +
                ", Email: '" + email + '\'' +
                ", Direccion: '" + direccion + '\'' +
                ", Salario: " + salario +
                ", Turno: '" + turno + '\'' +
                ']';
    }
}