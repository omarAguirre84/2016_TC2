package edu.ort.tc2.tp5_Menu_Interfaces;

public class Opcion {
	private String texto;
	private Accion callback;
	
	public Opcion(String valor, Accion callback) {
		texto = valor;
		this.callback = callback; 
	}

	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * @return the callback
	 */
	public Accion getCallback() {
		return callback;
	}
	
	public void ejecutar() {
		if (this.callback!=null){
			this.callback.ejecutar();
		}
	}
}
