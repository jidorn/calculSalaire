package com.aquere.ws.calculsalaire.service.dto;

import com.aquere.ws.calculsalaire.dao.entity.Entreprise;

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
   * l'entreprise du salarié.
   */
  private EntrepriseDto entrepriseDto;

  /**
   * la liste des cotisations de la fiche de paie.
   */
  private List<CotisationSocialeDto> cotisationSociales;

  /**
   * la liste des cotisations imposable de la fiche de paie.
   */
  private List<CotisationImposableDto> cotisationImposables;

  public FicheDePaieDto() {
  }

  /**
   * constructeur avec params.
   *
   * @param nbJourTravailParAn   le nbJourTravailParAn.
   * @param salaireDeBase        le salaireDeBase.
   * @param entrepriseDto        l'entrepriseDto.
   * @param cotisationSociales   la cotisationSociales.
   * @param cotisationImposables la cotisationImposables.
   */
  public FicheDePaieDto(double nbJourTravailParAn, double salaireDeBase,
                        EntrepriseDto entrepriseDto,
                        List<CotisationSocialeDto> cotisationSociales,
                        List<CotisationImposableDto> cotisationImposables) {
    this.nbJourTravailParAn = nbJourTravailParAn;
    this.salaireDeBase = salaireDeBase;
    this.entrepriseDto = entrepriseDto;
    this.cotisationSociales = cotisationSociales;
    this.cotisationImposables = cotisationImposables;
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

  public EntrepriseDto getEntrepriseDto() {
    return entrepriseDto;
  }

  public void setEntrepriseDto(EntrepriseDto entrepriseDto) {
    this.entrepriseDto = entrepriseDto;
  }

  public List<CotisationSocialeDto> getCotisationSociales() {
    return cotisationSociales;
  }

  public void setCotisationSociales(List<CotisationSocialeDto> cotisationSociales) {
    this.cotisationSociales = cotisationSociales;
  }

  public List<CotisationImposableDto> getCotisationImposables() {
    return cotisationImposables;
  }

  public void setCotisationImposables(List<CotisationImposableDto> cotisationImposables) {
    this.cotisationImposables = cotisationImposables;
  }

  @Override
  public String toString() {
    return String.format("FicheDePaieDto{nbJourTravailParAn=%s, salaireDeBase=%s,"
     + " entrepriseDto=%s, cotisationSociales=%s, cotisationImposables=%s}",
      nbJourTravailParAn, salaireDeBase, entrepriseDto, cotisationSociales,
      cotisationImposables);
  }
}
