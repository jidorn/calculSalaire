package com.aquere.ws.calculsalaire.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "cotisation_sociale")
public class CotisationSociale extends AbstractEntity {

  /**
   * Nom du régime contenant.
   */
  @Column(name = "REGIME")
  private String regime;

  /**
   * pourcentage total.
   */
  @Column(name = "POURC_TOTAL")
  private double pourcentageTotal;

  /**
   * pourcentage employeur.
   */
  @Column(name = "POURC_EMPLOYEUR")
  private double pourcentageEmployeur;

  /**
   * pourcentage salarié.
   */
  @Column(name = "POURC_SALARIE")
  private double pourcentageSalarie;

  /**
   * la base de calcul.
   */
  @Column(name = "ASSIETE")
  private double assiete;

  /**
   * la version de la cotisation. Elle se définit par l'année de la cotisation.
   */
  @Column(name = "VERSION")
  private int version;

  public CotisationSociale(String regime, double pourcentageTotal, double pourcentageEmployeur, double pourcentageSalarie, double assiete, int version) {
    this.regime = regime;
    this.pourcentageTotal = pourcentageTotal;
    this.pourcentageEmployeur = pourcentageEmployeur;
    this.pourcentageSalarie = pourcentageSalarie;
    this.assiete = assiete;
    this.version = version;
  }

  public CotisationSociale() {
  }

  public String getRegime() {
    return regime;
  }

  public void setRegime(String regime) {
    this.regime = regime;
  }

  public double getPourcentageTotal() {
    return pourcentageTotal;
  }

  public void setPourcentageTotal(double pourcentageTotal) {
    this.pourcentageTotal = pourcentageTotal;
  }

  public double getPourcentageEmployeur() {
    return pourcentageEmployeur;
  }

  public void setPourcentageEmployeur(double pourcentageEmployeur) {
    this.pourcentageEmployeur = pourcentageEmployeur;
  }

  public double getPourcentageSalarie() {
    return pourcentageSalarie;
  }

  public void setPourcentageSalarie(double pourcentageSalarie) {
    this.pourcentageSalarie = pourcentageSalarie;
  }

  public double getAssiete() {
    return assiete;
  }

  public void setAssiete(double assiete) {
    this.assiete = assiete;
  }

  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }
}
