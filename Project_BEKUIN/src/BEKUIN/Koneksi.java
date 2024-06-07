/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BEKUIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class Koneksi {

    private static Connection Koneksi;
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    public static Connection getConnection() throws SQLException{
        String db = "jdbc:mysql://localhost:3306/bekuin";
        String user = "root";
        String pass = "";
        
        Koneksi = DriverManager.getConnection(db, user, pass);
        
        return Koneksi;
        
    }
    
}
