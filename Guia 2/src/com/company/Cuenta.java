package com.company;

import javax.swing.*;
import java.util.UUID;

public class Cuenta {

    private static final int MAXIMO_OPERACIONES = 10;

    private UUID id;
    private double balance;
    private Titular titular;
    private int contOperaciones = 0;
    private String operaciones[] = new String[MAXIMO_OPERACIONES];

    public Cuenta(double balance, Titular titular) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.titular = titular;
    }

    private UUID getId() {
        return id;
    }

    private double getBalance() {
        return balance;
    }

    public Titular getTitular() {
        return titular;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    private void imprimirMensajeDeposito (double monto) {
        JOptionPane.showMessageDialog(null, "Usted ha depositado: " + monto);
    }

    private void imprimirMensajeExtraccion (double monto) {
        JOptionPane.showMessageDialog(null, "Usted ha extraido: " + monto);
    }

    public double deposito (double monto) {
        anotarDeposito(monto);
        imprimirMensajeDeposito(monto);
        return this.balance = this.balance + monto;
    }

    public double extraccion (double monto) {
        double balanceTemporal = this.balance - monto;
        if (balanceTemporal >= -2000) {
            this.balance = this.balance - monto;
            anotarExtraccion(monto);
            imprimirMensajeExtraccion(monto);
        } else {
            System.out.println("Monto insuficiente!");
        }
        return this.balance;
    }

    private void anotarDeposito (double monto) {
        if (this.contOperaciones == MAXIMO_OPERACIONES) {
            this.contOperaciones = 0;
        }
        operaciones[contOperaciones] = "El cliente " + titular.getNombre() + " depositó " + monto;
        this.contOperaciones++;
    }

    private void anotarExtraccion (double monto) {
        if (this.contOperaciones == 10) {
            this.contOperaciones = 0;
        }
        operaciones[contOperaciones] = "El cliente " + titular.getNombre() + " retiró " + monto;
        this.contOperaciones++;
    }
}