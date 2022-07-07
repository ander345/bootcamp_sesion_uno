package com.openbootcamp.sesion.cuatroPoo.clases;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsung", "A20", "Negro", 3000,3, "Android");

        SmartWatch smartWatch = new SmartWatch("Apple Watch", "14", "gris",
                50, 512);

        System.out.println("smartphone : " + smartPhone + "\nsmartwatch : " + smartWatch);
    }
}
