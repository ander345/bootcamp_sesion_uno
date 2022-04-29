package com.openbootcamp.sesion.dos;

public class mainfuncion {

    public static void main(String[] args) {
        double precio = 1152564;
        double result = iva(precio);
        System.out.println("precio sin iva: " + precio);
        System.out.println("precio con iva " + result);
    }


    static double iva(double precio){
        precio += precio*0.20;
        return precio;
    }
}
