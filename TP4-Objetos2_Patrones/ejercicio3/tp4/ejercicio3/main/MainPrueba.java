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

		Seguro hogar = new Hogar(2000);
		Seguro automovil = new Automovil(1000);
		Seguro vida = new Vida(770);
		Seguro medico = new Medico(652);

		paqueteDeSeguros.añadirSeguro(hogar);
		paqueteDeSeguros.añadirSeguro(hogar);
		paqueteDeSeguros.añadirSeguro(automovil);
		paqueteDeSeguros.añadirSeguro(vida);
		paqueteDeSeguros.añadirSeguro(vida);
		paqueteDeSeguros.añadirSeguro(medico);

		System.out.println(paqueteDeSeguros.costoSeguro());

	}

}
