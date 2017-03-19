package edu.ort.tc2.tp5_Menu_Interfaces;

public class SumaNumeros implements Accion {
	
	private Menu2 aaa = new Menu2();
	@Override
	public void ejecutar() {
		System.out.println(4 + "+" + 5 + "=" + (4+5));
	}
	
	
}
