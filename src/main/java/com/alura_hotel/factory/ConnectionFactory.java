package com.alura_hotel.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection RecuperaConexion() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost/control_hotel?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "Kiivj84_d!");
    }
}
