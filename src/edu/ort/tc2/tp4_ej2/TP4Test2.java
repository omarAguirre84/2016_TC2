package edu.ort.tc2.tp4_ej2;

public class TP4Test2 {

	public static void main(String[] args) {
		Autor aUno = new Autor("Daitel",65,"USA");
		Libro l1 = new Libro("Programando en Java", 250, aUno);
		Libro l2 = new Libro("Java para principiantes", 200, aUno);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
	}

}
