package edu.ort.tc2.tp2_arrays_vectores;
import java.util.Scanner;

public class Tp2TestEjer1 {
	private static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) {
		int vec [] = new int[5]; 
		
		for (int i = 0; i < vec.length; i++) {
			System.out.print("ingrese el valor de vec["+i+"]:");
			vec[i] = input.nextInt();
			
		}
		for (int i = 0; i < vec.length; i++) {
			System.out.println("vec ["+i+"]="+vec[i]);
		}
	}
	
	
	
}
