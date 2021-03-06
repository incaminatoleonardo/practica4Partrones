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
	void testCostoTotal98() { // no se me ocurre otro test
		// SETUP
		Seguros listaSeguros = new Seguros(new ArrayList<>());
		PaqueteDeSeguros paqueteDeSeguros = new PaqueteDeSeguros(listaSeguros, 0.05);

		Seguro hogar = new Hogar(10);
		Seguro automovil = new Automovil(20);
		Seguro vida = new Vida(30);
		Seguro medico = new Medico(40);

		paqueteDeSeguros.aņadirSeguro(hogar);
		paqueteDeSeguros.aņadirSeguro(hogar);
		paqueteDeSeguros.aņadirSeguro(automovil);
		paqueteDeSeguros.aņadirSeguro(vida);
		paqueteDeSeguros.aņadirSeguro(vida);
		paqueteDeSeguros.aņadirSeguro(medico);

		double resultadoEsperado = 98;

		// EXERCISE
		double resultado = paqueteDeSeguros.costoSeguro();

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

	@Test
	void testCostoTotal5034() { // no se me ocurre otro test
		// SETUP
		Seguros listaSeguros = new Seguros(new ArrayList<>());
		PaqueteDeSeguros paqueteDeSeguros = new PaqueteDeSeguros(listaSeguros, 0.05);

		Seguro hogar = new Hogar(2000);
		Seguro automovil = new Automovil(1000);
		Seguro vida = new Vida(770);
		Seguro medico = new Medico(652);

		paqueteDeSeguros.aņadirSeguro(hogar);
		paqueteDeSeguros.aņadirSeguro(hogar);
		paqueteDeSeguros.aņadirSeguro(automovil);
		paqueteDeSeguros.aņadirSeguro(vida);
		paqueteDeSeguros.aņadirSeguro(vida);
		paqueteDeSeguros.aņadirSeguro(medico);

		double resultadoEsperado = 5034.4;

		// EXERCISE
		double resultado = paqueteDeSeguros.costoSeguro();

		// VERIFY
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

}
