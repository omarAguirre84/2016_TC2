package edu.ort.tc2.ej3.herenYpolim_trucoMagia;

public class MazoEspanol extends Mazo {

	static private String [] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "Sota", "Caballo", "Rey"};

	@Override
	public void llenar() {
		naipes.add(new Naipe("Comodin"));
		naipes.add(new Naipe("Comodin"));
		llenarPalo("Espadas", valores);
		llenarPalo("Oros", valores);
		llenarPalo("Copas", valores);
		llenarPalo("Bastos", valores);
	}

}
