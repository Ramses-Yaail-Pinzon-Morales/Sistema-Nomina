
package com.api.proyecto.rest;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ShellyOdin21
 */
public class ConexionBD {
    private static Connection conexion;
    private static String Driver = "com.mysql.cj.jdbc.Driver";
    private static String User = "root";
    private static String password = "ShellyOdin21";
    private static String url = "jdbc:mysql://localhost:3306/agapi-system"+"?useTimezone=true&serverTimezone=UTC";
    
    //Comprobación de conexión.
    public ConexionBD() {
        conexion = null;
        try {
            Class.forName(Driver);
            conexion = DriverManager.getConnection(url,User,password);
            if(conexion != null){
                JOptionPane.showMessageDialog(null,"Conexión Éxitosa a la Base de Datos.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la conexión de "+e);
        }
    }
    public Connection getConnection(){
        return conexion;
    }
}
