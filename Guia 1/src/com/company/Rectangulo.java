package com.company;

public class Rectangulo {

    private float ancho=1;
    private float alto=1;

    public float getAncho() {
        return ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float calcularArea () {

        return alto * ancho;

    }

    public float calcularPerimetro () {

        return 2 * (alto + ancho);

    }
}
