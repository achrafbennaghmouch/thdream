package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String Title;
	String Gender;
	String Firstname;
	String Lastname;
	String Username;
	String Email;
	String Password;
	String PasswordConfirm;
	String Dateofbirth;
	String Phone;
	@ManyToOne
	@JoinColumn(name = "designation_id")
	Designation designation;
	@ManyToOne
	@JoinColumn(name = "country_id")
	Country country;
	@ManyToOne
	@JoinColumn(name = "city_id")
	City city;
	String Address;
	String IDNumber;
	String Remark;
	String DateOfJoining;
	String Salary;
	String Shift;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String title, String gender, String firstname, String lastname, String username, String email,
			String password, String passwordConfirm, String dateofbirth, String phone, Designation designation,
			Country country, City city, String address, String iDNumber, String remark, String dateOfJoining,
			String salary, String shift) {
		super();
		Title = title;
		Gender = gender;
		Firstname = firstname;
		Lastname = lastname;
		Username = username;
		Email = email;
		Password = password;
		PasswordConfirm = passwordConfirm;
		Dateofbirth = dateofbirth;
		Phone = phone;
		this.designation = designation;
		this.country = country;
		this.city = city;
		Address = address;
		IDNumber = iDNumber;
		Remark = remark;
		DateOfJoining = dateOfJoining;
		Salary = salary;
		Shift = shift;
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

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPasswordConfirm() {
		return PasswordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		PasswordConfirm = passwordConfirm;
	}

	public String getDateofbirth() {
		return Dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		Dateofbirth = dateofbirth;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getDateOfJoining() {
		return DateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		DateOfJoining = dateOfJoining;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public String getShift() {
		return Shift;
	}

	public void setShift(String shift) {
		Shift = shift;
	}

}
