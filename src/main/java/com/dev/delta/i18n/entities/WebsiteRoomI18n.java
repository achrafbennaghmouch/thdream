package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebsiteRoomI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String pageTitleI18n;
	String roomTitleI18n;
	String roomSubTitleI18n;
	String reservationSectionI18n;
	String lang;

	public WebsiteRoomI18n() {
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

	public String getRoomTitleI18n() {
		return roomTitleI18n;
	}

	public void setRoomTitleI18n(String roomTitleI18n) {
		this.roomTitleI18n = roomTitleI18n;
	}

	public String getRoomSubTitleI18n() {
		return roomSubTitleI18n;
	}

	public void setRoomSubTitleI18n(String roomSubTitleI18n) {
		this.roomSubTitleI18n = roomSubTitleI18n;
	}

	public String getReservationSectionI18n() {
		return reservationSectionI18n;
	}

	public void setReservationSectionI18n(String reservationSectionI18n) {
		this.reservationSectionI18n = reservationSectionI18n;
	}

}
