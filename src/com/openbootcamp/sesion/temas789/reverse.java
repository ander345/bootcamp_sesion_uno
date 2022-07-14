package com.openbootcamp.sesion.temas789;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class reverse {

    public static void main(String[] args) {

        //  0.devuelve una cadena al revés
        System.out.println("0. devuelve una cadena al revés");
        Scanner scanner = new Scanner(System.in);
        String texto;
        System.out.println("Introduce un texto");
        texto = scanner.nextLine();

        String rever = reverse(texto);
        System.out.println(rever);

        // 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        System.out.println("1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.");
        String textos[] = {"uno ", "dos ", "tres ", "cuatro"};

        for (String items : textos) {
            System.out.println(items);
        }

        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        System.out.println("2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.");
        Integer[][] numeros = {{46, 155}, {460, 8}, {642, 15}};

        for (int i = 0; i < numeros.length; i++) {
            for (int y = 0; y < numeros[i].length; y++) {
                System.out.println("elemento: " + numeros[i][y] + " Fila: " + (i + 1) + " Columna: " + (y + 1));
            }
        }

        //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        System.out.println("3. vector");
        Vector vector = new Vector();
        vector.add("uno");
        vector.add("dos");
        vector.add("tres");
        vector.add("cuatro");
        vector.add("cinco");

        vector.remove("dos");
        vector.remove("tres");
        System.out.println("resultado del vector: " + vector);

        //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        System.out.println("4. el problema es el desperdicio de memoria");

        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        System.out.println("5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.");

        ArrayList<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");


        LinkedList<String> listaLinked = new LinkedList<>(lista);

        for (String item : listaLinked) {
            System.out.println(" Elementos listalinked: " + item);
        }

        for (String item : lista){
            System.out.println(" Elemento lista: " + item);
        }

        //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        System.out.println("6. llenar arraylist");

        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for(int i=1; i<11; i++){
            arraylist.add(i);

        }
        for(int i =0 ; i<arraylist.size();i++){
            if(arraylist.get(i) % 2 == 0){
                arraylist.remove(i);
            }
        }

        System.out.println(arraylist.toString());

    }

    //devuelve una cadena al revés
    public static String reverse(String texto) {
        StringBuilder reves = new StringBuilder(texto);
        texto = reves.reverse().toString();
        return texto;
    }
}
