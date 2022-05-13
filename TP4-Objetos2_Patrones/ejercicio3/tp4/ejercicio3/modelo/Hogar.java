package tp4.ejercicio3.modelo;

public class Hogar implements Seguro {

	private double precio;

	public Hogar(double precio) {

		this.precio = precio;
	}

	@Override
	public double costoSeguro() {

		return precio;
	}

}
