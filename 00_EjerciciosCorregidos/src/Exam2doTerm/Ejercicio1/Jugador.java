package Exam2doTerm.Ejercicio1;

public class Jugador {
	String nombre;
	int edad;
	double salario;
	Historial historial;
	
	public boolean ganaMas(Jugador j) {
		if(this.salario > j.salario) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esSuperGoleador () {
		if(this.historial.numeroGoles>=100) {
			return true;
		}else {
			return false;
		}
	}
	
	
}


