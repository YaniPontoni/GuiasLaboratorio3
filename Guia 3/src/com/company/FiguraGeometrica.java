package com.company;

public abstract class FiguraGeometrica {

    // ATRIBUTOS \\

    protected String color = "Verde";

    // CONSTRUCTORES \\

    public FiguraGeometrica() {

    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    // GETTERS Y SETTERS \\

    public String getColor() {
        return color;
    }

    // METODOS \\

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura Geometrica [" +
                "Color: '" + color + '\'' +
                ']';
    }
}
