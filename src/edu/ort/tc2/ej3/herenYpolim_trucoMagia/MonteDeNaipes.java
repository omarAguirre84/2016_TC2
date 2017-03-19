package edu.ort.tc2.ej3.herenYpolim_trucoMagia;

import java.util.ArrayList;

public class MonteDeNaipes {
	
	protected ArrayList<Naipe> naipes = null;
	
	MonteDeNaipes() {
		naipes = new ArrayList<Naipe>();
	}

	public Naipe extraer() {
		if (!estaVacio()) {
			return naipes.remove(0);
		}
		return null;
	}
	
	public void agregar(Naipe naipe) {
		naipes.add(naipe);
	}
	
	public int getCantidad() {
		return naipes.size();
	}

	public void mostrar() {
		for (Naipe n: naipes) {
			System.out.println(n);
		}
	}
	
	public String valorUltimo() {
		if (!estaVacio()) {
			return naipes.get(naipes.size()-1).toString();
		}
		return "";
	}
	
	public boolean estaVacio() {
		return naipes.size() == 0;
	}
}
