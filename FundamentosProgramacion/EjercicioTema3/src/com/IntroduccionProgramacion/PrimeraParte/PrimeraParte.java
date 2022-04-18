package com.IntroduccionProgramacion.PrimeraParte;

/***
 * Primera parte:
 * Crear una función con tres parámetros que sean números que se suman entre sí.
 * Llamar a la función en el main y darle valores.
 */

public class PrimeraParte {

	public static void main(String[] args) {
		
		int resultadoSuma = suma(10, 20, 10);
		
		System.out.println(resultadoSuma);

	}
	
	public static int suma(int a, int b, int c) {
		return a + b + c;
	}
}

