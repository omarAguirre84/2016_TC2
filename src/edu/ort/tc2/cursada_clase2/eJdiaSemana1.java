package edu.ort.tc2.cursada_clase2;

public class eJdiaSemana1 {

	static String [] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
	
	public static void main(String[] args) 
	{
		int size = dias.length;
		
		for (int d = size; d > 0; d --) 
		{
			System.out.println("Dia " + d + ": " + dias[d-1]);
		}
		
	}

}
//Posicionamiento directo e indirecto