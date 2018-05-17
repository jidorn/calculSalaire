package com.aquere.ws.calculsalaire.service.interfaces;

import com.aquere.ws.calculsalaire.dao.entity.FicheDePaie;
import com.aquere.ws.calculsalaire.service.exception.CalculSalaireException;

public interface IFicheDePaieService {
  FicheDePaie getFicheDePaie(double salaireBrut)throws CalculSalaireException;

}
