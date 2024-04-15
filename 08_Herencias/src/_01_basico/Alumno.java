package _01_basico;
/**
 * En Java para heredar una clase de otra se usa la palabra reservada
 * 'extends' despues del nombre de ña clase y a continuacion el nombre de la clase padre
 */
public class Alumno extends Persona{
	//Automáticamente la clase Alumno tiene todos los atributos de la clase Persona (nombre, edad) así 
	// como sus métodos (presentarse())
	
	public String curso;
	
	public boolean esCiencias() {
		if(curso.equals("DAM")) {
			return true;
		}return false;
	}
	/**
	 * Existe un concepto muy importante en la herencia conocido como
	 * la "sobreescritura" de métodos o "Override de métodos".
	 * Para sobreescribir un método, debemos de crear un método en la clase hija
	 * con la misma FIRMA qu eel método padre.
	 * 
	 * Al sobreescribir un método queremos darle un comportamiento diferente al de la clase
	 * 
	 * No confundir con la sobrecarga de métodos
	 * 
	 * La anotación @Override simplemente sirve para comprobar que el métod
	 * existe en la clase Padre y lo estamos sobreescribiendo. 
	 * En caso de que el método no
	 * exista en la clase padre daria un error en tiempo de compilación
	 */
	@Override
	public void presentarse() {
		System.out.println("Hola soy el alumno muñon d enombre: " +this.nombre);
		super.presentarse();
		//Super es una referencia al objeto padre, a lo que this es una referencia al objeto
	}
	
	
	
	
	
}
