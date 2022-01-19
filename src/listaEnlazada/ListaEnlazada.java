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
public class ListaEnlazada {
    
    private Nodo cabeza;
    private int cantidad;

    public ListaEnlazada() {
        cabeza = null;
        cantidad = 0;
    }

    //AGREGAR AL INICIO
    public void agregarCitaInicio(Cita cita) {
        if (cabeza == null) {
            cabeza = new Nodo(cita);
        } else {
            Nodo nuevo = new Nodo(cita);
            nuevo.siguiente = (cabeza);
            cabeza = nuevo;
        }
        cantidad++;
    }

    //AGREGAR AL FINAL
    public void agregarCitaFinal(Cita cita) {
        if (cabeza == null) {
            cabeza = new Nodo(cita);
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            Nodo nuevo = new Nodo(cita);
            temp.siguiente = (nuevo);
        }
        cantidad++;
    }

    //AGREGAR EN UNA POSICION DADA
    public void agregarCitaPos(int index, Cita cita) {
        Nodo nuevo = new Nodo(cita);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            if (index == 0) {
                agregarCitaInicio(cita);
            } else {
                Nodo temp = cabeza;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.siguiente;
                }
                nuevo.siguiente = (temp.siguiente);
                temp.siguiente = (nuevo);
            }
        }
        cantidad++;
    }

    //ELIMINAR ARTICULO
    public void eliminarCita(int pos) {
        if (pos == 0) {
            cabeza = cabeza.siguiente;
        } else {
            int contador = 0;
            Nodo temp = cabeza;
            while (contador < pos - 1) {
                temp = temp.siguiente;
                contador++;
            }
            temp.siguiente = (temp.siguiente.siguiente);
        }
        cantidad--;
    }

    //MODIFICAR ARTICULO
    public void modificarNodo(Cita ant, Cita pos) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (cabeza.cita.equals(ant)) {
                temp.cita = (pos);
                break;
            }
            temp = temp.siguiente;
        }
    }

    //MOSTRAR ARTICULOS
    public void mostrarCitas() {
        Nodo n = cabeza;
        while (n != null) {
            System.out.println(n.cita);
            n = n.siguiente;
        }
    }

    public int tamanio() {
        return cantidad;
    }

    //OBTENER DATOS DE UN ARTICULO CON UNA POSICION DADA
    public Cita obtenerCita(int pos) {
        int contador = 0;
        Nodo temp = cabeza;

        while (contador < pos) {
            temp = temp.siguiente;
            contador++;
        }
        return temp.cita;
    }
    
}
