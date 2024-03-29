package _01_Condicionales;

import java.util.Scanner;

public class _01_IF_01 {

	public static void main(String[] args) {
		// Los programas como hemos visto, se ejecutan lÃ­nea a lÃ­nea, hasta
		//que llegan al fin del bloque del mÃ©todo 'main' y entonce se acaba
		//el programa.
		
		//Existen diferentes maneras de alterar este secuencialidad, y muchas
		//veces es necesaria para crear algorimos o hacer determinadas
		//funcionalidades.
		
		//Una manera es mediante los CONDICIONALES. Los condicionales evaluan
		//una expresión BOOLEAN, y en función de si la expresión es TRUE o 
		//FALSE, se tomará¡ una ruta u otra.
		
		//Una manera para hacer condiciones es mediante la palabra reservada
		//'if'. La condición a evaluar irá¡ siempre entre parÃ©ntesis
		
		boolean cierto = true;
		if(cierto)//Como la variable 'cierto' es TRUE, entramos dentro del condicional
			System.out.println("La variable tiene valor TRUE");
		
		cierto = false;
		if(cierto)//Como la variable 'cierto' es FALSE, NO entramos dentro del condicional
			System.out.println("La variable tiene valor FALSE (esto no se imprime, ulio)");
		
		//Puedo jugar con operadores para alterar la expresiÃ³n boolean
		if(!cierto)
			System.out.println("La variable tiene valor FALSE");
		
		int numero = 7;
		if(numero > 5)
			System.out.println("La variable 'numero' es mayor que 5");
		
		numero = 4;
		if(numero > 5)
			System.out.println("La variable 'numero' es mayor que 5");
		
		//Notese que solamente afecta a la sentencia inmediatamente siguiente
		//Si queremos que la condicion afecta a mÃ¡s de una lÃ­nea, debemos
		//de usar un 'bloque'
		numero = 6;
		if(numero > 5) {
			System.out.println("Hurra!! El numero es mayor que 5");
			System.out.println("El numero es: " + numero);
		}
		//IMPORTANTE: Se considera buena prÃ¡ctica de programaciÃ³n en Java
		//hacer siempre bloques en los condicionales, ya que facilita la
		//lectura. Es decir, no importa si haceis una lÃ­nea o varias, 
		//siempre en conveniente hacer un bloque
		
		//La sentencia 'if' puede contener otra palabra reservada en caso
		//de que no se cumpla la condiciÃ³n. La palabra es 'else'
		if(numero > 5) {
			System.out.println("El nÃºmero es mayor que 5");
		}else {
			System.out.println("El nÃºmero es menor o igual que 5");
		}

		//Normalmente las condiciones se basan en entradas de usuario o parÃ¡metros
		//de entrada
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un nÃºmero para saber si es mayor, igual o menor 5");
		numero = sc.nextInt();
		if(numero > 5) {
			System.out.println("El nÃºmero es mayor que 5");
		}else {
			System.out.println("El nÃºmero es menor o igual que 5");
		}
		
		//Existe otra variente del 'if' que nos da la opciÃ³n de poner mÃ¡s condiciones
		//a valorar, que es 'else if'. Podemos poner tanto 'else if' como queramos.
		if(numero > 5) {
			//Si entra por esta condicion, NO valora el 'else if' y por supuesto
			//tampoco entrarÃ­a por el 'else'
			System.out.println("El nÃºmero es mayor que 5");
		}else if(numero < 5){ 
			//Si no se cumple la condicion del 'if', valora esta otra opciÃ³n
			//pero ojo! Si la condiciÃ³n del if se cumple NO se valora esta
			//otra opciÃ³n
			System.out.println("El nÃºmero es menor que 5");
		}else if(numero == 5){ //OJO! Para comparar valores se usa '=='
			//Si no cumple el primer 'if' y no cumple el segundo 'else if'
			//entonces valoramos esta opciÃ³n
			System.out.println("El nÃºmero es igual a 5");
		}/*else {//El 'else' lo podemos usar si lo necesitamos, pero en 
				//este caso no tiene sentido
			System.out.println("El nÃºmero es menor o igual que 5");
		}*/
		
		//Podemos ver como los bloques 'else if' y 'else' son totalmente
		//optativos. AdemÃ¡s, el bloque 'else if' se puede repetir, mientras
		//que el bloque 'else' solo puede haber uno (si lo hay).
		
		System.out.println("Fin de programa");
	}
}
