package edu.ort.tc2.tp2_arrays_vectores;

public class Tp2TestEjer3 
{

	public static void main(String[] args) 
	{
		//int [] vec1 = new int [5];
		
		int[] vec1 = { 1, 2, 3, 4, 5 };
		int[] vec2 = { 6, 4, 3, 1, 0 };
		int[] vec3 = { 1, 5, 7, 4, 3, 6 };
		int[] vec4 = { 1, 1, 1, 1, 1, 1,1 }; 

		System.out.println("el orden del vec1 es: "+ orden( tipoDeOrden(vec1)) );
		System.out.println("el orden del vec2 es: "+ orden( tipoDeOrden(vec2)) );
		System.out.println("el orden del vec3 es: "+ orden( tipoDeOrden(vec3)) );
		System.out.println("el orden del vec4 es: "+ orden( tipoDeOrden(vec4)) );
		
	}

	public static int tipoDeOrden(int[] arrayParam)
	{
		int result=0;
		int asc=0;
		int desc=0;
		int desordenado=0;
		int iguales=0;
		
		for (int i = 0; i < arrayParam.length-1; i++) 
		{
			if (arrayParam[i] < arrayParam[i+1]) //ASCENDENTE
			{
				asc ++;
			}
			
			else if(arrayParam[i] > arrayParam[i+1]) //DESCENDENTE
			{
				desc ++;
			}
			
			else if(arrayParam[i] == arrayParam[i+1]) //IGUALES
			{
				iguales ++;
			}
			
			if (asc > 0 && desc > 0) //DESORDENADO
			{
				desordenado++;
				asc=0;desc=0;iguales=0;
			}
		}

		if (asc > 0) {result=1;}
		if (desc > 0) {result=2;}
		if (desordenado > 0) {result=3;}
		if (iguales > 0) {result=4;}
		
		return result;
	}
	
	public static String orden(int num)
	{
		String result="";
		
		switch (num) 
		{
			case 1: result="ascendente"; break;
			case 2: result="descendente"; break;
			case 3: result="desordenado"; break;
			case 4: result="sin orden todos los valores iguales"; break;
	
			default: result="no se conoce"; break;
		}
		
		return result;
	}
}
