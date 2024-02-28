
public class _09_Funciones_02 {

	public static void main(String[] args) {
		imprimirLong(34);
		imprimirSuma(45, 55);
		//imprimirLong("pepe");
		imprimirCadena("pepe");
		imprimirCadena("maria", "luisa");
		imprimirCadena("Manolo", 34);
		
		//Gracias a la sobrecarga puedo usar la funcion imprimir
		//y dependiendo del parÃ¡metro de entrada, se invocarÃ¡
		//una funciÃ³n u otra
		imprimir(34.78);
		imprimir("Pepe");
		imprimir(2_000_000_000);
		
		System.out.println("Fin de programa");
	}
	
	//Las funciones tienen las siguientes partes
	//1. Visibilidad, desde donde se invocar a la funciÃ³n. De momento haremos
	//que se pueda invocar desde cualquier parte -> public
	//2. Tipo de funciÃ³n, que puede ser estÃ¡tica o dinÃ¡mica. De momento todas
	//nuestras funciones serÃ¡n estaticas -> static
	//3. ParÃ¡metro de salida, el tipo de valor devuelto por la funciÃ³n. En caso
	//de que no devuelva nada se usa la palabra "void". Solo se puede devolver
	//un valor y se debe hacer con la palabra "return" dentro de la funciÃ³n. 
	//Cuando se ejecute la palabra "return" se acabarÃ¡ la funciÃ³n
	//4. Nombre de la funciÃ³n, representa como identificar e invocar la funciÃ³n
	//El nombre de la funciÃ³n sigue la misma regla que los nombres de las funciones.
	//AdemÃ¡s se debe usar 'lowerCamelCase' (como en las variables)
	//5. ParÃ¡metros de entrada, se ponen entre parÃ©ntesis las variables que necesita
	//la funciÃ³n para hacer su operaciÃ³n. Puede haber varios parÃ¡metros de entrada
	//separados por ",".
	//6. Las funciones siempre van con un bloque '{}'.
	public static double estaEsMiFuncion(int numero1, double numero2, String cadena1) {
		//Operaciones que realiza la funciÃ³n
		return 0;
		//El codigo de abajo da error en tiempo de compilaciÃ³n porque es inalcanzable.
		//El "return" pone fin a la funciÃ³n
		//System.out.println("Mensaje");//Error en tiempo de compilaciÃ³n
	}
	
	//Podemos invocar a funciones dentro de otras funciones y suele ser muy habitual
	public static void imprimirLong(long n1) {
		System.out.println("----------------------------");
		System.out.println("salida: " + n1);
		System.out.println("----------------------------");
	}
	
	public static void imprimirSuma(int n1, int n2) {
		long resultado = n1 + n2;
		imprimirLong(resultado);
	}
	
	//Podemos invocar a funciones dentro de otras funciones y suele ser muy habitual
	public static void imprimirCadena(String s1) {
		System.out.println("----------------------------");
		System.out.println("salida: " + s1);
		System.out.println("----------------------------");
	}
	//En java existe el concepto de Firma de FunciÃ³n
	//La firma de una funciÃ³n es lo que hace que Java distinga univocamente
	//una funciÃ³n de otra
	//En Java la firma de una funciÃ³n esta compuesta de:
	//1. El nombre de la funciÃ³n
	//2. El nÃºmero de parÃ¡metros de entrada de una funciÃ³n
	//3. El tipo de parÃ¡metros de entrada de una funciÃ³n
	//NO, pertenece el parÃ¡metro de salida
	
	//La siguiente funciÃ³n daria erro, porque tiene la MISMA FIRMA que la
	//funciÃ³n de arriba. Para Java ambas funciones son iguales
	/*
	public static void imprimirCadena(String s1) {
		System.out.println("----------------------------");
	}
	*/
	//La funciÃ³n de arriba no darÃ­a error si cambiamos el nombre
	
	//Creamos otra funcion que se llame igual, PERO cambiamos el nÃºmero
	//de parÃ¡metros de entrada. Por lo tanto, la firma es diferente
	public static void imprimirCadena(String s1,String s2) {
		System.out.println("----------------------------");
		System.out.println("Salida 1: " + s1);
		System.out.println("Salida 1: " + s2);
		System.out.println("----------------------------");
	}
	
	//Ahora cambiamos la firma de la funciÃ³n, variando el TIPO de parÃ¡metros
	//de entrada
	public static void imprimirCadena(String s1,double d2) {
		System.out.println("----------------------------");
		System.out.println("Salida 1: " + s1);
		System.out.println("Salida 1: " + d2);
		System.out.println("----------------------------");
	}
	
	//Concepto de SOBRECARGA de funciones.
	//En java sobrecargamos una funciÃ³n cuando dos o mas funciones tienen
	//el mismo nombre pero distinta firma, es decir, cambian el nÃºmero de
	//parametros de entrada o cambia el tipo de parÃ¡metros de entrada.
	
	//La funcion System.out.println() esta sobrecargada, segÃºn el parÃ¡metro
	//de entrada que se pase, se invoca a un println o a otro.
	
	//Vamos a sobrecargar la funcion imprimir(), para hacerla genÃ©rica
	public static void imprimir(long valor) {
		System.out.println("-------- long --------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");
	}
	
	public static void imprimir(String valor) {
		System.out.println("------- String -------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");
	}
	
	public static void imprimir(double valor) {
		System.out.println("------- double -------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");
	}
	
	//La siguiente funciÃ³n darÃ­a error en tiempo de compilaciÃ³n porque
	//tiene la misma firma que el mÃ©todo de arriba. El parÃ¡metro de
	//salida NO pertenece a la firma de un mÃ©todo, por lo tanto
	//Java no tiene manera de distinguirlos
	/*
	public static String imprimir(double valor) {
		System.out.println("------- double -------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");
		return "Manuel no te arrime a la pared, que te va a llenar de cal";
	}*/
	
	}
