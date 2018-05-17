package com.aquere.ws.calculsalaire.service.enums.regimes;

public enum CadreRetraiteCompEnum {
  ARRCO("Arrco TA"),
  ASSURANCE_DECES_OBLIGATOIRE("Ass. décès obligatoire"),
  AGFF_TA("AGFF TA"),
  AGIRC_TB("Agirc TB"),
  APEC("Apec"),
  AGFF_TB("AGFF TB"),
  AGFF_TC("AGFF TC"),
  AGIRC_TC("Agirc TC"),
  CET("CET");

  CadreRetraiteCompEnum(String libelle) {
    this.libelle = libelle;
  }

  private String libelle;

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }
}
