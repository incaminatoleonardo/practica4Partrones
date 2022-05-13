package tp4.ejercicio3.modelo;

public class Automovil implements Seguro {

	private double precio;

	public Automovil(double precio) {

		this.precio = precio;
	}

	@Override
	public double costoSeguro() {

		return precio;
	}

}
