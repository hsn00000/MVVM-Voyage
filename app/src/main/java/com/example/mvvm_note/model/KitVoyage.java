
package com.example.mvvm_note.model;
import java.util.ArrayList;

public class KitVoyage {

    private ArrayList<OptionVoyage> lesOptions;
	private String depart;
	private String destination;
	
	public String getDepart() {
		return depart;
	}
	public String getDestination() {
		return destination;
	}
	
        /**
         * 
         * @param unDepart nom de la destination
         * @param uneDestination 
         */
	public KitVoyage(String unDepart, String uneDestination){
		this.depart = unDepart;
		this.destination = uneDestination;
		lesOptions = new ArrayList<OptionVoyage>();
	}
	
	public double prix(){
		double resultat = 0;
		for(OptionVoyage uneOption : lesOptions){
			resultat += uneOption.prix();
		}
		return resultat;
	}
	
	public String toString(){
		String chaine = "Voyage de " + depart + " a " + destination + ", avec pour options :\n";
		for(OptionVoyage uneOption : lesOptions){
			chaine += "- " + uneOption.toString() + "\n";
		}
		chaine += "Prix total : " + prix() + " euros \n";
		return chaine;
	}
	
	public void ajouterOption(OptionVoyage uneOption){
		if(uneOption !=null){
			lesOptions.add(uneOption);
		}
	}
	
	public void annuler(){
		lesOptions.clear();
	}
	
	public int getNbOptions(){
		return lesOptions.size();
	}
}
    

