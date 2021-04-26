package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Punto 1

        JOptionPane.showMessageDialog(null, "Ejercicio 1");

        var cilindro1 = new Cilindro();

        JOptionPane.showMessageDialog(null, cilindro1);
        JOptionPane.showMessageDialog(null, "Radio: " + cilindro1.getRadio());
        JOptionPane.showMessageDialog(null, "Altura: " + cilindro1.getAltura());
        JOptionPane.showMessageDialog(null, "Area: " + cilindro1.calcularArea());
        JOptionPane.showMessageDialog(null, "Volumen: " + cilindro1.calcularVolumen());

        var cilindro2 = new Cilindro(5.8, 15.7);

        JOptionPane.showMessageDialog(null, cilindro2);
        JOptionPane.showMessageDialog(null, "Radio: " + cilindro2.getRadio());
        JOptionPane.showMessageDialog(null, "Altura: " + cilindro2.getAltura());
        JOptionPane.showMessageDialog(null, "Area: " + cilindro2.calcularArea());
        JOptionPane.showMessageDialog(null, "Volumen: " + cilindro2.calcularVolumen());

        // Punto 2

        JOptionPane.showMessageDialog(null, "Ejercicio 2");

        var toma = new Estudiante(38596481, "Toma", "Lindback", "tlindback0@nymag.com", "1543 Fuller Street", 2001, 4500, "TUP");
        var hurley = new Estudiante(22663067, "Hurley", "MacKettrick", "hmackettrick1@sitemeter.com", "5 Loeprich Junction", 1997, 4500, "TUP");
        var orbadiah = new Estudiante(31210000, "Orbadiah", "Ostridge", "oostridge2@youtube.com", "9313 Farwell Terrace", 2000, 5800, "TUSI");
        var ardath = new Estudiante(16425641, "Ardath", "Jager", "ajager3@over-blog.com", "4048 La Follette Plaza", 1999, 5800, "TUSI");
        var rector = new Staff(41212102, "Rene", "Brundell", "rbrundell4@woothemes.com", "71098 Merry Trail", 75000, "Tarde");
        var administrativo = new Staff(19452870, "Reuven", "Barenski", "rbarenski5@mtv.com", "1956 Acker Place", 30000, "Maniana");
        var profesor = new Staff(19837315, "Damien", "Clucas", "dclucas6@admin.ch", "531 Messerschmidt Junction", 47000, "Tarde");
        var profesor2 = new Staff(16449874, "Syman", "Offener", "soffener7@go.com", "7 Lien Plaza", 47000, "Maniana");

        var institucion = new Persona[10];
        
        institucion[0] = toma;
        institucion[1] = hurley;
        institucion[2] = orbadiah;
        institucion[3] = ardath;
        institucion[4] = rector;
        institucion[5] = administrativo;
        institucion[6] = profesor;
        institucion[7] = profesor2;
        
        int contadorEstudiantes = 0;
        int contadorStaff = 0;

        for (Persona persona : institucion) {
            if (persona != null) {
                if (persona instanceof Estudiante) contadorEstudiantes++;
                if (persona instanceof Staff) contadorStaff++;
            }
        }

        JOptionPane.showMessageDialog(null, "En la institucion hay " + contadorEstudiantes + " estudiantes.");
        JOptionPane.showMessageDialog(null, "En la institucion hay " + contadorStaff + " miembros del staff.");

        double totalCuota = 0.0;

        for (Persona persona : institucion) {
            if (persona != null) {
                if (persona instanceof Estudiante) totalCuota += ((Estudiante) persona).getCoutaMensual();
            }
        }

        JOptionPane.showMessageDialog(null, "Total de ingresos por cuotas de estudiantes: " + totalCuota);

        // Punto 3

        JOptionPane.showMessageDialog(null, "Ejercicio 3");

        var circulo = new ACirculo("Rojo", 30.7);
        var rectangulo = new Rectangulo("Azul", 10.8, 20.9);
        var cuadrado = new Cuadrado("Verde", 8.9);

        JOptionPane.showMessageDialog(null, circulo);
        JOptionPane.showMessageDialog(null, rectangulo);
        JOptionPane.showMessageDialog(null, cuadrado);

        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        figuras[0] = circulo;
        figuras[1] = rectangulo;
        figuras[2] = cuadrado;

        for (FiguraGeometrica figu : figuras) {
            if (figu != null) {
                JOptionPane.showMessageDialog(null, "El area de la figura " + figu.getClass().getSimpleName() + " es " + figu.calcularArea());
                JOptionPane.showMessageDialog(null, "El perimetro de la figura " + figu.getClass().getSimpleName() + " es " + figu.calcularPerimetro()+ "\n");
            }
        }
    }
}
