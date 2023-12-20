package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebsiteAboutI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String pageTitleI18n;
	String reservationSectionI18n;
	String lang;

	public WebsiteAboutI18n() {
		// TODO Auto-generated constructor stub
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

	public String getPageTitleI18n() {
		return pageTitleI18n;
	}

	public void setPageTitleI18n(String pageTitleI18n) {
		this.pageTitleI18n = pageTitleI18n;
	}

	public String getReservationSectionI18n() {
		return reservationSectionI18n;
	}

	public void setReservationSectionI18n(String reservationSectionI18n) {
		this.reservationSectionI18n = reservationSectionI18n;
	}

}
