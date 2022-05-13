package tp4.ejercicio2.modelo;

import java.util.List;

public class ItemsScrum {

	private List<ItemScrum> listaItems;

	public ItemsScrum(List<ItemScrum> listaItems) {
		super();
		this.listaItems = listaItems;
	}

	public void agregarItemScrum(ItemScrum item) {
		listaItems.add(item);
	}

	public List<ItemScrum> obtenerItemsScrum() {

		return listaItems;
	}

}
