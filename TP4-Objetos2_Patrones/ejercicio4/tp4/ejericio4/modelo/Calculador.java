package tp4.ejericio4.modelo;

public abstract class Calculador {

	public double calcularPrecio(double precioProducto) {
		double precioTotal = 0;
		if (this.estaEnPromocion()) {
			precioTotal = this.sumarProcentaje(precioProducto); // hacer la multiplicacion aca, SIEMRPE INTENTERTAR
																// HACER LA MAYOR CANTIDAD DE COSAS ACA

		}
		if (!this.estaEnPromocion()) {
			precioTotal = this.sumarProcentaje(precioProducto);
		}

		return precioTotal;
	}

	abstract double sumarProcentaje(double precioProducto);

	abstract public boolean estaEnPromocion();

}
