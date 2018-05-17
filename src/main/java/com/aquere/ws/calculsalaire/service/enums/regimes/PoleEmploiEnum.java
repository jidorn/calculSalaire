package com.aquere.ws.calculsalaire.service.enums.regimes;

public enum PoleEmploiEnum {
  CHOMAGE("Chômage"),AGS("AGS");

  private String libelle;

  PoleEmploiEnum(String libelle) {
    this.libelle = libelle;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }
}
