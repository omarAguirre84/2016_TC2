package edu.ort.tc2.tp3.ej2;

public class SubContratado extends Empleado
{

	private float cantHoras;
	private float precioHora;
	
	 public SubContratado()
	 {
		 this.cantHoras = 0;
		 this.precioHora = 0;
	 }
	 
	 public SubContratado(String nombre, int edad, float cantHoras, int precioHora)
	 {
		 super(nombre,edad);
		 this.cantHoras = cantHoras;
		 this.precioHora = precioHora;
	 }
	 
	 public void setCantHoras(float horas){
		 this.cantHoras = horas;
	 }
	 public float getCantHoras()
	 {
		 return this.cantHoras;
	 }
	 
	 public void setPrecioHora(float precioHora)
	 {
		this.precioHora = precioHora; 
	 }
	 public float getPrecioHora()
	 {
		return this.precioHora; 
	 }
	 
	 
	 @Override
	public  String toString(){
		 return "SubContratado " + this.getNombre() + " gana " + calcularPago();
	 }
	 
	 @Override
	public float calcularPago(){
		//la formula es precioHora * cantHoras
		 return this.precioHora * this.cantHoras;
	 }
}
