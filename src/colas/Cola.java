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
public class Cola {
    public Nodo cabeza, ultimo;
	public int cantidad;
	
	public Cola() {
		cabeza = null;
		ultimo = null;
		cantidad = 0;
	}
	
	public void encolar(Cita cita) {
		Nodo nuevo = new Nodo(cita);
		
		if(cabeza == null) {
			cabeza = nuevo;
			ultimo = nuevo;
		}
		else {
			ultimo.siguiente = nuevo;
			ultimo = nuevo;
		}
		cantidad++;
	}
	
	public void desencolar() {
		if(!estaVacio()) {
			Nodo temporal = cabeza;
			cabeza = cabeza.siguiente;
			temporal.siguiente = null;
			if(cabeza == null)
				ultimo = null;
			
			cantidad--;
		}
	}
	
	public Cita obtener() {
		if(cabeza == null)
			return null;
		
		return cabeza.cita;
	}
	
	public boolean estaVacio() {
		if(cabeza == null)
			return true;
		return false;
	}
	
	public int tamaño() {
		return cantidad;
	}
        public Cita buscar(int i){
        Nodo temp = cabeza;
        if(temp!=null){
            int cont=0;
            while (temp!=null) {
                if(i==cont){
                    return temp.cita;
                }
                cont++;
                temp = temp.siguiente;
            }
        } 
        return null;
    }
        
    
}
