package _01_Depuracion;

import java.util.Scanner;
//Hay 2 tipos de errores
//Compilacion: Cuando tenemso error en tiempo de compilacion y no se puede ejecutar en el .class
//Ejecución:
public class _02_DepuracionSentenciasControl {

	public static void main(String[] args) {
		//Podemos depurara Sentenciuas de Control con la misma 
		//metodología
		System.out.println("Introduzca un numero");
		Scanner sc=new Scanner(System.in);
		int numero1=sc.nextInt();
		
		if (numero1==0) {
			int numero2=56;
			System.out.println("El número introducido es 0");			
		}		
		System.out.println("Fin del programa");
		
		for(int i=0;1<=100;i++) {
			System.out.println("La variable de control de bucle es: "+i);
			if (i==50) {
				System.out.println(12/ numero1);
			}
			
		}
		
	}

}
