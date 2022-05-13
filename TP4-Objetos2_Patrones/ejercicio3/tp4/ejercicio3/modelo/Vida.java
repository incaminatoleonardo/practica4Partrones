package tp4.ejercicio3.modelo;

public class Vida implements Seguro {

	private double precio;

	public Vida(double precio) {

		this.precio = precio;
	}

	@Override
	public double costoSeguro() {

		return precio;
	}

}
