/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaEnlazada;

import entidades.Cita;

/**
 *
 * @author HP
 */
public class Nodo {

    public Cita cita;
    public Nodo siguiente;

    public Nodo(Cita cita) {
        this.cita = cita;
        this.siguiente = null;
    }
}
