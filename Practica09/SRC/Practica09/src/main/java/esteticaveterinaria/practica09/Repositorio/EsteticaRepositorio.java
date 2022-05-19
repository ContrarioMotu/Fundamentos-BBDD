/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esteticaveterinaria.practica09.Repositorio;

import esteticaveterinaria.practica09.Conexion.ConexionBD;
import esteticaveterinaria.practica09.Modelo.Estetica;
import esteticaveterinaria.practica09.Modelo.Producto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.time.OffsetDateTime;
import java.sql.Timestamp;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * Clase que conecta las esteticas con la base de datos
 * @author The501st
 */
public class EsteticaRepositorio {

    private ConexionBD c;
    private Statement stat;
    private PreparedStatement prestat;

    public EsteticaRepositorio() {
        c = new ConexionBD();
    }


    /**
     * Metodo que regresa una lista de todos los esteticas disponibles en la base de datos
     * @return una lista con las esteticas de la BD
     * @throws SQLException
     */
    public List<Estetica> getListaEsteticas() throws SQLException {
        String query = "SELECT * FROM Estetica";
        LinkedList<Estetica> esteticas = new LinkedList<>();
        try {
            c.conectar();
            prestat = c.prepararDeclaracionPreparada(query);
            ResultSet rs= prestat.executeQuery();
            while(rs. next()) {
                Estetica estetica = new Estetica(
                rs.getInt("idEstetica"),
                rs.getString("nombre"),
                rs.getString("telefono"),
                rs.getString("calle"),
                rs.getInt("numCalle"),
                rs.getString("estado"),
                rs.getString("codigoPostal"),
                rs.getString("horaInicio"),
                rs.getString("horaFin"),
                rs.getInt("numConsultorios"));
                esteticas.add(estetica);
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

        return esteticas;
    }
    /**
     * Metodo que regresa una estetica dado su id
     * @param id ed de la estetica
     * @return la estetica que se identifica con ese id
     */
    public Estetica getEstetica(int id) {
        String query = "SELECT * FROM Estetica WHERE idEstetica = ?";
        Estetica estetica = null;
        try {
            c.conectar();
            prestat= c.prepararDeclaracionPreparada(query);
            prestat.setInt(1, id);
            ResultSet rs = prestat.executeQuery();
            while (rs.next()) {
                estetica = new Estetica(
                rs.getInt("idEstetica"),
                rs.getString("nombre"),
                rs.getString("telefono"),
                rs.getString("calle"),
                rs.getInt("numCalle"),
                rs.getString("estado"),
                rs.getString("codigoPostal"),
                rs.getString("horaInicio"),
                rs.getString("horaFin"),
                rs.getInt("numConsultorios"));
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

        return estetica;

    }

    /**
     * Metodo que actualiza en la base de datos un nuevo producto
     * @param estetica Objeto producto que se añadirá a la BD
     */
    public void insertarEstetica(Estetica estetica) {
        String query = "INSERT INTO Estetica " +
                "(idEstetica, nombre, telefono, calle,"
                + "numCalle, estado, codigoPostal, horaInicio, "
                + "horaFin, numConsultorios)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            c.conectar();
            prestat = c.prepararDeclaracionPreparada(query);
            prestat.setInt(1, estetica.getIdEstetica());
            prestat.setString(2, estetica.getNombre());
            prestat.setString(3, estetica.getTelefono());
            prestat.setString(4, estetica.getCalle());
            prestat.setInt(5, estetica.getNumCalle());
            prestat.setString(6, estetica.getEstado());
            prestat.setString(7, estetica.getCodigoPostal());
            prestat.setTime(8, Time.valueOf(LocalTime.parse(estetica.getHoraInicio())));
            prestat.setTime(9, Time.valueOf(LocalTime.parse(estetica.getHoraFin())));
            prestat.setInt(10, estetica.getNumConsultorios());
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

    public void actualizarEstetica(int idEstetica, Estetica act){

        String query = "UPDATE Estetica Set idEstetica = ?, nombre = ?, telefono = ?, " +
                "calle = ?, numcalle = ?, estado = ?, codigopostal = ?, horainicio = ?," +
                "horafin = ?, numconsultorios = ? WHERE idestetica = ?";

        try {

            c.conectar();
            prestat = c.prepararDeclaracionPreparada(query);
            prestat.setInt(1,act.getIdEstetica());
            prestat.setString(2,act.getNombre());
            prestat.setString(3, act.getTelefono());
            prestat.setString(4, act.getCalle());
            prestat.setInt(5,act.getNumCalle());
            prestat.setString(6, act.getEstado());
            prestat.setString(7, act.getCodigoPostal());
            prestat.setTime(8, Time.valueOf(LocalTime.parse(act.getHoraInicio())));
            prestat.setTime(9, Time.valueOf(LocalTime.parse(act.getHoraFin())));
            prestat.setInt(10, act.getNumConsultorios());
            prestat.setInt(11,idEstetica);
            prestat.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                c.cerrar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void borrarEstetica(int idEstetica){

        String query = "DELETE FROM estetica where idEstetica = ?";
        Scanner lector = new Scanner(System.in);
        Estetica temp;
        String resp;

        do {

            try{

                temp = getEstetica(idEstetica);
                System.out.println("¿Estas seguro de borrar el siguiente registro?\n" + temp.toString() + "\n\nY/N");
                resp = lector.nextLine();

                if ("Y".equals(resp))
                    try {
                        c.conectar();
                        prestat = c.prepararDeclaracionPreparada(query);
                        prestat.setInt(1, idEstetica);
                        prestat.executeUpdate();
                        break;
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                break;

            } catch (Exception e) {
                System.out.println("Formato incorrecto");
                break;
            } finally {
                try {
                    c.cerrar();
                } catch (SQLException e) {
                    e.printStackTrace();
                    break;
                }
            }

        } while (true);

    }
    
}
