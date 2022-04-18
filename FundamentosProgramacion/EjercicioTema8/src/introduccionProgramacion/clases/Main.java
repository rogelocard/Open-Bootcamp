package introduccionProgramacion.clases;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.setNombre("Steven Arias");
		persona1.setEdad(20);
		persona1.setTelefono(754932123);
		
		System.out.println("Mi nombre es " + persona1.getNombre() +
							" tengo " + persona1.getEdad() + " anios y mi telefono es: " + persona1.getTelefono());	
	}

}

class Persona {
	
	private int edad;
	private String nombre;
	private int telefono;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
		
}
