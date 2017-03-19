package edu.ort.tc2.tp4_ej3;

public class TP4Test3 {

	public static void main(String[] args) {	
		
		Reloj reloj1 = new Reloj(new Hora(10,15,55), "Digital");
		Reloj reloj2 = new Reloj(new Hora(10,15,55), "Analógico");
		
		reloj1.start();
		reloj2.start();
	}

}
