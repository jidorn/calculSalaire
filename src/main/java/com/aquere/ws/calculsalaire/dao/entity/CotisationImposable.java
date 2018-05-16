package com.aquere.ws.calculsalaire.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "cotisation_imposable")
public class CotisationImposable extends AbstractEntity {

  /**
   * le libelle de la cotisation.
   */
  @Column
  private String libelle;

  /**
   * la base de calcul du montant de la cotisation.
   */
  @Column
  private double base;

  /**
   * le taux du calcul de la cotisation.
   */
  @Column
  private double taux;

  /**
   * le montant de la cotisation.
   */
  @Column
  private double montant;

  /**
   * Constructeur avec les paramètres.
   *
   * @param libelle le libelle.
   * @param base    la base.
   * @param taux    le taux.
   * @param montant le montant.
   */
  public CotisationImposable(String libelle, double base, double taux, double montant) {
    this.libelle = libelle;
    this.base = base;
    this.taux = taux;
    this.montant = montant;
  }

  public CotisationImposable() {
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
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
}
