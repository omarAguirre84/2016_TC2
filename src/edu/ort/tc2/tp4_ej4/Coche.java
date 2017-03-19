package edu.ort.tc2.tp4_ej4;

import edu.ort.tc2.tp4_ej1.Motor;


public class Coche {
	private String marca;
	private Motor motor;
	private Rueda[] ruedas;
	private Puerta puertaIzquierda = new Puerta("izquierda");
	private Puerta puertaDerecha = new Puerta("derecha");
	
	private Ventana vIzq = new Ventana("izq");
	private Ventana vDer = new Ventana("der");
	
	public Coche(String marca, String tipoMotor){
		this.marca = marca;
		this.motor = new Motor(tipoMotor);
		ruedas = new Rueda[Ruedas_enum.values().length];
		
		for (int i = 0; i < Ruedas_enum.values().length; i++) {
			ruedas[i] = new Rueda();
		}
	}
	private String getRuedas() {
		String output = "";
	
		for (int i=0; i < Ruedas_enum.values().length; i++) 
		{
			output = output + Ruedas_enum.values()[i] + ": " + ruedas[i] + " ";
		}
		return output;
	}
	
	public void inflarRueda(int nroRueda, int psi){
		ruedas[nroRueda].inflar(psi);
	}
	
	public void abrirPuerta(String cual){
		if (cual.equalsIgnoreCase("izquierda")) {
			puertaIzquierda.abrir();
		}
		if (cual.equalsIgnoreCase("derecha")) {
			puertaDerecha.abrir();
		}
	}
	public void cerrarPuerta(String cual){
		if (cual.equalsIgnoreCase("izquierda")) {
			puertaIzquierda.cerrar();
		}
		if (cual.equalsIgnoreCase("derecha")) {
			puertaDerecha.cerrar();
		}
	}

	
	@Override
	public String toString() {

		return "Coche [\n marca=" + marca + ",\n motor=" + motor + ",\n ruedas= " + getRuedas() 
				+"\n puertaIzquierda=" + puertaIzquierda + ", puertaDerecha=" + puertaDerecha + ", vIzq=" + vIzq + ", vDer=" + vDer + "]";

	}
	

}
