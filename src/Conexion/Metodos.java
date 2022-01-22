 ;
package Conexion;

import entidades.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jsmith
 */


public class Metodos {

    private static Connection cn = null;
    private static PreparedStatement ps = null;
    private static Statement st = null;
    private static ResultSet rs = null;

    public static String insertarCita(Cita cita) {
        String mensaje = null;
        try {
            cn = Conecion_MySQL.realizarConexion();
            String sql = "insert into paciente values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, cita.getId());
            ps.setString(2, cita.getFecha());
            ps.setString(3, cita.getHora());
            ps.setString(4, cita.getMotivo());
            ps.setString(5, cita.getSintomas());
            ps.setString(6, cita.getPaciente().getNombre());
            ps.setString(7, cita.getPaciente().getApellido());
            ps.setString(8, cita.getPaciente().getDni());
            ps.setString(9, cita.getPaciente().getTelefono());
            ps.setString(10, cita.getPaciente().getDireccion());
            ps.setString(11, cita.getPaciente().getEmail());
            ps.setString(12, cita.getPaciente().getFechaNacimiento());
            ps.setString(13, cita.getPaciente().getSexo());
            ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                ps.close();
                cn.close();
            } catch (SQLException ex) {
                mensaje = ex.getMessage();
            }
        }
        return mensaje;
    }

    // Crear metodo para eliminar un registro segun objeto
    public static String eliminarCita(Cita cita) {
        String mensaje = null;
        try {
            cn = Conecion_MySQL.realizarConexion();
            String sql = "delete from paciente where id = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, cita.getId());
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        }

        return mensaje;
    }

    public static void eliminar() {
        try {
            cn = Conecion_MySQL.realizarConexion();
            String sql = "drop database if exists scitas";
            ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            sql = "create database scitas";
            ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            sql = "use scitas";
            ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            sql = "CREATE TABLE paciente(\n"
                    + "  id int not null,\n"
                    + "  fecha VARCHAR(50) NOT NULL,\n"
                    + "  hora VARCHAR(50) NOT NULL,\n"
                    + "  motivo VARCHAR(50) NOT NULL,\n"
                    + "  sintomas VARCHAR(50) NOT NULL,\n"
                    + "  nombre VARCHAR(50) NOT NULL,\n"
                    + "  apellidos VARCHAR(50) NOT NULL,\n"
                    + "  dni VARCHAR(8) NOT NULL,\n"
                    + "  telefono VARCHAR(50) NOT NULL,\n"
                    + "  direccion VARCHAR(50) NOT NULL,\n"
                    + "  email VARCHAR(50) NOT NULL,\n"
                    + "  fecha_nacimiento VARCHAR(50) NOT NULL,\n"
                    + "  sexo VARCHAR(50) NOT NULL,\n"
                    + "  PRIMARY key(id)\n"
                    + ")";

            ps = cn.prepareStatement(sql);
            ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }

    }

}
