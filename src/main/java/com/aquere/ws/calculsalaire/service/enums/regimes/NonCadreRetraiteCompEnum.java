package com.aquere.ws.calculsalaire.service.enums.regimes;

public enum NonCadreRetraiteCompEnum {
  ARRCO_T1("Arrco T1"),
  ARRCO_T2("Arrco T2"),
  AGFF_T1("AGFF T1"),
  AGFF_T2("AGFF T2");

  NonCadreRetraiteCompEnum(String libelle) {
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
