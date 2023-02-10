package org.alejandroArias.model;

public class BaseDatosMariaDB implements BaseDatos {

    private static final String ruta = "jdbc:mariadb://localhost:3306/curso_java/server=2";


    @Override
    public void insertar() {
        System.out.println(" insertar desde MariaDB");
    }

    @Override
    public void modificar() {
        System.out.println("modificar desde MariaDB" );
    }

    @Override
    public void consultar() {
        System.out.println("consultar desde MariaDB" );
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde MariaDB" );
    }

}
