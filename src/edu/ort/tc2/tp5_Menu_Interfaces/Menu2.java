package edu.ort.tc2.tp5_Menu_Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu2 {
	protected String titulo;
	private ArrayList<Opcion> opciones;
	private Scanner input;
	
	/***
	 * Constructor por defecto.
	 * Pondr� el valor "Men�" como t�tulo del men�.
	 */	
	public Menu2() {
		titulo = "Menu";
		inicializar();
	}

	/***
	 * Constructor parametrizado.
	 * Recibe el valor del t�tulo del men�.
	 */	
	public Menu2(String titulo) {
		this.titulo = titulo;
		inicializar();
	}
	
	private void inicializar() {
		opciones = new ArrayList<Opcion>();
		input = new Scanner(System.in);
	}
	
	/***
	 * Agrega el texto pasado como par�metro.
	 * Como una opci�n del men�.
	 * El n�mero de opci�n se crea autom�ticamente.
	 */	
	public void agregarOpcion(Opcion opcion) {
		opciones.add(opcion);
	}
	
	/***
	 * Devuelve el valor de una opci�n v�lida de men�.
	 * (Estar� entre 1 y la cantidad de opciones).
	 */
	public Opcion elegirOpcion() {
		int valor = 0;
		do {
			mostrar();
			try {
				valor = Integer.parseInt(input.nextLine());
			} catch (Exception e) {
				System.out.println("Epa, carg� mal la opci�n, debe ser un nro entre 1 y " + valorSalir());
				valor = -1;
			}
		} while(valor < 1 || valor > valorSalir());
		if (valor == valorSalir()) {
			return null;
		} else {
			return opciones.get(valor-1);
		}
	}
	
	/***
	 * Muestra todas las opciones del men�
	 * incluyendo la opci�n autom�tica
	 * Salir (que siempre ser� la �ltima)
	 */
	protected void mostrar() {
		int n = 1;
		System.out.println(titulo);
		for (Opcion op : opciones) {
			System.out.println(n + "-" + op.getTexto());
			n++;
		}
		System.out.println(n + "-Salir");
		System.out.println("Ingrese una opci�n para continuar:");
	}
	
	/***
	 * Devuelve el t�tulo del men�
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/***
	 * Devuelve el valor de la opci�n "Salir"
	 * generada autom�ticamente.
	 * Coincide con la cantidad de opciones creadas + 1.
	 */
	public int valorSalir() {
		return opciones.size() + 1;
	}

}
