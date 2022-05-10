package ejercicio1.main;

import java.util.ArrayList;

import ejercicio1.modelo.Empleado;
import ejercicio1.modelo.EmpleadoConCargo;
import ejercicio1.modelo.EmpleadoRegular;

public class MainPrueba {

	public static void main(String[] args) {

		Empleado julioDirector = new EmpleadoConCargo(50, "Director", new ArrayList<>(), "julio");
		Empleado nataliaGerente = new EmpleadoConCargo(40, "Gerente", new ArrayList<>(), "natalia");
		Empleado joseMedio = new EmpleadoConCargo(30, "Medio", new ArrayList<>(), "jose");
		Empleado brinaLider = new EmpleadoConCargo(20, "Lider", new ArrayList<>(), "brina");
		Empleado pazLider = new EmpleadoConCargo(20, "Lider", new ArrayList<>(), "paz");
		Empleado robertoRegular = new EmpleadoRegular(10);
		Empleado juanRegular = new EmpleadoRegular(10);

		julioDirector.aņadirEmpleado(nataliaGerente);
		nataliaGerente.aņadirEmpleado(joseMedio);
		joseMedio.aņadirEmpleado(brinaLider);
		joseMedio.aņadirEmpleado(pazLider);
		pazLider.aņadirEmpleado(robertoRegular);
		brinaLider.aņadirEmpleado(juanRegular);

		System.out.println(julioDirector.salarioTotal());

	}

}
