package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String titleI18n;
	String bodyI18n;
	String dateI18n;
	String userI18n;
	String photosI18n;
	String dayI18n;
	String monthI18n;
	String blogCategoryI18n;
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

	public String getTitleI18n() {
		return titleI18n;
	}

	public void setTitleI18n(String titleI18n) {
		this.titleI18n = titleI18n;
	}

	public String getBodyI18n() {
		return bodyI18n;
	}

	public void setBodyI18n(String bodyI18n) {
		this.bodyI18n = bodyI18n;
	}

	public String getDateI18n() {
		return dateI18n;
	}

	public void setDateI18n(String dateI18n) {
		this.dateI18n = dateI18n;
	}

	public String getUserI18n() {
		return userI18n;
	}

	public void setUserI18n(String userI18n) {
		this.userI18n = userI18n;
	}

	public String getPhotosI18n() {
		return photosI18n;
	}

	public void setPhotosI18n(String photosI18n) {
		this.photosI18n = photosI18n;
	}

	public String getDayI18n() {
		return dayI18n;
	}

	public void setDayI18n(String dayI18n) {
		this.dayI18n = dayI18n;
	}

	public String getMonthI18n() {
		return monthI18n;
	}

	public void setMonthI18n(String monthI18n) {
		this.monthI18n = monthI18n;
	}

	public String getBlogCategoryI18n() {
		return blogCategoryI18n;
	}

	public void setBlogCategoryI18n(String blogCategoryI18n) {
		this.blogCategoryI18n = blogCategoryI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
