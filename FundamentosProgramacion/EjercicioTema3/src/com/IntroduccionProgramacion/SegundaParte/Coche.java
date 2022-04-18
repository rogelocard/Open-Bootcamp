package com.IntroduccionProgramacion.SegundaParte;
/****
 * Segunda parte:
 * Crear una clase coche.
 * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * Una función que incremente el número de puertas que tiene el coche.
 * Crear un objeto miCoche en el main y añadirle una puerta.
 * Mostrar el número de puertas que tiene el objeto.
 */

public class Coche {

	public static void main(String[] args) {
		
		miCoche coche = new miCoche();
		coche.aniadirPuertas(); 
		
		System.out.println(coche.numeroPuertas);
	}
	
}

class miCoche{
	
	public int numeroPuertas = 0;
	
	public void aniadirPuertas() {
		this.numeroPuertas++;
	}
}
