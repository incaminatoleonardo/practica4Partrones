package ejercicio1.modelo;

import java.util.List;

public class Empleados {

	private List<Empleado> empleados;

	public Empleados(List<Empleado> empleados) {
		super();
		this.empleados = empleados;
	}

	public void añadir(Empleado empleado) {
		// empleados.add(empleado);

	}

	public List<Empleado> obtenerEmpleados() {

		return this.empleados;
	}

	public double salarioTotal() {

		for (Empleado empleado : empleados) {
			return empleado.salarioTotal();
		}

		return 0;
	}

}
