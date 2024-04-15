package _01_basico;
//Se puede crear directamente el 'extends' con: class> superclas> browse > la clase padre
public class Docente extends Persona{
	public double salario;
	
	public double calcularSalarioNeto() {
		double salarioNeto= salario * 0.85;
		return salarioNeto;
	}
}
