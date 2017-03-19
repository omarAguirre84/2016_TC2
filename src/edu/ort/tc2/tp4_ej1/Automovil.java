package edu.ort.tc2.tp4_ej1;

public class Automovil {
	private Motor motor;
	private String modelo;
	private String marca;
	
	public Automovil(Motor motor, String modelo, String marca){
		this.motor=motor;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	public String getTipoMotor(){
		return this.motor.getTipo();
	}
	public String getMarca(){
		return this.marca;
	}
	
	@Override
	public String toString(){
		return this.marca + " " + this.modelo + " " + this.motor.getTipo();
	}
}
