package edu.ort.tc2.tp2_arrays_vectores;

public class Tp2TestEjer7 {

	public static void main(String[] args) {
		
		int [][] m1={{1,2,3},{1,2,3},{1,2,3}};
		int [][] m2={{22,8,21},{16,17,18},{13,26,12}};
		
		if (cuadradoMagico(m1)) 
		{
			System.out.println("Es magico!");
		}
		else
		{
			System.out.println("No es magico!");
		}
		if (cuadradoMagico(m2)) 
		{
			System.out.println("Es magico!");
		}
		else
		{
			System.out.println("No es magico!");
		}
	}

	public static boolean cuadradoMagico(int [][] matriz)
	{
		int fila1 = matriz[0][0]+matriz[0][1]+matriz[0][2];
		int fila2 = matriz[1][0]+matriz[1][1]+matriz[1][2];
		int fila3 = matriz[2][0]+matriz[2][1]+matriz[2][2];
		boolean result=false;
		
		if (fila1 == fila2 && fila1 == fila3) 
		{
			result = true;
		}
		
		return result;
	}
}
