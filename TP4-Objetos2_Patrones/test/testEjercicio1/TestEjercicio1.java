package testEjercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ejercicio1.modelo.Empleado;
import ejercicio1.modelo.EmpleadoConCargo;
import ejercicio1.modelo.EmpleadoRegular;

class TestEjercicio1 {

	@Test
	void testSalarioTotal() { // no se me ocurre el otro caso test

		// SETUP
		Empleado julioDirector = new EmpleadoConCargo(50, "Director", "julio");
		Empleado nataliaGerente = new EmpleadoConCargo(40, "Gerente", "natalia");
		Empleado joseMedio = new EmpleadoConCargo(30, "Medio", "jose");
		Empleado brinaLider = new EmpleadoConCargo(20, "Lider", "brina");
		Empleado pazLider = new EmpleadoConCargo(20, "Lider", "paz");
		Empleado robertoRegular = new EmpleadoRegular(10);
		Empleado juanRegular = new EmpleadoRegular(10);

		julioDirector.añadirEmpleado(nataliaGerente);
		nataliaGerente.añadirEmpleado(joseMedio);
		joseMedio.añadirEmpleado(brinaLider);
		joseMedio.añadirEmpleado(pazLider);
		pazLider.añadirEmpleado(robertoRegular);
		brinaLider.añadirEmpleado(juanRegular);

		double resultadoEsperado = 180;

		// EXERCISE
		double resultado = julioDirector.salarioTotal();

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);

	}

}
