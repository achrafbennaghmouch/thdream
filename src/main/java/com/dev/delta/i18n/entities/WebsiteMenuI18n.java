package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebsiteMenuI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String homeItemI18n;
	String aboutItemI18n;
	String roomItemI18n;
	String blogItemI18n;
	String signInI18n;
	String contactItemI18n;
	String lang;

	public String getLang() {
		return lang;
	}

	public String getContactItemI18n() {
		return contactItemI18n;
	}

	public void setContactItemI18n(String contactItemI18n) {
		this.contactItemI18n = contactItemI18n;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public WebsiteMenuI18n() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHomeItemI18n() {
		return homeItemI18n;
	}

	public void setHomeItemI18n(String homeItemI18n) {
		this.homeItemI18n = homeItemI18n;
	}

	public String getAboutItemI18n() {
		return aboutItemI18n;
	}

	public void setAboutItemI18n(String aboutItemI18n) {
		this.aboutItemI18n = aboutItemI18n;
	}

	public String getRoomItemI18n() {
		return roomItemI18n;
	}

	public void setRoomItemI18n(String roomItemI18n) {
		this.roomItemI18n = roomItemI18n;
	}

	public String getBlogItemI18n() {
		return blogItemI18n;
	}

	public void setBlogItemI18n(String blogItemI18n) {
		this.blogItemI18n = blogItemI18n;
	}

	public String getSignInI18n() {
		return signInI18n;
	}

	public void setSignInI18n(String signInI18n) {
		this.signInI18n = signInI18n;
	}

	public String getContactI18n() {
		return contactItemI18n;
	}

	public void setContactI18n(String contactI18n) {
		this.contactItemI18n = contactI18n;
	}

}
