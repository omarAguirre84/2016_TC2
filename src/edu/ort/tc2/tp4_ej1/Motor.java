package edu.ort.tc2.tp4_ej1;

public class Motor {
	private String tipo;


	public Motor(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	@Override
	public String toString(){
		return tipo;
	}
}