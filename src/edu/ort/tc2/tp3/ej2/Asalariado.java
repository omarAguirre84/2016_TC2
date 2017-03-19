package edu.ort.tc2.tp3.ej2;

public class Asalariado extends Empleado
{
	
	private float sueldo;
	
	public Asalariado(){
		 this.sueldo = 0;
	}
	
	public Asalariado(String nombre, int edad, float sueldo){
		//COMPLETAR
		super.setNombre(nombre);
		super.setEdad(edad);
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString()
	{
		return "Asalariado " + this.getNombre() + " edad " + this.getEdad() + " gana "+ this.sueldo;
	}
	
	@Override
	public float calcularPago()//devuelve el sueldoMensual
	{
		return this.sueldo;
	}
}
