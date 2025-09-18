
package com.example.mvvm_note.model;
public class Transport extends OptionVoyage {

	private boolean trajetLong;
	static public final int TARIF_LONG = 1500;
	static public final int TARIF_BASE = 200;

	public Transport(String unNom, double unPrix) {
		super(unNom, unPrix);
		trajetLong = false;
	}

	public Transport(String unNom, double unPrix, boolean estTrajetLong) {
		super(unNom, unPrix);
		trajetLong = estTrajetLong;
	}

	public boolean isTrajetLong() {
		return trajetLong;
	}

	public double prix() {
		double result = 0;
		if (trajetLong) {
			result = TARIF_LONG + super.prix();
		} else {
			result = TARIF_BASE + super.prix();
		}
		return result;
	}

}
