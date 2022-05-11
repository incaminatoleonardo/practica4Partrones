package tp4.ejercicio2.modelo;

import java.util.List;

public class HistoriasDeUsusarios implements ItemsScrum {

	private String nombre;
	private int semanas;
	private List<ItemsScrum> listaItems; // esto deberia sacarlo a otra clase

	public HistoriasDeUsusarios(String nombre, int semanas, List<ItemsScrum> listaItems) {
		super();
		this.nombre = nombre;
		this.semanas = semanas;
		this.listaItems = listaItems;
	}

	@Override
	public int calcularTiempo() {

		int tiempoTotal = semanas;
		for (ItemsScrum itemsScrum : listaItems) {
			tiempoTotal += itemsScrum.calcularTiempo();
		}

		return tiempoTotal;
	}

	public void agregarItemScrum(ItemsScrum item) {
		listaItems.add(item);
	}

}
