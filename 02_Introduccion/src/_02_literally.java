
public class _02_literally {
	/*
	 * Un proyecto JAVA puede tener varias clases con metodos main el main que se
	 * ejecutara, será sobre aquel fichero que hagamos en "Run as"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Literales en JAVA");

		/*
		 * En Java como en todos los lenguaajes de programación, tenemos lo que se llama
		 * liyterales.
		 */
//Una literal es un valor constante formado por una secuencia de caracteres. 
//Cualquier declaración en Java que defina un valor constante 
//-un valor que no pueda ser cambiado durante la ejecución del programa- 
//es una literal.
		// Tenemos los siguientes literales:
		// Literal de cadena, van entre comillas

		System.out.println("Esto es un literal de cacena");
		// literales de caracteres, van entre comillado y solo puede haber uno
		System.out.println("a");
		// literales bloqueanos, puede ser una de dos líneas, verdadero (true)
		// y ffalso (falso). Se utilizan ls palabras reservadas ¨true¨ y ¨false¨
		// respectivamente

		System.out.println(true);
		System.out.println(false);

		/// Literales de numeros enteros (int), son literales númericos que van desde
		// –2,147,483,648 a 2,147,483,647
		// los numeros enteros van sin coma y sin punto
		System.out.println(2147483647);
		// podemos utilizar "_" para separar los numeros y que se entienda mejor
		System.out.println(1000000000);
		System.out.println(1_000_000_000);
		// lkiterales de numeros enteros largos (long), el alrgo es mucho mayor
		// se pone con una "L" mayúscula o minuyscula al final
		System.out.println(214748364745l);
		System.out.println(2_147_483_647_45l);

		// literales de números decimales grandes (double), la parte decimal
		// se separa de la parte entera cin un "."
		// este tipo de literal es el más usado para hacer número decimales en JAVA
		System.out.println(1200.234);
		System.out.println(1_200.234);

		// literales de numeros decimales pequeños (float), se tratan igual que los
		// double pero se pone una f al final
		// Este apenas se usa hoy en dia, por ello es mejor usar siempre el "double"

		System.out.println(1200.234f);
		System.out.println(1_200.234f);
	}

}
