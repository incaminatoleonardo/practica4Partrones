package tp4.ejericio4.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {

	private double porcentaje;
	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorNoJubilado(LogTransaction log, int mesEnPromocion, double porcentaje) {
		this.porcentaje = porcentaje;
		this.log = log;
		this.mesEnPromocion = mesEnPromocion;
	}

//	public double calcularPrecio(double precioProducto) {
//		double precioTotal = 0;// precioProducto;
//		if (!this.estaEnPromocion() /* of(mesEnPromocion).equals(now().getMonth()) */) {
//
//			precioTotal = this.sumarProcentaje(precioProducto);
//			// precioTotal += precioProducto * 0.15;
//		} else {
//			precioTotal = this.sumarProcentaje(precioProducto);
//			// precioTotal += precioProducto * 0.21;
//		}
//		log.log(CalculadorNoJubilado.class.getName());
//		return precioTotal;
//	}

	@Override
	public double sumarProcentaje(double precioProducto) {
		precioProducto += precioProducto * porcentaje;
		return precioProducto;
	}

	public boolean estaEnPromocion() {
		return !of(mesEnPromocion).equals(now().getMonth());
	}

}
