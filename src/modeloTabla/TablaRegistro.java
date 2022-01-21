/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloTabla;

import formulario.Principal;
import javax.swing.table.AbstractTableModel;
import listaEnlazada.ListaEnlazada;

/**
 *
 * @author HP
 */
public class TablaRegistro extends AbstractTableModel {

    private final ListaEnlazada lista = Principal.lista;
    private final String[] titules = {"Nombres", "Apellidos", "Dni", "Telefono", "Correo", "Fecha N", "Sexo", "Dia", "Hora", "Sintomas"};

    
    @Override
    public int getRowCount() {
        return lista.tamanio();
    }

    @Override
    public int getColumnCount() {
        return titules.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lista.obtenerCita(rowIndex).getPaciente().getNombre();
            case 1:
                return lista.obtenerCita(rowIndex).getPaciente().getApellido();
            case 2:
                return lista.obtenerCita(rowIndex).getPaciente().getDni();
            case 3:
                return lista.obtenerCita(rowIndex).getPaciente().getTelefono();
            case 4:
                return lista.obtenerCita(rowIndex).getPaciente().getEmail();
            case 5:
                return lista.obtenerCita(rowIndex).getPaciente().getFechaNacimiento();
            case 6:
                return lista.obtenerCita(rowIndex).getPaciente().getSexo();
            case 7:
                return lista.obtenerCita(rowIndex).getFecha();
            case 8:
                return lista.obtenerCita(rowIndex).getHora();
            case 9:
                return lista.obtenerCita(rowIndex).getSintomas();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return titules[column];
    }
    
    

}
