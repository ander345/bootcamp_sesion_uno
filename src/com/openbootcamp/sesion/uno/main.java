package com.openbootcamp.sesion.uno;

public class main {
    public static void main(String[] args) {
        System.out.println("creando metodo main");


        // 1. numericos
        // 1.1 enteros
        byte variableByte = 1;
        System.out.println("variable byte: " + variableByte);
        short variableShort = 20;
        System.out.println("variable short: " + variableShort);
        int variableInt = 100;
        System.out.println("variable int: " + variableInt);
        long variablelong = 100000;
        System.out.println("variable long: " + variablelong);

        // 1.2 decimales
        float variableFloat = 456.55f;
        System.out.println("variable float: " + variableFloat);
        double variableDouble = 100.576d;
        System.out.println("variable double. " + variableDouble);

        // 2. booleano
        boolean variableBoolean = false;
        System.out.println("variable boolean: " + variableBoolean);
        boolean variableBoolean2 = true;
        System.out.println("variable boolean: " + variableBoolean2);

        // 3. texto
        char variableChar = 'y';
        System.out.println("variable char: " + variableChar);
        String variableString = "Lorem ipsum dolor sit amet.....";
        System.out.println("variable string: " + variableString);


    }
}
