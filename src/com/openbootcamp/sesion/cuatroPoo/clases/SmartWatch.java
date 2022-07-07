package com.openbootcamp.sesion.cuatroPoo.clases;

public class SmartWatch extends SmartDevice{

    int peso;
    int memoria;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String marca, String modelo, String color, int peso, int memoria) {
        super(marca, modelo, color);
        this.peso = peso;
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "peso en gramos=" + peso +
                ", memoria en MB =" + memoria +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
