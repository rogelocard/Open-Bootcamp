package openBootcamp.estructurasControl;

public class Main {

	public static void main(String[] args) {
		/***
		 * Usando un if, crear una condici�n que compare si la variable numeroIf es
		 * positivo, negativo, o 0.
		 */

		// CONDICIONAL IF:

		int numeroIf = -4;

		if (numeroIf > 0) {
			System.out.println("El numero " + numeroIf + " es positivo");
		} else if (numeroIf < 0) {
			System.out.println("El numero " + numeroIf + " es negativo");
		} else {
			System.out.println("El numero " + numeroIf + " es igual a 0");
		}

		/***
		 * Crea un bucle While, este bucle tendr� que tener como condici�n que la
		 * variable numeroWhile sea inferior a 3, el bloque de c�digo que tendr� el
		 * bucle deber�: Incrementar el valor de la variable en uno cada vez que se
		 * ejecute. Mostrarlo por pantalla cada vez que se ejecute.
		 */

		// CICLO WHILE:

		int numeroWhile = 0;

		while (numeroWhile < 3) {
			System.out.println(numeroWhile);
			numeroWhile++;
		}

		/***
		 * Para el bucle Do While, deber�s crear la misma estructura que en el While,
		 * pero solo se debe ejecutar una vez.
		 */

		// DO-WHILE

		int numeroDoWhile = 0;

		do {
			numeroDoWhile++;
			System.out.println(numeroDoWhile);
		} while (numeroDoWhile < 3);

		/***
		 * Para el bucle For, crea una variable numeroFor, esta variable tendr� como
		 * valor 0 y su condici�n ser� que la variable sea igual o menor que 3, se ir�
		 * incrementando en 1 su valor cada vez que se ejecute y deber� mostrarse por
		 * pantalla.
		 */

		// FOR:
		for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println(numeroFor);
		}

		/***
		 * Por �ltimo, para el Switch, deber�s crear la variable estacion, y distintos
		 * case para las cuatro estaciones del a�o. Dependiendo del valor de la variable
		 * estacion se deber� mandar un mensaje por consola informando de la estaci�n en
		 * la que est�. Tambi�n habr� que poner un default para cuando el valor de la
		 * variable no sea una estaci�n.
		 */

		// SWITCH:

		String estacion = "Invierno";

		switch (estacion) {
		case "Verano":
			System.out.println("La estacion es verano");
			break;
		case "Invierno":
			System.out.println("La estacion es invierno");
			break;
		case "Oto�o":
			System.out.println("La estacion es Oto�o");
		case "Primavera":
			System.out.println("La estacion es Primavera");
		default:
			System.out.println("Lo siento no es una estacion");

		}

	}
}
