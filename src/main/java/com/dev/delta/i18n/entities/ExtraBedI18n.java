package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExtraBedI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String roomI18n;
	String ExtraBedI18n;
	String BedNoI18n;
	String CommentI18n;
	String langI18n;
	String getAllTitleI18n;
	String getTitleI18n;
	String editTitleI18n;
	String createTitleI18n;
	String priceI18n;

	public String getPriceI18n() {
		return priceI18n;
	}

	public void setPriceI18n(String priceI18n) {
		this.priceI18n = priceI18n;
	}

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

	public String getRoomI18n() {
		return roomI18n;
	}

	public void setRoomI18n(String roomI18n) {
		this.roomI18n = roomI18n;
	}

	public String getExtraBedI18n() {
		return ExtraBedI18n;
	}

	public void setExtraBedI18n(String extraBedI18n) {
		ExtraBedI18n = extraBedI18n;
	}

	public String getBedNoI18n() {
		return BedNoI18n;
	}

	public void setBedNoI18n(String bedNoI18n) {
		BedNoI18n = bedNoI18n;
	}

	public String getCommentI18n() {
		return CommentI18n;
	}

	public void setCommentI18n(String commentI18n) {
		CommentI18n = commentI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
