package edu.ort.tc2.tp4_ej4_ENCLASE;

public class Coche {

	private String marca;
	private Motor motor;
	private Rueda [] ruedas;
	private Puerta puertaIzquierda;
	private Puerta puertaDerecha;

	public Coche(String marca, String tipoMotor) {
		this.marca = marca;
		motor = new Motor(tipoMotor);
		ruedas = new Rueda[PosicionRueda.values().length];
		for (int i=0; i < PosicionRueda.values().length; i++) {
			ruedas[i] = new Rueda();
		}
		puertaIzquierda = new Puerta("izquierda");
		puertaDerecha = new Puerta("derecha");
	}
	
	public void inflarRueda(int nroRueda, int presion) {
		ruedas[nroRueda].inflar(presion);
	}
	
	public void abrirPuerta(String cual) {
		if (cual.equalsIgnoreCase("izquierda")) {
			puertaIzquierda.abrir();
		} else {
			puertaDerecha.abrir();
		}
	}
	
	public void cerrarPuerta(String cual) {
		if (cual.equalsIgnoreCase("izquierda")) {
			puertaIzquierda.cerrar();
		} else {
			puertaDerecha.cerrar();
		}
	}
	
	private String getRuedas() {
		String output = "";
		for (int i=0; i < PosicionRueda.values().length; i++) {
			output = output + 
					PosicionRueda.values()[i] + ": " +
					ruedas[i] + " ";
		}
		return output;
	}

	@Override
	public String toString() {
		return "Coche marca " + marca + "\n motor " + motor +
				"\n ruedas=" + getRuedas() +
				"\n " + puertaIzquierda + ", " + puertaDerecha;
	}
	
}
