package edu.ort.tc2.tp3.ej3;
import edu.ort.tc2.tp3.ej2.SubContratado;

public class Vendedor extends SubContratado
{
	private float porcentaje;
	
	public Vendedor(String nombre, int edad, float cantHoras, int precioHora, int comision)
	{
		super(nombre,edad,cantHoras,precioHora);
		
		this.porcentaje = comision;
	}
	
	@Override
	public String toString(){
		return "Vendedor "+ this.getNombre() + " sueldo " + this.calcularPago();
	}
	
	@Override
	public float calcularPago()
	{
		return ((getPrecioHora() * getCantHoras()) * porcentaje)/10; 
	}
	
}
