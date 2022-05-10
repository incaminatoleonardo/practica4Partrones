package tp4.ejercicio5.main;

import tp4.ejercicio5.modelo.Importadas;
import tp4.ejercicio5.modelo.Nacionales;
import tp4.ejercicio5.modelo.Remeras;

public class MainPrueba {

	public static void main(String[] args) {

		Remeras importada = new Importadas(10);
		Remeras nacional = new Nacionales(10);

		System.out.println(importada.costoTotal());
		System.out.println(nacional.costoTotal());

	}

}
