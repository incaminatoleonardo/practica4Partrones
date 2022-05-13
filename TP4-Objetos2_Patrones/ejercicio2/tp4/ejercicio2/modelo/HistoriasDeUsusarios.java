package tp4.ejercicio2.modelo;

import java.util.ArrayList;
import java.util.List;

public class HistoriasDeUsusarios implements ItemScrum {

	private String nombre;
	private int semanas;
	private ItemsScrum items;

	public HistoriasDeUsusarios(String nombre, int semanas) {
		super();
		this.nombre = nombre;
		this.semanas = semanas;
		this.items = new ItemsScrum(new ArrayList<>()); // lo mejor es que empleados vaya en constructor, para hacer
														// inyeccion de dependencia
	}

	@Override
	public int calcularTiempo() {

		int tiempoTotal = semanas;
		for (ItemScrum itemsScrum : this.obtenerItemsScrum()) {
			tiempoTotal += itemsScrum.calcularTiempo();
		}

		return tiempoTotal;
	}

	public void agregarItemScrum(ItemScrum item) {
		items.agregarItemScrum(item);
	}

	public List<ItemScrum> obtenerItemsScrum() {
		return items.obtenerItemsScrum();
	}

}
