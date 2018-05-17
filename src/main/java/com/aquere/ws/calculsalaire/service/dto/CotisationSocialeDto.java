package com.aquere.ws.calculsalaire.service.dto;

import com.aquere.ws.calculsalaire.service.enums.regimes.UrssafEnum;

public class CotisationSocialeDto {


  /**
   * Nom du régime contenant.
   */
  private UrssafEnum regime;

  /**
   * pourcentage total.
   */
  private double pourcentageTotal;

  /**
   * pourcentage employeur.
   */
  private double pourcentageEmployeur;

  /**
   * pourcentage salarié.
   */
  private double pourcentageSalarie;

  /**
   * la base de calcul.
   */
  private double assiete;

  /**
   * la version de la cotisation. Elle se définit par l'année de la cotisation.
   */
  private int version;

  /**
   * Constructeur avec params.
   *
   * @param regime               le regime.
   * @param pourcentageTotal     le pourcentageTotal.
   * @param pourcentageEmployeur le pourcentageEmployeur.
   * @param pourcentageSalarie   le pourcentageSalarie.
   * @param assiete              l'assiete.
   * @param version              la version.
   */
  public CotisationSocialeDto(UrssafEnum regime, double pourcentageTotal,
                              double pourcentageEmployeur,
                              double pourcentageSalarie,
                              double assiete, int version) {
    this.regime = regime;
    this.pourcentageTotal = pourcentageTotal;
    this.pourcentageEmployeur = pourcentageEmployeur;
    this.pourcentageSalarie = pourcentageSalarie;
    this.assiete = assiete;
    this.version = version;
  }

  /**
   * le constructeur par défaut.
   */
  public CotisationSocialeDto() {
  }

  public UrssafEnum getRegime() {
    return regime;
  }

  public void setRegime(UrssafEnum regime) {
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

  @Override
  public String toString() {
    return String.format(regime.getLibelle(),
      "CotisationSocialeDto{regime=%s, pourcentageTotal=%s, "
        + "pourcentageEmployeur=%s, pourcentageSalarie=%s, assiete=%s, version=%d}",
      pourcentageTotal, pourcentageEmployeur, pourcentageSalarie, assiete, version);
  }
}
