package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebsiteHomeI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String aboutSectionTitleI18n;
	String offerSectionTitleI18n;
	String offerSectionSubTitleI18n;
	String bookButtonI18n;
	String videoTitleI18n;
	String videoSubTitleI18n;
	String roomTitleI18n;
	String roomSubTitleI18n;
	String reservationSectionI18n;
	String learnmoreButton;
	String lang;

	public WebsiteHomeI18n() {
		// TODO Auto-generated constructor stub
	}

	public String getLearnmoreButton() {
		return learnmoreButton;
	}

	public void setLearnmoreButton(String learnmoreButton) {
		this.learnmoreButton = learnmoreButton;
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

	public String getAboutSectionTitleI18n() {
		return aboutSectionTitleI18n;
	}

	public void setAboutSectionTitleI18n(String aboutSectionTitleI18n) {
		this.aboutSectionTitleI18n = aboutSectionTitleI18n;
	}

	public String getOfferSectionTitleI18n() {
		return offerSectionTitleI18n;
	}

	public void setOfferSectionTitleI18n(String offerSectionTitleI18n) {
		this.offerSectionTitleI18n = offerSectionTitleI18n;
	}

	public String getOfferSectionSubTitleI18n() {
		return offerSectionSubTitleI18n;
	}

	public void setOfferSectionSubTitleI18n(String offerSectionSubTitleI18n) {
		this.offerSectionSubTitleI18n = offerSectionSubTitleI18n;
	}

	public String getBookButtonI18n() {
		return bookButtonI18n;
	}

	public void setBookButtonI18n(String bookButtonI18n) {
		this.bookButtonI18n = bookButtonI18n;
	}

	public String getVideoTitleI18n() {
		return videoTitleI18n;
	}

	public void setVideoTitleI18n(String videoTitleI18n) {
		this.videoTitleI18n = videoTitleI18n;
	}

	public String getVideoSubTitleI18n() {
		return videoSubTitleI18n;
	}

	public void setVideoSubTitleI18n(String videoSubTitleI18n) {
		this.videoSubTitleI18n = videoSubTitleI18n;
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
