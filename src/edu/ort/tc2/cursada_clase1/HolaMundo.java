package edu.ort.tc2.cursada_clase1;

public class HolaMundo {
	
	public static void main(String[] args) {
		//Saluda a quien usa el programa basandose
		//el nombre pasado como parametro al programa 
		
		System.out.println(args.length);
		System.out.println("Hola");
		
		for (int i = 0; i < args.length; i++) 
		{
			System.out.print(args[i]);
			System.out.print(" ");
		}
	}

	
}
