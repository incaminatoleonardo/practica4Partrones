package ejercicio1.modelo;

import java.util.List;

public class EmpleadoConCargo implements Empleado {

	private String nombre;
	private double salario;
	private String cargo;
	private Empleados empleados; // preguntar si esta bien
	private double salarioTotal = 0;
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

		for (Empleado empleado : empleadosLista) {
			return this.salario + empleado.salarioTotal();

		}

		return salarioTotal;
	}

	public void a�adirEmpleado(Empleado empleado) {
		// empleados.a�adir(empleado);
		empleadosLista.add(empleado);
	}

	public List<Empleado> obtenerEmpleado() {

		return empleados.obtenerEmpleados();
	}

}
