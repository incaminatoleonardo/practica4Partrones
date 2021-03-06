package tp4.ejercicio2.main;

import tp4.ejercicio2.modelo.HistoriasDeUsusarios;
import tp4.ejercicio2.modelo.ItemScrum;
import tp4.ejercicio2.modelo.Spike;
import tp4.ejercicio2.modelo.Tarea;

public class MainPrueba {

	public static void main(String[] args) {

		HistoriasDeUsusarios historiaUsuario1 = new HistoriasDeUsusarios("registrar", 3);
		HistoriasDeUsusarios historiaUsuario2 = new HistoriasDeUsusarios("ingresar", 4);
		ItemScrum spike1 = new Spike("pagar", 3);
		ItemScrum spike2 = new Spike("validar", 2);
		ItemScrum tarea1 = new Tarea("corregir pago", 1);
		ItemScrum tarea2 = new Tarea("corregir validacion", 2);
		ItemScrum tarea3 = new Tarea("sumar deuda", 1);

		historiaUsuario1.agregarItemScrum(historiaUsuario2);
		historiaUsuario1.agregarItemScrum(spike1);
		historiaUsuario1.agregarItemScrum(spike2);
		historiaUsuario1.agregarItemScrum(tarea1);
		historiaUsuario1.agregarItemScrum(tarea2);
		historiaUsuario1.agregarItemScrum(tarea3);

		System.out.println(historiaUsuario1.calcularTiempo());

	}

}
