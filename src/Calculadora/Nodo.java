/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calculadora;

/**
 *
 * @author Administrador
 */
public class Nodo {
    private String dato;
	private Nodo siguiente;

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo(String d) {
		this.setDato(d);
		this.setSiguiente(null);
	}
}
