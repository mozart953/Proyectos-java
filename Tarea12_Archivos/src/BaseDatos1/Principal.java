/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilson Pop
 */
public class Principal {
   // public static Connection Conexion() throws ClassNotFoundException{
        
     public static void main(String[] args) throws ClassNotFoundException {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            //LAPTOP-8VOKSOEH
             String conectarBD = "jdbc:sqlserver://localhost:1433;" + "database=tiendaInformatica;"
                +"user=sa;"+"password=sa;"+"loginTimeout=30;";
            
             Connection cn = DriverManager.getConnection(conectarBD);
            JOptionPane.showMessageDialog(null, "CONECTADO");
         //  return cn;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, ex, "ERROR" +ex.getMessage(),JOptionPane.ERROR_MESSAGE);
           // return null;
        }
    }
   
       
           
       
        
        /*try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String conectarBD = "jdbc:sqlserver://LAPTOP-8VOKSOEH\\SQLEXPRESS;" + "databaseName=tiendaInformatica;"
                + "loginTimeout=30";
            Connection cn = DriverManager.getConnection(conectarBD);
           return cn;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }*/
    //}
    
}
