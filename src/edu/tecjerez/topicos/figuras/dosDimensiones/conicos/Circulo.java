package edu.tecjerez.topicos.figuras.dosDimensiones.conicos;

public class Circulo {
	
	public double area (double radio) {
		return Math.PI*(radio*radio);
	}
	
	public double perimetro(double radio) {
		return 2*Math.PI*radio;
	}

}
