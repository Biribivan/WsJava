
public class _03_variables {
	public static void main(String[] args) {

		// Las variables son "cajas" donde vamos a guardar información
		// que podrá ser cambiada en el tiempo

		/*
		 * Todo programa de ordenador persigue ofrecer una funcionalidad determinada
		 * para la que, por regla general, necesitará almacenar y manipular información.
		 * Dicha información, que son los datos sobre los que operaremos, deben
		 * almacenarse temporalmente en la memoria del ordenador.
		 * 
		 * Para poder almacenar y recuperar fácilmente información en la memoria de un
		 * ordenador los lenguajes de programación ofrecen el concepto de variables
		 */

		/*
		 * En Java, una variable es un espacio en la memoria que se utiliza para
		 * almacenar un valor específico (generalmente un literal). Las variables tienen
		 * un nombre, un tipo y un valor.
		 * 
		 * El nombre de una variable es un identificador único que se utiliza para hacer
		 * referencia al valor almacenado en esa variable. El tipo de una variable
		 * especifica qué tipo de valores pueden almacenarse en ella y el valor es el
		 * dato que se guarda.
		 * 
		 * Java es un lenguaje de tipado estático, lo que significa que el tipo de una
		 * variable debe ser especificado al momento de declararla.
		 */

		// Llamamos declaración de una variable cuando creamos una variable
		// por primera vez para usarla durante su ciclo de vida
		// Para dedicar una variavble en java primero especificamos el tipo,
		// luego el nombre y la igualamos a un valor

		// TIPO_VARIABLE NOMBRE_VARIABLE - VALOR_VARIABLE

		// eJEMPLO DE UNA VARIAVBLE ENTERA
		int numero1 = 1;

		// Una vex declarada una variable no podemos volver a declararla mientras exista
		// int numero1= 5;// Esto da error, la variable ya ha sido creada

		// Lo que si podemos hacer es cambiar el valor de las variables
		numero1 = 5;

		// podemos imprimir por pantalla valores de variables llamandolas por su nombre

		System.out.println(numero1);

		numero1 = 20;
		System.out.println(numero1); /// Notese que ahora el valor de numero1 ha cambiado

		numero1 = 1340;
		System.out.println(numero1);

		/*
		 * Podemos crear variables de distintos tipos como las variables booleans
		 */

		boolean variableBooleana = true;
		System.out.println(variableBooleana);
		variableBooleana=false;
		System.out.println(variableBooleana);
		
		//notese que el nombre de las variables en JAVA van en notacion LowerCamelCase
		
		//OJO!¡!¡!, EL NOMBRE DE LAS VARIABLES ES SENSIBLE A LAS MAYUSCULAS Y MINUSCULAS
		
		int estoEsUnaVariable=0;
		System.out.println(estoEsUnaVariable);
		
		int ESTOESUNAVARIABLE=8;
		System.out.println(ESTOESUNAVARIABLE);
		
				
		//Las variuables en JAVA no pueden empezaar en numero.
		//int 1numero= 0//error
		
		//Deben empezar por:
		//1. caracter alfabetico
		//2. guion bajo "_"
		//3. Simbolo del dolar "$"
		
		//Variable de tipo double
		double variableDouble=12.34;
		System.out.println(variableDouble);
		
		//Variable de tipo long
		long variableLarga=232l; //OJO con la l
		System.out.println(variableLarga);
		
		//variables de tipo float
		float variableFloat=23.45F;
		System.out.println(variableFloat);
		
		//Existen otro tipo de variables menos usados, como por ejemplo:
		//byte, para numeros muy pequeños, entre -128 y 127
		
		byte variableByte=127;
		System.out.println(variableByte);
		
		//tipo Char
		char variableChar='C';
		System.out.println(variableChar);
		
		//Tipo String o cadena. OJO!!, en este caso se capitaliza la primera palabra
		String variableCadena= "esto es una variable de cadena";
		System.out.println(variableCadena);
		
		variableCadena= "Acabo de cambiar el valor de la variableCadena";
		System.out.println(variableCadena);
		
		
		
		
		
		
		
		
		
	}
}
