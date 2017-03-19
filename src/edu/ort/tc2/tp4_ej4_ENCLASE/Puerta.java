package edu.ort.tc2.tp4_ej4_ENCLASE;

public class Puerta {
	private String lugar;
	private boolean abierta;
	
	public Puerta(String posicion){
		this.lugar = posicion;
	}
	
	public void abrir() {
		if (abierta) {
			System.out.println("Ey! La puerta " + lugar + " ya est� abierta!");
		} else {
			System.out.println("Abr�endo la puerta " + lugar);
			abierta = true;
		}
	}

	public void cerrar() {
		if (!abierta) {
			System.out.println("Ey! La puerta " + lugar + " ya est� cerrada!");
		} else {
			System.out.println("Cerrando la puerta " + lugar);
			abierta = false;
		}
	}
	 private String getEstado() {
		 return (abierta) ? "abierta" : "cerrada";
	 }

	@Override
	public String toString() {
		return "Puerta " + lugar + ", " + getEstado();
	}
	
}
