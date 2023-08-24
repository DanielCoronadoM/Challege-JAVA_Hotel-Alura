package com.alura_hotel.test;

import com.alura_hotel.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class testConnectionDB {
    public static void main(String[] args) throws SQLException {
        /**
         * Llama al metodo para crear la conexion con la DB
         */
        Connection con = new ConnectionFactory().RecuperaConexion();

        System.out.println("Cerrando la conexión");

        con.close();
    }
}
