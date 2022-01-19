/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

import entidades.Cita;

/**
 *
 * @author HP
 */
public class Nodo {
    public Nodo siguiente;
    public Cita cita;

    public Nodo(Cita cita) {
        this.siguiente = null;
        this.cita = cita;
    }
}
