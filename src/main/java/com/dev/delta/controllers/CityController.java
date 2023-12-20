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

import com.dev.delta.entities.City;
import com.dev.delta.i18n.entities.CityI18n;
import com.dev.delta.i18n.repositories.CityI18nRepository;
import com.dev.delta.i18n.repositories.UIHeaderI18nRepository;
import com.dev.delta.i18n.repositories.UIMenuI18nRepository;

import com.dev.delta.repositories.MessageRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.services.CityService;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class CityController {
	/**
	 * cityService
	 */
	@Autowired
	private CityService cityService;

	@Autowired
	CityI18nRepository cityI18nRepository;

	@Autowired
	InformationService informationService;

	@Autowired
	UIMenuI18nRepository menuI18nRepository;


	@Autowired
	MessageRepository messageRepository;

	@Autowired
	NotificationRepository notificationRepository;


	@Autowired
	UIHeaderI18nRepository headerI18nRepository;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/add-city")
	public String getaddCity(Model model, City city) {
		String lang = informationService.getSeletedLang();
		CityI18n cityI18n = cityI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "city/add";
	}

	/**
	 * getCitys
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/cities")
	public String getCitys(Model model) {
		List<City> citys = cityService.getCitys();
		String lang = informationService.getSeletedLang();
		CityI18n cityI18n = cityI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		model.addAttribute("items", citys);
		menuHeaderUtil.getMenuHeader(model);
		return "city/cities";
	}

	/**
	 * addCity
	 * 
	 * @param city
	 * @return
	 */
	@PostMapping("/addcity")

	public String addCity(@Validated City city, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "city/add";
		}
		cityService.save(city);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editcity/{id}")
	public String findById(@PathVariable("id") long id, Model model, City city) {
		City cityy = cityService.findById(id).get();
		String lang = informationService.getSeletedLang();
		CityI18n cityI18n = cityI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		model.addAttribute("item", cityy);
		menuHeaderUtil.getMenuHeader(model);

		return "city/edit";
	}

	/**
	 * updateCity
	 * 
	 * @param id
	 * @param city
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatecity/{id}")
	public String updateCity(@PathVariable("id") long id, @Validated City city, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return this.findById(id, model, city);
		}

		cityService.save(city);
		return "redirect:/cities";
	}

	/**
	 * deleteCity
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletecity/{id}")
	@Transactional
	public String deleteCity(@PathVariable("id") Long id) {
		cityService.delete(id);
		return "redirect:/cities";
	}
}
