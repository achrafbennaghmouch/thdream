package com.dev.delta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.InformationHotel;
import com.dev.delta.i18n.repositories.WebsiteFooterI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteMenuI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteSignInI18nRepository;
import com.dev.delta.services.InformationService;

@Controller
public class AuthController {

	@Autowired
	InformationService informationService;

	@Autowired
	WebsiteMenuI18nRepository websiteMenuI18nRepository;

	@Autowired
	WebsiteSignInI18nRepository websiteSignInI18nRepository;

	@Autowired
	WebsiteFooterI18nRepository websiteFooterI18nRepository;

	@GetMapping("/login")
	public String login(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id);
		String lang = informationHotel.getLang();
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("menu", websiteMenuI18nRepository.findByLang(lang));
		model.addAttribute("login", websiteSignInI18nRepository.findByLang(lang));
		model.addAttribute("footer", websiteFooterI18nRepository.findByLang(lang));
		return "auth/login";
	}

}
