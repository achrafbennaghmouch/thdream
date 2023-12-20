package com.dev.delta;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


import com.dev.delta.dto.BlogCategoryDTO;
import com.dev.delta.dto.BlogDTO;
import com.dev.delta.dto.CheckInDTO;
import com.dev.delta.dto.CityDTO;
import com.dev.delta.dto.CountryDTO;
import com.dev.delta.dto.CurrencyDTO;
import com.dev.delta.dto.CustomerDTO;
import com.dev.delta.dto.DepartementDTO;
import com.dev.delta.dto.DesignationDTO;
import com.dev.delta.dto.EmailDTO;
import com.dev.delta.dto.EmployeeDTO;
import com.dev.delta.dto.ExpenseCategoryDTO;
import com.dev.delta.dto.ExpenseDTO;

import com.dev.delta.dto.GalleryDTO;
import com.dev.delta.dto.GuestTypeDTO;
import com.dev.delta.dto.HeaderDTO;

import com.dev.delta.dto.InformationHotelDTO;

import com.dev.delta.dto.MenuDTO;
import com.dev.delta.dto.MessageDTO;
import com.dev.delta.dto.OfferDTO;
import com.dev.delta.dto.PaymentDTO;
import com.dev.delta.dto.PaymentMethodDTO;
import com.dev.delta.dto.RoleDTO;
import com.dev.delta.dto.RoomDTO;
import com.dev.delta.dto.RoomTypeDTO;
import com.dev.delta.dto.ShiftDTO;
import com.dev.delta.dto.SubscriberDTO;
import com.dev.delta.dto.UserDTO;
import com.dev.delta.dto.VatDTO;
import com.dev.delta.dto.WebsiteDTO;
import com.dev.delta.services.InformationService;

@SpringBootApplication
public class thedreamApplication implements CommandLineRunner {

	@Autowired
	UserDTO userDTO;

	@Autowired
	InformationHotelDTO informationHotelDTO;

	@Autowired
	CheckInDTO checkInDTO;

	@Autowired
	RoomTypeDTO roomTypeDTO;


	@Autowired
	GuestTypeDTO guestTypeDTO;

	@Autowired
	CityDTO cityDTO;

	@Autowired
	CountryDTO countryDTO;

	@Autowired
	BlogDTO blogDTO;

	@Autowired
	CustomerDTO customerDTO;

	@Autowired
	RoomDTO roomDTO;



	@Autowired
	ExpenseDTO expenseDTO;

	@Autowired
	ExpenseCategoryDTO expenseCategoryDTO;


	@Autowired
	ShiftDTO shiftDTO;

	@Autowired
	DesignationDTO designationDTO;

	@Autowired
	BlogCategoryDTO blogCategoryDTO;

	@Autowired
	GalleryDTO galleryDTO;

	@Autowired
	OfferDTO offerDTO;

	@Autowired
	EmailDTO emailDTO;

	@Autowired
	CurrencyDTO currencyDTO;

	@Autowired
	RoleDTO roleDTO;

	@Autowired
	WebsiteDTO websiteDTO;

	@Autowired
	InformationService informationService;

	@Value("${system.lang}")
	String lang;

	@Autowired
	MenuDTO menuDTO;
	// Read server.port from app.prop

	@Autowired
	HeaderDTO headerDTO;

	@Autowired
	SubscriberDTO subscriberDTO;

	@Autowired
	PaymentDTO paymentDTO;

	@Autowired
	PaymentMethodDTO paymentMethodDTO;


	@Autowired
	EmployeeDTO employeeDTO;

	@Autowired
	DepartementDTO departementDTO;



	@Autowired
	MessageDTO messageDTO;

	@Autowired
	VatDTO vatDTO;

	public static void main(String[] args) {
		SpringApplication.run(thedreamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		roleDTO.populate();
		userDTO.populate();
		blogCategoryDTO.populate();

		informationHotelDTO.populate();
		roomTypeDTO.populate();
		guestTypeDTO.populate();
		cityDTO.populate();
		countryDTO.populate();
		blogDTO.populate();
		customerDTO.populate();
		roomDTO.populate();


		expenseCategoryDTO.populate();
		expenseDTO.populate();


		shiftDTO.populate();
		designationDTO.populate();
		galleryDTO.populate();
		offerDTO.populate();
		emailDTO.populate();
		currencyDTO.populate();
		websiteDTO.populate();
		checkInDTO.populate();
		menuDTO.populate();
		headerDTO.populate();
		subscriberDTO.populate();
		paymentDTO.populate();
		paymentMethodDTO.populate();

		employeeDTO.populate();
		departementDTO.populate();

		messageDTO.populate();
		vatDTO.populate();

	}

	/**
	 * 
	 * @return
	 */

	@Bean
	public SessionLocaleResolver localeResolver() {
		Locale arabicLocale = new Locale.Builder().setLanguageTag("ar-SA-u-nu-arab").build();
		SessionLocaleResolver slr = new SessionLocaleResolver();
		if (lang.equals("en")) {
			slr.setDefaultLocale(Locale.ENGLISH);
		} else if (lang.equals("ar")) {

			slr.setDefaultLocale(arabicLocale);
		}

		return slr;
	}

}
