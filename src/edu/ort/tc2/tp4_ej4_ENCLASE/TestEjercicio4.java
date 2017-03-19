package edu.ort.tc2.tp4_ej4_ENCLASE;

public class TestEjercicio4 {

	public static void main(String[] args) {
		Coche coche = new Coche("Ford", "GDI");
		coche.inflarRueda(PosicionRueda.DD.ordinal(), 29);
		coche.inflarRueda(PosicionRueda.DI.ordinal(), 29);
		coche.inflarRueda(PosicionRueda.TD.ordinal(), 31);
		coche.inflarRueda(PosicionRueda.TI.ordinal(), 31);
		coche.abrirPuerta("Izquierda");
		coche.abrirPuerta("Izquierda");
		coche.cerrarPuerta("Derecha");
		System.out.println(coche);
	}

}
