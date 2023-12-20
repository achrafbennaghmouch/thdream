package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Customer;
import com.dev.delta.i18n.entities.CustomerI18n;
import com.dev.delta.i18n.repositories.CustomerI18nRepository;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.CustomerService;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class CustomerController {
	/**
	 * customerService
	 */
	@Autowired
	private CustomerService customerService;

	@Autowired
	private CityService cityService;

	@Autowired
	private CountryService countryService;
	@Autowired
	InformationService informationService;
	@Autowired
	CustomerI18nRepository customerI18nRepository;
	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/add-customer")
	public String getaddCustomer(Model model) {

		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("countries", countryService.getCountrys());
		String lang = informationService.getSeletedLang();
		CustomerI18n cityI18n = customerI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "customer/add";
	}

	/**
	 * getCustomers
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/customers")
	public String getCustomers(Model model) {
		List<Customer> customers = customerService.getCustomers();

		model.addAttribute("items", customers);
		String lang = informationService.getSeletedLang();
		CustomerI18n cityI18n = customerI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "customer/customers";
	}

	/**
	 * addCustomer
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping("/addcustomer")

	public String addCustomer(Customer customer) {
		customerService.save(customer);
		return "redirect:/customers";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/customer/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Customer customer = customerService.findById(id).get();
		model.addAttribute("item", customer);
		String lang = informationService.getSeletedLang();
		CustomerI18n cityI18n = customerI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "customer/view";
	}

	@RequestMapping("/editcustomer/{id}")
	public String finCustomerdById(@PathVariable("id") Long id, Model model) {
		Customer customer = customerService.findById(id).get();
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("item", customer);
		String lang = informationService.getSeletedLang();
		CustomerI18n cityI18n = customerI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "customer/edit";
	}

	/**
	 * updateCustomer
	 * 
	 * @param id
	 * @param customer
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatecustomer/{id}")
	public String updateCustomer(@PathVariable("id") long id, @Validated Customer customer, BindingResult result,
			Model model) {

		customerService.save(customer);
		return "redirect:/customers";
	}

	/**
	 * deleteCustomer
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletecustomer/{id}")
	@Transactional
	public String deleteCustomer(@PathVariable("id") Long id) {
		customerService.delete(id);
		return "redirect:/customers";
	}

}
