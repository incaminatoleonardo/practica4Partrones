package testEjercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tp4.ejericio4.modelo.Calculador;
import tp4.ejericio4.modelo.CalculadorJubilado;
import tp4.ejericio4.modelo.CalculadorNoJubilado;
import tp4.ejericio4.modelo.LogTransaction;

class TestEjercicio4 {

	@Test
	void testJubilado() {
		// SETUP
		Calculador jubilado = new CalculadorJubilado(new LogTransaction(), 4, 0.1);
		double resultadoEsperado = 11;

		// EXERCISE
		double resultado = jubilado.calcularPrecio(10);

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

	@Test
	void testNoJubiladoEnPromocion() {
		// SETUP
		CalculadorNoJubilado noJubilado = new CalculadorNoJubilado(new LogTransaction(), 4, 0.21);
		double resultadoEsperado = 12.1;

		// EXERCISE
		double resultado = noJubilado.calcularPrecio(10);

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

	@Test
	void testNoJubiladoSinPromocion() {
		// SETUP
		CalculadorNoJubilado noJubilado = new CalculadorNoJubilado(new LogTransaction(), 5, 0.15);
		double resultadoEsperado = 11.5;

		// EXERCISE
		double resultado = noJubilado.calcularPrecio(10);

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

}
