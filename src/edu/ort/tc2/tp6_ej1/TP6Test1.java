package edu.ort.tc2.tp6_ej1;

import edu.ort.tc2.tp3.ej2.*;
//import edu.ort.tc2.tp3.ej2.SubContratado;
import edu.ort.tc2.tp3.ej3.Vendedor;

public class TP6Test1 {

	public static void main(String[] args) {
		
		Empleado[] vec = new Empleado[5];
		
			
		try {
			if (vec.length <= 5) {
				vec[0] = new Asalariado("Jose", 30, 10000);
				vec[1] = new SubContratado("Carlos", 23, 150, 100);
				vec[2] = new SubContratado("Ana", 40, 250, 100);
				vec[3] = new Vendedor("Pedro", 25, 100, 200, 5); 
				vec[4] = new Vendedor("Maria", 30, 100, 200, 10);
				//vec[5] = new Vendedor("Maria", 30, 100, 200, 10);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
		
		
		
	}

}
