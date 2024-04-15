package _01_basico;

/**
 * La herencia es una de las propiedades más importantes que podemos
 * encontrar en OOP. Mediante la herencia se puede hacer que una clase tenga todo los
 * atribbbutos y métodos de otra.
 * La clase de la cual se hereda se llama clase 'padre' y la clase heredada o que hereda 'hija'
 * 
 * La clase 'hija' tendrá todos los atributos de la clase 'padre'
 */

public class Persona {
	public String nombre;
	public int edad;
	
	public void presentarse() {
		System.out.println("Buenas, mi nombre es: " +nombre);
	}
}
