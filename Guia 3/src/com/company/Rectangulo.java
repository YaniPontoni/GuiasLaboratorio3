package com.company;

public class Rectangulo extends FiguraGeometrica {

    // ATRIBUTOS \\

    protected double base;
    protected double altura;

    // CONSTRUCTORES \\

    public Rectangulo() {
        this.base = 1.0;
        this.altura = 4.0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // GETTERS Y SETTERS \\

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // METODOS \\

    @Override
    public double calcularArea() {
        return (this.base * this.altura);
    }

    @Override
    public double calcularPerimetro() {
        return (2 * (this.base + this.altura));
    }

    @Override
    public String toString() {
        return "Rectangulo [" +
                "Color: '" + color + '\'' +
                ", Base: " + base +
                ", Altura: " + altura +
                ']';
    }
}