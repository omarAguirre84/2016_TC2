package edu.ort.tc2.ej3.herenYpolim_trucoMagia;

public class NaipeNumerado extends Naipe {

	private int valor;
	
	public NaipeNumerado(String palo, int valorNumerico, String figura) {
		super(figura + " de " + palo);
		this.valor = valorNumerico;
	}

	public String getTodo() {
		return valor + " - " + super.toString();
	}

	@Override
	public int getValor() {
		return valor;
	}

}
