package com.springframeworkguru.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntitiy implements Serializable {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
