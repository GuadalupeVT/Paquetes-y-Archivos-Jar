package edu.tecjerez.topicos.vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import edu.tecjerez.topicos.geometria.Punto;

public class VentanaInicio extends JFrame implements ActionListener{
	JTextField cajaX, cajaY;
	JButton btnTriangulo;
	public VentanaInicio(){
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		
		
		
		
		
		JLabel lbl1=new JLabel("Ingresa el valor de X");
		lbl1.setBounds(10,20,120,20);
		add(lbl1);
		
		cajaX = new JTextField();
		cajaX.setBounds(130,20,100,20);
		add(cajaX);
		
		JLabel lbl2=new JLabel("Ingresa el valor de Y");
		lbl2.setBounds(10,50,120,20);
		add(lbl2);
		
		cajaY = new JTextField();
		cajaY.setBounds(130,50,100,20);
		add(cajaY);
		
		btnTriangulo=new JButton("Calcular Area del triangulo");
		btnTriangulo.setBounds(100, 80, 200, 30);
		add(btnTriangulo);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Punto obj1=new Punto();
		
		//PuntoPrueba obj2=new PuntoPrueba();
		//No se puede usar la clase PuntoPrueba ya que no
		//es publica y ademas esta en otro paquete
		
		
		
	}

}
