package edu.ort.tc2.ej3.herenYpolim_trucoMagia;

public class JuegosDeCartas {

	static private MazoEspanol oME;
	static private MazoFrances oMF;

	public static void main(String[] args) {
		oME = new MazoEspanol();
		oME.mezclar();
		oME.mostrarMazo();
		oMF = new MazoFrances();
		oMF.mezclar();
		oMF.mostrarMazo();
	}

}
