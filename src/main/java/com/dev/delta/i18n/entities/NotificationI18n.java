package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotificationI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nameI18n;
	String dateI18n;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameI18n() {
		return nameI18n;
	}

	public void setNameI18n(String nameI18n) {
		this.nameI18n = nameI18n;
	}

	public String getDateI18n() {
		return dateI18n;
	}

	public void setDateI18n(String dateI18n) {
		this.dateI18n = dateI18n;
	}

}
