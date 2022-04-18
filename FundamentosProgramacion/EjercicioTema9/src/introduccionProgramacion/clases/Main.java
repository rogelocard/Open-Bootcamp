package introduccionProgramacion.clases;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();		
		cliente1.nombre= "Roger";
		cliente1.edad = 20;
		cliente1.telefono = 654992123;
		cliente1.credito = 7.8;
		System.out.println("Mi nombre es " + cliente1.nombre +
							" tengo " + cliente1.edad + " anios, mi telefono es: " + cliente1.telefono + 
							" y mi puntaje de credito es: " + cliente1.credito);
		
		Trabajador trabajador1 = new Trabajador();
		trabajador1.nombre = "Juan";
		trabajador1.edad = 19;
		trabajador1.telefono = 321243234;
		trabajador1.salario = 2300;
		
		System.out.println("Mi nombre es " + trabajador1.nombre +
				" tengo " + trabajador1.edad + " anios, mi telefono es: " + trabajador1.telefono + 
				" y mi salario es: " + trabajador1.salario);
	}

}

class Persona {
	
	public int edad;
	public String nombre;
	public int telefono;
		
}

class Cliente extends Persona {
	
	public double credito;
}

class Trabajador extends Persona{
	
	public double salario;
}