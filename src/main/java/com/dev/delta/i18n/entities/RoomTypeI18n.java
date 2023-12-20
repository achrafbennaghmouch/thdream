package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomTypeI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String TitleI18n;
	String ShortCodeI18n;
	String AdultCapacityI18n;
	String KidsCapacityI18n;
	String BasePriceI18n;
	String amenityI18n;
	String AirConditionerI18n;
	String BathTubI18n;
	String CoffeeMakerI18n;
	String DoubleBedI18n;
	String FreeNewspaperI18n;
	String MiniFridgeI18n;
	String wifiI18n;
	String StatusI18n;
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
		return TitleI18n;
	}

	public void setTitleI18n(String titleI18n) {
		TitleI18n = titleI18n;
	}

	public String getShortCodeI18n() {
		return ShortCodeI18n;
	}

	public void setShortCodeI18n(String shortCodeI18n) {
		ShortCodeI18n = shortCodeI18n;
	}

	public String getAdultCapacityI18n() {
		return AdultCapacityI18n;
	}

	public void setAdultCapacityI18n(String adultCapacityI18n) {
		AdultCapacityI18n = adultCapacityI18n;
	}

	public String getKidsCapacityI18n() {
		return KidsCapacityI18n;
	}

	public void setKidsCapacityI18n(String kidsCapacityI18n) {
		KidsCapacityI18n = kidsCapacityI18n;
	}

	public String getBasePriceI18n() {
		return BasePriceI18n;
	}

	public void setBasePriceI18n(String basePriceI18n) {
		BasePriceI18n = basePriceI18n;
	}

	public String getAmenityI18n() {
		return amenityI18n;
	}

	public void setAmenityI18n(String amenityI18n) {
		this.amenityI18n = amenityI18n;
	}

	public String getAirConditionerI18n() {
		return AirConditionerI18n;
	}

	public void setAirConditionerI18n(String airConditionerI18n) {
		AirConditionerI18n = airConditionerI18n;
	}

	public String getBathTubI18n() {
		return BathTubI18n;
	}

	public void setBathTubI18n(String bathTubI18n) {
		BathTubI18n = bathTubI18n;
	}

	public String getCoffeeMakerI18n() {
		return CoffeeMakerI18n;
	}

	public void setCoffeeMakerI18n(String coffeeMakerI18n) {
		CoffeeMakerI18n = coffeeMakerI18n;
	}

	public String getDoubleBedI18n() {
		return DoubleBedI18n;
	}

	public void setDoubleBedI18n(String doubleBedI18n) {
		DoubleBedI18n = doubleBedI18n;
	}

	public String getFreeNewspaperI18n() {
		return FreeNewspaperI18n;
	}

	public void setFreeNewspaperI18n(String freeNewspaperI18n) {
		FreeNewspaperI18n = freeNewspaperI18n;
	}

	public String getMiniFridgeI18n() {
		return MiniFridgeI18n;
	}

	public void setMiniFridgeI18n(String miniFridgeI18n) {
		MiniFridgeI18n = miniFridgeI18n;
	}

	public String getWifiI18n() {
		return wifiI18n;
	}

	public void setWifiI18n(String wifiI18n) {
		this.wifiI18n = wifiI18n;
	}

	public String getStatusI18n() {
		return StatusI18n;
	}

	public void setStatusI18n(String statusI18n) {
		StatusI18n = statusI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
