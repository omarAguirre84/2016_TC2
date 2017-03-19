package edu.ort.tc2.tp2_arrays_vectores;
import java.util.Scanner;

public class Tp2TestEjer4
{
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Ingrese tamaño del Array");
		int tamano=input.nextInt();
		
		int [] vec1 = new int [tamano];//TAMAÑO DEL ARRAY POR TECLADO
		
		System.out.println("Ingrese el numero a buscar");//NUMERO A BUSCAR DENTRO DE ARRAY
		int numero = input.nextInt();
		
		//DESORDENADO
		for (int i = 0; i < vec1.length; i++) //CARGAR CON NUMEROS AL AZAR ENTRE 10 y 20 
		{
			vec1[i] = Tp2TestEjer2.numeroAlAzar_Public(10, 20);
		}
		
		for (int i = 0; i < vec1.length; i++) //RECORRER MOSTRANDO
		{
			System.out.println("En el indice: "+i+ " esta el valor "+ vec1[i]);
		}
		
		if (getPosicion(vec1, numero) != -1) 
		{
			System.out.println("Posicion primera ocurrencia de: "+numero+" en el array es: "+getPosicion(vec1, numero)); 
		}
		
		System.out.println("");
		
		//ORDENADO ASC
		int [] vecOrdenadoAsc = ordenarArrayAsc(vec1); //ORDENAR ARRAY
		

		for (int i = 0; i < vecOrdenadoAsc.length; i++) //RECORRER MOSTRANDO
		{
			System.out.println("En el indice "+i+ " esta el valor "+ vecOrdenadoAsc[i]);
		}
		
		if (getPosicion(vecOrdenadoAsc, numero) != -1) 
		{
			System.out.println("Posicion primera ocurrencia de: "+numero+" en el array es: "+getPosicion(vecOrdenadoAsc, numero)); 
		}
		
	}
	
	//METODOS
	public static int getPosicion(int [] arrayInt, int seBusca)
	{
		int result = -1;
		for (int i = 0; i < arrayInt.length; i++) 
		{
			if (arrayInt[i] == seBusca) 
			{
				result = i;
			}
		}
		return result;
	}
	
	public static int[] ordenarArrayAsc(int [] arrayParaOrdenar)
	{
		int max,min;
		int [] arrayOrdenado;
		
		for (int i = 0; i < arrayParaOrdenar.length; i++) 
		{
			for (int j = 0; j < arrayParaOrdenar.length-1; j++) 
			{
				if (arrayParaOrdenar[j] > arrayParaOrdenar[j+1]) //vas cambiando de orden el mayor primero y el menor despues (lo busque en internet)
				{
					max = arrayParaOrdenar[j];
					min = arrayParaOrdenar[j+1];
					
					arrayParaOrdenar[j]=min; arrayParaOrdenar[j+1]=max;
				}
			}
		}
		
		return arrayOrdenado = arrayParaOrdenar;
	}
	
}
