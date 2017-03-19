package edu.ort.tc2.tp2_arrays_vectores;
import java.util.Scanner;;

public class Tp2TestEjer5 {
	public static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.print("Ingrese tamaño del Array: ");
		
		int [] vec1 = new int [input.nextInt()];//TAMAÑO DEL ARRAY POR TECLADO
		
		System.out.print("Ingrese el numero a buscar: ");//NUMERO A BUSCAR DENTRO DE ARRAY
		int numero = input.nextInt();
		
		System.out.println("\n");
		
		for (int i = 0; i < vec1.length; i++) 
		{
			vec1[i]=Tp2TestEjer2.numeroAlAzar_Public(1, 10);
		}
		for (int i = 0; i < vec1.length; i++) 
		{
			System.out.println("vec["+i+"]"+vec1[i]);
		}
			
		System.out.print("El valor a buscar es "+numero+ " y esta en el vector en las posiciones: ");
		

		if (dondeEsta(vec1, numero) != null) 
		{
			for (int i = 0; i < (dondeEsta(vec1, numero)).length; i++) 
			{
				System.out.print(dondeEsta(vec1, numero)[i]);
				
				if ((i < dondeEsta(vec1, numero).length-1)) 
				{
					System.out.print(", ");
				}
			}
		}
		else
		{
			System.out.print("ninguna");
		}
		
	}
	
	public static int[] dondeEsta(int[] array, int valorABuscar)
	{
		int[] result;
		int cont=0;
		
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] == valorABuscar) 
			{
				cont++;
			}
		}
		
		if (cont > 0) 
		{ 
			result = new int[cont];
			int contador=0;
			
			for (int i = 0; i < array.length; i++) 
			{
				if (array[i] == valorABuscar) 
				{
					result[contador]=i;
					contador++;
				}
			}
		}
		else
		{
			result=null;
		}
		return result;
	}
	
}
