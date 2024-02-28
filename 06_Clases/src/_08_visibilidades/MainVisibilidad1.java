package _08_visibilidades;

public class MainVisibilidad1 {
	public static void main(String[] args) {
		Estudiante e1= new Estudiante();
		//e1.nombre ="Pepe";
		e1.peso=67.76;
		e1.edad=65;
		e1.dni="51804876C";
		e1.setNombre("PEDRO SANCHEZ");
		System.out.println(e1.getNombre());
	}
}
