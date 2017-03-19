package edu.ort.tc2.tp2_arrays_vectores;

public class Tp2TestEjer2 {

	public static void main(String[] args) 
	{
		for (int i = 11; i < 18; i++) 
		{
			System.out.println(numeroAlAzar(11, 18));
		}
	}
	
	public static int numeroAlAzar_Public(int min, int max)
	{
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	private static int numeroAlAzar(int min, int max)
	{
		return (int)(Math.random()*(max-min+1))+min;
	}

}
