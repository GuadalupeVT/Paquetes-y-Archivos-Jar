package edu.tecjerez.topicos.figuras.tresDimensiones;

import edu.tecjerez.topicos.figuras.dosDimensiones.conicos.Circulo;

public class Cono {
	protected double areaBase(double radio) {
		Circulo c=new Circulo();
		return c.area(radio);
	}
	
	public double volumen(double radio, double altura) {
		return((areaBase(radio)*altura)/3);
	}

	protected double areaLateral(double r, double g) {
		return Math.PI*r*g;
	}
	
	public double areaTotal (double radio,double g) {
		return areaBase(radio)+areaTotal(radio, g);
	}
}
