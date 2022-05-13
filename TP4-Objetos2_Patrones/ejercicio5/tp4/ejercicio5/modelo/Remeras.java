package tp4.ejercicio5.modelo;

public abstract class Remeras {

	protected double precio;

	public Remeras(double precio) {
		super();
		this.precio = precio;
	}

	public double costoTotal() {

		double costoTotal = precio;
		costoTotal += precio * this.impuestoAduana() + precio * this.recargo() + precio * this.costoTransporte()
				- precio * this.bonificacion() + precio * this.impuestoComercio(); // aca bonificacion lo tome como un
																					// descuento de precio

		return costoTotal;

	}

	protected abstract double recargo();

	protected abstract double impuestoAduana();

	protected abstract double costoTransporte();

	protected abstract double bonificacion();

	protected abstract double impuestoComercio();

}
