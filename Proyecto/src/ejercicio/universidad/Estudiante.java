package ejercicio.universidad;

public class Estudiante {
	
	private String nombre;
	private int edad;
	private Carrera carrera;
	
	public Estudiante(String nombre, int edad, Carrera carrera) {
		this.nombre=nombre;
		this.edad=edad;
		this.carrera=carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	
}
