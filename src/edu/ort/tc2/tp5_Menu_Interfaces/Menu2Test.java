package edu.ort.tc2.tp5_Menu_Interfaces;

public class Menu2Test {

	private static Menu2 menu;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu = new Menu2();
		menu.agregarOpcion(new Opcion("Bienvenida", new Mostrar("Bienvenido!")));
		menu.agregarOpcion(new Opcion("Suma 4 + 5", new SumaNumeros()));
		menu.agregarOpcion(new Opcion("Despedida", new Mostrar("Adios!")));
		Opcion opcionElegida = menu.elegirOpcion();
		while(opcionElegida!=null) {
			opcionElegida.ejecutar();
			opcionElegida = menu.elegirOpcion();
		}
		System.out.println("FIN");
	}

}
