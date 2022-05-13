package tp4.ejercicio5.modelo;

public class Importadas extends Remeras {

	private final double porcentajeRecargo = 0.03;
	private final double porcentajeAduana = 0.05;
	private final double porcentajeComercio = 0.25;

	public Importadas(double precio) {
		super(precio);

	}

	@Override
	protected double recargo() {

		return porcentajeRecargo;
	}

	@Override
	protected double impuestoAduana() {

		return porcentajeAduana;
	}

	@Override
	protected double costoTransporte() {

		return 0;
	}

	@Override
	protected double bonificacion() {

		return 0;
	}

	@Override
	protected double impuestoComercio() {

		return porcentajeComercio;
	}

}
