package com.aquere.ws.calculsalaire.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "fiche_de_paie")
public class FicheDePaie extends AbstractEntity {

  /**
   * le nombre de jours travaillé par an.
   */
  @Column(name = "nb_jour_travail_par_an")
  private double nbJourTravailParAn;

  /**
   * le salaire de base.
   */
  @Column(name = "salaire_de_base_ag")
  private double salaireDeBase;

  /**
   * constructeur avec les paramètres.
   *
   * @param nbJourTravailParAn le nombre de jour.
   * @param salaireDeBase      le salaire de base.
   */
  public FicheDePaie(double nbJourTravailParAn, double salaireDeBase) {
    this.nbJourTravailParAn = nbJourTravailParAn;
    this.salaireDeBase = salaireDeBase;
  }

  public FicheDePaie() {
  }

  public double getNbJourTravailParAn() {
    return nbJourTravailParAn;
  }

  public void setNbJourTravailParAn(double nbJourTravailParAn) {
    this.nbJourTravailParAn = nbJourTravailParAn;
  }

  public double getSalaireDeBase() {
    return salaireDeBase;
  }

  public void setSalaireDeBase(double salaireDeBase) {
    this.salaireDeBase = salaireDeBase;
  }
}
