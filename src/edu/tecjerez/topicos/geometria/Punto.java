package edu.tecjerez.topicos.geometria;

public class Punto {

	    int coordenadaX;
	    int coordenadaY;
	    PuntoPrueba pp=new PuntoPrueba();
	//metodo para calcular la distancia entre dos puntos
	double obtenerDistancia(Punto punto1, Punto punto2) {
		return Math.sqrt(Math.abs( ( ( punto2.coordenadaX-punto2.coordenadaX)*(punto2.coordenadaX-punto2.coordenadaX) ) +  ( (punto2.coordenadaY-punto2.coordenadaY)*(punto2.coordenadaY-punto2.coordenadaY) )  ));
		
	}
}

class PuntoPrueba{ //modificador de acceso 
	double x=new Punto().obtenerDistancia(new Punto(), new Punto());
}