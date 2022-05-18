/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package esteticaveterinaria.practica09.Repositorio;

import esteticaveterinaria.practica09.Conexion.ConexionBD;
import esteticaveterinaria.practica09.Modelo.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase que conecta con los productos en la base de datos
 * 
 * @author The501st
 */
public class ProductoRepositorio {
    private ConexionBD c= new ConexionBD();
    private Statement stat;
    private PreparedStatement prestat;
    
    /**
     * Metodo que regresa una lista de todos los productos disponibles en la base de datos
     * @return una lista con los productos de la BD
     * @throws SQLException
     */
    public List<Producto> getListaProductos() throws SQLException {
        String query = "SELECT * FROM Producto";
        LinkedList<Producto> listaProductos= new LinkedList<>();
        try {
            c.conectar();
            prestat = c.prepararDeclaracionPreparada(query);
            //prestat.setString(1, String.valueOf(idProducto));
            ResultSet rs= stat.executeQuery(query);
            while(rs. next()) {
                Producto producto = new Producto(
                rs.getInt("idProducto"),
                rs.getString("nombre"),
                rs.getDouble("precio"),
                rs.getString("descripcion"),
                rs.getInt("cantidadDisponible"),
                rs.getString("imagen"));
                listaProductos.add(producto);
            }
        } catch (SQLException sql) {
            sql.printStackTrace();
        } finally {
            try {
                c.cerrar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return listaProductos;
    }
    
    /**
     * Metodo que regresa un producto que es buscado por su id
     * @param id id del producto que se va a buscar
     * @return objeto del tipo Producto con toda su informacion correspondiente
     */
    public Producto getProducto(int id) {
        String query= "SELECT * FROM Producto WHERE idProducto = ?";
        Producto producto= null; 
        try {
            c.conectar();
            prestat= c.prepararDeclaracionPreparada(query);
            prestat.setString(1, String.valueOf(id));
            ResultSet rs = prestat.executeQuery();
            while (rs.next()) {
                producto = new Producto (
                rs.getInt("idProducto"),
                rs.getString("nombre"),
                rs.getDouble("precio"),
                rs.getString("descripcion"),
                rs.getInt("cantidadDisponible"),
                rs.getString("imagen"));
            }
        } catch (SQLException sql) {
            sql.printStackTrace();
        } finally {
            try {
                c.cerrar();
            } catch (SQLException e) {
               e.printStackTrace();
            }
        }
        return producto;
    }
    
    /**
     * Metodo que actualiza en la base de datos un nuevo producto
     * @param prod Objeto producto que se añadirá a la BD
     */
    public void insertarProducto(Producto prod) {
        String query = "INSERT INTO Producto " + 
                "(idProducto, nombre, precio, descripcion, cantidadDisponible, imagen)"
                + " VALUES (?,?,?,?,?,?)";
        
        try {
            c.conectar();
            prestat = c.prepararDeclaracionPreparada(query);
            prestat.setInt(1, prod.getIdProducto());
            prestat.setString(2, prod.getNombre());
            prestat.setDouble(3, prod.getPrecio());
            prestat.setString(4, prod.getDescripcion());
            prestat.setInt(5, prod.getCantidadDisponible());
            prestat.setString(6, prod.getImagen());
            prestat.executeUpdate();
        } catch (SQLException sql) {
            sql.printStackTrace();
        } finally {
            try {
                c.cerrar();
                System.out.println("Insertado correctamente");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Metodo que se utiliza para actualizar un producto
     * @param idProd para saber cual producto se va a modificar
     * @param producto la información a ser actualizada en dicho producto
     */
    public void actualizarProducto(int idProd, Producto producto) {
        String query = "UPDATE Producto SET idProducto = ?, nombre = ?, "
                + "precio = ?, descripcion = ?, "
                + "cantidadDisponible = ?, imagen = ? WHERE idProducto = ?";
        try {
            c.conectar();
            prestat = c.prepararDeclaracionPreparada(query);
            prestat = c.prepararDeclaracionPreparada(query);
            prestat.setInt(1, producto.getIdProducto());
            prestat.setString(2, producto.getNombre());
            prestat.setDouble(3, producto.getPrecio());
            prestat.setString(4, producto.getDescripcion());
            prestat.setInt(5, producto.getCantidadDisponible());
            prestat.setString(6, producto.getImagen());
            prestat.executeUpdate();
        }catch (SQLException sql) {
            sql.printStackTrace();
        } finally {
            try {
                c.cerrar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
