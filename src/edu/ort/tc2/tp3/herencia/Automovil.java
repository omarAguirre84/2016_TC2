package edu.ort.tc2.tp3.herencia;

public class Automovil extends Vehiculo 
{

	private int puertas;

	public Automovil() {
		puertas = 2;
	}

	public void setPuertas(int cantidadPuertas) 
	{
		this.puertas = cantidadPuertas;
	}

	@Override
	public String toString() 
	{
		return "Patente:" + getPatente() + " - Velocidad: " + getVelocidad() + " - Cantidad de Puertas: " + this.puertas;
	} 

}
