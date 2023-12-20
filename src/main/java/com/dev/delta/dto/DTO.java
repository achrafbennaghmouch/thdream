package com.dev.delta.dto;

import com.dev.delta.email.EmailSetting;

import com.dev.delta.entities.Blog;
import com.dev.delta.entities.BlogCategory;
import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.City;
import com.dev.delta.entities.Country;
import com.dev.delta.entities.Currency;
import com.dev.delta.entities.Customer;
import com.dev.delta.entities.Departement;
import com.dev.delta.entities.Designation;
import com.dev.delta.entities.Expense;
import com.dev.delta.entities.ExpenseCategory;

import com.dev.delta.entities.Gallery;
import com.dev.delta.entities.GuestType;

import com.dev.delta.entities.InformationHotel;

import com.dev.delta.entities.Message;
import com.dev.delta.entities.Notification;
import com.dev.delta.entities.Offer;
import com.dev.delta.entities.Role;
import com.dev.delta.entities.Room;
import com.dev.delta.entities.RoomType;
import com.dev.delta.entities.Shift;
import com.dev.delta.entities.User;
import com.dev.delta.entities.VAT;
import com.dev.delta.i18n.entities.AmenityI18n;
import com.dev.delta.i18n.entities.BedI18n;
import com.dev.delta.i18n.entities.BlogCategoryI18n;
import com.dev.delta.i18n.entities.BlogI18n;
import com.dev.delta.i18n.entities.CheckInI18n;
import com.dev.delta.i18n.entities.CityI18n;
import com.dev.delta.i18n.entities.CountryI18n;
import com.dev.delta.i18n.entities.CurrencyI18n;
import com.dev.delta.i18n.entities.CustomerI18n;
import com.dev.delta.i18n.entities.DepartementI18n;
import com.dev.delta.i18n.entities.DesignationI18n;
import com.dev.delta.i18n.entities.EmailI18n;
import com.dev.delta.i18n.entities.EmployeeI18n;
import com.dev.delta.i18n.entities.ExpenseCategoryI18n;
import com.dev.delta.i18n.entities.ExpenseI18n;
import com.dev.delta.i18n.entities.ExtraBedI18n;
import com.dev.delta.i18n.entities.ExtraBedRequestI18n;
import com.dev.delta.i18n.entities.FoodCategoryI18n;
import com.dev.delta.i18n.entities.FoodI18n;
import com.dev.delta.i18n.entities.FoodOrderI18n;
import com.dev.delta.i18n.entities.FoodRequestI18n;
import com.dev.delta.i18n.entities.GalleryI18n;
import com.dev.delta.i18n.entities.GuestTypeI18n;
import com.dev.delta.i18n.entities.HouseKeepingItemI18n;
import com.dev.delta.i18n.entities.HouseKeepingOrderI18n;
import com.dev.delta.i18n.entities.HouseKeepingRequestI18n;
import com.dev.delta.i18n.entities.InformationHotelI18n;
import com.dev.delta.i18n.entities.LaundryItemI18n;
import com.dev.delta.i18n.entities.LaundryOrderI18n;
import com.dev.delta.i18n.entities.LaundryRequestI18n;
import com.dev.delta.i18n.entities.MessageI18n;
import com.dev.delta.i18n.entities.OfferI18n;
import com.dev.delta.i18n.entities.PaymentI18n;
import com.dev.delta.i18n.entities.PaymentMethodI18n;
import com.dev.delta.i18n.entities.RoomI18n;
import com.dev.delta.i18n.entities.RoomTypeI18n;
import com.dev.delta.i18n.entities.ShiftI18n;
import com.dev.delta.i18n.entities.SubscriberI18n;
import com.dev.delta.i18n.entities.UIHeaderI18n;
import com.dev.delta.i18n.entities.UIMenuI18n;
import com.dev.delta.i18n.entities.UserI18n;
import com.dev.delta.i18n.entities.WebsiteAboutI18n;
import com.dev.delta.i18n.entities.WebsiteBlogI18n;
import com.dev.delta.i18n.entities.WebsiteBookingRoomI18n;
import com.dev.delta.i18n.entities.WebsiteContactI18n;
import com.dev.delta.i18n.entities.WebsiteFooterI18n;
import com.dev.delta.i18n.entities.WebsiteHomeI18n;
import com.dev.delta.i18n.entities.WebsiteMenuI18n;
import com.dev.delta.i18n.entities.WebsiteRoomI18n;
import com.dev.delta.i18n.entities.WebsiteSignInI18n;
import com.github.javafaker.Faker;

public interface DTO {
	Faker faker = new Faker();
	public User user = new User();
	public User user1 = new User();
	public InformationHotel informationHotel = new InformationHotel();

	CheckIn checkIn = new CheckIn();
	RoomType roomType1 = new RoomType();
	RoomType roomType2 = new RoomType();
	RoomType roomType3 = new RoomType();
	Message message = new Message();
	City city = new City();
	Country country = new Country();
	GuestType guestType1 = new GuestType();
	GuestType guestType2 = new GuestType();
	Customer customer = new Customer();
	Blog blog = new Blog();
	Room room = new Room();
	Room room1 = new Room();
	Room room2 = new Room();
	Room room3 = new Room();
	Room room4 = new Room();
	Room room5 = new Room();

	Expense expense = new Expense();
	ExpenseCategory expenseCategory = new ExpenseCategory();
	ExpenseCategory expenseCategory2 = new ExpenseCategory();

	Shift shift = new Shift();
	Designation designation = new Designation();
	Blog blog2 = new Blog();
	Blog blog3 = new Blog();
	Blog blog4 = new Blog();
	BlogCategory blogCategory = new BlogCategory();
	BlogCategory blogCategory1 = new BlogCategory();
	BlogCategory blogCategory2 = new BlogCategory();
	BlogCategory blogCategory3 = new BlogCategory();
	Gallery gallery = new Gallery();
	Gallery gallery2 = new Gallery();
	Gallery gallery3 = new Gallery();
	Gallery gallery4 = new Gallery();
	Offer offer = new Offer();
	Offer offer2 = new Offer();
	Offer offer3 = new Offer();
	EmailSetting emailSetting = new EmailSetting();
	Currency currency = new Currency();
	Notification notification = new Notification();
	Role role = new Role();
	Role role2 = new Role();
	Role role3 = new Role();
	User user3 = new User();
	Customer customer2 = new Customer();

	VAT vat = new VAT();
	Departement departement = new Departement();

	// translation

	AmenityI18n amenityI18n = new AmenityI18n();
	AmenityI18n amenityI18n2 = new AmenityI18n();
	AmenityI18n amenityI18n3 = new AmenityI18n();
	AmenityI18n amenityI18n4 = new AmenityI18n();
	AmenityI18n amenityI18n5 = new AmenityI18n();

	WebsiteMenuI18n websiteMenuI18n = new WebsiteMenuI18n();
	WebsiteMenuI18n websiteMenu2I18n = new WebsiteMenuI18n();
	WebsiteMenuI18n websiteMenu3I18n = new WebsiteMenuI18n();
	WebsiteMenuI18n websiteMenu4I18n = new WebsiteMenuI18n();
	WebsiteMenuI18n websiteMenu5I18n = new WebsiteMenuI18n();

	WebsiteHomeI18n websiteHomeI18n = new WebsiteHomeI18n();
	WebsiteHomeI18n websiteHomeI18n2 = new WebsiteHomeI18n();
	WebsiteHomeI18n websiteHomeI18n3 = new WebsiteHomeI18n();
	WebsiteHomeI18n websiteHomeI18n4 = new WebsiteHomeI18n();
	WebsiteHomeI18n websiteHomeI18n5 = new WebsiteHomeI18n();

	WebsiteAboutI18n websiteAboutI18n = new WebsiteAboutI18n();
	WebsiteAboutI18n websiteAboutI18n2 = new WebsiteAboutI18n();
	WebsiteAboutI18n websiteAboutI18n3 = new WebsiteAboutI18n();
	WebsiteAboutI18n websiteAboutI18n4 = new WebsiteAboutI18n();
	WebsiteAboutI18n websiteAboutI18n5 = new WebsiteAboutI18n();

	WebsiteBlogI18n websiteBlogI18n = new WebsiteBlogI18n();
	WebsiteBlogI18n websiteBlogI18n2 = new WebsiteBlogI18n();
	WebsiteBlogI18n websiteBlogI18n3 = new WebsiteBlogI18n();
	WebsiteBlogI18n websiteBlogI18n4 = new WebsiteBlogI18n();
	WebsiteBlogI18n websiteBlogI18n5 = new WebsiteBlogI18n();

	WebsiteContactI18n websiteContactI18n = new WebsiteContactI18n();
	WebsiteContactI18n websiteContactI18n2 = new WebsiteContactI18n();
	WebsiteContactI18n websiteContactI18n3 = new WebsiteContactI18n();
	WebsiteContactI18n websiteContactI18n4 = new WebsiteContactI18n();
	WebsiteContactI18n websiteContactI18n5 = new WebsiteContactI18n();

	WebsiteFooterI18n websiteFooterI18n = new WebsiteFooterI18n();
	WebsiteFooterI18n websiteFooterI18n2 = new WebsiteFooterI18n();
	WebsiteFooterI18n websiteFooterI18n3 = new WebsiteFooterI18n();
	WebsiteFooterI18n websiteFooterI18n4 = new WebsiteFooterI18n();
	WebsiteFooterI18n websiteFooterI18n5 = new WebsiteFooterI18n();

	WebsiteRoomI18n websiteRoomI18n = new WebsiteRoomI18n();
	WebsiteRoomI18n websiteRoomI18n2 = new WebsiteRoomI18n();
	WebsiteRoomI18n websiteRoomI18n3 = new WebsiteRoomI18n();
	WebsiteRoomI18n websiteRoomI18n4 = new WebsiteRoomI18n();
	WebsiteRoomI18n websiteRoomI18n5 = new WebsiteRoomI18n();

	WebsiteSignInI18n websiteSignInI18n = new WebsiteSignInI18n();
	WebsiteSignInI18n websiteSignInI18n2 = new WebsiteSignInI18n();
	WebsiteSignInI18n websiteSignInI18n3 = new WebsiteSignInI18n();
	WebsiteSignInI18n websiteSignInI18n4 = new WebsiteSignInI18n();
	WebsiteSignInI18n websiteSignInI18n5 = new WebsiteSignInI18n();

	WebsiteBookingRoomI18n websitebookingRoomI18n = new WebsiteBookingRoomI18n();
	WebsiteBookingRoomI18n websitebookingRoomI18n2 = new WebsiteBookingRoomI18n();
	WebsiteBookingRoomI18n websitebookingRoomI18n3 = new WebsiteBookingRoomI18n();
	WebsiteBookingRoomI18n websitebookingRoomI18n4 = new WebsiteBookingRoomI18n();
	WebsiteBookingRoomI18n websitebookingRoomI18n5 = new WebsiteBookingRoomI18n();

	BedI18n bedI18n = new BedI18n();
	BedI18n bedI18n2 = new BedI18n();
	BedI18n bedI18n3 = new BedI18n();
	BedI18n bedI18n4 = new BedI18n();
	BedI18n bedI18n5 = new BedI18n();

	BlogCategoryI18n blogCategoryI18n = new BlogCategoryI18n();
	BlogCategoryI18n blogCategoryI18n2 = new BlogCategoryI18n();
	BlogCategoryI18n blogCategoryI18n3 = new BlogCategoryI18n();
	BlogCategoryI18n blogCategoryI18n4 = new BlogCategoryI18n();
	BlogCategoryI18n blogCategoryI18n5 = new BlogCategoryI18n();

	BlogI18n blogI18n = new BlogI18n();
	BlogI18n blogI18n2 = new BlogI18n();
	BlogI18n blogI18n3 = new BlogI18n();
	BlogI18n blogI18n4 = new BlogI18n();
	BlogI18n blogI18n5 = new BlogI18n();

	CheckInI18n checkInI18n = new CheckInI18n();
	CheckInI18n checkInI18n2 = new CheckInI18n();
	CheckInI18n checkInI18n3 = new CheckInI18n();
	CheckInI18n checkInI18n4 = new CheckInI18n();
	CheckInI18n checkInI18n5 = new CheckInI18n();

	CountryI18n countryI18n = new CountryI18n();
	CountryI18n countryI18n2 = new CountryI18n();
	CountryI18n countryI18n3 = new CountryI18n();
	CountryI18n countryI18n4 = new CountryI18n();
	CountryI18n countryI18n5 = new CountryI18n();

	CurrencyI18n currencyI18n = new CurrencyI18n();
	CurrencyI18n currencyI18n2 = new CurrencyI18n();
	CurrencyI18n currencyI18n3 = new CurrencyI18n();
	CurrencyI18n currencyI18n4 = new CurrencyI18n();
	CurrencyI18n currencyI18n5 = new CurrencyI18n();

	CustomerI18n customerI18n = new CustomerI18n();
	CustomerI18n customerI18n2 = new CustomerI18n();
	CustomerI18n customerI18n3 = new CustomerI18n();
	CustomerI18n customerI18n4 = new CustomerI18n();
	CustomerI18n customerI18n5 = new CustomerI18n();

	DesignationI18n designationI18n = new DesignationI18n();
	DesignationI18n designationI18n2 = new DesignationI18n();
	DesignationI18n designationI18n3 = new DesignationI18n();
	DesignationI18n designationI18n4 = new DesignationI18n();
	DesignationI18n designationI18n5 = new DesignationI18n();

	EmployeeI18n employeeI18n = new EmployeeI18n();
	EmployeeI18n employeeI18n2 = new EmployeeI18n();
	EmployeeI18n employeeI18n3 = new EmployeeI18n();
	EmployeeI18n employeeI18n4 = new EmployeeI18n();
	EmployeeI18n employeeI18n5 = new EmployeeI18n();

	ExpenseI18n expenseI18n = new ExpenseI18n();
	ExpenseI18n expenseI18n2 = new ExpenseI18n();
	ExpenseI18n expenseI18n3 = new ExpenseI18n();
	ExpenseI18n expenseI18n4 = new ExpenseI18n();
	ExpenseI18n expenseI18n5 = new ExpenseI18n();

	ExpenseCategoryI18n expenseCategoryI18n = new ExpenseCategoryI18n();
	ExpenseCategoryI18n expenseCategoryI18n2 = new ExpenseCategoryI18n();
	ExpenseCategoryI18n expenseCategoryI18n3 = new ExpenseCategoryI18n();
	ExpenseCategoryI18n expenseCategoryI18n4 = new ExpenseCategoryI18n();
	ExpenseCategoryI18n expenseCategoryI18n5 = new ExpenseCategoryI18n();

	ExtraBedI18n extraBedI18n = new ExtraBedI18n();
	ExtraBedI18n extraBedI18n2 = new ExtraBedI18n();
	ExtraBedI18n extraBedI18n3 = new ExtraBedI18n();
	ExtraBedI18n extraBedI18n4 = new ExtraBedI18n();
	ExtraBedI18n extraBedI18n5 = new ExtraBedI18n();

	FoodI18n foodI18n = new FoodI18n();
	FoodI18n foodI18n2 = new FoodI18n();
	FoodI18n foodI18n3 = new FoodI18n();
	FoodI18n foodI18n4 = new FoodI18n();
	FoodI18n foodI18n5 = new FoodI18n();

	GalleryI18n galleryI18n = new GalleryI18n();
	GalleryI18n galleryI18n2 = new GalleryI18n();
	GalleryI18n galleryI18n3 = new GalleryI18n();
	GalleryI18n galleryI18n4 = new GalleryI18n();
	GalleryI18n galleryI18n5 = new GalleryI18n();

	GuestTypeI18n guestTypeI18n = new GuestTypeI18n();
	GuestTypeI18n guestTypeI18n2 = new GuestTypeI18n();
	GuestTypeI18n guestTypeI18n3 = new GuestTypeI18n();
	GuestTypeI18n guestTypeI18n4 = new GuestTypeI18n();
	GuestTypeI18n guestTypeI18n5 = new GuestTypeI18n();

	InformationHotelI18n informationHotelI18n = new InformationHotelI18n();
	InformationHotelI18n informationHotelI18n2 = new InformationHotelI18n();
	InformationHotelI18n informationHotelI18n3 = new InformationHotelI18n();
	InformationHotelI18n informationHotelI18n4 = new InformationHotelI18n();
	InformationHotelI18n informationHotelI18n5 = new InformationHotelI18n();

	MessageI18n messageI18n = new MessageI18n();
	MessageI18n messageI18n2 = new MessageI18n();
	MessageI18n messageI18n3 = new MessageI18n();
	MessageI18n messageI18n4 = new MessageI18n();
	MessageI18n messageI18n5 = new MessageI18n();

	OfferI18n offerI18n = new OfferI18n();
	OfferI18n offerI18n2 = new OfferI18n();
	OfferI18n offerI18n3 = new OfferI18n();
	OfferI18n offerI18n4 = new OfferI18n();
	OfferI18n offerI18n5 = new OfferI18n();

	RoomI18n roomI18n = new RoomI18n();
	RoomI18n roomI18n2 = new RoomI18n();
	RoomI18n roomI18n3 = new RoomI18n();
	RoomI18n roomI18n4 = new RoomI18n();
	RoomI18n roomI18n5 = new RoomI18n();

	RoomTypeI18n roomTypeI18n = new RoomTypeI18n();
	RoomTypeI18n roomTypeI18n2 = new RoomTypeI18n();
	RoomTypeI18n roomTypeI18n3 = new RoomTypeI18n();
	RoomTypeI18n roomTypeI18n4 = new RoomTypeI18n();
	RoomTypeI18n roomTypeI18n5 = new RoomTypeI18n();

	ShiftI18n shiftI18n = new ShiftI18n();
	ShiftI18n shiftI18n2 = new ShiftI18n();
	ShiftI18n shiftI18n3 = new ShiftI18n();
	ShiftI18n shiftI18n4 = new ShiftI18n();
	ShiftI18n shiftI18n5 = new ShiftI18n();

	UserI18n userI18n = new UserI18n();
	UserI18n userI18n2 = new UserI18n();
	UserI18n userI18n3 = new UserI18n();
	UserI18n userI18n4 = new UserI18n();
	UserI18n userI18n5 = new UserI18n();

	CityI18n cityI18n = new CityI18n();
	CityI18n cityI18n2 = new CityI18n();
	CityI18n cityI18n3 = new CityI18n();
	CityI18n cityI18n4 = new CityI18n();
	CityI18n cityI18n5 = new CityI18n();

	UIMenuI18n menuI18n = new UIMenuI18n();
	UIMenuI18n menuI18n2 = new UIMenuI18n();
	UIMenuI18n menuI18n3 = new UIMenuI18n();
	UIMenuI18n menuI18n4 = new UIMenuI18n();
	UIMenuI18n menuI18n5 = new UIMenuI18n();

	UIHeaderI18n headerI18n = new UIHeaderI18n();
	UIHeaderI18n headerI18n2 = new UIHeaderI18n();
	UIHeaderI18n headerI18n3 = new UIHeaderI18n();
	UIHeaderI18n headerI18n4 = new UIHeaderI18n();
	UIHeaderI18n headerI18n5 = new UIHeaderI18n();

	SubscriberI18n subscriberI18n = new SubscriberI18n();
	SubscriberI18n subscriberI18n2 = new SubscriberI18n();
	SubscriberI18n subscriberI18n3 = new SubscriberI18n();
	SubscriberI18n subscriberI18n4 = new SubscriberI18n();
	SubscriberI18n subscriberI18n5 = new SubscriberI18n();

	EmailI18n emailI18n = new EmailI18n();
	EmailI18n emailI18n2 = new EmailI18n();
	EmailI18n emailI18n3 = new EmailI18n();
	EmailI18n emailI18n4 = new EmailI18n();
	EmailI18n emailI18n5 = new EmailI18n();

	FoodCategoryI18n foodCategoryI18n = new FoodCategoryI18n();
	FoodCategoryI18n foodCategoryI18n2 = new FoodCategoryI18n();
	FoodCategoryI18n foodCategoryI18n3 = new FoodCategoryI18n();
	FoodCategoryI18n foodCategoryI18n4 = new FoodCategoryI18n();
	FoodCategoryI18n foodCategoryI18n5 = new FoodCategoryI18n();

	PaymentI18n paymentI18n = new PaymentI18n();
	PaymentI18n paymentI18n2 = new PaymentI18n();
	PaymentI18n paymentI18n3 = new PaymentI18n();
	PaymentI18n paymentI18n4 = new PaymentI18n();
	PaymentI18n paymentI18n5 = new PaymentI18n();

	PaymentMethodI18n paymentMethodI18n = new PaymentMethodI18n();
	PaymentMethodI18n paymentMethodI18n2 = new PaymentMethodI18n();
	PaymentMethodI18n paymentMethodI18n3 = new PaymentMethodI18n();
	PaymentMethodI18n paymentMethodI18n4 = new PaymentMethodI18n();
	PaymentMethodI18n paymentMethodI18n5 = new PaymentMethodI18n();

	HouseKeepingItemI18n houseKeepingItemI18n = new HouseKeepingItemI18n();
	HouseKeepingItemI18n houseKeepingItemI18n2 = new HouseKeepingItemI18n();
	HouseKeepingItemI18n houseKeepingItemI18n3 = new HouseKeepingItemI18n();
	HouseKeepingItemI18n houseKeepingItemI18n4 = new HouseKeepingItemI18n();
	HouseKeepingItemI18n houseKeepingItemI18n5 = new HouseKeepingItemI18n();

	FoodOrderI18n foodOrderI18n = new FoodOrderI18n();
	FoodOrderI18n foodOrderI18n2 = new FoodOrderI18n();
	FoodOrderI18n foodOrderI18n3 = new FoodOrderI18n();
	FoodOrderI18n foodOrderI18n4 = new FoodOrderI18n();
	FoodOrderI18n foodOrderI18n5 = new FoodOrderI18n();

	HouseKeepingOrderI18n houseKeepingOrderI18n = new HouseKeepingOrderI18n();
	HouseKeepingOrderI18n houseKeepingOrderI18n2 = new HouseKeepingOrderI18n();
	HouseKeepingOrderI18n houseKeepingOrderI18n3 = new HouseKeepingOrderI18n();
	HouseKeepingOrderI18n houseKeepingOrderI18n4 = new HouseKeepingOrderI18n();
	HouseKeepingOrderI18n houseKeepingOrderI18n5 = new HouseKeepingOrderI18n();


	LaundryOrderI18n laundryOrderI18n = new LaundryOrderI18n();
	LaundryOrderI18n laundryOrderI18n2 = new LaundryOrderI18n();
	LaundryOrderI18n laundryOrderI18n3 = new LaundryOrderI18n();
	LaundryOrderI18n laundryOrderI18n4 = new LaundryOrderI18n();
	LaundryOrderI18n laundryOrderI18n5 = new LaundryOrderI18n();



	FoodRequestI18n foodRequestI18n = new FoodRequestI18n();
	FoodRequestI18n foodRequestI18n2 = new FoodRequestI18n();
	FoodRequestI18n foodRequestI18n3 = new FoodRequestI18n();
	FoodRequestI18n foodRequestI18n4 = new FoodRequestI18n();
	FoodRequestI18n foodRequestI18n5 = new FoodRequestI18n();



	HouseKeepingRequestI18n houseKeepingRequestI18n = new HouseKeepingRequestI18n();
	HouseKeepingRequestI18n houseKeepingRequestI18n2 = new HouseKeepingRequestI18n();
	HouseKeepingRequestI18n houseKeepingRequestI18n3 = new HouseKeepingRequestI18n();
	HouseKeepingRequestI18n houseKeepingRequestI18n4 = new HouseKeepingRequestI18n();
	HouseKeepingRequestI18n houseKeepingRequestI18n5 = new HouseKeepingRequestI18n();



	LaundryRequestI18n laundryRequestI18n = new LaundryRequestI18n();
	LaundryRequestI18n laundryRequestI18n2 = new LaundryRequestI18n();
	LaundryRequestI18n laundryRequestI18n3 = new LaundryRequestI18n();
	LaundryRequestI18n laundryRequestI18n4 = new LaundryRequestI18n();
	LaundryRequestI18n laundryRequestI18n5 = new LaundryRequestI18n();


	LaundryItemI18n laundryItemI18n = new LaundryItemI18n();
	LaundryItemI18n laundryItemI18n2 = new LaundryItemI18n();
	LaundryItemI18n laundryItemI18n3 = new LaundryItemI18n();
	LaundryItemI18n laundryItemI18n4 = new LaundryItemI18n();
	LaundryItemI18n laundryItemI18n5 = new LaundryItemI18n();

	DepartementI18n departementI18n = new DepartementI18n();
	DepartementI18n departementI18n2 = new DepartementI18n();
	DepartementI18n departementI18n3 = new DepartementI18n();
	DepartementI18n departementI18n4 = new DepartementI18n();
	DepartementI18n departementI18n5 = new DepartementI18n();

	ExtraBedRequestI18n extraBedRequestI18n = new ExtraBedRequestI18n();
	ExtraBedRequestI18n extraBedRequestI18n2 = new ExtraBedRequestI18n();
	ExtraBedRequestI18n extraBedRequestI18n3 = new ExtraBedRequestI18n();
	ExtraBedRequestI18n extraBedRequestI18n4 = new ExtraBedRequestI18n();
	ExtraBedRequestI18n extraBedRequestI18n5 = new ExtraBedRequestI18n();

	public void populate();
}
