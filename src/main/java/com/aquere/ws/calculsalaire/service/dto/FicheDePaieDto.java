package com.aquere.ws.calculsalaire.service.dto;

import java.util.List;

public class FicheDePaieDto {

  /**
   * le nombre de jours travaillé par an.
   */
  private double nbJourTravailParAn;

  /**
   * le salaire de base.
   */
  private double salaireDeBase;

  /**
   * la liste des cotisations de la fiche de paie.
   */
  private List<CotisationSocialeDto> cotisationSociales;

  /**
   * la liste des cotisations imposable de la fiche de paie.
   */
  private List<CotisationImposableDto> cotisationImposables;

  /**
   * constructeur par défaut.
   *
   * @param nbJourTravailParAn nb jour travail par an.
   * @param salaireDeBase      le salaire de base.
   */
  public FicheDePaieDto(double nbJourTravailParAn, double salaireDeBase) {
    this.nbJourTravailParAn = nbJourTravailParAn;
    this.salaireDeBase = salaireDeBase;
  }

  public FicheDePaieDto() {
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

  @Override
  public String toString() {
    return String.format("FicheDePaieDto{nbJourTravailParAn=%s, salaireDeBase=%s, "
      + "cotisationSociales=%s, cotisationImposables=%s}", nbJourTravailParAn,
      salaireDeBase, cotisationSociales, cotisationImposables);
  }
}
