package com.aquere.ws.calculsalaire.service.enums;

public enum RegimeEnum {

  ASSURANCE_MALADIE("Assurance Maladie"),
  SOLIDARITE_AUTONOME("Solidarité Autonome");

  private String libelle;

  RegimeEnum(String libelle) {
    this.libelle = libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public String getLibelle() {
    return libelle;
  }

}
