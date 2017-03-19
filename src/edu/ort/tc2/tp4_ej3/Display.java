package edu.ort.tc2.tp4_ej3;

public class Display {
	private String tipo;
	
	public Display(String tipo){
		this.tipo = tipo;
	}
	
	public void setDisplayHora(Hora hora){
		if (tipo == "Digital" || tipo == "digital") {
			System.out.println("[" + hora.getHora() + ":" + hora.getMinutos() + ":"+ hora.getSegundos() +"]");
		}
		else
		{
			System.out.println("->" + hora.getHora() + ":" + hora.getMinutos() + ":"+ hora.getSegundos() +"<-");
		}
		
	}
		
}

