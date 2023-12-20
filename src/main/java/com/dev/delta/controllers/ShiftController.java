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

import com.dev.delta.entities.Shift;
import com.dev.delta.i18n.entities.ShiftI18n;
import com.dev.delta.i18n.repositories.ShiftI18nRepository;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.ShiftService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class ShiftController {
	/**
	 * shiftService
	 */
	@Autowired
	private ShiftService shiftService;

	@Autowired
	InformationService informationService;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	ShiftI18nRepository shiftI18nRepository;

	@GetMapping("/add-shift")
	public String getaddShift(Model model) {
		String lang = informationService.getSeletedLang();
		ShiftI18n cityI18n = shiftI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "shift/add";
	}

	/**
	 * getShifts
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/shifts")
	public String getShifts(Model model) {
		List<Shift> shifts = shiftService.getShifts();

		model.addAttribute("items", shifts);
		String lang = informationService.getSeletedLang();
		ShiftI18n cityI18n = shiftI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "shift/shifts";
	}

	/**
	 * addShift
	 * 
	 * @param shift
	 * @return
	 */
	@PostMapping("/addshift")
	public String addShift(Shift shift) {
		shiftService.save(shift);
		return "redirect:/shifts";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editshift/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		Shift shift = shiftService.findById(id).get();
		model.addAttribute("item", shift);
		String lang = informationService.getSeletedLang();
		ShiftI18n cityI18n = shiftI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "shift/edit";
	}

	/**
	 * updateShift
	 * 
	 * @param id
	 * @param shift
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateshift/{id}")
	public String updateShift(@PathVariable("id") long id, @Validated Shift shift, BindingResult result, Model model) {

		shiftService.save(shift);
		return "redirect:/shifts";
	}

	/**
	 * deleteShift
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteshift/{id}")
	@Transactional
	public String deleteShift(@PathVariable("id") Long id) {
		shiftService.delete(id);
		return "redirect:/shifts";
	}
}
