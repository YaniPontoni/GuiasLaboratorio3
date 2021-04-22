package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Punto 1

        // A
        Autor jBloch = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        JOptionPane.showMessageDialog(null, jBloch);

        // B

        Autor[] autores = new Autor[2];

        autores[0] = jBloch;

        // C
        Libro effectiveJava = new Libro("Effective Java", 450, 150, autores);

        JOptionPane.showMessageDialog(null, effectiveJava);
        // D
        //System.out.println(effectiveJava);

        // E
        effectiveJava.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Escriba la nueva cantidad del precio: ")));
        effectiveJava.setStock(Integer.parseInt(JOptionPane.showInputDialog("Escriba la nueva cantidad de stock: ")));

        // F
        JOptionPane.showMessageDialog(null, effectiveJava.toString());
        //System.out.println(effectiveJava);


        Autor bHill = new Autor("Benny", "Hill", "bennyhill@gmail.com", 'M');
        JOptionPane.showMessageDialog(null, bHill);
        //System.out.println(bHill);

        autores[1] = bHill;

        Libro effectiveJava2 = new Libro("Effective Java", 450, 150, autores);

        // G
        JOptionPane.showMessageDialog(null, effectiveJava2.imprimirMensaje());
        //System.out.println(effectiveJava2.imprimirMensaje());

        // Punto 2

        Cliente yani = new Cliente("Yani", "yani.pontoni@gmail.com", 25);
        Cliente carlos = new Cliente("Carlos", "carlitos.teves@gmail.com", 50);

        ItemDeVenta itemDeVenta1 = new ItemDeVenta("Mayonesa", "Helmanns 1 kg", 120, 7);
        ItemDeVenta itemDeVenta2 = new ItemDeVenta("Ketchup", "Fanacoa 500 grs", 87, 10);
        ItemDeVenta itemDeVenta3 = new ItemDeVenta("Mostaza", "Danica 250 grs", 69, 7);
        ItemDeVenta itemDeVenta4 = new ItemDeVenta("Cigarrillos", "Marlboro Box", 250, 20);
        ItemDeVenta itemDeVenta5 = new ItemDeVenta("Caramelos", "Media hora", 2, 100);
        ItemDeVenta itemDeVenta6 = new ItemDeVenta("Alfajor", "Shot", 40, 25);

        ItemDeVenta[] aderezos = new ItemDeVenta[3];
        ItemDeVenta[] itemsKiosko = new ItemDeVenta[3];

        aderezos[0] = itemDeVenta1;
        aderezos[1] = itemDeVenta2;
        aderezos[2] = itemDeVenta3;

        itemsKiosko[0] = itemDeVenta4;
        itemsKiosko[1] = itemDeVenta5;
        itemsKiosko[2] = itemDeVenta6;

        Factura facturaYani = new Factura(yani, aderezos);
        Factura facturaCarlos = new Factura(carlos, itemsKiosko);

        JOptionPane.showMessageDialog(null, facturaYani);
        JOptionPane.showMessageDialog(null, facturaCarlos);

        // Punto 3

        var pedro = new Titular("Pedro", 'M');
        var mariela = new Titular("Mariela", 'F');
        var alfonso = new Titular("Alfonso", 'M');
        var ximena = new Titular("Ximena", 'F');

        var cuentaPedro = new Cuenta(20000, pedro);
        var cuentaMariela = new Cuenta(50000, mariela);
        var cuentaAlfonso = new Cuenta(35000, alfonso);
        var cuentaXimena = new Cuenta(100000, ximena);

        double monto = Double.parseDouble(JOptionPane.showInputDialog("Escriba el monto a depositar en la cuenta de Pedro: "));
        cuentaPedro.deposito(monto);

        monto = Double.parseDouble(JOptionPane.showInputDialog("Escriba el monto a extraer de la cuenta de Pedro: "));
        cuentaPedro.extraccion(monto);

        monto = Double.parseDouble(JOptionPane.showInputDialog("Escriba el monto a depositar en la cuenta de Mariela: "));
        cuentaMariela.deposito(monto);

        monto = Double.parseDouble(JOptionPane.showInputDialog("Escriba el monto a extraer de la cuenta de Mariela: "));
        cuentaMariela.extraccion(monto);

        monto = Double.parseDouble(JOptionPane.showInputDialog("Escriba el monto a depositar en la cuenta de Alfonso: "));
        cuentaAlfonso.deposito(monto);

        monto = Double.parseDouble(JOptionPane.showInputDialog("Escriba el monto a extraer de la cuenta de Alfonso: "));
        cuentaAlfonso.extraccion(monto);

        monto = Double.parseDouble(JOptionPane.showInputDialog("Escriba el monto a depositar en la cuenta de Ximena: "));
        cuentaXimena.deposito(monto);

        monto = Double.parseDouble(JOptionPane.showInputDialog("Escriba el monto a extraer de la cuenta de Ximena: "));
        cuentaXimena.extraccion(monto);

        JOptionPane.showMessageDialog(null,"Operaciones realizadas sobre la cuenta de " + cuentaPedro.getTitular() + ":");
        for (String ops : cuentaPedro.getOperaciones()) {
            if (ops != null) JOptionPane.showMessageDialog(null, ops);
        }

        JOptionPane.showMessageDialog(null,"Operaciones realizadas sobre la cuenta de " + cuentaMariela.getTitular() + ":");
        for (String ops : cuentaMariela.getOperaciones()) {
            if (ops != null) JOptionPane.showMessageDialog(null, ops);
        }

        JOptionPane.showMessageDialog(null,"Operaciones realizadas sobre la cuenta de " + cuentaAlfonso.getTitular() + ":");
        for (String ops : cuentaAlfonso.getOperaciones()) {
            if (ops != null) JOptionPane.showMessageDialog(null, ops);
        }

        JOptionPane.showMessageDialog(null,"Operaciones realizadas sobre la cuenta de " + cuentaXimena.getTitular() + ":");
        for (String ops : cuentaXimena.getOperaciones()) {
            if (ops != null) JOptionPane.showMessageDialog(null, ops);
        }
    }
}