/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilson Pop
 */
public class Conexion {
    public static Connection getConexion() throws ClassNotFoundException{
        String url = "jdbc:sqlserver://localhost:1433;" /*Esta parte parte puede copiarse igual o copiar el nombre
                del servidor que aparece al iniciar sqlserver
                */
                + "database=DpanSimulacion1;" // El nombre de la base de datos es la que se esté usando en ese momento
                + "user=sa;"//el usuario puede ser sa o cualquier otro que se haya configurado
                + "password=sa;"//la contraseña, dependiendo de la configurada en sqlserver
                +"loginTimeout=30;";//tiempo en segundos para comprobar si existe o no un error de conexión
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url);

            JOptionPane.showMessageDialog(null, "CONECTADO");
            return con;
        
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    };
}
