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
import esteticaveterinaria.practica09.Repositorio.*;
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

        do {
        try {
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
        System.out.println("Introduzca la direccion de la imagen del producto \n");
        resp.setImagen(lector.nextLine());
        break;
        } catch (Exception e) {
            System.out.println("Formato incorrecto");
        }
        } while (true);
        return resp;

    }

    private static Estetica obtenerDatosEstetica() {
	Scanner lector = new Scanner(System.in);
	Estetica estetica = new Estetica();
	do {
	    try {
		System.out.println("Introduzca el id de la estetica \n");
		estetica.setIdEstetica(Integer.parseInt(lector.nextLine()));

		System.out.println("Introduzca el nombre de la estetica \n");
		estetica.setNombre(lector.nextLine());

		System.out.println("Introduzca el telefono de la estetica (10 digitos)\n");
		estetica.setTelefono(lector.nextLine());

		System.out.println("Introduzca el nombre de la calle donde se encuentra la estetica\n");
		estetica.setCalle(lector.nextLine());

		System.out.println("Introduzca el numero exterior \n");
		estetica.setNumCalle(Integer.parseInt(lector.nextLine()));

		System.out.println("Introduzca el estado\n");
		estetica.setEstado(lector.nextLine());

		System.out.println("Introduzca el codigo postal \n");
		estetica.setCodigoPostal(lector.nextLine());

		System.out.println("Introduzca la hora en la que abre formato 24 horas ejemplo 12:00:00 \n");
		estetica.setHoraInicio(lector.nextLine());

		System.out.println("Introduzca la hora en la que cierra formato formato 24 horas ejemplo 20:45:00 \n");
		estetica.setHoraFin(lector.nextLine());

		System.out.println("Introduzca el numero de consultorios \n");
		estetica.setNumConsultorios(Integer.parseInt(lector.nextLine()));
		break;
		
	    } catch (Exception e) {
		System.out.println("Formato incorrecto.");
	    }
	    
	} while (true);
	return estetica;
	
    }

    public static void main(String[] args) throws SQLException{

        Scanner in = new Scanner(System.in);
        Producto temp;
        Estetica tempE;
        int clave;
        ProductoRepositorio prodRepo = new ProductoRepositorio();
        EsteticaRepositorio esteticaRepo = new EsteticaRepositorio();

        System.out.println("1.Mostrar tabla Producto.\n2.Añadir producto\n3.Modificar producto\n4.Eliminar producto");
        System.out.println("5.Mostrar tabla Estetica.\n6.Añadir estetica\n7.Modificar estetica\n8.Eliminar estetica");

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

                System.out.println("Introduce el id del producto a eliminar\n");
                clave = Integer.parseInt(in.nextLine());
                prodRepo.borrarProducto(clave);

                break;

            case 5:
                //Mostrar tabla Producto
                List<Estetica> esteticas;
                esteticas = esteticaRepo.getListaEsteticas();
                System.out.println(esteticas.size());

                for (Estetica e : esteticas)
                    System.out.println(e.toString());
                //Iterator it = esteticas.iterator();

                //while (it.hasNext()) {
                //    System.out.println(it.next());
                //}
                break;
            case 6:
		        System.out.println("Introduzca los datos de la estetica a insertar.");

                tempE = obtenerDatosEstetica();
                esteticaRepo.insertarEstetica(tempE);

                break;

            case 7:

                //Modificar producto
                System.out.println("Introduce el id de la estetica a modificar\n");
                clave = Integer.parseInt(in.nextLine());
                System.out.println("Introduzca los datos actualizados de la estetica");
                tempE = obtenerDatosEstetica();
                esteticaRepo.actualizarEstetica(clave,tempE);

                break;

            case 8:

                System.out.println("Introduce el id de la estetica a eliminar\n");
                clave = Integer.parseInt(in.nextLine());
                esteticaRepo.borrarEstetica(clave);

            default: break;

        }

    }

}
