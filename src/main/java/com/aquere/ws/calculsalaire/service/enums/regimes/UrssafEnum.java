package com.aquere.ws.calculsalaire.service.enums.regimes;

public enum UrssafEnum {

  ASSURANCE_MALADIE("Assurance Maladie"),
  SOLIDARITE_AUTONOME("Solidarité Autonome"),
  ALLOCATIONS_FAMILIALES("Allocations familiales"),
  ASSURANCE_VIEILLESSE_DEPLAFONNEE("Assurance vieillesse déplafonnée"),
  FINANCEMENT_ORGANISATIONS_SYNDICALES("Financement orga. synd"),
  ACCIDENT_TRAVAIL("Accidents du travail"),
  CSG_DEDUCTIBLE("CSG déductible"),
  CSG_NON_DEDUCTIBLE("CSG non-déductible"),
  CRDS("CRDS"),
  ASSURANCE_VIEILLESSE_PLAFONNEE("Assurance vieillesse plafonnée"),
  AIDE_LOGEMENT_FNAL_MOINS_20_SALARIES("Aide logement-Fnal"),
  AIDE_LOGEMENT_FNAL_AU_MOINS_20_SALARIES("Aide logement-Fnal");

  private String libelle;

  UrssafEnum(String libelle) {
    this.libelle = libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public String getLibelle() {
    return libelle;
  }

}
