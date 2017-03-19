package edu.ort.tc2.tp3.ej2;

public abstract class Empleado {
	private String nombre;
	private int edad;
	
	public Empleado(){
		this.edad = 0;
		this.nombre = "";
	}
	
	public Empleado(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public int getEdad(){
		return this.edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	

	@Override
	public String toString(){
		return "[Nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public float calcularPago(){
		return 0.0f; 
	}
}
