package com.company;

public class Circulo {

    // ATRIBUTOS \\
    
    private double radio = 1.0;
    private String color = "Rojo";

    // CONSTRUCTORES \\

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    // GETTERS Y SETTERS \\

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    // METODOS \\

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo [" +
                "Radio: " + radio +
                ", Color: '" + color + '\'' +
                ']';
    }
}
