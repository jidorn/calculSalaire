package com.aquere.ws.calculsalaire.dao.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

	@Id
  @GeneratedValue
	protected Long id;

}
