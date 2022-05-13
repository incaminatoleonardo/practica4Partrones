package tp4.ejercicio5.modelo;

public class Nacionales extends Remeras {

	private final double porcentajeTransporte = 0.015;
	private final double porcentajeBonificacion = 0.2;
	private final double porcentajeComercio = 0.15;

	public Nacionales(double precio) {

		super(precio);

	}

	@Override
	protected double recargo() {

		return 0;
	}

	@Override
	protected double impuestoAduana() {

		return 0;
	}

	@Override
	protected double costoTransporte() {

		return porcentajeTransporte;
	}

	@Override
	protected double bonificacion() {

		return porcentajeBonificacion;
	}

	@Override
	protected double impuestoComercio() {

		return porcentajeComercio;
	}

}
