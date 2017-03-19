package edu.ort.tc2.tp4_ej4_ENCLASE;

public class Rueda {
	private int presion;
	
	public Rueda(){
		presion = 0;
	}
	
	public int getPresion() {
		return presion;
	}
	
	public void inflar(int presion) {
		this.presion = presion;
	}

	@Override
	public String toString() {
		return "[presion=" + getPresion() + " pci]";
	}
	
}
