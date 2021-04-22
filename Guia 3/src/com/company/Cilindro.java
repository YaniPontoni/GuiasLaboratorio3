package com.company;

public class Cilindro extends Circulo {

    // ATRIBUTOS \\

    private double altura = 1.0;

    // CONSTRUCTORES \\

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, String color) {
        super(radio, color);
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    // GETTERS Y SETTERS \\

    public double getAltura () {
        return altura;
    }

    // METODOS \\

    @Override
    public double calcularArea() {
        return ((2 * Math.PI * super.getRadio() * this.altura) + (2 * super.calcularArea()));
    }

    public double calcularVolumen() {
        return super.calcularArea() * this.altura;
    }

    @Override
    public String toString() {
        return "Cilindro [" +
                "Subclase de: " + super.toString() +
                " Altura: " + altura +
                ']';
    }
}
