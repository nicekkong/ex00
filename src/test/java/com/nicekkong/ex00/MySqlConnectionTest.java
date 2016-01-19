package com.nicekkong.ex00;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by nicekkong on 2016. 1. 16..
 */
public class MySqlConnectionTest {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex";
    private static final String USER = "zerock";
    private static final String PWD = "zerock";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);

        try{
            Connection con = DriverManager.getConnection(URL, USER, PWD);
            System.out.print(con);
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
