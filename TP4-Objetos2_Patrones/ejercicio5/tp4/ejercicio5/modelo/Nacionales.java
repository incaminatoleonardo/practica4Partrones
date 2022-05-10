package tp4.ejercicio5.modelo;

public class Nacionales extends Remeras {

	private double precio;

	private final double porcentajeTransporte = 0.015;
	private final double porcentajeBonificacion = 0.2;
	private final double porcentajeComercio = 0.15;

	public Nacionales(double precio) {

		this.precio = precio;

	}

	@Override
	double carlcularPorcentaje() {

		return precio + precio * porcentajeTransporte + precio * porcentajeBonificacion + precio * porcentajeComercio;
	}

}
