package tp4.ejercicio5.modelo;

public abstract class Remeras {

	public double costoTotal() {
		return this.carlcularPorcentaje();
	}

	abstract double carlcularPorcentaje();

}
