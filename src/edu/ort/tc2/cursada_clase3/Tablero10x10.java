package edu.ort.tc2.cursada_clase3;

public class Tablero10x10 {

	public static void main(String[] args) 
	{	
		Character [][] tableroCharacter = new Character [8][10];
		char [][] tableroChar = new char [8][10];
		Integer [][] tableroInteger = new Integer[10][8];
		//System.out.println('b'-'a');
		
		System.out.println(tableroCharacter.length);
		System.out.println(tableroCharacter[0].length);
		
		char a=' ';
		
		for (int i = 0; i < tableroInteger.length; i++) 
		{
			for (int j = 0; j < tableroInteger[i].length; j++) 
			{
				tableroInteger[i][j] = j;
				System.out.print("[");
				System.out.print(tableroInteger[i][j]);
				System.out.print("]");
			}
			System.out.print(" ("+i);
			System.out.println("\n");
		}
		
		
	}

}
