package com.fluxxo.docker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jan.lendholt on 15.02.17.
 */
public class TestJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Setup the connection with the DB
        try {
            Connection connect = DriverManager
                    .getConnection("jdbc:mysql://mysql/test?"
                            + "user=test&password=test");
            System.out.println("Connection closed? "+connect.isClosed());
        } catch (Exception e) {
            e.printStackTrace();
        }


        Thread.sleep(3600000);
    }
}
