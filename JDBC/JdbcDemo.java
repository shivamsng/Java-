package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo {
    public static void main(String ar[]) {

        Connection connection = null;
        final String username = "sa";
        final String password = "";
        final String jdbcurl = "jdbc:h2:~/test";
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");   for ms server

        // String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
        // String user = "sa";
        // String pass = "";

        try {

            Class.forName ("org.h2.Driver");  ///

            connection = DriverManager.getConnection(jdbcurl,username,password);///authentication

            System.out.println("Connected Successfully...");

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
