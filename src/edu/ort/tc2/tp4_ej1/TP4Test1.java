package edu.ort.tc2.tp4_ej1;

public class TP4Test1 {

	public static void main(String[] args) 
	{
		Automovil uno = new Automovil(new Motor("3.8L V6"),"Mustang","Ford");
		Automovil dos = new Automovil(new Motor("4.6L V8"),"GT40","Ford");
		
		System.out.println(uno.toString());
		System.out.println(dos.toString());
	}

}
