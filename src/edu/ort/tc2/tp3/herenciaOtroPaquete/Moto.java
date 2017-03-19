package edu.ort.tc2.tp3.herenciaOtroPaquete;

import edu.ort.tc2.tp3.herencia.*;

public class Moto extends Vehiculo {
	private int cilindrada;

	public Moto(String patente, int cilindrada) {
		super(patente);
		this.cilindrada = cilindrada;
	}

	public void presionarAcelerador() {
		acelerar();
	}

	public int getCilindrada() 
	{
		
		return this.cilindrada;
	}

	@Override
	public String toString() {
		return "Patente:" + getPatente() + " - Velocidad:" + getVelocidad() + " - Cilindradas:" + cilindrada;
	}
}