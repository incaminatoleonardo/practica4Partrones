package testEjercicio4;

import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tp4.ejericio4.modelo.Calculador;
import tp4.ejericio4.modelo.CalculadorJubilado;
import tp4.ejericio4.modelo.CalculadorNoJubilado;
import tp4.ejericio4.modelo.LogTransaction;

class TestEjercicio4 {

	@Test
	void testJubiladoSinPromocion() {
		// SETUP
		Calculador jubilado = new CalculadorJubilado(new LogTransaction(), now().getMonth().getValue(), 0.1);
		double resultadoEsperado = 11;

		// EXERCISE
		double resultado = jubilado.calcularPrecio(10);

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

	@Test
	void testJubiladoEnPromocion() {
		// SETUP
		Calculador jubilado = new CalculadorJubilado(new LogTransaction(), now().getMonth().getValue() + 1, 0);
		double resultadoEsperado = 10;

		// EXERCISE
		double resultado = jubilado.calcularPrecio(10);

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

	@Test
	void testNoJubiladoSinPromocion() {
		// SETUP
		Calculador noJubilado = new CalculadorNoJubilado(new LogTransaction(), now().getMonth().getValue(), 0.21);
		double resultadoEsperado = 12.1;

		// EXERCISE
		double resultado = noJubilado.calcularPrecio(10);

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

	@Test
	void testNoJubiladoEnPromocion() {
		// SETUP
		Calculador noJubilado = new CalculadorNoJubilado(new LogTransaction(), now().getMonth().getValue() + 1, 0.15);
		double resultadoEsperado = 11.5;

		// EXERCISE
		double resultado = noJubilado.calcularPrecio(10);

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

}
