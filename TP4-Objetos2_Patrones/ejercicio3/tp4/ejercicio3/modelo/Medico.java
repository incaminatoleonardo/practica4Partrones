package tp4.ejercicio3.modelo;

public class Medico implements Seguro {

	private double precio;

	public Medico(double precio) {

		this.precio = precio;
	}

	@Override
	public double costoSeguro() {

		return precio;
	}

}
