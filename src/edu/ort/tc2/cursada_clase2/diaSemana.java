package edu.ort.tc2.cursada_clase2;

public class diaSemana {
	
	private String nombreLargo;
	private String nombreCorto;
	
	//////////////////////////////////////
	public String getNombreLargo() {
		return nombreLargo;
	}
	
	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}
	
	public String getNombreCorto() {
		return nombreCorto;
	}
	
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	///////////////////////////////////////
	//el contructor inicializa atributos
	public diaSemana() {
		this.nombreLargo = "";
		this.nombreCorto = "";
	}

	/*
	public diaSemana(String nombreLargo, String nombreCorto) {
		this.nombreLargo = nombreLargo;
		this.nombreCorto = nombreCorto;
	}
	*/
	
	public char generarInicial(){
		return this.nombreLargo.charAt(0);
	}
	
	public void generarNombreCorto(){
		nombreCorto = this.nombreLargo.substring(0, 2);
	}

	@Override
	public String toString() {
		return "diaSemana [nombreLargo: " + nombreLargo + 
						   ", nombreCorto: " + nombreCorto + 
						   ", inicial(): " + generarInicial()
						   + "]";
	}
	
}
