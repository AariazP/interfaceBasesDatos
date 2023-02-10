package org.alejandroArias.model;

public class BaseDatosMySql implements BaseDatos {

    private static final String ruta = "jdbc:mysql://localhost:3306/curso_java/server=1";

    @Override
    public void insertar() {
        System.out.println(" insertar desde MySql");
    }

    @Override
    public void modificar() {
        System.out.println("modificar desde MySql" );
    }

    @Override
    public void consultar() {
        System.out.println("consultar desde MySql" );
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde MySql" );
    }
}
