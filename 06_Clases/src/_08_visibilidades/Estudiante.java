package _08_visibilidades;
	//Con las visibilidades establecemos desde donde podemos acceder a nuestros atributos y métodos
	
	//En Java tenemos 4 tipos de visibilidades:
		//1º private --> Solo tenemos visibilidad dentro de la propia clase, es decir
			//no vamos a dejar acceder a nuestro atributo si no está dentro de la misma
	
		//2º (default) --> Solo tenemos visibilidad dentro de la propia clase y de las clases dentro 
			//del mismo paquete. El que hemos hecho siempre
		
		//3º protected --> Solo tenemos visibilidad dentro de la propia clase,
			//de las clases dentro del mismo paquete y de las clases que hereden de esta

		//4º Public --> Tenemos visibilidad en todas las partes de nuestro proyecto


//Normalmente, a efectos prácticos, los atributos siempre se declaran como 'private' y se 
//crean sus métodos accesores y modificadores
public class Estudiante {
	private String nombre;
	int edad;
	protected double peso;
	public String dni;
		
	
	public Estudiante() {
		super();	//Hay que crar un cosntructor por defecto ya que si creamos uno con
		//atributos, Jaava elimina el por defecto y las demás clases se quedarían sin 
		//constructor por defecto y da error
	}

	public Estudiante(String nombre, int edad, double peso, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.dni = dni;
	}
	
	//Normlamentre si creamos u atributo privado tenemos que darle métodos modificadores y accesores
	//La ventaja es que en los métodos podemos aplicar lógica, mientras q en un atributo no
	//Por convenio es muy importante seguir los convenios de Java para estos metodos:
	
	//Los métodos modificadores empiezan por 'set' + nombre_atributo
	//Para los métodos accesores empiezan por la palabra 'get' + nombre_atributo
	
	//Esto es un metodo modificador
	public void setNombre(String nombre) { //Esto sirve para modificar															
		if(nombre.length()>=1) {		// el nombre con las condiciones que nosotros queramos
			this.nombre=nombre;			// Hacer atributos privados y hacer el metodo modificador publico
		}	
	}
	
	//Esto es un metodo accesor
	public String getNombre() {
		//return this.nombre.toLowerCase();
		if(this.nombre!= null) {//Esto para evitar nullPointerException
			return convertirNombreAMinuscula();
		}
		return this.nombre;
	}
	
	private String convertirNombreAMinuscula() {
		return this.nombre.toLowerCase();
	}
	
}
