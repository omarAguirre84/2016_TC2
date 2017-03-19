package edu.ort.tc2.ej3.herenYpolim_trucoMagia;

public abstract class Mazo extends MonteDeNaipes {
	
	public Mazo() {
		super();
		llenar();
		mezclar();
	}
	
	protected abstract void llenar();

	public void mezclar() {
		Naipe aux;
		if (naipes.size()==0) {
			llenar();
		}
		for (int tope=naipes.size(); tope > 0; tope--) {
			aux = naipes.remove((int)(Math.random() * tope));
			naipes.add(aux);
		}
	}

	protected void llenarPalo(String palo, String[] valores) {
		for (int n=0; n < valores.length; n++) {
			naipes.add(new NaipeNumerado(palo, n+1, valores[n]));
		}
	}

	public void mostrarMazo() {
		mostrar();
	}

}
