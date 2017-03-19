package edu.ort.t2.tp1;

import java.util.Locale;
import java.util.Scanner;


public class Circulo {
	private static Scanner input = new Scanner(System.in).useLocale(Locale.US);	
	
	private int x,y;
	private double radio;
	
	/////////CONSTRUCTORES///////////
	public Circulo() {
		super();
		System.out.print("Ingrese X: "); 
		this.x = input.nextInt();
		
		
		System.out.print("Ingrese X: "); 
		this.y = input.nextInt();
		
		
		System.out.print("Ingrese Radio: ");
		this.radio = input.nextDouble();
	}
	
	public Circulo(int x, int y, double radio) {
		super();
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	/////////GETTERS/SETTERS///////////
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/////////////////////////////

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + ", radio=" + radio + "]";
	}
	
}
