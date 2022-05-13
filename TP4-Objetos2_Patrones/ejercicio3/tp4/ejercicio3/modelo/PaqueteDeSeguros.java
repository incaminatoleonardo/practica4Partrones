package tp4.ejercicio3.modelo;

import java.util.List;

public class PaqueteDeSeguros implements Seguro {

	private Seguros seguros;
	private double porcetaje;

	public PaqueteDeSeguros(Seguros seguros, double porcetaje) {

		this.seguros = seguros;
		this.porcetaje = porcetaje;
	}

	@Override
	public double costoSeguro() {

		int cantidadSeguros = 0;
		double costoTotal = 0;
		for (Seguro seguro : seguros.obtenerSeguros()) {
			costoTotal += seguro.costoSeguro();
			cantidadSeguros++;
		}
		costoTotal += costoTotal * (cantidadSeguros * porcetaje);
		return costoTotal;
	}

	public void añadirSeguro(Seguro seguro) {
		seguros.añadirSeguro(seguro);
	}

	public List<Seguro> obtenerSeguros() {
		return seguros.obtenerSeguros();
	}

}
