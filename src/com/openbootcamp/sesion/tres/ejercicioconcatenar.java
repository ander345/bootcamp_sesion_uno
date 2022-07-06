package com.openbootcamp.sesion.tres;

public class ejercicioconcatenar {
    public static void main(String[] args) {
        System.out.println("creando metodo main");
        String[] nombres = {"nombre1", "nombre22", "nombre333", "nombre444"};
        String cadena="";
        for (String items:nombres  ) {
            cadena+=items;
        }
        System.out.println("cadena concatenada: " + cadena);
    }
}
