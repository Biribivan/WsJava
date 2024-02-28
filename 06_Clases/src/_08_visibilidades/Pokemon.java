package _08_visibilidades;

//Normalmente las clases que representan entidades en Java siguen la convención 
//JavaBean, ya que muchas aplicaciones la exigen para que funcione

//Esta convención dice: 
	//1.  Atributos privados
	//2.  Métodos accesores y modificadores  (setters y getters)
	//3.  Constructor por defecto
public class Pokemon {
	private int vida;
	private String nombre;
	private int experiencia;
	
	//CONSTRUCTORES
	public Pokemon() {
		super();
	}

	public Pokemon(int vida, String nombre, int experiencia) {
		super();
		this.vida = vida;
		this.nombre = nombre;
		this.experiencia = experiencia;
	}

	//HANSELL Y GRETTEL
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		if(vida<0) {
			this.vida = 0;
		}else {
			this.vida = vida;
		}			
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Pokemon [vida=" + vida + ", nombre=" + nombre + ", experiencia=" + experiencia + "]";
	}
	
	
}
