package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String TitleI18n;
	String GenderI18n;
	String FirstnameI18n;
	String LastnameI18n;
	String UsernameI18n;
	String EmailI18n;
	String PasswordI18n;
	String PasswordConfirmI18n;
	String DateofbirthI18n;
	String PhoneI18n;
	String designationI18n;
	String countryI18n;
	String cityI18n;
	String AddressI18n;
	String IDNumberI18n;
	String RemarkI18n;
	String DateOfJoiningI18n;
	String SalaryI18n;
	String ShiftI18n;
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

	public String getGenderI18n() {
		return GenderI18n;
	}

	public void setGenderI18n(String genderI18n) {
		GenderI18n = genderI18n;
	}

	public String getFirstnameI18n() {
		return FirstnameI18n;
	}

	public void setFirstnameI18n(String firstnameI18n) {
		FirstnameI18n = firstnameI18n;
	}

	public String getLastnameI18n() {
		return LastnameI18n;
	}

	public void setLastnameI18n(String lastnameI18n) {
		LastnameI18n = lastnameI18n;
	}

	public String getUsernameI18n() {
		return UsernameI18n;
	}

	public void setUsernameI18n(String usernameI18n) {
		UsernameI18n = usernameI18n;
	}

	public String getEmailI18n() {
		return EmailI18n;
	}

	public void setEmailI18n(String emailI18n) {
		EmailI18n = emailI18n;
	}

	public String getPasswordI18n() {
		return PasswordI18n;
	}

	public void setPasswordI18n(String passwordI18n) {
		PasswordI18n = passwordI18n;
	}

	public String getPasswordConfirmI18n() {
		return PasswordConfirmI18n;
	}

	public void setPasswordConfirmI18n(String passwordConfirmI18n) {
		PasswordConfirmI18n = passwordConfirmI18n;
	}

	public String getDateofbirthI18n() {
		return DateofbirthI18n;
	}

	public void setDateofbirthI18n(String dateofbirthI18n) {
		DateofbirthI18n = dateofbirthI18n;
	}

	public String getPhoneI18n() {
		return PhoneI18n;
	}

	public void setPhoneI18n(String phoneI18n) {
		PhoneI18n = phoneI18n;
	}

	public String getDesignationI18n() {
		return designationI18n;
	}

	public void setDesignationI18n(String designationI18n) {
		this.designationI18n = designationI18n;
	}

	public String getCountryI18n() {
		return countryI18n;
	}

	public void setCountryI18n(String countryI18n) {
		this.countryI18n = countryI18n;
	}

	public String getCityI18n() {
		return cityI18n;
	}

	public void setCityI18n(String cityI18n) {
		this.cityI18n = cityI18n;
	}

	public String getAddressI18n() {
		return AddressI18n;
	}

	public void setAddressI18n(String addressI18n) {
		AddressI18n = addressI18n;
	}

	public String getIDNumberI18n() {
		return IDNumberI18n;
	}

	public void setIDNumberI18n(String iDNumberI18n) {
		IDNumberI18n = iDNumberI18n;
	}

	public String getRemarkI18n() {
		return RemarkI18n;
	}

	public void setRemarkI18n(String remarkI18n) {
		RemarkI18n = remarkI18n;
	}

	public String getDateOfJoiningI18n() {
		return DateOfJoiningI18n;
	}

	public void setDateOfJoiningI18n(String dateOfJoiningI18n) {
		DateOfJoiningI18n = dateOfJoiningI18n;
	}

	public String getSalaryI18n() {
		return SalaryI18n;
	}

	public void setSalaryI18n(String salaryI18n) {
		SalaryI18n = salaryI18n;
	}

	public String getShiftI18n() {
		return ShiftI18n;
	}

	public void setShiftI18n(String shiftI18n) {
		ShiftI18n = shiftI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
