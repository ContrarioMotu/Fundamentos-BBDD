/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

 /**
  * Clase main
  */

package esteticaveterinaria.practica09;

import esteticaveterinaria.practica09.Conexion.*;
import esteticaveterinaria.practica09.Modelo.*;
import esteticaveterinaria.practica09.Repositorio.ProductoRepositorio;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maite
 */
public class Practica09 {

    static Producto obtenerDatosProducto(){

        Scanner lector = new Scanner(System.in);
        Producto resp = new Producto();

        System.out.println("Introduzca el id del producto \n");
        resp.setIdProducto(Integer.parseInt(lector.nextLine()));
        System.out.println("Introduzca el nombre del producto \n");
        resp.setNombre(lector.nextLine());
        System.out.println("Introduzca el precio del producto \n");
        resp.setPrecio(Double.parseDouble(lector.nextLine()));
        System.out.println("Introduzca la descripcion del producto \n");
        resp.setDescripcion(lector.nextLine());
        System.out.println("Introduzca la cantidad disponible del producto \n");
        resp.setCantidadDisponible(Integer.parseInt(lector.nextLine()));
        System.out.println("Introduzca la direecion de la imagen del producto \n");
        resp.setImagen(lector.nextLine());

        return resp;

    }

    public static void main(String[] args) throws SQLException{
        
        ConexionBD c = new ConexionBD();
        try {
            c.conectar();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner in = new Scanner(System.in);
        Producto temp;
        int clave;
        ProductoRepositorio prodRepo = new ProductoRepositorio();
        
        System.out.println("1. Mostrar tabla Producto.\n2.Añadir producto\n3.Modificar producto\n4.Eliminar producto");

        do {
            try {
                clave = in.nextInt();
                in.nextLine();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sólo se admiten numeros");
            }
        } while (true);

        switch (clave) {
            case 1:

                //Mostrar tabla Producto
                List<Producto> productos;
                productos = prodRepo.getListaProductos();
                Iterator it = productos.iterator();
                System.out.println(productos.size());
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
                break;

            case 2:

                //Añadir Producto

                System.out.println("Introduzca los datos del nuevo producto");

                temp = obtenerDatosProducto();
                prodRepo.insertarProducto(temp);

                break;
        
            case 3:

                //Modificar producto
                System.out.println("Introduce el id del producto a modificar\n");
                clave = Integer.parseInt(in.nextLine());
                System.out.println("Introduzca los datos actualizados del producto");
                temp = obtenerDatosProducto();

                prodRepo.actualizarProducto(clave,temp);

                break;

            case 4:
                //Eliminar producto
                break;

            default:
                break;
        }
    }
}
