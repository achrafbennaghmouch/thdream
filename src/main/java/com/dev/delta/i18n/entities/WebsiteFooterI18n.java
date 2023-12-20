package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebsiteFooterI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String addressTitleI18n;
	String reservationTitleI18n;
	String navigationTitleI18n;
	String newsletterTitleI18n;
	String newsletterSubTitleI18n;
	String email;
	String signUpButton;
	String lang;

	public WebsiteFooterI18n() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSignUpButton() {
		return signUpButton;
	}

	public void setSignUpButton(String signUpButton) {
		this.signUpButton = signUpButton;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddressTitleI18n() {
		return addressTitleI18n;
	}

	public void setAddressTitleI18n(String addressTitleI18n) {
		this.addressTitleI18n = addressTitleI18n;
	}

	public String getReservationTitleI18n() {
		return reservationTitleI18n;
	}

	public void setReservationTitleI18n(String reservationTitleI18n) {
		this.reservationTitleI18n = reservationTitleI18n;
	}

	public String getNavigationTitleI18n() {
		return navigationTitleI18n;
	}

	public void setNavigationTitleI18n(String navigationTitleI18n) {
		this.navigationTitleI18n = navigationTitleI18n;
	}

	public String getNewsletterTitleI18n() {
		return newsletterTitleI18n;
	}

	public void setNewsletterTitleI18n(String newsletterTitleI18n) {
		this.newsletterTitleI18n = newsletterTitleI18n;
	}

	public String getNewsletterSubTitleI18n() {
		return newsletterSubTitleI18n;
	}

	public void setNewsletterSubTitleI18n(String newsletterSubTitleI18n) {
		this.newsletterSubTitleI18n = newsletterSubTitleI18n;
	}

}
