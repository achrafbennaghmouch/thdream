package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RoomType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String Title;
	String ShortCode;
	String AdultCapacity;
	String KidsCapacity;
	String BasePrice;

	String AirConditioner;
	String BathTub;
	String CoffeeMaker;
	String DoubleBed;
	String FreeNewspaper;
	String MiniFridge;
	String wifi;
	String Status;

	public RoomType() {
		// TODO Auto-generated constructor stub
	}

	public RoomType(String title, String shortCode, String adultCapacity, String kidsCapacity, String basePrice,
			 String airConditioner, String bathTub, String coffeeMaker, String doubleBed,
			String freeNewspaper, String miniFridge, String wifi, String status) {
		super();
		Title = title;
		ShortCode = shortCode;
		AdultCapacity = adultCapacity;
		KidsCapacity = kidsCapacity;
		BasePrice = basePrice;

		AirConditioner = airConditioner;
		BathTub = bathTub;
		CoffeeMaker = coffeeMaker;
		DoubleBed = doubleBed;
		FreeNewspaper = freeNewspaper;
		MiniFridge = miniFridge;
		this.wifi = wifi;
		Status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getShortCode() {
		return ShortCode;
	}

	public void setShortCode(String shortCode) {
		ShortCode = shortCode;
	}

	public String getAdultCapacity() {
		return AdultCapacity;
	}

	public void setAdultCapacity(String adultCapacity) {
		AdultCapacity = adultCapacity;
	}

	public String getKidsCapacity() {
		return KidsCapacity;
	}

	public void setKidsCapacity(String kidsCapacity) {
		KidsCapacity = kidsCapacity;
	}

	public String getBasePrice() {
		return BasePrice;
	}

	public void setBasePrice(String basePrice) {
		BasePrice = basePrice;
	}



	public String getAirConditioner() {
		return AirConditioner;
	}

	public void setAirConditioner(String airConditioner) {
		AirConditioner = airConditioner;
	}

	public String getBathTub() {
		return BathTub;
	}

	public void setBathTub(String bathTub) {
		BathTub = bathTub;
	}

	public String getCoffeeMaker() {
		return CoffeeMaker;
	}

	public void setCoffeeMaker(String coffeeMaker) {
		CoffeeMaker = coffeeMaker;
	}

	public String getDoubleBed() {
		return DoubleBed;
	}

	public void setDoubleBed(String doubleBed) {
		DoubleBed = doubleBed;
	}

	public String getFreeNewspaper() {
		return FreeNewspaper;
	}

	public void setFreeNewspaper(String freeNewspaper) {
		FreeNewspaper = freeNewspaper;
	}

	public String getMiniFridge() {
		return MiniFridge;
	}

	public void setMiniFridge(String miniFridge) {
		MiniFridge = miniFridge;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
