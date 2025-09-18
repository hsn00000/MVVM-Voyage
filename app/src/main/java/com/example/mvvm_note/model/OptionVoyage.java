package com.example.mvvm_note.model;

public class OptionVoyage {
  private String nom;
  private double prix;
  private boolean tarifReduit;

  public static double COEF_TARIF_REDUIT = 0.8;

  /**
   * Constructeur de la classe OptionVoyage
   * @param unNom nom de l'option
   * @param unPrix prix de l'option
   */
  public OptionVoyage(String unNom, double unPrix) {
    this.nom = unNom;
    this.prix = unPrix;
    this.tarifReduit = false;
  }

    /**
   * Constructeur de la classe OptionVoyage
   * @param unNom nom de l'option
   * @param unPrix prix de l'option
   * @param estTarifReduit booléen permettant d'indiquer si le tarif est réduit
   */
  public OptionVoyage(String unNom, double unPrix, boolean estTarifReduit) {
    this.nom = unNom;
    this.prix = unPrix;
    this.tarifReduit = estTarifReduit;
  }



  public String getNom() {
    return nom;
  }

  /**
   * Méthode permettant de calculer le prix d'une option voyage
   * @return prix de l'option voyage en double
   */
  public double prix() {
    double resultat = 0;
    if(this.tarifReduit == true){
      resultat = this.prix * COEF_TARIF_REDUIT;
    }
    else if(this.tarifReduit == false){
      resultat = this.prix;
    }
    return resultat;
  }

  /**
   * 
   */
  public String toString() {
    return getNom() + " -> " + prix() + " euros";
  }

}
