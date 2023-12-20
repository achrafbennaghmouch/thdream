package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodOrderI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String roomI18n;
	String NoofPersonsI18n;
	String WaiterNameI18n;
	String FoodItemI18n;
	String checkinI18n;
	String priceI18n;
	String langI18n;
	String getAllTitleI18n;
	String getTitleI18n;
	String editTitleI18n;
	String createTitleI18n;

	public FoodOrderI18n() {
		// TODO Auto-generated constructor stub
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

	public String getNoofPersonsI18n() {
		return NoofPersonsI18n;
	}

	public void setNoofPersonsI18n(String noofPersonsI18n) {
		NoofPersonsI18n = noofPersonsI18n;
	}

	public String getWaiterNameI18n() {
		return WaiterNameI18n;
	}

	public void setWaiterNameI18n(String waiterNameI18n) {
		WaiterNameI18n = waiterNameI18n;
	}

	public String getFoodItemI18n() {
		return FoodItemI18n;
	}

	public void setFoodItemI18n(String foodItemI18n) {
		FoodItemI18n = foodItemI18n;
	}

	public String getCheckinI18n() {
		return checkinI18n;
	}

	public void setCheckinI18n(String checkinI18n) {
		this.checkinI18n = checkinI18n;
	}

	public String getPriceI18n() {
		return priceI18n;
	}

	public void setPriceI18n(String priceI18n) {
		this.priceI18n = priceI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
