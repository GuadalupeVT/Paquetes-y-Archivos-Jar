package edu.tecjerez.topicos.figuras;

public class Triangulo {

	//metodo que calcule el area de un triangulo a traves
	//de la formula de Heron
	
	public double area(double a, double b, double c) {
		double s=(a+b+c)/2;
		return Math.sqrt(Math.abs(s*(s-a)*(s-b)*(s-c)));
	}
}
