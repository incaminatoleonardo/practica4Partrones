package tp4.ejercicio3.main;

import java.util.ArrayList;

import tp4.ejercicio3.modelo.Automovil;
import tp4.ejercicio3.modelo.Hogar;
import tp4.ejercicio3.modelo.Medico;
import tp4.ejercicio3.modelo.PaqueteDeSeguros;
import tp4.ejercicio3.modelo.Seguro;
import tp4.ejercicio3.modelo.Seguros;
import tp4.ejercicio3.modelo.Vida;

public class MainPrueba {

	public static void main(String[] args) {

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

		System.out.println(paqueteDeSeguros.costoSeguro());

	}

}
