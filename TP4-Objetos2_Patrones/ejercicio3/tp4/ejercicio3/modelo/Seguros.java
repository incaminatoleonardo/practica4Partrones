package tp4.ejercicio3.modelo;

import java.util.List;

public class Seguros {

	private List<Seguro> seguros;

	public Seguros(List<Seguro> seguros) {

		this.seguros = seguros;
	}

	public void añadirSeguro(Seguro seguro) {
		seguros.add(seguro);
	}

	public List<Seguro> obtenerSeguros() {
		return seguros;
	}

}
