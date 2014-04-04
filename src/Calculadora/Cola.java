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
public class Cola {
    private NodoDoble inicio;
	private NodoDoble fin;

	public NodoDoble getInicio() {
		return inicio;
	}

	public void setInicio(NodoDoble inicio) {
		this.inicio = inicio;
	}

	public NodoDoble getFin() {
		return fin;
	}

	public void setFin(NodoDoble fin) {
		this.fin = fin;
	}

	public Cola() {
		inicio = null;
		inicio = fin;
	}

	public void push(String d) {
		NodoDoble nuevo = new NodoDoble(d);
		if (inicio == null) {
			inicio = nuevo;
			fin = nuevo;
		} else {
			nuevo.setSiguiente(inicio);
			inicio.setAnterior(nuevo);
			inicio = nuevo;
		}
	}

	public boolean isVacia() {
		return inicio == null;
	}

	public String pop() throws Exception {
		if (isVacia())
			throw new Exception("La cola está vacía");
		else if (inicio != fin) {
			NodoDoble aux = fin;
			fin = fin.getAnterior();
			fin.setSiguiente(null);
			aux.setAnterior(null);
			String resultado = aux.getDato();
			aux = null;
			return resultado;
		} else {
			String resultado = inicio.getDato();
			inicio = null;
			fin = null;
			return resultado;
		}
	}
	
	public void recorrerCola(){
		NodoDoble aux=inicio;
		while(aux!=null){
			System.out.print(aux.getDato());
			aux=aux.getSiguiente();
		}
	}
	public void ordenarCola(){
		NodoDoble aux=fin;
		while(aux!=null){
			System.out.print(aux.getDato());
			aux=aux.getAnterior();
		}
	}
}
