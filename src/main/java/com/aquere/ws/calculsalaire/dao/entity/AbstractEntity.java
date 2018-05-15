package com.aquere.ws.calculsalaire.dao.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity<T> {

	protected T id;

	public T getId() {
		return id;
	}

	public void setId(T pId) {
		id = pId;
	}
}
