package clases;

import java.util.Date;

public class _04_Date {
	public static void main(String[] args) {
		//La maneera más básica e rabajar con fechas en JAVA es con la clase date.
		
		//La clase date toma como referencia de la ahora la del SO.
		//Cuando instanciamos la clase date obtendremos la hora del sistema donde estemos ejecutando el programa.
		
		//OjO, la clase Date que normalmente usaremos será la del paquete java.util
		
		
		Date fecha=new Date();//
		System.out.println(fecha);
		
		//Internamente la clase Date lo que guarda es el número de milisegundos que han pasado desde
		//el 01/01/1970 00:00:00, tambiém llamada hora UNIX. Se guarda en una variable de tipo long.
		//Podemos acceder a ella:
		System.out.println(fecha.getTime());
		
		//Si queremos manejar fechas debemos basarnos en  otras clases, la clase date tiene casi todos
		//sus métodos obsoletos que se mantienen para hacer retrocompatibilidad entre versiones superiores
		//de Java frente a las inferiores, pero nos dicen que hay otras maneras mejores de hacer la funcionalidad
		System.out.println(fecha.getDay());//Los días van del 0 al 6
		System.out.println(fecha.getMonth());//Los meses van del 0 al 11
		System.out.println(fecha.getYear() +1900); //Es el año actual menos 1900
		
		//Hay una manera más fácil de obtener el número de miilisegundos
		System.out.println(System.currentTimeMillis());//
		long tiempo= System.currentTimeMillis() - fecha.getTime();
		System.out.println("Tiempo total de ejecución del programa: " +tiempo);
	}
}
