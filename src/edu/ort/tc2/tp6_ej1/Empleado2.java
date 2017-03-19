package edu.ort.tc2.tp6_ej1;

public abstract class Empleado2 {
	private String nombre;
	private int edad;
	
	public Empleado2(){
		this.edad = 0;
		this.nombre = "";
	}
	
	public Empleado2(String nombre, int edad){
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
	
	public abstract float calcularPago();
}
