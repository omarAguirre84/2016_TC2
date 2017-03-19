package edu.ort.tc2.tp5_ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
	private final int TOPE = 50;
	private int altas = 0;
	private ArrayList<Persona> lista;
	private static Scanner entrada = new Scanner(System.in);

	
	public Curso(){
		System.out.println(
		"--------------------------------"+"\n"+
		"         Menu Cursos	 "+"\n"+
		"--------------------------------"+"\n");
		
		for (int i = 0; i < Menu.values().length; i++) 
		{
			System.out.println(i+1 + ". " + Menu.values()[i]);
		}
		System.out.print("\nIngrese opcion: ");
		
		int opcion = entrada.nextInt();
		
		do {
			System.out.print("\nIngrese opcion: ");
			opcion = entrada.nextInt();
		} while (opcion < 1 || opcion > 6);
		System.out.println("salio");
		
		
	}
	
	public void altaPersona(Persona p){
		
	}
	public Persona altaAlumno(){
		Persona a = new Persona();
		return a;
	}
	public Persona altaProfesor(){
		Persona a = new Persona();
		return a;
	} 
	public void imprimirLista(){
		
	}
	public void verProfesores(){
		
	}
	public void verAlumnos(){
		
	}
	public void procesar(){
		
	}
	
}
