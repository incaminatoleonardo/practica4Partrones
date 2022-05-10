package testEjercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tp4.ejercicio5.modelo.Importadas;
import tp4.ejercicio5.modelo.Nacionales;
import tp4.ejercicio5.modelo.Remeras;

class TestEjercicio5 {

	@Test
	void testImportada() {
		// SETUP
		Remeras importada = new Importadas(10);
		double resultadoEsperado = 13.5;

		// EXERCISE
		double resultado = importada.costoTotal();

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

	@Test
	void testNacional() {
		// SETUP
		Remeras nacional = new Nacionales(10);
		double resultadoEsperado = 13.65;

		// EXERCISE
		double resultado = nacional.costoTotal();

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

}
