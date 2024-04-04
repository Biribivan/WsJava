package principal;

import aleatorios.ClaseAleatorios;
import sysos.ClaseImprimirPantalla;

public class Main {
	public static void main(String[] args) {
		ClaseAleatorios ca = new ClaseAleatorios();
		int numero = ca.numeroAleatorio();
		
		ClaseImprimirPantalla ip = new ClaseImprimirPantalla();
		ip.imprimir(numero);
	}
}
