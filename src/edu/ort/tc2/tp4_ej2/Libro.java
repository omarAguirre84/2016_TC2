package edu.ort.tc2.tp4_ej2;

public class Libro {
	private String nombre;
	private float precio;
	private Autor autor;
	
	public Libro(String nombre, float precio, Autor autor){
		this.nombre=nombre;
		this.precio=precio;
		this.autor=autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void verTodo(){
		
	}
	@Override
	public String toString(){
		return "Libro: " + this.nombre + " precio: " + this.precio + " autor: " + this.autor.getNombre();
	}
}
