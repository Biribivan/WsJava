package _08_visibilidades.otroPaquete;

import _08_visibilidades.Estudiante;

public class MainVisibilidad2 {
	public static void main(String[] args) {
		Estudiante e1=new Estudiante();
	//	e1.edad = 16; No deja porque edad esta en default
		//Y solo permite en el mismo paquete
		//e1.nombre ="Pepe";
		//e1.peso=56.876;
		e1.dni="51804852C"; //Este si deja porq es publico
	}
}
