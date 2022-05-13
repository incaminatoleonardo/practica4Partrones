package testEjercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import tp4.ejercicio3.modelo.Automovil;
import tp4.ejercicio3.modelo.Hogar;
import tp4.ejercicio3.modelo.Medico;
import tp4.ejercicio3.modelo.PaqueteDeSeguros;
import tp4.ejercicio3.modelo.Seguro;
import tp4.ejercicio3.modelo.Seguros;
import tp4.ejercicio3.modelo.Vida;

class TestEjercicio3 {

	@Test
	void testCostoTotal() { // no se me ocurre otro test
		// SETUP
		Seguros listaSeguros = new Seguros(new ArrayList<>());
		PaqueteDeSeguros paqueteDeSeguros = new PaqueteDeSeguros(listaSeguros, 0.05);

		Seguro hogar = new Hogar(10);
		Seguro automovil = new Automovil(20);
		Seguro vida = new Vida(30);
		Seguro medico = new Medico(40);

		paqueteDeSeguros.añadirSeguro(hogar);
		paqueteDeSeguros.añadirSeguro(hogar);
		paqueteDeSeguros.añadirSeguro(automovil);
		paqueteDeSeguros.añadirSeguro(vida);
		paqueteDeSeguros.añadirSeguro(vida);
		paqueteDeSeguros.añadirSeguro(medico);

		double resultadoEsperado = 182;

		// EXERCISE
		double resultado = paqueteDeSeguros.costoSeguro();

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

}
