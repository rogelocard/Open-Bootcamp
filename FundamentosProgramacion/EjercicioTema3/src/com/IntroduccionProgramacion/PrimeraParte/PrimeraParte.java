package com.IntroduccionProgramacion.PrimeraParte;

/***
 * Primera parte:
 * Crear una funci�n con tres par�metros que sean n�meros que se suman entre s�.
 * Llamar a la funci�n en el main y darle valores.
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

