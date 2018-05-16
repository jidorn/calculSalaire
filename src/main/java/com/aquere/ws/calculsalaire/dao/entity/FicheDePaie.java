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
  private double salaireDeBaseAG;

  /**
   * constructeur avec les paramètres.
   *
   * @param nbJourTravailParAn le nombre de jour.
   * @param salaireDeBaseAG    le salaire de base.
   */
  public FicheDePaie(double nbJourTravailParAn, double salaireDeBaseAG) {
    this.nbJourTravailParAn = nbJourTravailParAn;
    this.salaireDeBaseAG = salaireDeBaseAG;
  }

  public FicheDePaie() {
  }

  public double getNbJourTravailParAn() {
    return nbJourTravailParAn;
  }

  public void setNbJourTravailParAn(double nbJourTravailParAn) {
    this.nbJourTravailParAn = nbJourTravailParAn;
  }

  public double getSalaireDeBaseAG() {
    return salaireDeBaseAG;
  }

  public void setSalaireDeBaseAG(double salaireDeBaseAG) {
    this.salaireDeBaseAG = salaireDeBaseAG;
  }
}
