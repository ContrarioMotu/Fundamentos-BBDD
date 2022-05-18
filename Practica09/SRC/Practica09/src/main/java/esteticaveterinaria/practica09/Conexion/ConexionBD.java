/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esteticaveterinaria.practica09.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maite
 */
public class ConexionBD {
    private Connection c= null; 
    
    /**
     * Metodo que se conecta con la base de datos
     * @throws SQLException
     */
    public void conectar() throws SQLException{
        String jdbc= "jdbc:postgresql://localhost:5432/postgres";
        c= DriverManager.getConnection(jdbc, "postgres", "17@");
        System.out.println("Conexion exitosa");
    }
    
    /**
     * Metodo que cierra la conexión con la base de datos
     * @throws SQLException
     */
    public void cerrar () throws SQLException {
        c.close();
        System.out.println("Conexion cerrada");
    }
    
    /**
     * Metodo que se encarga de preparar la base de datos para recibir una 
     * sentencia
     * @return Statement -- Objeto que utilizaremos para crear sentencias sql
     * @throws SQLException -- Si no se logra preparar lanza un error
     */
    public Statement prepararDeclaracion() throws SQLException{
        return c.createStatement();
    }
    
    /**
     * Metodo que se encarga de preparar la base de datos para recibir una 
     * sentencia preparada
     * @param query -- La query que modificaremos en caso de necesitar parametros
     * @return PreparedStatement -- Objeto que utilizaremos para las sentencias sql
     * @throws SQLException -- Si no se logra prepara lanza un error
     */
    public PreparedStatement prepararDeclaracionPreparada(String query)  throws SQLException{
        return c.prepareStatement(query);
    }
    
}
