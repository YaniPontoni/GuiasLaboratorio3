package com.company;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class Factura {

    private UUID id;
    private LocalDateTime fecha;
    private Cliente cliente;
    private ItemDeVenta[] items;

    public Factura(Cliente cliente, ItemDeVenta[] items) {
        this.id = UUID.randomUUID();
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
        this.items = items;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getMontoTotal () {
        double total = 0.0;
        for (ItemDeVenta itemDeVenta : items) {
            if (itemDeVenta != null) {
                total = total + itemDeVenta.getTotal();
            }
        }
        return total - (total * (cliente.getDescuento() / 100));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ItemDeVenta[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "\nFactura [" +
                "ID: " + id +
                ", Fecha: " + fecha +
                ", monto: " + getMontoTotal() +
                ", detalle cliente: " + cliente +
                ", detalle items: " + Arrays.toString(items) +
                ']';
    }
}