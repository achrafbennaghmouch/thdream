package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String RoomNoI18n;
	String FloorI18n;
	String RoomTypeI18n;
	String StatusI18n;
	String bookedStatusI18n;
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

	public String getRoomNoI18n() {
		return RoomNoI18n;
	}

	public void setRoomNoI18n(String roomNoI18n) {
		RoomNoI18n = roomNoI18n;
	}

	public String getFloorI18n() {
		return FloorI18n;
	}

	public void setFloorI18n(String floorI18n) {
		FloorI18n = floorI18n;
	}

	public String getRoomTypeI18n() {
		return RoomTypeI18n;
	}

	public void setRoomTypeI18n(String roomTypeI18n) {
		RoomTypeI18n = roomTypeI18n;
	}

	public String getStatusI18n() {
		return StatusI18n;
	}

	public void setStatusI18n(String statusI18n) {
		StatusI18n = statusI18n;
	}

	public String getBookedStatusI18n() {
		return bookedStatusI18n;
	}

	public void setBookedStatusI18n(String bookedStatusI18n) {
		this.bookedStatusI18n = bookedStatusI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
