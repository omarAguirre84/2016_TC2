package edu.ort.tc2.cursada_clase1;

public class EjemploArrays1 {

	static String [] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
	
	public static void main(String[] args) {
		// Programa muestra los nombres de los
		// dias de la Semana
		
		for (int i = 0; i < semana.length; i++) 
		{
			System.out.println(semana[i]);
		}
		
		System.out.println("El primer dia de la semana es el: " + getDiaSemana(5));
		System.out.println("Y la posicion del dia es: " + getNumDiaSemana(getDiaSemana(5)));
	}

	private static int getNumDiaSemana(String dia)
	{
		int result = 0;
		
		while (result < semana.length && !dia.equals(semana[result])) 
		{
			result ++;
		}
		
		if (result < semana.length) 
		{
			result++;
		}else
		{
			result = -1;
		}
		return result;
	}
	
	private static String getDiaSemana(int nro)
	{
		String result ="Invalido";
		if (nro > 0 && nro <= semana.length) 
		{
			result = semana[nro-1];
		}
		return result;
	}
}
