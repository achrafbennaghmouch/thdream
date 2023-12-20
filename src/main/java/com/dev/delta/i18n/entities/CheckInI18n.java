package com.dev.delta.i18n.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CheckInI18n {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String GuestTypeI18n;
	String FullnameI18n;
	String EmailI18n;
	String MobileI18n;
	String AddressI18n;
	String CountryI18n;
	String cityI18n;
	String GenderI18n;
	String AgeI18n;
	String CheckInI18n;
	String CheckOutI18n;
	String DurationofStayI18n;
	String AdultsI18n;
	String KidsI18n;
	String RoomPlanI18n;
	String BookedByI18n;
	String VehicleNumberI18n;
	String RemarkI18n;
	String IDNoI18n;
	String NameOtherPersonI18n;
	String GenderOtherPersonI18n;
	String AgeOtherPersonI18n;
	String AddressOtherPersonI18n;
	String IDNoOtherPersonI18n;
	String AdvancePaymentI18n;
	String paymentStatusI18n;
	String StatusI18n;
	String roomI18n;
	String cutomerI18n;
	String langI18n;
	String getAllTitleI18n;
	String getTitleI18n;
	String editTitleI18n;
	String createTitleI18n;
	String languageI18;
	String viewinvoiceI18n;
	String viewcheckinI18n;
	String orderlaundryI18n;
	String orderfoodI18n;
	String extrabedI18n;
	String housekeepingI18n;
	String checkoutbuttonI18n;
	String bookingInformationI18n;
	String basicInformationI18n;
	String additionalInformationI18n;
	String UsernameI18n;
	String PasswordI18n;
	@Column(name = "messsage", length = 512)
	String messageI18n;

	public String getMessageI18n() {
		return messageI18n;
	}

	public void setMessageI18n(String messageI18n) {
		this.messageI18n = messageI18n;
	}

	public String getUsernameI18n() {
		return UsernameI18n;
	}

	public void setUsernameI18n(String usernameI18n) {
		UsernameI18n = usernameI18n;
	}

	public String getPasswordI18n() {
		return PasswordI18n;
	}

	public void setPasswordI18n(String passwordI18n) {
		PasswordI18n = passwordI18n;
	}

	public String getBookingInformationI18n() {
		return bookingInformationI18n;
	}

	public void setBookingInformationI18n(String bookingInformationI18n) {
		this.bookingInformationI18n = bookingInformationI18n;
	}

	public String getBasicInformationI18n() {
		return basicInformationI18n;
	}

	public void setBasicInformationI18n(String basicInformationI18n) {
		this.basicInformationI18n = basicInformationI18n;
	}

	public String getAdditionalInformationI18n() {
		return additionalInformationI18n;
	}

	public void setAdditionalInformationI18n(String additionalInformationI18n) {
		this.additionalInformationI18n = additionalInformationI18n;
	}

	public String getCheckoutbuttonI18n() {
		return checkoutbuttonI18n;
	}

	public void setCheckoutbuttonI18n(String checkoutbuttonI18n) {
		this.checkoutbuttonI18n = checkoutbuttonI18n;
	}

	public String getViewinvoiceI18n() {
		return viewinvoiceI18n;
	}

	public void setViewinvoiceI18n(String viewinvoiceI18n) {
		this.viewinvoiceI18n = viewinvoiceI18n;
	}

	public String getViewcheckinI18n() {
		return viewcheckinI18n;
	}

	public void setViewcheckinI18n(String viewcheckinI18n) {
		this.viewcheckinI18n = viewcheckinI18n;
	}

	public String getOrderlaundryI18n() {
		return orderlaundryI18n;
	}

	public void setOrderlaundryI18n(String orderlaundryI18n) {
		this.orderlaundryI18n = orderlaundryI18n;
	}

	public String getOrderfoodI18n() {
		return orderfoodI18n;
	}

	public void setOrderfoodI18n(String orderfoodI18n) {
		this.orderfoodI18n = orderfoodI18n;
	}

	public String getExtrabedI18n() {
		return extrabedI18n;
	}

	public void setExtrabedI18n(String extrabedI18n) {
		this.extrabedI18n = extrabedI18n;
	}

	public String getHousekeepingI18n() {
		return housekeepingI18n;
	}

	public void setHousekeepingI18n(String housekeepingI18n) {
		this.housekeepingI18n = housekeepingI18n;
	}

	public String getLanguageI18() {
		return languageI18;
	}

	public void setLanguageI18(String languageI18) {
		this.languageI18 = languageI18;
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

	public String getGuestTypeI18n() {
		return GuestTypeI18n;
	}

	public void setGuestTypeI18n(String guestTypeI18n) {
		GuestTypeI18n = guestTypeI18n;
	}

	public String getFullnameI18n() {
		return FullnameI18n;
	}

	public void setFullnameI18n(String fullnameI18n) {
		FullnameI18n = fullnameI18n;
	}

	public String getEmailI18n() {
		return EmailI18n;
	}

	public void setEmailI18n(String emailI18n) {
		EmailI18n = emailI18n;
	}

	public String getMobileI18n() {
		return MobileI18n;
	}

	public void setMobileI18n(String mobileI18n) {
		MobileI18n = mobileI18n;
	}

	public String getAddressI18n() {
		return AddressI18n;
	}

	public void setAddressI18n(String addressI18n) {
		AddressI18n = addressI18n;
	}

	public String getCountryI18n() {
		return CountryI18n;
	}

	public void setCountryI18n(String countryI18n) {
		CountryI18n = countryI18n;
	}

	public String getCityI18n() {
		return cityI18n;
	}

	public void setCityI18n(String cityI18n) {
		this.cityI18n = cityI18n;
	}

	public String getGenderI18n() {
		return GenderI18n;
	}

	public void setGenderI18n(String genderI18n) {
		GenderI18n = genderI18n;
	}

	public String getAgeI18n() {
		return AgeI18n;
	}

	public void setAgeI18n(String ageI18n) {
		AgeI18n = ageI18n;
	}

	public String getCheckInI18n() {
		return CheckInI18n;
	}

	public void setCheckInI18n(String checkInI18n) {
		CheckInI18n = checkInI18n;
	}

	public String getCheckOutI18n() {
		return CheckOutI18n;
	}

	public void setCheckOutI18n(String checkOutI18n) {
		CheckOutI18n = checkOutI18n;
	}

	public String getDurationofStayI18n() {
		return DurationofStayI18n;
	}

	public void setDurationofStayI18n(String durationofStayI18n) {
		DurationofStayI18n = durationofStayI18n;
	}

	public String getAdultsI18n() {
		return AdultsI18n;
	}

	public void setAdultsI18n(String adultsI18n) {
		AdultsI18n = adultsI18n;
	}

	public String getKidsI18n() {
		return KidsI18n;
	}

	public void setKidsI18n(String kidsI18n) {
		KidsI18n = kidsI18n;
	}

	public String getRoomPlanI18n() {
		return RoomPlanI18n;
	}

	public void setRoomPlanI18n(String roomPlanI18n) {
		RoomPlanI18n = roomPlanI18n;
	}

	public String getBookedByI18n() {
		return BookedByI18n;
	}

	public void setBookedByI18n(String bookedByI18n) {
		BookedByI18n = bookedByI18n;
	}

	public String getVehicleNumberI18n() {
		return VehicleNumberI18n;
	}

	public void setVehicleNumberI18n(String vehicleNumberI18n) {
		VehicleNumberI18n = vehicleNumberI18n;
	}

	public String getRemarkI18n() {
		return RemarkI18n;
	}

	public void setRemarkI18n(String remarkI18n) {
		RemarkI18n = remarkI18n;
	}

	public String getIDNoI18n() {
		return IDNoI18n;
	}

	public void setIDNoI18n(String iDNoI18n) {
		IDNoI18n = iDNoI18n;
	}

	public String getNameOtherPersonI18n() {
		return NameOtherPersonI18n;
	}

	public void setNameOtherPersonI18n(String nameOtherPersonI18n) {
		NameOtherPersonI18n = nameOtherPersonI18n;
	}

	public String getGenderOtherPersonI18n() {
		return GenderOtherPersonI18n;
	}

	public void setGenderOtherPersonI18n(String genderOtherPersonI18n) {
		GenderOtherPersonI18n = genderOtherPersonI18n;
	}

	public String getAgeOtherPersonI18n() {
		return AgeOtherPersonI18n;
	}

	public void setAgeOtherPersonI18n(String ageOtherPersonI18n) {
		AgeOtherPersonI18n = ageOtherPersonI18n;
	}

	public String getAddressOtherPersonI18n() {
		return AddressOtherPersonI18n;
	}

	public void setAddressOtherPersonI18n(String addressOtherPersonI18n) {
		AddressOtherPersonI18n = addressOtherPersonI18n;
	}

	public String getIDNoOtherPersonI18n() {
		return IDNoOtherPersonI18n;
	}

	public void setIDNoOtherPersonI18n(String iDNoOtherPersonI18n) {
		IDNoOtherPersonI18n = iDNoOtherPersonI18n;
	}

	public String getAdvancePaymentI18n() {
		return AdvancePaymentI18n;
	}

	public void setAdvancePaymentI18n(String advancePaymentI18n) {
		AdvancePaymentI18n = advancePaymentI18n;
	}

	public String getPaymentStatusI18n() {
		return paymentStatusI18n;
	}

	public void setPaymentStatusI18n(String paymentStatusI18n) {
		this.paymentStatusI18n = paymentStatusI18n;
	}

	public String getStatusI18n() {
		return StatusI18n;
	}

	public void setStatusI18n(String statusI18n) {
		StatusI18n = statusI18n;
	}

	public String getRoomI18n() {
		return roomI18n;
	}

	public void setRoomI18n(String roomI18n) {
		this.roomI18n = roomI18n;
	}

	public String getCutomerI18n() {
		return cutomerI18n;
	}

	public void setCutomerI18n(String cutomerI18n) {
		this.cutomerI18n = cutomerI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
