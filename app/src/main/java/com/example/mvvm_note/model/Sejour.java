
package com.example.mvvm_note.model;
public class Sejour extends OptionVoyage{
	
		private int nbNuit;
		private double prixNuit;
		
                /**
                 * Constructeur de la classe Sejour
                 * @param n nom de l'option
                 * @param p prix de l'option
                 * @param nN nombre de nuits du sejour
                 * @param pN prix par nuit du sejour 
                 */
		public Sejour(String unNom, double unPrix, int unNbNuit, double unPrixNuit){
			super(unNom,unPrix);
			nbNuit = unNbNuit;
			prixNuit = unPrixNuit;
		}

		public Sejour(String unNom, double unPrix, boolean estTarifReduit, int unNbNuit, double unPrixNuit){
			super(unNom,unPrix, estTarifReduit);
			nbNuit = unNbNuit;
			prixNuit = unPrixNuit;
		}

		public int getNbNuit() {
		return nbNuit;
		}

		public double getPrixNuit() {
			return prixNuit;
		}
		
		public double prix(){
			return nbNuit * prixNuit + super.prix();
		}
}