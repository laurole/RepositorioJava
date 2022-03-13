package ejercicio.ejecutando;

import java.util.ArrayList;
import java.util.List;

import ejercicio.universidad.Carrera;
import ejercicio.universidad.Estudiante;

public class EjecutandoSistema {

	public static void main(String[] args) {
		
		Carrera c1 = new Carrera(00526, "Ingenieria de Sistemas");
		Carrera c2 = new Carrera(58942, "Licenciatura en Matem�ticas");
		Estudiante e1;
		Estudiante e2;
		
		List<String> asignaturac1 = new ArrayList<String>();
		List<String> asignaturac2 = new ArrayList<String>();

		
		asignaturac1.add("C�lcuolo I");
		asignaturac1.add("Algoritmos y programaci�n");
		asignaturac1.add("L�gica matem�tica");
		asignaturac1.add("Ingl�s I");
		asignaturac1.add("�lgebra Lineal");
		asignaturac1.add("Pensamiento Sist�mico");
		asignaturac1.add("Introducci�n a la carrera");
		c1.setAsignaturas(asignaturac1);
		
		asignaturac2.add("C�lculo I");
		asignaturac2.add("Introducci�n a la carrera");
		asignaturac2.add("Ingl�s I");
		asignaturac2.add("L�gica Matem�tica");
		asignaturac2.add("�lgebra I");
		asignaturac2.add("Matem�tica Analitica");
		asignaturac2.add("Ingl�s II");
		c2.setAsignaturas(asignaturac2);
		
		 e1 = new Estudiante("Laura Rold�n", 22, c1);
		 e2= new Estudiante("Samuel �aron", 18, c2);
		
		imprimir(e1);
		System.out.println();
		imprimir(e2);
		
	}
	
	public static void imprimir(Estudiante e) {
		
		System.out.println("Estudiante: " + e.getNombre() + "\n"
				+ " Edad: " + e.getEdad() + "\n" + "Carrera: " + e.getCarrera().getNombre());
	}

}
