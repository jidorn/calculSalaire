package com.aquere.ws.calculsalaire.service.dto;

public class EntrepriseDto {

  private String nom;

  private String raisonSociale;

  private String immatriculation;

  private int nbSalaries;

  public EntrepriseDto() {
  }

  /**
   * constructeur avec params.
   *
   * @param nom             le nom.
   * @param raisonSociale   la raison sociale.
   * @param immatriculation l'immatriculation.
   * @param nbSalaries      le nombre de salaries.
   */
  public EntrepriseDto(String nom, String raisonSociale, String immatriculation, int nbSalaries) {
    this.nom = nom;
    this.raisonSociale = raisonSociale;
    this.immatriculation = immatriculation;
    this.nbSalaries = nbSalaries;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getRaisonSociale() {
    return raisonSociale;
  }

  public void setRaisonSociale(String raisonSociale) {
    this.raisonSociale = raisonSociale;
  }

  public String getImmatriculation() {
    return immatriculation;
  }

  public void setImmatriculation(String immatriculation) {
    this.immatriculation = immatriculation;
  }

  public int getNbSalaries() {
    return nbSalaries;
  }

  public void setNbSalaries(int nbSalaries) {
    this.nbSalaries = nbSalaries;
  }

  @Override
  public String toString() {
    return String.format("EntrepriseDto{nom='%s', raisonSociale='%s',"
        + " immatriculation='%s', nbSalaries=%d}", nom, raisonSociale,
      immatriculation, nbSalaries);
  }
}
