package Project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sharia
 */
import java.sql.*;


public class ConnectionProvider {
    public static Connection getConnection() {
        try {
            String url = "jdbc:sqlite:E:\\NetBeansProjects\\HMS\\patient.db";
            Connection conn = DriverManager.getConnection(url);
            return conn;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    
    }
}
