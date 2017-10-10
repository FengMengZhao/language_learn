package org.fmz.jdbc;

import java.sql.*;
import javax.sql.*;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionManager{

    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    
    public static Connection getConnection(){

        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://172.16.192.194:3306/login", "root", "root");
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public static Connection getConnectionFromC3p0(){
        Connection conn = null;
        try{
             conn = dataSource.getConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public static DataSource getDataSource(){
        return dataSource; 
    }
}
