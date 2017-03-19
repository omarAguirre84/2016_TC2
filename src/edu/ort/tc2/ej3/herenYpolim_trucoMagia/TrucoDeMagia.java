package edu.ort.tc2.ej3.herenYpolim_trucoMagia;

import java.util.Scanner;

public class TrucoDeMagia {

	private static Scanner input = new Scanner(System.in);
	private static Mazo oMazo;
	private static MonteDeNaipes oMonteTruco;

	public static void main(String[] args) {
		Naipe aux;
		oMazo = new MazoFrances();
		// preparo el mazo
		oMonteTruco = new MonteDeNaipes();
		while (oMonteTruco.getCantidad() < 21) {
			aux = oMazo.extraer();
			if (aux.getValor()!=0) {
				oMonteTruco.agregar(aux);
			}
		}
		// comienza el truco
		for (int vueltas = 0; vueltas < 3; vueltas++) {
			procesar(vueltas==0);
		}
		// resoluci�n
		for (int n=0; n < 10; n++) {
			oMonteTruco.extraer();
		}
		System.out.println("La carta elegida fue: " + oMonteTruco.extraer());
	}
	
	private static void procesar(boolean primeraVez) {
		MonteDeNaipes[] oMontes = new MonteDeNaipes[3];
		for (int p=0;p<3;p++) {
			oMontes[p] = new MonteDeNaipes();
		}
		for (int i=0;i<7;i++) {
			for (int p=0;p<3;p++) {
				oMontes[p].agregar(oMonteTruco.extraer());
			}
			System.out.println(String.format("%25s %25s %25s", oMontes[0].valorUltimo(), oMontes[1].valorUltimo(), oMontes[2].valorUltimo()));
		}
		char op;
		do{
			System.out.println((primeraVez) ? "Elija un valor e indique en qu� columna est�" : "�En qu� columna est� el valor elegido?");
			System.out.println("(A, B � C)");
			op = input.nextLine().toUpperCase().charAt(0);
		} while (op!='A' && op!='B' && op!='C');
		switch (op) {
			case 'A' : reagrupar(oMontes[1]); reagrupar(oMontes[0]); reagrupar(oMontes[2]); break;
			case 'B' : reagrupar(oMontes[0]); reagrupar(oMontes[1]); reagrupar(oMontes[2]); break;
			default  : reagrupar(oMontes[0]); reagrupar(oMontes[2]); reagrupar(oMontes[1]);
		}
	}
	
	private static void reagrupar(MonteDeNaipes monte) {
		
		while(!monte.estaVacio()) {
			oMonteTruco.agregar(monte.extraer());
		}
	}

}
