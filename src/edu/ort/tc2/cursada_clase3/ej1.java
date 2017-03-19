package edu.ort.tc2.cursada_clase3;

import java.util.ArrayList;

public class ej1 {

	public static void main(String[] args) {

		//int [] datos;
		
		//for (int i = 0; i < datos.length; i++) {
		//	System.out.print(datos[i]);
		//}
		
		int [] datos = new int [100000];
		
		///////DEL 1 a N
		for (int i = 0; i < datos.length; i++) 
		{
			datos[i] = i+1;
		}
		//mostrarArray(datos);
		 
		///////DEL N a 1
		for (int i = 0; i < datos.length; i++) 
		{
			datos[i] = datos.length - i;
		}
		//mostrarArray(datos);
		
		///////DE arrays
		for (int i = 0; i < datos.length; i++) 
		{
			//Casting enmascarar una posicion de meroria para que se muestre como otra cosa 
			datos[i] = (int) (Math.random() * datos.length);
		}
		//mostrarArray(datos);
		System.out.println("Posicion "+encontrarRepetido(datos));
		
		ArrayList<Integer> prueba = obtenerPosiciones(datos, 0);
		
		for (Integer valor : prueba) 
		{
			//System.out.println(prueba.get(0));
			System.out.println(valor);
		}
	}

	static public void mostrarArray(int [] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
	
	static public int encontrarRepetido(int [] a)
	{
		int prim = a[0]; 
		int i = 1;
		
		while (i < a.length && prim != a[i]) 
		{
			i++;
		}
		
		if (i == a.length) 
		{
			i = -1;
		}
		return i;
	}
	
	static public ArrayList<Integer> obtenerPosiciones(int [] datos, int valor)
	{
		ArrayList<Integer> aux = new ArrayList<Integer>(); 
		aux.add(5);
		
		for (int pos = 0; pos < datos.length; pos++) 
		{
			if (datos[pos] == valor) 
			{
				aux.add(pos);
			}
		}
		
		return aux;
	}
	
}
