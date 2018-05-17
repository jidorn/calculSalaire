package com.aquere.ws.calculsalaire.service.dto;

import com.aquere.ws.calculsalaire.service.enums.RegimeEnum;

public class CotisationImposableDto {

  /**
   * le libelle de la cotisation.
   */
  private RegimeEnum libelle;

  /**
   * la base de calcul du montant de la cotisation.
   */
  private double base;

  /**
   * le taux du calcul de la cotisation.
   */
  private double taux;

  /**
   * le montant de la cotisation.
   */
  private double montant;

  public CotisationImposableDto() {
  }

  /**
   * constructeur avec les params.
   *
   * @param libelle le libelle.
   * @param base    la base.
   * @param taux    le taux.
   * @param montant le montant.
   */
  public CotisationImposableDto(RegimeEnum libelle, double base, double taux, double montant) {
    this.libelle = libelle;
    this.base = base;
    this.taux = taux;
    this.montant = montant;
  }

  public RegimeEnum getLibelle() {
    return libelle;
  }

  public void setLibelle(RegimeEnum libelle) {
    this.libelle = libelle;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getTaux() {
    return taux;
  }

  public void setTaux(double taux) {
    this.taux = taux;
  }

  public double getMontant() {
    return montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

  @Override
  public String toString() {
    return String.format("CotisationImposableDto{libelle=%s, base=%s, taux=%s, montant=%s}",
      libelle, base, taux, montant);
  }
}
