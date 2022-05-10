package ejercicio1.modelo;

public class EmpleadoRegular implements Empleado {

	private double salario;

	public EmpleadoRegular(double salario) {
		super();
		this.salario = salario;
	}

	@Override
	public double salarioTotal() {

		return this.salario;

	}

	@Override
	public void añadirEmpleado(Empleado nataliaGerente) {

	}

}
