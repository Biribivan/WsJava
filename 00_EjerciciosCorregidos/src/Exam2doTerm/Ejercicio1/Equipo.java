package Exam2doTerm.Ejercicio1;

import java.util.ArrayList;

public class Equipo {
	String nombre;
	double presupuesto;
	ArrayList<Jugador> listaJugadores;
	
	public double salarioTotalJugadores() {
		double salarioTotal=0;
		for(Jugador j : listaJugadores) {
			salarioTotal += j.salario;
		}return salarioTotal;
	}
	
	public boolean esPresupuestoValido() {
		double salarioTotalJugadores = this.salarioTotalJugadores();
		if( presupuesto >= salarioTotalJugadores) {
			return true;
		}return false;
	}
}
