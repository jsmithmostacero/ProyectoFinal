/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author HP
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import entidades.Cita;

/**
 *
 * @author HP
 */
public class Pila {
	public Nodo cima;
	public int cantidad;
	
	public Pila() {
		this.cima = null;
		this.cantidad = 0;
	}
	
	public void push(Cita cita) {
		Nodo nuevo = new Nodo(cita);
		nuevo.siguiente = cima;
		cima = nuevo;
		cantidad++;
	}
	
	public boolean empty() {
		if(cima == null)
			return true;
		return false;
	}
	
	public void pop() {
		if(!empty()) {
			Nodo temporal = cima;
			cima = cima.siguiente;
			temporal.siguiente = null;
			cantidad--;
		}
	}
	
	public Cita peek() {
		if(empty())
			return null;
		return cima.cita;
	}
	
	public int tamaño() {
		return cantidad;
	}
}
    
