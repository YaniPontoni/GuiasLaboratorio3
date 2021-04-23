package com.company;

public class Persona {

    // ATRIBUTOS \\

    protected int dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String direccion;

    // CONSTRUCTORES \\

    public Persona() {
    }

    public Persona(int dni, String nombre, String apellido, String email, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }

    // GETTERS Y SETTERS \\

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // METODOS \\

    @Override
    public String toString() {
        return "Persona [" +
                "DNI: " + dni +
                ", Nombre: '" + nombre + '\'' +
                ", Apellido: '" + apellido + '\'' +
                ", Email: '" + email + '\'' +
                ", Direccion: '" + direccion + '\'' +
                ']';
    }
}