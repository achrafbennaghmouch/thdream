package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.InformationHotel;
import com.dev.delta.i18n.entities.InformationHotelI18n;
import com.dev.delta.i18n.repositories.InformationI18nRepository;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class InformationController {

	@Autowired
	InformationService informationService;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	InformationI18nRepository informationI18nRepository;

	@GetMapping("/informationsadmin")
	public String getInformations(Model model) {
		List<InformationHotel> infos = informationService.getInformations();
		model.addAttribute("items", infos);
		String lang = informationService.getSeletedLang();
		InformationHotelI18n infoI18n = informationI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", infoI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "information/informations";
	}

	@RequestMapping("/hotel/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		InformationHotel hotel = informationService.findById(id);
		model.addAttribute("item", hotel);
		String lang = informationService.getSeletedLang();
		InformationHotelI18n infoI18n = informationI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", infoI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "information/view";
	}

	@RequestMapping("/editinformation/{id}")
	public String findHotelById(@PathVariable("id") Long id, Model model) {
		InformationHotel hotel = informationService.findById(id);
		model.addAttribute("item", hotel);
		String lang = informationService.getSeletedLang();
		InformationHotelI18n infoI18n = informationI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", infoI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "information/edit";
	}
}
