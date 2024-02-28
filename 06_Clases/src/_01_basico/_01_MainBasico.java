package _01_basico;

public class _01_MainBasico {
	public static void main(String[] args) {
		
		//La JVM se compone del 'heap' y el 'stack':
		//-------------------------------------------------------------------------------------------------------------------------------------------------------
		// -'heap'--> Espacio de memoria donde se crean los objetos a traves de la palabra reservada 'new'
				/*
            	A partir de una clase podremos crear los objetos.
				Un OBJETO es una instancia de una clase.
				
				Cuando creamos un objeto se asignan valores por defecto:
				Los primitivos se inicializan a '0'
				Booleanos a 'false'
				Referencias ('stack') a 'null'. OJO! 'null' significa ausencia de valor, !=0
				
				Los objetos son anonimos, no tienen nombre, la unica manera de acceder a ellos es atraves de su referencia
				Un programa java (A priori) tendrá tantos objetos como 'news' hayan.
				 */

		//-'stack'--> Espacio de memoria donde se crean las variables y también las referencias
				/*
				 Para apuntar a un objeto se necesita una variable de clase o 'referencia'
				 La referencia no guarda información, solo guarda donde se encuentra el objeto
				 Una referencia solo puede apuntar a un objeto, a no ser que se use un array
				 */
 
		//IMPORTANTE
			//-Una variable contiene el valor.
			//Ej: Una variable de tipo "int" contiene el valor "5"
			int numero=5;
			//-Una referencia contiene la posición de memoria de donde se encuentra el objeto
			//Ej: una referencia de tipo String contiene la posición de memoria "0x123KAF"
			//Y en esa memoria estará el objeto (a través del 'new') de tipo String (con su valor)
			String cadena = new String("Pepe");
		
		
		//Objeto persona
		Persona p1 =  new Persona();
		
		//Podemos acceder a las propiedades de un objeto mediante la referencia y un '.'
		//En este caso el la referencia es 'p1' y apunta al objeto 'Persona'
		System.out.println(p1.nombre); //La referencia 'p1' apunta al objeto 'Persona' y pide el nombre
		System.out.println(p1.edad);   
		System.out.println(p1.peso);
		System.out.println(p1.estaCasado);
		
		//Podemos modificar los valores de los atributos de un objeto, como se haría con una variable normal
		p1.nombre="Thor";
		p1.edad=167;
		p1.estaCasado=true;
		p1.peso=105.6;
		
		//El "estado de un objeto" es el valor de los atributos en un instante de tiempo.
		
		//Si se imprime la referencia, en principio, devuelve su dirección de memoria
		System.out.println(p1);
	}
}
