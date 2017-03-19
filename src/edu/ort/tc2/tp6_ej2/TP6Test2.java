package edu.ort.tc2.tp6_ej2;

import java.util.ArrayList;

public class TP6Test2 {
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();

		try {
			while (true) {
				String elString = "este es un String";
				lista.add(elString);
				
				if (lista.size() % 10000000 == 0) {
					System.out.println("La lista tiene " + lista.size()/ 1000000 + " milliones de elementos!");
				}
			}
		}catch (OutOfMemoryError m) {
			System.out.println(m.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}