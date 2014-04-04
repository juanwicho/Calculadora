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
public class Pila {
    private Nodo inicio;

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public Pila() {
		inicio = null;
	}

	public void push(String d) {
		Nodo nuevo = new Nodo(d);
		if (inicio == null)
			inicio = nuevo;
		else {
			nuevo.setSiguiente(inicio);
			inicio = nuevo;
		}
	}

	public boolean isVacia() {
		return inicio == null;
	}

	public String pop() throws Exception {
		if (isVacia())
			throw new Exception("La pila esta vacía");
		else {
			Nodo aux = inicio;
			inicio = inicio.getSiguiente();
			aux.setSiguiente(null);
			String resultado = aux.getDato();
			aux = null;
			return resultado;
		}
	}
	
	public void recorrerPila(){
		Nodo aux=inicio;
		while(aux!=null){
			System.out.println(aux.getDato());
			aux=aux.getSiguiente();
		}
	}
	
	public String sacarInicio(){
		return inicio.getDato();
	}
}
