package edu.ort.tc2.tp4_ej4;

public class Rueda {
	private int psi;
	
	public Rueda(){
		psi=0;
	}
	
	public void inflar(int psi){
		this.psi = psi;
	}
	
	public int getPsi(){
		return psi;
	}
	
	@Override
	public String toString(){
		return psi +" PSI, " ;
	}
}
