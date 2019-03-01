package edu.tecjerez.topicos.figuras.tresDimensiones;

import edu.tecjerez.topicos.figuras.Triangulo;
import edu.tecjerez.topicos.geometria.Punto;

public class Piramide {

	private double areaBase (double lado) {
		return (4*lado);
	}
	
	private double areaLateral (double lado1,double lado2,double lado3) {
		Triangulo a= new Triangulo();
		return (a.area(lado1,lado2,lado3)*4);
	}
	
	double voulumen (double lado, double altura) {
		return (areaBase(lado)*altura)/3;
	}
	public double areaTotal(double lado1,double lado2,double lado3, double base) {
		return (areaBase(base)+areaLateral(lado1,lado2,lado3));
	}

}

