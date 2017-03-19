package edu.ort.tc2.cursada_clase2;


public class ejObjetosArray {
	
	static diaSemana [] semana; //Array de Objetos
	// diaSemana [] semana = new diaSemana[7];
	
	static String [] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"}; //Array de Strings
	
	public static void main(String[] args) {
		
		semana = new diaSemana[7];
		//	System.out.println(semana.length);
		//	System.out.println(semana[0]);
			
		for (int i = 0; i < dias.length; i++) 
		{	
			semana[i] = new diaSemana();
			semana[i].setNombreLargo(dias[i]);
			semana[i].generarNombreCorto();
			
			System.out.println(semana[i].toString());
			
		}
	}
	
}