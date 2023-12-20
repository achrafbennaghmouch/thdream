package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebsiteBlogI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String pageTitleI18n;
	String nameSearchI18n;
	String searchButtonI18n;
	String categoryTitleI18n;
	String recentPostI18n;
	String tagI18n;
	String instagramFeedI18n;
	String newsletterTitleI18n;
	String emailI18n;
	String sendButtonI18n;
	String lang;

	public WebsiteBlogI18n() {
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

	public String getNameSearchI18n() {
		return nameSearchI18n;
	}

	public void setNameSearchI18n(String nameSearchI18n) {
		this.nameSearchI18n = nameSearchI18n;
	}

	public String getSearchButtonI18n() {
		return searchButtonI18n;
	}

	public void setSearchButtonI18n(String searchButtonI18n) {
		this.searchButtonI18n = searchButtonI18n;
	}

	public String getCategoryTitleI18n() {
		return categoryTitleI18n;
	}

	public void setCategoryTitleI18n(String categoryTitleI18n) {
		this.categoryTitleI18n = categoryTitleI18n;
	}

	public String getRecentPostI18n() {
		return recentPostI18n;
	}

	public void setRecentPostI18n(String recentPostI18n) {
		this.recentPostI18n = recentPostI18n;
	}

	public String getTagI18n() {
		return tagI18n;
	}

	public void setTagI18n(String tagI18n) {
		this.tagI18n = tagI18n;
	}

	public String getInstagramFeedI18n() {
		return instagramFeedI18n;
	}

	public void setInstagramFeedI18n(String instagramFeedI18n) {
		this.instagramFeedI18n = instagramFeedI18n;
	}

	public String getNewsletterTitleI18n() {
		return newsletterTitleI18n;
	}

	public void setNewsletterTitleI18n(String newsletterTitle) {
		this.newsletterTitleI18n = newsletterTitle;
	}

	public String getEmailI18n() {
		return emailI18n;
	}

	public void setEmailI18n(String emailI18n) {
		this.emailI18n = emailI18n;
	}

	public String getSendButtonI18n() {
		return sendButtonI18n;
	}

	public void setSendButtonI18n(String sendButtonI18n) {
		this.sendButtonI18n = sendButtonI18n;
	}

}
