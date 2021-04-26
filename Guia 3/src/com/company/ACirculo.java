package com.company;

public class ACirculo extends FiguraGeometrica {

    // ATRIBUTOS \\

    private double radio;

    // CONSTRUCTORES \\

    public ACirculo() {
        this.radio = 1.0;
    }

    public ACirculo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // GETTERS Y SETTERS \\

    public double getRadio() {
        return radio;
    }

    // METODOS \\

    @Override
    public double calcularArea() {
        return (Math.PI * Math.pow(this.radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (2 * Math.PI * this.radio);
    }

    @Override
    public String toString() {
        return "Circulo [" +
                "Radio: " + radio +
                ", Color: '" + color + '\'' +
                ']';
    }
}
