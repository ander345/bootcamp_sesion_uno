package com.openbootcamp.sesion.dos;

import java.util.Scanner;

public class mainfuncion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce valor: ");
        double precio = scanner.nextInt();
        double result = iva(precio);
        System.out.println("precio sin iva: " + precio);
        System.out.println("precio con iva " + result);
    }


    static double iva(double precio){
        precio += precio*0.20;
        return precio;
    }
}
