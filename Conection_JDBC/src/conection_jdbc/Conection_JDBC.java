/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conection_jdbc;

/**
 *
 * @author Maricela Velasco
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conection_JDBC {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        String user="root";
        String password="";
        String url="jdbc:mysql://localhost:3306/mydb";
        Connection Conexion;
        Statement statement;
        ResultSet rst;
        
        
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conection_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
}
