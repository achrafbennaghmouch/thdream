package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String Fullname;
	String Email;
	String Mobile;
	String Address;
	@ManyToOne
	@JoinColumn(name = "country_id")
	Country Country;
	@ManyToOne
	@JoinColumn(name = "city_id")
	City City;
	String Gender;
	String Age;
	@ManyToOne
	@JoinColumn(name = "user_id")
	User user;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String fullname, String email, String mobile, String address,
			com.dev.delta.entities.Country country, com.dev.delta.entities.City city, String gender, String age) {
		super();
		Fullname = fullname;
		Email = email;
		Mobile = mobile;
		Address = address;
		Country = country;
		City = city;
		Gender = gender;
		Age = age;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country country) {
		Country = country;
	}

	public City getCity() {
		return City;
	}

	public void setCity(City city) {
		City = city;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

}
