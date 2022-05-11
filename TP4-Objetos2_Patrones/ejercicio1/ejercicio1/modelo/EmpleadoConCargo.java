package ejercicio1.modelo;

import java.util.List;

public class EmpleadoConCargo implements Empleado {

	private String nombre;
	private double salario;
	private String cargo;
	private Empleados empleados; // esta bien, usar esto

	private List<Empleado> empleadosLista;

	public EmpleadoConCargo(double salario, String cargo, List<Empleado> empleados, String nombre) {
		super();
		this.salario = salario;
		this.cargo = cargo;
		this.empleadosLista = empleados;
		this.nombre = nombre;
	}

	@Override
	public double salarioTotal() {

		double montoTotal = this.salario;
		for (Empleado empleado : empleadosLista) {
			montoTotal += empleado.salarioTotal();

		}

		return montoTotal;
	}

	@Override
	public void añadirEmpleado(Empleado empleado) {
		// empleados.añadir(empleado);
		empleadosLista.add(empleado);
	}

	public List<Empleado> obtenerEmpleado() {

		return empleados.obtenerEmpleados();
	}

}
