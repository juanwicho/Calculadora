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
import javax.swing.*;
import javax.swing.border.EmptyBorder;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JTextField pantalla;
	JButton uno;
	JButton dos;
	JButton tres;
	JButton cuatro;
	JButton cinco;
	JButton seis;
	JButton siete;
	JButton ocho;
	JButton nueve;
	JButton cero;
	JButton mas;
	JButton menos;
	JButton por;
	JButton entre;
	JButton exponente;
	JButton parentesisAbre;
	JButton parentesisCierra;
	JButton igual;
	JButton limpiar;
    String texto="";

	public Ventana() {
		setTitle("CalculadoraPlus");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new BorderLayout());
		panel.setBackground(java.awt.Color.CYAN);
		pantalla = new JTextField("0", 20);
		pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
		pantalla.setFont(new Font("Arial", Font.CENTER_BASELINE, 25));
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		pantalla.setEditable(false);
		pantalla.setBackground(Color.white);
		pantalla.setBounds(20, 10, 300, 75);

		setLayout(null);
		uno = new JButton("1");
		uno.setBounds(10, 220, 50, 50);
		dos = new JButton("2");
		dos.setBounds(70, 220, 50, 50);
		tres = new JButton("3");
		tres.setBounds(130, 220, 50, 50);
		cuatro = new JButton("4");
		cuatro.setBounds(10, 160, 50, 50);
		cinco = new JButton("5");
		cinco.setBounds(70, 160, 50, 50);
		seis = new JButton("6");
		seis.setBounds(130, 160, 50, 50);
		siete = new JButton("7");
		siete.setBounds(10, 100, 50, 50);
		ocho = new JButton("8");
		ocho.setBounds(70, 100, 50, 50);
		nueve = new JButton("9");
		nueve.setBounds(130, 100, 50, 50);
		cero = new JButton("0");
		cero.setBounds(190, 100, 50, 50);
		mas = new JButton("+");
		mas.setBounds(190, 220, 50, 50);
		menos = new JButton("-");
		menos.setBounds(250, 220, 50, 50);
		por = new JButton("*");
		por.setBounds(190, 160, 50, 50);
		entre = new JButton("/");
		entre.setBounds(250, 160, 50, 50);
		exponente = new JButton("^");
		exponente.setBounds(310, 160, 50, 50);
		igual = new JButton("=");
		igual.setBounds(10, 280, 350, 50);
		parentesisAbre = new JButton("(");
		parentesisAbre.setBounds(250, 100, 50, 50);
		parentesisCierra = new JButton(")");
		parentesisCierra.setBounds(310, 100, 50, 50);
		limpiar = new JButton("ac");
		limpiar.setBounds(310, 220, 50, 50);
		add(uno);
		add(dos);
		add(tres);
		add(cuatro);
		add(cinco);
		add(seis);
		add(siete);
		add(ocho);
		add(nueve);
		add(cero);
		add(parentesisAbre);
		add(parentesisCierra);
		add(por);
		add(entre);
		add(mas);
		add(menos);
		add(exponente);
		add(igual);
		add(limpiar);
		add(pantalla);
		uno.addActionListener(this);
		dos.addActionListener(this);
		tres.addActionListener(this);
		cuatro.addActionListener(this);
		cinco.addActionListener(this);
		seis.addActionListener(this);
		siete.addActionListener(this);
		ocho.addActionListener(this);
		nueve.addActionListener(this);
		cero.addActionListener(this);
		mas.addActionListener(this);
		menos.addActionListener(this);
		por.addActionListener(this);
		entre.addActionListener(this);
		exponente.addActionListener(this);
		igual.addActionListener(this);
		limpiar.addActionListener(this);
		parentesisAbre.addActionListener(this);
		parentesisCierra.addActionListener(this);
		this.setBounds(100, 100, 370, 350);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource()==uno) {
	            pantalla.setText(texto+"1");
	            texto=texto+"1";
	        }
		 if (e.getSource()==dos) {
	            pantalla.setText(texto+"2");
	            texto=texto+"2";
	        }
		 if (e.getSource()==tres) {
	            pantalla.setText(texto+"3");
	            texto=texto+"3";
	        }
		 if (e.getSource()==cuatro) {
	            pantalla.setText(texto+"4");
	            texto=texto+"4";
	        }
		 if (e.getSource()==cinco) {
	            pantalla.setText(texto+"5");
	            texto=texto+"5";
	        }
		 if (e.getSource()==seis) {
	            pantalla.setText(texto+"6");
	            texto=texto+"6";
	        }
		 if (e.getSource()==siete) {
	            pantalla.setText(texto+"7");
	            texto=texto+"7";
	        }
		 if (e.getSource()==ocho) {
	            pantalla.setText(texto+"8");
	            texto=texto+"8";
	        }
		 if (e.getSource()==nueve) {
	            pantalla.setText(texto+"9");
	            texto=texto+"9";
	        }
		 if (e.getSource()==cero) {
	            pantalla.setText(texto+"0");
	            texto=texto+"0";
	        }
		 if (e.getSource()==mas) {
	            pantalla.setText(texto+"+");
	            texto=texto+"+";
	        }
		 if (e.getSource()==menos) {
	            pantalla.setText(texto+"-");
	            texto=texto+"-";
	        }
		 if (e.getSource()==por) {
	            pantalla.setText(texto+"*");
	            texto=texto+"*";
	        }
		 if (e.getSource()==entre) {
	            pantalla.setText(texto+"/");
	            texto=texto+"/";
	        }
		 if (e.getSource()==parentesisAbre) {
	            pantalla.setText(texto+"(");
	            texto=texto+"(";
	        }
		 if (e.getSource()==parentesisCierra) {
	            pantalla.setText(texto+")");
	            texto=texto+")";
	        }
		 if (e.getSource()==exponente) {
	            pantalla.setText(texto+"^");
	            texto=texto+"^";
	        }
		 if (e.getSource()==limpiar) {
	            pantalla.setText("");
	            texto="";
	        }
		 if (e.getSource()==igual) {
			 String resultado="";
			Notacion p= new Notacion();
	            try {
					 resultado=p.resuelvePolaca(p.postFija(p.acomoda(p.toNodos(texto))));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
	            pantalla.setText(resultado);
	            resultado="";
	            texto="";
	        }
	}
}
