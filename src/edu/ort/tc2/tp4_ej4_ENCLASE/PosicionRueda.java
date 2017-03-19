package edu.ort.tc2.tp4_ej4_ENCLASE;

public enum PosicionRueda {
	DD("Delantera Derecha"), DI("Delatera Izquierda"),
	TD("Trasera Derecha"), TI("Trasera Izquierda"), AUX("Auxilio");
	
	private String value;
	
	PosicionRueda(String v) {
        this.value = v;
    }
	
	String getValue() {
		return this.value;
	}
}
