package testEjercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ejercicio1.modelo.Empleado;
import ejercicio1.modelo.EmpleadoConCargo;
import ejercicio1.modelo.EmpleadoRegular;

class TestEjercicio1 {

	@Test
	void testSalarioTotal180() { // no se me ocurre el otro caso test

		// SETUP
		Empleado julioDirector = new EmpleadoConCargo(50, "Director", "julio");
		Empleado nataliaGerente = new EmpleadoConCargo(40, "Gerente", "natalia");
		Empleado joseMedio = new EmpleadoConCargo(30, "Medio", "jose");
		Empleado brinaLider = new EmpleadoConCargo(20, "Lider", "brina");
		Empleado pazLider = new EmpleadoConCargo(20, "Lider", "paz");
		Empleado robertoRegular = new EmpleadoRegular(10);
		Empleado juanRegular = new EmpleadoRegular(10);

		julioDirector.aņadirEmpleado(nataliaGerente);
		nataliaGerente.aņadirEmpleado(joseMedio);
		joseMedio.aņadirEmpleado(brinaLider);
		joseMedio.aņadirEmpleado(pazLider);
		pazLider.aņadirEmpleado(robertoRegular);
		brinaLider.aņadirEmpleado(juanRegular);

		double resultadoEsperado = 180;

		// EXERCISE
		double resultado = julioDirector.salarioTotal();

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);

	}

	@Test
	void testSalarioTotal435() { // no se me ocurre el otro caso test

		// SETUP
		Empleado julioDirector = new EmpleadoConCargo(110, "Director", "julio");
		Empleado nataliaGerente = new EmpleadoConCargo(90, "Gerente", "natalia");
		Empleado joseMedio = new EmpleadoConCargo(75, "Medio", "jose");
		Empleado brinaLider = new EmpleadoConCargo(50, "Lider", "brina");
		Empleado pazLider = new EmpleadoConCargo(50, "Lider", "paz");
		Empleado robertoRegular = new EmpleadoRegular(30);
		Empleado juanRegular = new EmpleadoRegular(30);

		julioDirector.aņadirEmpleado(nataliaGerente);
		nataliaGerente.aņadirEmpleado(joseMedio);
		joseMedio.aņadirEmpleado(brinaLider);
		joseMedio.aņadirEmpleado(pazLider);
		pazLider.aņadirEmpleado(robertoRegular);
		brinaLider.aņadirEmpleado(juanRegular);

		double resultadoEsperado = 435;

		// EXERCISE
		double resultado = julioDirector.salarioTotal();

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);

	}

}
