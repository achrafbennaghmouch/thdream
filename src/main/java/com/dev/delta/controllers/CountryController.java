package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Country;
import com.dev.delta.i18n.entities.CountryI18n;
import com.dev.delta.i18n.repositories.CountryI18nRepository;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class CountryController {
	/**
	 * countryService
	 */
	@Autowired
	private CountryService countryService;

	@Autowired
	InformationService informationService;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	CountryI18nRepository countryI18nRepository;

	@GetMapping("/add-country")
	public String getaddCountry(Country country, Model model) {
		String lang = informationService.getSeletedLang();
		CountryI18n countryI18n = countryI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", countryI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "country/add";
	}

	/**
	 * getCountrys
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/countries")
	public String getCountrys(Model model) {
		List<Country> countrys = countryService.getCountrys();
		model.addAttribute("items", countrys);
		String lang = informationService.getSeletedLang();
		CountryI18n countryI18n = countryI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", countryI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "country/countries";
	}

	/**
	 * addCountry
	 * 
	 * @param country
	 * @return
	 */
	@PostMapping("/addcountry")

	public String addCountry(@Valid Country country, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "country/add";
		}

		countryService.save(country);
		return "redirect:/countries";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editcountry/{id}")
	public String findById(@PathVariable("id") Long id, Model model, Country country) {
		Country countryy = countryService.findById(id).get();
		model.addAttribute("item", countryy);
		String lang = informationService.getSeletedLang();
		CountryI18n countryI18n = countryI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", countryI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "country/edit";
	}

	/**
	 * updateCountry
	 * 
	 * @param id
	 * @param country
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatecountry/{id}")
	public String updateCountry(@PathVariable("id") long id, @Validated Country country, BindingResult result,
			Model model) {

		if (result.hasErrors()) {
			return this.findById(id, model, country);
		}

		countryService.save(country);
		return "redirect:/countries";
	}

	/**
	 * deleteCountry
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletecountry/{id}")
	@Transactional
	public String deleteCountry(@PathVariable("id") Long id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
}
