/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esteticaveterinaria.practica09.Modelo;

/**
 *Clase que describe a los productos
 * @author The 501st
 */
public class Producto {
    int idProducto;
    String nombre;
    double precio;
    String descripcion;
    int cantidadDisponible;
    String imagen;

    /**
     * Constructor con parametros
     * @param idProducto
     * @param nombre
     * @param precio
     * @param descripcion
     * @param cantidadDisponible
     * @param imagen
     */
    public Producto(int idProducto, String nombre, double precio, String descripcion, int cantidadDisponible, String imagen) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
        this.imagen = imagen;
    }

    /**
     * Regresa el id
     * @return id
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Regresa el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa el precio
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Regresa la descripcion
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Regresa la cantidad de productos disponible
     * @return cantidad de productos
     */
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    /**
     * Regresa el nombre del archivo de imagen
     * @return imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Modifica el id
     * @param idProducto
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Modifica el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica el precio
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Modifica la descripción
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Modifica la cantidad disponible
     * @param cantidadDisponible
     */
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    /**
     * Modifica la imagen
     * @param imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    /**
     * Metodo to String
     */
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", cantidadDisponible=" + cantidadDisponible + ", imagen=" + imagen + '}';
    }
    
    
}
