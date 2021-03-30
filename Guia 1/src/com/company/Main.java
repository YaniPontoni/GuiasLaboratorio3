package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Punto 1:");

        System.out.println("\nA y B) Alto y ancho inicial del rectangulo: ");

        System.out.print("\nAncho del rectangulo: " + rectangulo.getAncho());
        System.out.println("\nAlto del rectangulo: " + rectangulo.getAlto());

        System.out.println("\nC) Impresion por pantalla del area y perimetro del rectangulo: ");

        System.out.println("\nArea del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());

        rectangulo.setAlto(7);
        rectangulo.setAncho(9);

        System.out.println("\nD) Alto y ancho del rectangulo modificados: ");

        System.out.print("\nAncho del rectangulo: " + rectangulo.getAncho());
        System.out.println("\nAlto del rectangulo: " + rectangulo.getAlto());

        System.out.println("\nE) Impresion por pantalla del area y perimetro del rectangulo con sus atributos modificados: ");

        System.out.println("\nArea del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());

        Rectangulo rectangulo1 = new Rectangulo();

        System.out.println("\nF) Nuevo objeto de tipo Rectangulo inicializado con sus valores por defecto: ");

        System.out.println("\nAncho del rectangulo: " + rectangulo1.getAncho());
        System.out.println("Alto del rectangulo: " + rectangulo1.getAlto());

        System.out.println("\nPunto 2:");

        // Clase Empleado sin constructor

        Empleado empleado = new Empleado();
        Empleado empleado1 = new Empleado();

        // A)

        empleado.setNombre("Carlos");
        empleado.setApellido("Gutiérrez");
        empleado.setDni("23456345");
        empleado.setSalario(25000);

        // B)

        empleado1.setNombre("Ana");
        empleado1.setApellido("Sánchez");
        empleado1.setDni("34234123");
        empleado1.setSalario(27500);

        System.out.println("\nC) Impresion por pantalla de empleados:\n");

        empleado.imprimirEmpleado();
        empleado1.imprimirEmpleado();

        empleado.aumentarSalario(15);

        System.out.println("\nD) Salario anual con el aumento del 15%: " + empleado.calcularSalarioAnual());

        System.out.println("\nPunto 3:");

        // A)
        // Clase ItemDeVenta con constructor


        ItemDeVenta itemDeVenta = new ItemDeVenta(1, "Procenex", 10, 80 );
        ItemDeVenta itemDeVenta2 = new ItemDeVenta(2, "Nesquik", 50, 120);

        // con el set modifico la variable

        itemDeVenta2.setpUnitario(150);

        System.out.println("\nB) Impresion por pantalla del objeto itemDeVenta:\n");

        itemDeVenta.imprimirItemDeVenta();
        itemDeVenta2.imprimirItemDeVenta();

        System.out.println("\nPunto 4:");

        // 1)

        CuentaBancaria cuentaBancaria = new CuentaBancaria(1, "Cuenta BBVA", 15000);

        System.out.print("\n2) Ingrese la cantidad que desea acreditar en la cuenta: ");

        Scanner scanner = new Scanner(System.in);

        float cantidad= scanner.nextFloat();

        cuentaBancaria.creditoCuenta(cantidad);

        System.out.println("\nNuevo saldo de su cuenta: " + cuentaBancaria.getBalance());

        System.out.print("\n3) Ingrese el monto de la compra a debitar de la cuenta: ");

        cantidad = scanner.nextFloat();

        cuentaBancaria.debitoCuenta(cantidad);

        System.out.println("\nNuevo saldo de su cuenta: " + cuentaBancaria.getBalance());

        System.out.print("\n4) Ingrese el monto de la compra a debitar de la cuenta: ");

        cantidad = scanner.nextFloat();

        cuentaBancaria.debitoCuenta(cantidad);

        System.out.println("\n5) Imprimiendo los datos de la cuenta bancaria: ");

        cuentaBancaria.imprimirBalance();

        System.out.println("\nPunto 5:");

        Hora hora = new Hora (13, 04, 22);

        // Avanzando la hora

        System.out.print("\nHora inicializada: ");
        System.out.println(hora.toString());

        hora.avanzarHora();

        System.out.print("\nAvanzo una hora: ");
        System.out.println(hora.toString());

        hora.avanzarMinutos();

        System.out.print("Avanzo un minuto: ");
        System.out.println(hora.toString());

        hora.avanzarSegundos();

        System.out.print("Avanzo un segundo: ");
        System.out.println(hora.toString());

        // Retrocediendo la hora

        hora.retrocederHora();

        System.out.print("Retrocedo una hora: ");
        System.out.println(hora.toString());

        hora.retrocederMinutos();

        System.out.print("Retrocedo un minuto: ");
        System.out.println(hora.toString());

        hora.retrocederSegundos();

        // Devuelta a la hora inicializada

        System.out.print("Retrocedo un segundo (hora inicializada): ");
        System.out.println(hora.toString());

    }
}
