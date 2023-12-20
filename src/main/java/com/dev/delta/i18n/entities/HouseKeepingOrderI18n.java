package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HouseKeepingOrderI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String RoomI18n;
	String HousekeepingItemI18n;
	String HousekeepingStatusI18n;
	String RemarkI18n;
	String AssignedToI18n;
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

	public String getRoomI18n() {
		return RoomI18n;
	}

	public void setRoomI18n(String roomI18n) {
		RoomI18n = roomI18n;
	}

	public String getHousekeepingItemI18n() {
		return HousekeepingItemI18n;
	}

	public void setHousekeepingItemI18n(String housekeepingItemI18n) {
		HousekeepingItemI18n = housekeepingItemI18n;
	}

	public String getHousekeepingStatusI18n() {
		return HousekeepingStatusI18n;
	}

	public void setHousekeepingStatusI18n(String housekeepingStatusI18n) {
		HousekeepingStatusI18n = housekeepingStatusI18n;
	}

	public String getRemarkI18n() {
		return RemarkI18n;
	}

	public void setRemarkI18n(String remarkI18n) {
		RemarkI18n = remarkI18n;
	}

	public String getAssignedToI18n() {
		return AssignedToI18n;
	}

	public void setAssignedToI18n(String assignedToI18n) {
		AssignedToI18n = assignedToI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
