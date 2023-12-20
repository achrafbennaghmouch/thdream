package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebsiteSignInI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String pageTitleI18n;
	String adminI18n;
	String passwordI18n;
	String loginI18n;
	String websiteI18n;
	String lang;

	public WebsiteSignInI18n() {
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

	public String getAdminI18n() {
		return adminI18n;
	}

	public void setAdminI18n(String adminI18n) {
		this.adminI18n = adminI18n;
	}

	public String getPasswordI18n() {
		return passwordI18n;
	}

	public void setPasswordI18n(String passwordI18n) {
		this.passwordI18n = passwordI18n;
	}

	public String getLoginI18n() {
		return loginI18n;
	}

	public void setLoginI18n(String loginI18n) {
		this.loginI18n = loginI18n;
	}

	public String getWebsiteI18n() {
		return websiteI18n;
	}

	public void setWebsiteI18n(String websiteI18n) {
		this.websiteI18n = websiteI18n;
	}

}
