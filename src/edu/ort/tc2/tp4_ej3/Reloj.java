package edu.ort.tc2.tp4_ej3;

public class Reloj {
	private Display display;
	private Hora hora;
	
	public Reloj(Hora hora, String tipo){
		this.hora = hora;
		display = new Display(tipo);
	}
	
	public void start(){
		display.setDisplayHora(hora);
	}
}
