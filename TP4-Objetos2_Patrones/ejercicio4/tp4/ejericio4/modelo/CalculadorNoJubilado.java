package tp4.ejericio4.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {

	private double porcentaje;

	public CalculadorNoJubilado(LogTransaction log, int mesEnPromocion, double porcentaje) {
		super(log, mesEnPromocion);
		this.porcentaje = porcentaje;
	}

	@Override
	protected double porcentaje() {

		return porcentaje;
	}

	protected boolean estaEnPromocion(int mesEnPromocion) {
		return !of(mesEnPromocion).equals(now().getMonth());
	}

}
