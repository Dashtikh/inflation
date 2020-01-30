package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Infaltionrepo {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Infaltionrepo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Dashtikh", "dashti1565");


    }

    public void insert(int year, int bread, int rice, int meat, int dairy, int vegetables, float cpi, float inf, String created_date, String updated_date, String agent_name, String agent_id) throws Exception {
        preparedStatement = connection.prepareStatement("insert into inflation (year,bread,rice,meat,dairy,vegetables,cpi,inf,created_date,updated_date,agent_name,agent_id) values (?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, year);
        preparedStatement.setInt(2, bread);
        preparedStatement.setInt(3, rice);
        preparedStatement.setInt(4, meat);
        preparedStatement.setInt(5, dairy);
        preparedStatement.setInt(6, vegetables);
        preparedStatement.setFloat(7, cpi);
        preparedStatement.setFloat(8, inf);
        preparedStatement.setString(9, created_date);
        preparedStatement.setString(10, updated_date);
        preparedStatement.setString(11, agent_name);
        preparedStatement.setString(12, agent_id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }


}
