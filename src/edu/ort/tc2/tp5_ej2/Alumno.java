package edu.ort.tc2.tp5_ej2;


public class Alumno extends Persona{

	private int curso;
	private int cantMaterias;
	private String estado;
	
	public Alumno(){}
	public Alumno(String nombre, int edad, int curso, int cantMaterias, String estado){
		super.setNombre(nombre);
		super.setEdad(edad);
		this.curso = curso;
		this.cantMaterias = cantMaterias;
		this.estado = estado;
	}
	
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public int getCantMaterias() {
		return cantMaterias;
	}
	public void setCantMaterias(int cantMaterias) {
		this.cantMaterias = cantMaterias;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public void verTodo(){}
	
	
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", cantMaterias=" + cantMaterias + ", estado=" + estado + "]";
	}
	
	
}
