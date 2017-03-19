package edu.ort.tc2.tp5_ej2;

public class Profesor extends Persona{
	private String departamento;
	private String categoria;
	
	public Profesor(){}
	public Profesor(String nombre, int edad, String departamento, String categoria){
		super.setNombre(nombre);
		super.setEdad(edad);
		this.departamento = departamento;
		this.categoria = categoria;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public void verTodo(){}
	
	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", categoria=" + categoria + "]";
	}


	
}
