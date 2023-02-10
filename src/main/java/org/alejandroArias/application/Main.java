package org.alejandroArias.application;

import org.alejandroArias.model.BaseDatos;
import org.alejandroArias.model.BaseDatosMariaDB;
import org.alejandroArias.model.BaseDatosMySql;

public class Main {

    /**Defino el tipo de la Base de datos, pero del tipo de la interfaz
     * esto permite no acoplar el código a una base de datos en particular
    **/
    private static BaseDatos baseDatos ;



    public static void main(String[] args) {

        //supongamos que el usuario selecciona la base de datos MariaDB
        baseDatos = new BaseDatosMariaDB();

        //sin embargo, si mañana el usuario selecciona MySql
        baseDatos = new BaseDatosMySql();

        //el código no se ve afectado, ya que el tipo de la variable es la interfaz
        //si deseo ejecutar un método de la interfaz, simplemente lo llamo
        //y cada base de datos implementa el método de manera diferente
        //mientras uno llama a un servidor, el otro llama a otro

        System.out.println("Hello world!");
    }
}