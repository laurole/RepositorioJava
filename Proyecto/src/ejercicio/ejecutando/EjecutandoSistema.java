package ejercicio.ejecutando;

import java.util.ArrayList;
import java.util.List;

import ejercicio.universidad.Carrera;
import ejercicio.universidad.Estudiante;

public class EjecutandoSistema {

	public static void main(String[] args) {
		
		Carrera c1 = new Carrera(00526, "Ingenieria de Sistemas");
		Carrera c2 = new Carrera(58942, "Licenciatura en Matemáticas");
		Estudiante e1;
		Estudiante e2;
		
		List<String> asignaturac1 = new ArrayList<String>();
		List<String> asignaturac2 = new ArrayList<String>();

		
		asignaturac1.add("Cálcuolo I");
		asignaturac1.add("Algoritmos y programación");
		asignaturac1.add("Lógica matemática");
		asignaturac1.add("Inglés I");
		asignaturac1.add("Álgebra Lineal");
		asignaturac1.add("Pensamiento Sistémico");
		asignaturac1.add("Introducción a la carrera");
		c1.setAsignaturas(asignaturac1);
		
		asignaturac2.add("Cálculo I");
		asignaturac2.add("Introducción a la carrera");
		asignaturac2.add("Inglés I");
		asignaturac2.add("Lógica Matemática");
		asignaturac2.add("Álgebra I");
		asignaturac2.add("Matemática Analitica");
		asignaturac2.add("Inglés II");
		c2.setAsignaturas(asignaturac2);
		
		 e1 = new Estudiante("Laura Roldán", 22, c1);
		 e2= new Estudiante("Samuel Áaron", 18, c2);
		
		imprimir(e1);
		System.out.println();
		imprimir(e2);
		
	}
	
	public static void imprimir(Estudiante e) {
		
		System.out.println("Estudiante: " + e.getNombre() + "\n"
				+ " Edad: " + e.getEdad() + "\n" + "Carrera: " + e.getCarrera().getNombre());
	}

}
