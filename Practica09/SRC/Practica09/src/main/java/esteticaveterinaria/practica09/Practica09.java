/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package esteticaveterinaria.practica09;

import esteticaveterinaria.practica09.Conexion.ConexionBD;
import java.sql.SQLException;

/**
 *
 * @author maite
 */
public class Practica09 {

    public static void main(String[] args) {
        ConexionBD c= new ConexionBD();
        try{
            c.conectar();
            c.cerrar();
    } catch (SQLException e){
        System.out.println(e.toString());
    }
}
}
