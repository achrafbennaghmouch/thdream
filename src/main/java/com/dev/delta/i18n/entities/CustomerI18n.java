package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String FullnameI18n;
	String EmailI18n;
	String MobileI18n;
	String AddressI18n;
	String CountryI18n;
	String CityI18n;
	String GenderI18n;
	String AgeI18n;
	String userI18n;
	String langI18n;
	String getAllTitleI18n;
	String getTitleI18n;
	String editTitleI18n;
	String createTitleI18n;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullnameI18n() {
		return FullnameI18n;
	}

	public void setFullnameI18n(String fullnameI18n) {
		FullnameI18n = fullnameI18n;
	}

	public String getEmailI18n() {
		return EmailI18n;
	}

	public void setEmailI18n(String emailI18n) {
		EmailI18n = emailI18n;
	}

	public String getMobileI18n() {
		return MobileI18n;
	}

	public void setMobileI18n(String mobileI18n) {
		MobileI18n = mobileI18n;
	}

	public String getAddressI18n() {
		return AddressI18n;
	}

	public void setAddressI18n(String addressI18n) {
		AddressI18n = addressI18n;
	}

	public String getCountryI18n() {
		return CountryI18n;
	}

	public void setCountryI18n(String countryI18n) {
		CountryI18n = countryI18n;
	}

	public String getCityI18n() {
		return CityI18n;
	}

	public void setCityI18n(String cityI18n) {
		CityI18n = cityI18n;
	}

	public String getGenderI18n() {
		return GenderI18n;
	}

	public void setGenderI18n(String genderI18n) {
		GenderI18n = genderI18n;
	}

	public String getAgeI18n() {
		return AgeI18n;
	}

	public void setAgeI18n(String ageI18n) {
		AgeI18n = ageI18n;
	}

	public String getUserI18n() {
		return userI18n;
	}

	public void setUserI18n(String userI18n) {
		this.userI18n = userI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
