package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InformationHotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String description;
	String adress;
	String email;
	String telephone;
	String facebook;
	String instagram;
	String twitter;
	String lang;
	String langbackoffice;

	public InformationHotel() {
		// TODO Auto-generated constructor stub
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public InformationHotel(String name, String description, String adress, String email, String telephone,
			String facebook, String instagram, String twitter) {
		super();
		this.name = name;
		this.description = description;
		this.adress = adress;
		this.email = email;
		this.telephone = telephone;
		this.facebook = facebook;
		this.instagram = instagram;
		this.twitter = twitter;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getLangbackoffice() {
		return langbackoffice;
	}

	public void setLangbackoffice(String langbackoffice) {
		this.langbackoffice = langbackoffice;
	}

	@Override
	public String toString() {
		return "InformationHotel [id=" + id + ", name=" + name + ", description=" + description + ", adress=" + adress
				+ ", email=" + email + ", telephone=" + telephone + ", facebook=" + facebook + ", instagram="
				+ instagram + ", twitter=" + twitter + ", lang=" + lang + "]";
	}

}
