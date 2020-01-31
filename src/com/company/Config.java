package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 1. ADD LIB TO PROJECT
 *
 * 2. ENTER USERNAME AND PASSWORD FOR CONNECTION
 *
 */

public class Config {
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String user = "Dashtikh";
    private static String pass = "dashti1565";
    private static Connection conn;

    public static Connection getConnect() {
        try {
            if (conn == null) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(url, user, pass);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Failed to create the database connection.");
        }
        return conn;
    }

    public void connClose() throws SQLException {
        conn.close();
    }
}