;package Conexion;


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
            //System.out.println("se añadió");
//            fecha VARCHAR(50) NOT NULL,
//  hora VARCHAR(50) NOT NULL,
//  motivo VARCHAR(50) NOT NULL,
//  sintomas VARCHAR(50) NOT NULL,
//  nombre VARCHAR(50) NOT NULL,
//  apellidos VARCHAR(50) NOT NULL,
//  dni VARCHAR(50) NOT NULL,
//  telefono VARCHAR(50) NOT NULL,
//  direccion VARCHAR(50) NOT NULL,
//  email VARCHAR(50) NOT NULL,
//  fecha_nacimiento VARCHAR(50) NOT NULL,
//  sexo VARCHAR(50) NOT NULL,
            cn = Conecion_MySQL.realizarConexion();
            String sql = "insert into paciente values(?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, cita.getFecha());
            ps.setString(2, cita.getHora());
            ps.setString(3, cita.getMotivo());
            ps.setString(4, cita.getSintomas());
            ps.setString(5, cita.getPaciente().getNombre());
            ps.setString(6, cita.getPaciente().getApellido());
            ps.setString(7, cita.getPaciente().getDni());
            ps.setString(8, cita.getPaciente().getTelefono());
            ps.setString(9, cita.getPaciente().getDireccion());
            ps.setString(10, cita.getPaciente().getEmail());
            ps.setString(11, cita.getPaciente().getFechaNacimiento());
            ps.setString(12, cita.getPaciente().getSexo());
            ps.executeUpdate();
            
        } catch(ClassNotFoundException | SQLException ex) {
            mensaje = ex.getMessage();
        } finally {
            try {
                ps.close();
                cn.close();
            }catch(SQLException ex) {
                mensaje = ex.getMessage();
            }
        }
        return mensaje;
    }

//    public static ArrayList<Cita> listarCitas() {
//        ArrayList<Cita> citas = new ArrayList<>();
//        try {
//            cn = Conecion_MySQL.realizarConexion();
//            st = cn.createStatement();
//            String sql = "select * from cita";
//            rs = st.executeQuery(sql);
//            while(rs.next()) {
//                citas.add(new Cita(rs.getInt(1),rs.getString(2), rs.getInt(3)));
//            }
//        } catch (ClassNotFoundException | SQLException ex) {
//            showMessageDialog(null,ex.getMessage(),"Error",0);
//        } finally {
//            try {
//                rs.close();
//                st.close();
//                cn.close();
//            }catch(SQLException ex) {
//                showMessageDialog(null,ex.getMessage(),"Error",0);
//            }
//        }
//        return citas;
//    }
    

}
