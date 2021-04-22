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
    }
}
