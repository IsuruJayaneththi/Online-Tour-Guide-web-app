package com.onlinetourguide.common;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbConnect {


    public static void main(String[] args) {
        System.out.println(DbConnect.get_Connection());
    }

    public static Connection get_Connection() {


        Connection connection = null;
        PreparedStatement ps = null;
        Resultset resultset = null;

        String host = "jdbc:mysql://localhost:3306/onlinetourguide";
        String username = "root";
        String password = "Isuru@rox1";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(host, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }


        return connection;

    }

}
