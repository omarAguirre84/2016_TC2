package edu.ort.tc2.tp3.herencia;

public class Vehiculo {

	private String patente;
	private int velocidad;

	
	public Vehiculo() {
		patente = "Sin Patente";
		velocidad = 0;
	}

	public Vehiculo(String patente) {
		this.patente = patente;
		this.velocidad = 0;
	}

	public String getPatente() {
		return patente;
	}

	public Boolean validarPatente(String patente) {
		if (patente.equals(null)) {
			return false;
		}
		return true;
	}

	public void setPatente(String patente) {
		if (validarPatente(patente)) 
		{
			this.patente = patente;
		} else 
		{
			patente = "Sin Patente";
		}
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void acelerar() {
		velocidad += 1;
	}

	public void frenar() {
		while (velocidad > 0) {
			velocidad -= 1;
		}
	}

}
