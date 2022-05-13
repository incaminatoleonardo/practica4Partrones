package tp4.ejercicio4.main;

import tp4.ejericio4.modelo.Calculador;
import tp4.ejericio4.modelo.CalculadorJubilado;
import tp4.ejericio4.modelo.CalculadorNoJubilado;
import tp4.ejericio4.modelo.LogTransaction;

public class MainPrueba {

	public static void main(String[] args) {

		Calculador jubilado = new CalculadorJubilado(new LogTransaction(), 4, 0.1);
		Calculador noJubilado = new CalculadorNoJubilado(new LogTransaction(), 5, 0.21);

		System.out.println(jubilado.calcularPrecio(10));
		System.out.println(noJubilado.calcularPrecio(10));

	}

}
