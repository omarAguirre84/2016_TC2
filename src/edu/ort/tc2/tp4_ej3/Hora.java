package edu.ort.tc2.tp4_ej3;

public class Hora {
	private int hora, minutos, segundos;
	
	public Hora(int h, int m, int s){
		this.hora = h;
		this.minutos = m;
		this.segundos = s;
	}

	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}
}
