package com.openbootcamp.sesion.cincoInterfaz;

public class Main {
    public static void main(String[] args) {

        CocheCRUD cochebuscar = new CocheCRUDImpl();
        cochebuscar.save();
        cochebuscar.findAll();
        cochebuscar.delete();
    }
}
