package edu.ort.tc2.tp2_arrays_vectores;

public class Tp2TestEjer6_2 {

	public static void main(String[] args) {
		
		for (int i = 0; i < sumarUltimaFila(crearMatriz())[5].length; i++) 
		{
			System.out.print(sumarUltimaFila(crearMatriz())[5][i] +"|");
		}
		
	}
	
	public static int[][] crearMatriz()
	{
		int[][] matriz = new int [6][5];
		int num = 1;
		
				
		for (int i = 0; i < matriz.length-1; i++) 
		{
			for (int j = 0; j < matriz[i].length; j++) 
			{
				matriz[i][j] = num;
				num++;
			}
		}
		return matriz;
	}
	
	
	public static int[][] sumarUltimaFila(int[][] vec)
	{
		int [][] res= new int[6][5];
		int ultimaFila = vec.length-1;
		
		for (int i = 0; i < vec.length; i++) //COPIA VEC A RES
		{
			for (int j = 0; j < vec[j].length; j++) 
			{
				res[i][j] = vec[i][j];
			}
		}
		
		for (int j = 0; j < vec[j].length; j++) //SUMA, INSERTA EN ULTIMA FILA DE RES 
		{
			int suma = 0;
			for (int i = 0; i < vec.length; i++) 
			{
				suma += vec[i][j];
			}
			res[ultimaFila][j]=suma;
		}
		
		return res;
	}
}
