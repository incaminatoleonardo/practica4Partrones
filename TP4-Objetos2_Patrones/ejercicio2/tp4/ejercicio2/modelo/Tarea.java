package tp4.ejercicio2.modelo;

public class Tarea implements ItemScrum {

	private String nombre;
	private int semanas;

	public Tarea(String nombre, int semanas) {
		super();
		this.nombre = nombre;
		this.semanas = semanas;
	}

	@Override
	public int calcularTiempo() {

		return semanas;
	}

}
