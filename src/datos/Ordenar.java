/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.Cita;

/**
 *
 * @author HP
 */
public class Ordenar {
    private Cita cita;
    private int orden;

    public Ordenar(Cita cita, int orden) {
        this.cita = cita;
        this.orden = orden;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public int getPos() {
        return orden;
    }

    public void setPos(int orden) {
        this.orden = orden;
    }
    
}
