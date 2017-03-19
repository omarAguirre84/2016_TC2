package edu.ort.tc2.ej3.herenYpolim_trucoMagia;

public class Naipe {

	private String descripcion;

	public Naipe(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getValor() {
		return 0;
	}

	@Override
	public String toString() {
		return descripcion;
	}
}
