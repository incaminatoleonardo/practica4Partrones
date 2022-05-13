package tp4.ejericio4.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {

	private double porcentaje;

	public CalculadorJubilado(LogTransaction log, int mesEnPromocion, double porcentaje) {
		super(log, mesEnPromocion);
		this.porcentaje = porcentaje;
	}

	protected double porcentaje() {

		return porcentaje;
	}

	protected boolean estaEnPromocion(int mesEnPromocion) {
		return !of(mesEnPromocion).equals(now().getMonth());
	}

}
