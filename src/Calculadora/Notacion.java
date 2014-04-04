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
public class Notacion {
    Cola c = new Cola();

	public Notacion() {
	}
	
	public boolean isNumero(NodoDoble aux) {
		if (tipo(aux.getDato()) == "numero")
			return true;
		else
			return false;
	}
	
	public int prioridad(String x) {
		int prioridad;
		if (x == "^")
			prioridad = 3;
		else if ((x == "*") || (x == "/"))
			prioridad = 2;
		else
			prioridad = 1;
		return prioridad;
	}

	public String tipo(String x) {
		String tipo = "numero";
		if ((x == "(") || (x == ")") || (x == "^") || (x == "*") || (x == "/")
				|| (x == "+") || (x == "-")) {
			tipo = "operador";
		}
		return tipo;
	}

	public boolean isNumero(char x) {
		if ((x == '(') || (x == ')') || (x == '/') || (x == '*') || (x == '+')
				|| (x == '-') || (x == '^')) {
			return false;
		} else
			return true;
	}

	public String resuelvePolaca(Cola c) throws Exception {
		NodoDoble aux = c.getFin();
		String resultado = "";
		Pila pilaNumeros = new Pila();
		while (aux != null) {
			if (tipo(aux.getDato()) == "numero") {
				pilaNumeros.push(aux.getDato());
			} else {
				double r = 0;
				String x = pilaNumeros.pop();
				String y = pilaNumeros.pop();
				switch (aux.getDato()) {
				case "+":
					r = Double.parseDouble(y) + Double.parseDouble(x);
					break;
				case "-":
					r = Double.parseDouble(y) - Double.parseDouble(x);
					break;
				case "*":
					r = Double.parseDouble(y) * Double.parseDouble(x);
					break;
				case "/":
					r = Double.parseDouble(y) / Double.parseDouble(x);
					break;
				case "^":
					r = Math.pow(Double.parseDouble(y), Double.parseDouble(x));
					break;
				}
				resultado = "" + r;
				pilaNumeros.push(resultado);
			}
			aux = aux.getAnterior();
		}
		return resultado;
	}

	public Cola postFija(Cola cola) throws Exception {
		Pila p = new Pila();
		Cola c = cola;
		Cola pos = new Cola();
		NodoDoble aux = c.getFin();
		boolean bandera = false;
		while (aux != null) {
			if (tipo(aux.getDato()) == "numero") {
				pos.push(aux.getDato());
			} else {
				if (p.isVacia()) {
					p.push(aux.getDato());
				} else {
					if (aux.getDato() == "(") {
						p.push(aux.getDato());
						bandera = true;
					} else if (bandera == true) {
						p.push(aux.getDato());
						if (p.getInicio().getDato() == ")") {
							Nodo aux2 = p.getInicio();
							p.pop();
							while (aux2.getDato() != "(") {
								pos.push(p.pop());
								aux2 = p.getInicio();
							}
							p.pop();
							bandera = false;
						}
					} else if ((prioridad(p.getInicio().getDato())) >= (prioridad(aux
							.getDato()))) {
						pos.push(p.pop());
						p.push(aux.getDato());
					} else {
						p.push(aux.getDato());
					}
				}
			}
			aux = aux.getAnterior();
		}
		while (p.getInicio() != null)
			pos.push(p.pop());
		return pos;
	}

	public Cola toNodos(String cadena) {
		Cola c = new Cola();
		for (int i = 0; i < cadena.length(); i++) {
			if (isNumero(cadena.charAt(i))) {
				c.push(cadena.charAt(i) + "");
			} else {
				switch (cadena.charAt(i)) {
				case '(':
					c.push("(");
					break;
				case ')':
					c.push(")");
					break;
				case '^':
					c.push("^");
					break;
				case '/':
					c.push("/");
					break;
				case '*':
					c.push("*");
					break;
				case '+':
					c.push("+");
					break;
				case '-':
					c.push("-");
					break;
				}
			}
		}
		return c;
	}

	public Cola acomoda(Cola c) {
		NodoDoble aux = c.getFin();
		String x = "";
		Cola nueva = new Cola();
		while (aux != null) {
			if (tipo(aux.getDato()) == "numero") {
				x = x + aux.getDato();
				while ((aux.getAnterior() != null)
						&& (tipo(aux.getAnterior().getDato()) == "numero")) {
					x = x + aux.getAnterior().getDato();
					aux = aux.getAnterior();
				}
				nueva.push(x);
				x = "";
			} else
				nueva.push(aux.getDato());
			aux = aux.getAnterior();
		}
		return nueva;
	}
}
