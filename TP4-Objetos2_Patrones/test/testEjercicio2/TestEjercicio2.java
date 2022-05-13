package testEjercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tp4.ejercicio2.modelo.HistoriasDeUsusarios;
import tp4.ejercicio2.modelo.ItemScrum;
import tp4.ejercicio2.modelo.Spike;
import tp4.ejercicio2.modelo.Tarea;

class TestEjercicio2 {

	@Test
	void testTiempoTotal() { // no se me ocurre el otro test

		// SETUP
		HistoriasDeUsusarios historiaUsuario1 = new HistoriasDeUsusarios("registrar", 3);
		HistoriasDeUsusarios historiaUsuario2 = new HistoriasDeUsusarios("ingresar", 4);
		ItemScrum spike1 = new Spike("pagar", 3);
		ItemScrum spike2 = new Spike("validar", 2);
		ItemScrum tarea1 = new Tarea("corregir pago", 1);
		ItemScrum tarea2 = new Tarea("corregir validacion", 2);
		ItemScrum tarea3 = new Tarea("sumar deuda", 1);

		historiaUsuario1.agregarItemScrum(historiaUsuario2);
		historiaUsuario1.agregarItemScrum(spike1);
		historiaUsuario1.agregarItemScrum(spike2);
		historiaUsuario1.agregarItemScrum(tarea1);
		historiaUsuario1.agregarItemScrum(tarea2);
		historiaUsuario1.agregarItemScrum(tarea3);

		int resultadoEsperado = 16;

		// EXERCISE
		int resultado = historiaUsuario1.calcularTiempo();

		// VERIFY
		assertEquals(resultadoEsperado, resultado);

	}

}
