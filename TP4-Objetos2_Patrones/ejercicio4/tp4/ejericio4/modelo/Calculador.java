package tp4.ejericio4.modelo;

public abstract class Calculador {

	private LogTransaction log;
	private int mesEnPromocion;

	public Calculador(LogTransaction log, int mesEnPromocion) {

		this.log = log;
		this.mesEnPromocion = mesEnPromocion;
	}

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (this.estaEnPromocion(mesEnPromocion)) { // SIEMPRE INTENTERTAR HACER LA MAYOR CANTIDAD DE COSAS ACA
			precioTotal += precioProducto * this.porcentaje();

		}
		if (!this.estaEnPromocion(mesEnPromocion)) {
			precioTotal += precioProducto * this.porcentaje();
		}

		log.log(this.getClass().getName());
		return precioTotal;
	}

	protected abstract double porcentaje();

	protected abstract boolean estaEnPromocion(int mesEnPromocion);

}
