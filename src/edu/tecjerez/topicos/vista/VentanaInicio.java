package edu.tecjerez.topicos.vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import edu.tecjerez.topicos.figuras.Triangulo;
import edu.tecjerez.topicos.figuras.dosDimensiones.conicos.Circulo;
import edu.tecjerez.topicos.figuras.dosDimensiones.conicos.Elipse;
import edu.tecjerez.topicos.figuras.dosDimensiones.poligonos.Rombo;
import edu.tecjerez.topicos.figuras.tresDimensiones.Cono;
import edu.tecjerez.topicos.figuras.tresDimensiones.Piramide;
import edu.tecjerez.topicos.geometria.Punto;

public class VentanaInicio extends JFrame implements ActionListener{
	JLabel lblResultados;
	Punto obj1=new Punto();
	Triangulo triangulo=new Triangulo();
	Circulo circulo = new Circulo();
	Elipse elipse=new Elipse();
	Rombo rombo=new Rombo();
	Cono cono = new Cono();
	Piramide piramide = new Piramide();
	
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
		btnTriangulo.addActionListener(this);
		add(btnTriangulo);
		
		lblResultados =new JLabel();
		lblResultados.setBounds(50,50,500,300);
		add(lblResultados);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource()==btnTriangulo) {
			lblResultados.setText("<html>Area cono: "+cono.areaTotal(14, 8)+
					"<br>Volumen cono: "+cono.volumen(14, 25)+
					"<br>Area piramide: "+piramide.areaTotal(6, 7, 9, 10)+
					"<br>Volumen piramide: "+piramide.volumen(5, 14)+
					"<br>Elipse area: "+elipse.area(5, 8)+
					"<br>Elipse perimetro: "+elipse.perimetro(12, 7)+
					"<br>Area circulo: "+circulo.area(34)+
					"<br>Perimetro circulo: "+circulo.perimetro(34)+
					"<br>Area rombo: "+rombo.area(52)+
					"<br>Perimetro rombo: "+rombo.perimetro(14,26)+"</html>");
			
		}
		//PuntoPrueba obj2=new PuntoPrueba();
		//No se puede usar la clase PuntoPrueba ya que no
		//es publica y ademas esta en otro paquete
		
		
		
	}

}
