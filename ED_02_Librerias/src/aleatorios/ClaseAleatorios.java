package aleatorios;

import java.util.Random;

/**
 * Clase para generar números aleatorios
 * @author Biribivan
 */
public class ClaseAleatorios {
	
	/**
	 * Método que genera un <u><b>número aleatorio</b></u> entre dos números pasados por parametro
	 * @param n1 Representa el valor mínimo posible del rango (incluido)
	 * @param n2 Representa el valor máximo posible del rango (incluido)
	 * @return Devuelve el número aleatorio general
	 */
	
	public int numeroAleatorioEntreDosNumeros (int n1, int n2) {
		Random rn = new Random ();
		//Se pone n2 +1 para incluir el n2
		int nAleatorio = rn.nextInt(n1, n2 +1);
		
		return nAleatorio;
	}
	
	/**
	 * Método que genera un número aleatorio entre 0 y 2^32
	 * @return
	 */
	public int numeroAleatorio () {
		Random rn = new Random ();
		int nAleatorio = rn.nextInt();
		
		return nAleatorio;
	}
}