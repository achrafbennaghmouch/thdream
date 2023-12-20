package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UIMenuI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String dashboard;
	String website;
	String chekins;
	String customers;
	String guests;
	String guesttypes;
	String facilities;
	String rooms;
	String foods;
	String requests;
	String roomsTypes;
	String amenities;
	String beds;
	String extrabedorder;
	String housekeepingorder;
	String laundryorder;
	String foodorder;
	String extrabedrequest;
	String housekeepingrequest;
	String laundryrequest;
	String foodrequest;
	String foodcategories;
	String expenses;
	String expensescategories;
	String laundries;
	String laundryitems;
	String payments;
	String paymentmethods;
	String cms;
	String informations;
	String blogs;
	String blogcategories;
	String messages;
	String offers;
	String galleries;
	String locations;
	String cities;
	String countries;
	String users;
	String subrcribers;
	String settings;
	String documentation;
	String orders;
	String employees;
	String departements;
	String designations;
	String shifts;
	String housekeeping;
	String housekeepingitems;
	String lang;
	String profile;
	String logout;

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getLogout() {
		return logout;
	}

	public void setLogout(String logout) {
		this.logout = logout;
	}

	public String getDepartements() {
		return departements;
	}

	public void setDepartements(String departements) {
		this.departements = departements;
	}

	public String getDesignations() {
		return designations;
	}

	public void setDesignations(String designations) {
		this.designations = designations;
	}

	public String getShifts() {
		return shifts;
	}

	public void setShifts(String shifts) {
		this.shifts = shifts;
	}

	public String getHousekeeping() {
		return housekeeping;
	}

	public void setHousekeeping(String housekeeping) {
		this.housekeeping = housekeeping;
	}

	public String getHousekeepingitems() {
		return housekeepingitems;
	}

	public void setHousekeepingitems(String housekeepingitems) {
		this.housekeepingitems = housekeepingitems;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}

	public String getFoodcategories() {
		return foodcategories;
	}

	public void setFoodcategories(String foodcategories) {
		this.foodcategories = foodcategories;
	}

	public String getFoods() {
		return foods;
	}

	public void setFoods(String foods) {
		this.foods = foods;
	}

	public String getOrders() {
		return orders;
	}

	public void setOrders(String orders) {
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDashboard() {
		return dashboard;
	}

	public void setDashboard(String dashboard) {
		this.dashboard = dashboard;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getChekins() {
		return chekins;
	}

	public void setChekins(String chekins) {
		this.chekins = chekins;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getGuests() {
		return guests;
	}

	public void setGuests(String guests) {
		this.guests = guests;
	}

	public String getGuesttypes() {
		return guesttypes;
	}

	public void setGuesttypes(String guesttypes) {
		this.guesttypes = guesttypes;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public String getRoomsTypes() {
		return roomsTypes;
	}

	public void setRoomsTypes(String roomsTypes) {
		this.roomsTypes = roomsTypes;
	}

	public String getRequests() {
		return requests;
	}

	public void setRequests(String requests) {
		this.requests = requests;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public String getBeds() {
		return beds;
	}

	public void setBeds(String beds) {
		this.beds = beds;
	}

	public String getExtrabedorder() {
		return extrabedorder;
	}

	public void setExtrabedorder(String extrabedorder) {
		this.extrabedorder = extrabedorder;
	}

	public String getHousekeepingorder() {
		return housekeepingorder;
	}

	public void setHousekeepingorder(String housekeepingorder) {
		this.housekeepingorder = housekeepingorder;
	}

	public String getLaundryorder() {
		return laundryorder;
	}

	public void setLaundryorder(String laundryorder) {
		this.laundryorder = laundryorder;
	}

	public String getFoodorder() {
		return foodorder;
	}

	public void setFoodorder(String foodorder) {
		this.foodorder = foodorder;
	}

	public String getExtrabedrequest() {
		return extrabedrequest;
	}

	public void setExtrabedrequest(String extrabedrequest) {
		this.extrabedrequest = extrabedrequest;
	}

	public String getHousekeepingrequest() {
		return housekeepingrequest;
	}

	public void setHousekeepingrequest(String housekeepingrequest) {
		this.housekeepingrequest = housekeepingrequest;
	}

	public String getLaundryrequest() {
		return laundryrequest;
	}

	public void setLaundryrequest(String laundryrequest) {
		this.laundryrequest = laundryrequest;
	}

	public String getFoodrequest() {
		return foodrequest;
	}

	public void setFoodrequest(String foodrequest) {
		this.foodrequest = foodrequest;
	}

	public String getExpenses() {
		return expenses;
	}

	public void setExpenses(String expenses) {
		this.expenses = expenses;
	}

	public String getExpensescategories() {
		return expensescategories;
	}

	public void setExpensescategories(String expensescategories) {
		this.expensescategories = expensescategories;
	}

	public String getLaundries() {
		return laundries;
	}

	public void setLaundries(String laundries) {
		this.laundries = laundries;
	}

	public String getLaundryitems() {
		return laundryitems;
	}

	public void setLaundryitems(String laundryitems) {
		this.laundryitems = laundryitems;
	}

	public String getPayments() {
		return payments;
	}

	public void setPayments(String payments) {
		this.payments = payments;
	}

	public String getPaymentmethods() {
		return paymentmethods;
	}

	public void setPaymentmethods(String paymentmethods) {
		this.paymentmethods = paymentmethods;
	}

	public String getCms() {
		return cms;
	}

	public void setCms(String cms) {
		this.cms = cms;
	}

	public String getInformations() {
		return informations;
	}

	public void setInformations(String informations) {
		this.informations = informations;
	}

	public String getBlogs() {
		return blogs;
	}

	public void setBlogs(String blogs) {
		this.blogs = blogs;
	}

	public String getBlogcategories() {
		return blogcategories;
	}

	public void setBlogcategories(String blogcategories) {
		this.blogcategories = blogcategories;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	public String getGalleries() {
		return galleries;
	}

	public void setGalleries(String galleries) {
		this.galleries = galleries;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public String getCities() {
		return cities;
	}

	public void setCities(String cities) {
		this.cities = cities;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getSubrcribers() {
		return subrcribers;
	}

	public void setSubrcribers(String subrcribers) {
		this.subrcribers = subrcribers;
	}

	public String getSettings() {
		return settings;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

}
