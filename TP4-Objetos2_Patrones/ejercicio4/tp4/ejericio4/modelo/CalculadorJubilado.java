package tp4.ejericio4.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {

	private double porcentaje; // preguntar si el procetaje esta bien que se lo pase por constructor
	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorJubilado(LogTransaction log, int mesEnPromocion, double porcentaje) {
		this.porcentaje = porcentaje;
		this.log = log;
		this.mesEnPromocion = mesEnPromocion;
	}

//	public double calcularPrecio(double precioProducto) {
//		double precioTotal = precioProducto;
//		if (this.estaEnPromocion() /* !of(mesEnPromocion).equals(now().getMonth()) */) {
//			precioTotal = this.sumarProcentaje(precioProducto, 0.1);
//			// precioTotal += precioProducto * 0.1;
//		}
//		log.log(CalculadorJubilado.class.getName());
//		return precioTotal;
//	}

	public double sumarProcentaje(double precioProducto) {

		precioProducto += precioProducto * porcentaje;

		return precioProducto;
	}

	public boolean estaEnPromocion() {
		return !of(mesEnPromocion).equals(now().getMonth());
	}

}
