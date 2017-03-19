package edu.ort.tc2.tp4_ej4;

public class Puerta {
	
	private String lugar;
	private boolean abierta;
	
	public Puerta(String lugar){
		this.lugar = lugar;
	}
	public void setAbierta(){
		
	}
	public boolean getAbierta(){
		return abierta;
	}
	
	public void abrir(){
		System.out.println("abriendo la puerta " + lugar);
		abierta = true;
	}
	public void cerrar(){
		System.out.println("cerrando la puerta " + lugar);
		abierta = false;
	}
	
	private String getEstado(){
		return (abierta) ? "abierta":"cerrada";
	}
	@Override
	public String toString(){
		String a = getEstado();
		return lugar +" "+a;
	}
	
}
