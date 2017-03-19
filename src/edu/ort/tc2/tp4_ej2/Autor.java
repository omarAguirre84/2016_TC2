package edu.ort.tc2.tp4_ej2;

public class Autor {
	private String nombre;
	private int edad;
	private String pais;
	
	public Autor(){
		
	}
	public Autor(String nombre, int edad, String pais){
		this.nombre = nombre;
		this.edad = edad;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@Override
	public String toString(){
		return nombre + " edad: " + edad + " pais " + pais;
	}
}
