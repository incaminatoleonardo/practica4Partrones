package tp4.ejercicio5.modelo;

public class Importadas extends Remeras {

	private double precio;

	private final double porcentajeRecargo = 0.03;
	private final double porcentajeAduana = 0.05;
	private final double porcentajeComercio = 0.25;

	public Importadas(double precio) {
		super();
		this.precio = precio;

	}

	@Override
	double carlcularPorcentaje() { // preguntar si el 25% es soble el total

		double montoTotal = 0;
		montoTotal += precio + precio * porcentajeAduana + precio * porcentajeRecargo;
		montoTotal += montoTotal * porcentajeComercio;

		return montoTotal;// precio + precio * porcentajeAduana + precio * porcentajeRecargo + precio *
							// porcentajeComercio;
	}

}
