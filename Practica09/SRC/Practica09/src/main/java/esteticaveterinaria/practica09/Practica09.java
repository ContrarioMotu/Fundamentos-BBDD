/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

 /**
  * Clase main
  */

package esteticaveterinaria.practica09;

import esteticaveterinaria.practica09.Conexion.ConexionBD;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author maite
 */
public class Practica09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int clave;
        System.out.println("1. Mostrar tabla Producto.");
        do {
            try {
                clave = in.nextInt();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sólo se admiten numeros");
            }
        } while (true);

        switch (clave) {
            case 0:
                //Mostrar tabla Producto
                break;

            case 1:
                //Añadir Producto
                break;
        
            case 2:
                //Modificar producto
                break;

            case 3: 
                //Eliminar producto
                break;

            default:
                break;
        }
        /*ConexionBD c= new ConexionBD();
        try{
            c.conectar();
            c.cerrar();
    } catch (SQLException e){
        System.out.println(e.toString());
    }*/
}
}
