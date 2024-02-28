package _01_Condicionales;

public class _03_OperadorTernario {

	public static void main(String[] args) {
		// OPERADOR TERNARIO
		//-----------------
		//cON ESTE OPERADOR BUSCAMOS HACER UNA SENTYENCIA 'if-else' DE UNA MANERA RÁPIDA Y EN UNA SOLA LÍNEA
		
		//LA ESTRUCTURA ES:
		//(EXPRESION_BOOLEAN) ? CASO_VERDADERO : CASO_FALSO;
		
		//EJEMPLO
		int numero=5;
		String cadena = (numero<=5) ? "Menor o igual que 5" : "Mayor que 5";
		System.out.println(cadena);
		
		if(numero<=5) {
			System.out.println("Mneor o igual que 5");
		}else {
			System.out.println("Mayor que 5");
		}
		
		//Otro ejemplo
		String texto= (numero%2==0) ? "El número es par":"El número es impar";
		System.out.println(texto);
		
		//Otro ejemplo
		//Las variables booleanas normalemnte empiezan por 'es' o por 'is'
		//tambien puede empezar por 'tiene' o por 'has'
		boolean esPar= (numero%2==0) ? true:false;
		if (esPar) {
			
		}
		System.out.println(texto);
		}

	}


