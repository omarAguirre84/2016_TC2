package edu.ort.tc2.tp5_Menu_Interfaces;

public class Mostrar implements Accion {

	private String mensaje;
	public Mostrar(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public void ejecutar() {
		System.out.println(this.mensaje);
	}

}
