package edu.ort.tc2.tp4_ej4;

public class TP4Test4 {

	public static void main(String[] args) {
	Coche c1 = new Coche("Ford", "V8");
		
		
		c1.abrirPuerta("izq");
		
		for (int i = 0; i < Ruedas_enum.values().length; i++) {
			c1.inflarRueda(Ruedas_enum.values()[i].ordinal(), 29+i);
		}
		
		System.out.println(c1);
	}

}
