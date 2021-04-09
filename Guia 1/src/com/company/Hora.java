package com.company;

public class Hora {

    public int hora;
    public int minutos;
    public int segundos;

    public Hora (int hora, int minutos, int segundos) {
        this.hora = (hora >= 0 && hora < 24) ? hora : 0;
        this.minutos = (minutos >= 0 && minutos < 60) ? minutos : 0;
        this.segundos = (segundos >= 0 && segundos < 60) ? segundos : 0;
    }

    public void avanzarHora () {
        if (this.hora == 23) {
            this.hora=0;
        } else {
            this.hora++;
        }
    }

    public void avanzarMinutos () {
        if (this.minutos == 59) {
            this.minutos=0;
            avanzarHora();
        } else {
            this.minutos++;
        }
    }

    public Hora avanzarSegundos () {
        if (this.segundos == 59) {
            this.segundos=0;
            avanzarMinutos();
        } else {
            this.segundos++;
        }
        return this;
    }

    public void retrocederHora () {
        if (this.hora == 0) {
            this.hora=23;
        } else {
            this.hora--;
        }
    }

    public void retrocederMinutos () {
        if (this.minutos == 0) {
            this.minutos=59;
            retrocederHora();
        } else {
            this.minutos--;
        }
    }

    public Hora retrocederSegundos () {
        if (this.segundos == 0) {
            this.segundos=59;
            retrocederMinutos();
        } else {
            this.segundos--;
        }
        return this;
    }

    @Override
    public String toString() {
        String hor = String.format("%02d", hora);
        String min = String.format("%02d", minutos);
        String seg = String.format("%02d", segundos);

        return hor + ":" + min + ":" + seg;
    }

}