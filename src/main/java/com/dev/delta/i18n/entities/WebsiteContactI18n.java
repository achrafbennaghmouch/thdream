package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebsiteContactI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String pageTitleI18n;
	String formTitleI18n;
	String messageI18n;
	String nameI18n;
	String emailI18n;
	String subjectI18n;
	String sendI18n;
	String phoneSubtitleI18n;
	String emailSubtitleI18n;
	String lang;

	public WebsiteContactI18n() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getPageTitleI18n() {
		return pageTitleI18n;
	}

	public void setPageTitleI18n(String pageTitleI18n) {
		this.pageTitleI18n = pageTitleI18n;
	}

	public String getFormTitleI18n() {
		return formTitleI18n;
	}

	public void setFormTitleI18n(String formTitleI18n) {
		this.formTitleI18n = formTitleI18n;
	}

	public String getMessageI18n() {
		return messageI18n;
	}

	public void setMessageI18n(String messageI18n) {
		this.messageI18n = messageI18n;
	}

	public String getNameI18n() {
		return nameI18n;
	}

	public void setNameI18n(String nameI18n) {
		this.nameI18n = nameI18n;
	}

	public String getEmailI18n() {
		return emailI18n;
	}

	public void setEmailI18n(String emailI18n) {
		this.emailI18n = emailI18n;
	}

	public String getSubjectI18n() {
		return subjectI18n;
	}

	public void setSubjectI18n(String subjectI18n) {
		this.subjectI18n = subjectI18n;
	}

	public String getSendI18n() {
		return sendI18n;
	}

	public void setSendI18n(String sendI18n) {
		this.sendI18n = sendI18n;
	}

	public String getPhoneSubtitleI18n() {
		return phoneSubtitleI18n;
	}

	public void setPhoneSubtitleI18n(String phoneSubtitleI18n) {
		this.phoneSubtitleI18n = phoneSubtitleI18n;
	}

	public String getEmailSubtitleI18n() {
		return emailSubtitleI18n;
	}

	public void setEmailSubtitleI18n(String emailSubtitleI18n) {
		this.emailSubtitleI18n = emailSubtitleI18n;
	}

}
