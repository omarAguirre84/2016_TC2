package edu.ort.tc2.tp3.ej2;

public class TP3Test1 {

	public static void main(String[] args) {
		
		Asalariado jose = new Asalariado("Jose",30,10000);
		SubContratado carlos = new SubContratado("Carlos", 23, 50, 100);
	
		System.out.println(jose.toString());
		System.out.println(carlos.toString());
		
		
	}

}
