package ejercicio1.modelo;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoConCargo implements Empleado {

	private String nombre;
	private double salario;
	private String cargo;
	private Empleados empleados;

	public EmpleadoConCargo(double salario, String cargo, String nombre) {
		super();
		this.salario = salario;
		this.cargo = cargo;
		this.empleados = new Empleados(new ArrayList<>()); // lo mejor es que empleados vaya en constructor, para hacer
															// inyeccion de dependencia
		this.nombre = nombre;
	}

	@Override
	public double salarioTotal() {

		double montoTotal = this.salario;
		for (Empleado empleado : this.obtenerEmpleado()) {
			montoTotal += empleado.salarioTotal();

		}

		return montoTotal;
	}

	@Override
	public void añadirEmpleado(Empleado empleado) {
		empleados.añadir(empleado);

	}

	public List<Empleado> obtenerEmpleado() {

		return empleados.obtenerEmpleados();
	}

}
