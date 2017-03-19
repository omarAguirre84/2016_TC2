package edu.ort.tc2.tp3.herenciaOtroPaquete;

import edu.ort.tc2.tp3.herencia.*;

public class Main {
	public static void main(String[] args) {
		
		String patenteAuto = "AAA001";
		Automovil auto = new Automovil();
		
		if (auto.validarPatente(patenteAuto)) 
		{
			auto.setPatente(patenteAuto);
		}
		auto.acelerar();
		
		System.out.println(auto.toString());
		
		Moto moto = new Moto("MMM002", 125);
		moto.presionarAcelerador();
		moto.presionarAcelerador();
		moto.frenar();
		
		System.out.println("Esta moto tiene " + moto.getCilindrada() + "de cilindradas.");
		System.out.println(moto.toString());
	}
}