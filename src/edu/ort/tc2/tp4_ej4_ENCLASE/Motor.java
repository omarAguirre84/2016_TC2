package edu.ort.tc2.tp4_ej4_ENCLASE;

public class Motor {
	private String tipo;
	
	public Motor(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + getTipo() + "]";
	}
	
}
