package ejercicio1.modelo;

import java.util.List;

public class Empleados {

	private List<Empleado> empleados;

	public Empleados(List<Empleado> empleados) {
		super();
		this.empleados = empleados;
	}

	public void a�adir(Empleado empleado) {
		empleados.add(empleado);

	}

	public List<Empleado> obtenerEmpleados() {

		return this.empleados;
	}

}
