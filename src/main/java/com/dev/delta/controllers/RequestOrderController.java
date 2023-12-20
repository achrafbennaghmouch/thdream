package com.dev.delta.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.Customer;




import com.dev.delta.entities.User;
import com.dev.delta.i18n.entities.ExtraBedI18n;
import com.dev.delta.i18n.entities.ExtraBedRequestI18n;
import com.dev.delta.i18n.entities.FoodOrderI18n;
import com.dev.delta.i18n.entities.FoodRequestI18n;
import com.dev.delta.i18n.entities.HouseKeepingOrderI18n;
import com.dev.delta.i18n.entities.HouseKeepingRequestI18n;
import com.dev.delta.i18n.entities.LaundryOrderI18n;
import com.dev.delta.i18n.repositories.ExtraBedI18nRepository;
import com.dev.delta.i18n.repositories.ExtraBedRequestI18nRepository;
import com.dev.delta.i18n.repositories.FoodOrderI18nRepository;
import com.dev.delta.i18n.repositories.FoodRequestI18nRepository;
import com.dev.delta.i18n.repositories.HouseKeepingOrderI18nRepository;
import com.dev.delta.i18n.repositories.HouseKeepingRequestI18nRepository;
import com.dev.delta.i18n.repositories.LaundryOrderI18nRepository;
import com.dev.delta.repositories.CheckInRepository;
import com.dev.delta.repositories.CustomerRepository;



import com.dev.delta.security.UserPrincipal;

import com.dev.delta.services.InformationService;

import com.dev.delta.services.RoomService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class RequestOrderController {



	@Autowired
	RoomService roomService;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CheckInRepository checkInRepository;


	@Autowired
	InformationService informationService;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	HouseKeepingOrderI18nRepository houseKeepingOrderI18nRepository;

	@Autowired
	LaundryOrderI18nRepository laundryOrderI18nRepository;

	@Autowired
	FoodOrderI18nRepository foodOrderI18nRepository;

	@Autowired
	ExtraBedI18nRepository extraBedI18nRepository;







	@Autowired
	HouseKeepingRequestI18nRepository houseKeepingRequestI18nRepository;

	@Autowired
	ExtraBedRequestI18nRepository extraBedRequestI18nRepository;

	@Autowired
	FoodRequestI18nRepository foodRequestI18nRepository;

	@GetMapping("/extrabedrequest")
	public String getextrabedsRequest(Model model) {


		String lang = informationService.getSeletedLang();
		ExtraBedI18n houseI18n = extraBedI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "request/extrabedrequest";
	}

	@GetMapping("/foodrequest")
	public String getFoodRequest(Model model) {


		String lang = informationService.getSeletedLang();
		FoodOrderI18n houseI18n = foodOrderI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "request/foodrequestorder";
	}

	@GetMapping("/housekeepingrequest")
	public String getHouseKeepingRequest(Model model) {


		String lang = informationService.getSeletedLang();
		HouseKeepingOrderI18n houseI18n = houseKeepingOrderI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "request/housekeepingrequestorder";
	}

	@GetMapping("/laundryrequest")
	public String getLaundryOrderRequest(Model model) {


		String lang = informationService.getSeletedLang();
		LaundryOrderI18n houseI18n = laundryOrderI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "request/laundryrequestorder";
	}

	@GetMapping("/addlaundryorder")
	public String addLaundryOrder(Model model) {
		menuHeaderUtil.getMenuHeader(model);

		return "orderrequest/addlaundryorder";
	}

	public Customer getCustomer() {
		UserPrincipal principal = (UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = principal.getUser();
		Customer customer = customerRepository.findByUser(user);
		System.err.println(customer);
		return customer;
	}

	public List<CheckIn> getByCustomer(Customer customer) {
		return checkInRepository.findByCutomer(customer);
	}

	@GetMapping("/addhousekeepingorder")
	public String addHouseKeepingOrder(Model model) {
		model.addAttribute("rooms", roomService.getRooms());
		model.addAttribute("customer", getCustomer());
		menuHeaderUtil.getMenuHeader(model);

		String lang = informationService.getSeletedLang();
		HouseKeepingRequestI18n houseI18n = houseKeepingRequestI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);

		return "orderrequest/addhousekeepingorder";
	}

	@GetMapping("/addextrabedorder")
	public String addExtraBedOrder(Model model) {

		String lang = informationService.getSeletedLang();
		ExtraBedRequestI18n houseI18n = extraBedRequestI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);

		model.addAttribute("customer", getCustomer());
		model.addAttribute("rooms", roomService.getRooms());
		menuHeaderUtil.getMenuHeader(model);

		return "orderrequest/addextrabedorder";
	}

	@GetMapping("/addfoodorder")
	public String addFoodOrder(Model model) {

		model.addAttribute("customer", getCustomer());
		model.addAttribute("rooms", roomService.getRooms());
		menuHeaderUtil.getMenuHeader(model);

		String lang = informationService.getSeletedLang();
		FoodRequestI18n foodI18n = foodRequestI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", foodI18n);

		return "orderrequest/addfoodorder";
	}









}
