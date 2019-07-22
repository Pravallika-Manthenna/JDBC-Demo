package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchDemo {
    public void batchDemo()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDEMO", "root", "Root@123");

            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into Employee values(14,'pravallika', 23, 'f')");
            stmt.executeUpdate("insert into Employee values(15,'reyansh',23,'m')");

            con.close();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}