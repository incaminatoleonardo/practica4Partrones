package tp4.ejercicio5.modelo;

public abstract class Remeras { // hacer calcular porcentaje de los distintos impuestos, por ejemplo
								// calcularImpuestoAduana(). Y luego sumar y restar todo aca

	public double costoTotal() {
		return this.carlcularPorcentaje();
	}

	abstract double carlcularPorcentaje();

}
