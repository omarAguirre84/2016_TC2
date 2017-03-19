package edu.ort.tc2.ej3.herenYpolim_trucoMagia;

public class MazoFrances extends Mazo {

	static private String [] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

	@Override
	public void llenar() {
		naipes.add(new Naipe("Joker"));
		naipes.add(new Naipe("Joker"));
		llenarPalo("Diamantes", valores);
		llenarPalo("Picas", valores);
		llenarPalo("Tr�bol", valores);
		llenarPalo("Corazones", valores);
	}

}
