package com.aquere.ws.calculsalaire.service.enums.regimes;

public enum TaxesEnum {
  SALAIRE("Sur les salaires"),
  CONSTRUCTION("Construction"),
  APPRENTISSAGE("Apprentissage"),
  FORMATION_CONTINU("Formation continue");

  TaxesEnum(String libelle) {
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
