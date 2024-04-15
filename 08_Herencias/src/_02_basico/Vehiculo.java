package _02_basico;

public class Vehiculo {
	private String marca;
	private double peso;
	private double velocidad;
	/**
	 * Formato dd/mm/YYYY
	 */
	private String fechaFabricacion;
	
	/**
	 * Método que devuelve si el vehiculo es antiguo o no
	 * @return 'true' si el año de fabricación es menor que 2000 y 'false' si es mayor
	 */
	public boolean esAntiguo() {
		String sAnio = fechaFabricacion.split("/")[2];
		int iAnio = Integer.parseInt(sAnio);
		if( iAnio< 2000) {
			return true;
		}return false;	
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

}
