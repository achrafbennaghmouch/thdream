package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AmenityI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nameI18n;
	String descriptionI18n;
	String statusI18n;
	String languageI18n;
	String getAllTitleI18n;
	String getTitleI18n;
	String editTitleI18n;
	String createTitleI18n;

	public AmenityI18n() {
		// TODO Auto-generated constructor stub
	}

	public String getGetAllTitleI18n() {
		return getAllTitleI18n;
	}

	public void setGetAllTitleI18n(String getAllTitleI18n) {
		this.getAllTitleI18n = getAllTitleI18n;
	}

	public String getGetTitleI18n() {
		return getTitleI18n;
	}

	public void setGetTitleI18n(String getTitleI18n) {
		this.getTitleI18n = getTitleI18n;
	}

	public String getEditTitleI18n() {
		return editTitleI18n;
	}

	public void setEditTitleI18n(String editTitleI18n) {
		this.editTitleI18n = editTitleI18n;
	}

	public String getCreateTitleI18n() {
		return createTitleI18n;
	}

	public void setCreateTitleI18n(String createTitleI18n) {
		this.createTitleI18n = createTitleI18n;
	}

	public AmenityI18n(String nameI18n, String descriptionI18n, String statusI18n, String languageI18n) {
		super();
		this.nameI18n = nameI18n;
		this.descriptionI18n = descriptionI18n;
		this.statusI18n = statusI18n;
		this.languageI18n = languageI18n;
	}

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

	public String getDescriptionI18n() {
		return descriptionI18n;
	}

	public void setDescriptionI18n(String descriptionI18n) {
		this.descriptionI18n = descriptionI18n;
	}

	public String getStatusI18n() {
		return statusI18n;
	}

	public void setStatusI18n(String statusI18n) {
		this.statusI18n = statusI18n;
	}

	public String getLanguageI18n() {
		return languageI18n;
	}

	public void setLanguageI18n(String languageI18n) {
		this.languageI18n = languageI18n;
	}

}
