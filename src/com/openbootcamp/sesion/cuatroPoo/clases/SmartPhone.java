package com.openbootcamp.sesion.cuatroPoo.clases;

public class SmartPhone extends SmartDevice {

    int bateria;
    int ram;
    String sistema;


    public SmartPhone() {
        super();
    }

    public SmartPhone(String marca, String modelo, String color, int bateria, int ram, String sistema) {
        super(marca, modelo, color);
        this.bateria=bateria;
        this.ram = ram;
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "bateria mah =" + bateria +
                ", ram=" + ram +
                ", sistema='" + sistema + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
