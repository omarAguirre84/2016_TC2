package edu.ort.tc2.tp2_arrays_vectores;


public class Tp2TestEjer6 
{

	public static void main(String[] args) 
	{
		int[] vec1= new int[25];
		int cont=1;
		
		for (int i = 0; i < vec1.length; i++) //CARGAR VECTOR DE 1 A 25 
		{
			vec1[i]=cont;
			cont++;
		}
		
		int [][] matriz = new int [6][5];
		matriz = crearMatriz(vec1);
		sumarUltimaFila(matriz);
		
		
		for (int i = 0; i < matriz.length; i++) //CARGA LOS VALORES EN LA MATRIZ Y MUESTRA
		{
			for (int j = 0; j < (matriz[i]).length; j++) 
			{
				System.out.print(matriz[i][j]);
				System.out.print("|");
			}
			System.out.println();
		}
	}
	

	//METEODOS
	public static int[][] crearMatriz(int[] array)
	{
		int [][] matrix = new int [6][5];
		int cont =0;
		
		for (int i = 0; i < matrix.length-1; i++) //CARGA VECTOR DE 1d en VECTOR DE 2d 
		{
			for (int j = 0; j < matrix[i].length; j++) 
			{
				matrix[i][j] = array[cont];
				cont++;
			}
		}
		
		return matrix;
	}
	
	public static int[] sumarUltimaFila(int[][] vec)
	{
		int [] sumado = new int [5];
		
		int ultimaFila = vec.length-1;
		
		for (int i = 0; i < vec[i].length; i++) //SEGUNDA DIMENSION
		{			
			int suma=0;
			
			for (int j = 0; j < vec.length-1; j++) //PRIMERA DIMENSION 
			{
				suma = suma + (vec[j][i]);
			}
			sumado[i]=suma;
		}
		
		for (int j = 0; j < vec[j].length; j++) 
		{
			vec[ultimaFila][j]=sumado[j];
		}

		return sumado;
	}
}
