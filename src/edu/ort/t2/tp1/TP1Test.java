package edu.ort.t2.tp1;

public class TP1Test {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo(10,20,5.5);
		
		System.out.println();
		
		System.out.print("c1->x="+c1.getX()+", ");
		System.out.print("y="+c1.getY()+", ");		
		System.out.println("radio="+c1.getRadio());
		
		System.out.println();
		
		System.out.println("c2->"+c2.toString());
	
	}

}
