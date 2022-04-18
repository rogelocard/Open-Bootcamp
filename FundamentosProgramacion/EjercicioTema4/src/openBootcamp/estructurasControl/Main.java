package openBootcamp.estructurasControl;

public class Main {

	public static void main(String[] args) {
		/***
		 * Usando un if, crear una condición que compare si la variable numeroIf es
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
		 * Crea un bucle While, este bucle tendrá que tener como condición que la
		 * variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
		 * bucle deberá: Incrementar el valor de la variable en uno cada vez que se
		 * ejecute. Mostrarlo por pantalla cada vez que se ejecute.
		 */

		// CICLO WHILE:

		int numeroWhile = 0;

		while (numeroWhile < 3) {
			System.out.println(numeroWhile);
			numeroWhile++;
		}

		/***
		 * Para el bucle Do While, deberás crear la misma estructura que en el While,
		 * pero solo se debe ejecutar una vez.
		 */

		// DO-WHILE

		int numeroDoWhile = 0;

		do {
			numeroDoWhile++;
			System.out.println(numeroDoWhile);
		} while (numeroDoWhile < 3);

		/***
		 * Para el bucle For, crea una variable numeroFor, esta variable tendrá como
		 * valor 0 y su condición será que la variable sea igual o menor que 3, se irá
		 * incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
		 * pantalla.
		 */

		// FOR:
		for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println(numeroFor);
		}

		/***
		 * Por último, para el Switch, deberás crear la variable estacion, y distintos
		 * case para las cuatro estaciones del año. Dependiendo del valor de la variable
		 * estacion se deberá mandar un mensaje por consola informando de la estación en
		 * la que está. También habrá que poner un default para cuando el valor de la
		 * variable no sea una estación.
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
		case "Otoño":
			System.out.println("La estacion es Otoño");
		case "Primavera":
			System.out.println("La estacion es Primavera");
		default:
			System.out.println("Lo siento no es una estacion");

		}

	}
}
