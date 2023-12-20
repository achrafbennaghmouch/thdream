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

import com.dev.delta.entities.GuestType;
import com.dev.delta.i18n.entities.GuestTypeI18n;
import com.dev.delta.i18n.repositories.GuestTypeI18nRepository;
import com.dev.delta.services.GuestTypeService;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class GuestTypeController {
	/**
	 * guesTypeService
	 */
	@Autowired
	private GuestTypeService guesTypeService;

	@Autowired
	GuestTypeI18nRepository guestTypeI18nRepository;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	InformationService informationService;

	@GetMapping("/add-guesttype")
	public String getaddGuestType(Model model) {
		String lang = informationService.getSeletedLang();
		GuestTypeI18n cityI18n = guestTypeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "guesttype/add";
	}

	/**
	 * getGuestTypes
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/guesttypes")
	public String getGuestTypes(Model model) {
		List<GuestType> guesTypes = guesTypeService.getGuestTypes();
		model.addAttribute("items", guesTypes);
		String lang = informationService.getSeletedLang();
		GuestTypeI18n cityI18n = guestTypeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "guesttype/guesttypes";
	}

	/**
	 * addGuestType
	 * 
	 * @param guesType
	 * @return
	 */
	@PostMapping("/addguesttype")

	public String addGuestType(GuestType guesType) {
		guesTypeService.save(guesType);
		return "redirect:/guesttypes";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editguesttype/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		GuestType guesType = guesTypeService.findById(id).get();
		model.addAttribute("item", guesType);
		String lang = informationService.getSeletedLang();
		GuestTypeI18n cityI18n = guestTypeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "guesttype/edit";
	}

	/**
	 * updateGuestType
	 * 
	 * @param id
	 * @param guesType
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateguesttype/{id}")
	public String updateGuestType(@PathVariable("id") long id, @Validated GuestType guesType, BindingResult result,
			Model model) {

		guesTypeService.save(guesType);
		return "redirect:/guesttypes";
	}

	/**
	 * deleteGuestType
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteguesttype/{id}")
	@Transactional
	public String deleteGuestType(@PathVariable("id") Long id) {
		guesTypeService.delete(id);
		return "redirect:/guesttypes";
	}
}
