package com.openbootcamp.sesion.cincoInterfaz;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("esto es: save");
    }

    @Override
    public void findAll() {
        System.out.println("esto es: findall");
    }

    @Override
    public void delete() {
        System.out.println("esto es: delete");
    }
}
