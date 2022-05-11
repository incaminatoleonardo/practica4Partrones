package tp4.ejercicio2.modelo;

public class Spike implements ItemsScrum {

	private String nombre;
	private int semanas;

	public Spike(String nombre, int semanas) {
		super();
		this.nombre = nombre;
		this.semanas = semanas;
	}

	@Override
	public int calcularTiempo() {

		return semanas;
	}

}
