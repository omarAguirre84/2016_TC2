package edu.ort.tc2.tp6_ej3_parseInt_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TP6Test3 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double n1 =0;
		double n2=0;
		double res;
		boolean rehacer ;
		
		do {
			System.out.println("Ingrese 2 numeros:");
			try {
				n1 = Integer.parseInt(input.next());
				n2 = Integer.parseInt(input.next());
				res = n1 / n2;
				System.out.println("Division= " + res);
				rehacer = false;
				input.close();
			} catch (NumberFormatException a) {
				System.out.println("Ingrese numero entero");
				rehacer = true;
			} catch (InputMismatchException b) {
				System.out.println(b.getMessage());
				rehacer = true;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				rehacer = true;
			}
		} while (rehacer);
	}
}