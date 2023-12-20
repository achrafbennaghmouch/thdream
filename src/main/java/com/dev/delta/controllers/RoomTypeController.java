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

import com.dev.delta.entities.RoomType;
import com.dev.delta.i18n.entities.RoomTypeI18n;
import com.dev.delta.i18n.repositories.RoomTypeI18nRepository;
import com.dev.delta.repositories.CurrencyRepository;

import com.dev.delta.services.InformationService;
import com.dev.delta.services.RoomTypeService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class RoomTypeController {
	/**
	 * roomTypeService
	 */
	@Autowired
	private RoomTypeService roomTypeService;

	@Autowired
	InformationService informationService;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired

	RoomTypeI18nRepository roomTypeI18nRepository;

	@Autowired
	CurrencyRepository currencyRepository;


	@GetMapping("/add-roomtype")
	public String getaddRoomType(Model model) {

		String lang = informationService.getSeletedLang();
		RoomTypeI18n cityI18n = roomTypeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "roomtype/add";
	}

	/**
	 * getRoomTypes
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/roomtypes")
	public String getRoomTypes(Model model) {
		List<RoomType> roomTypes = roomTypeService.getRoomTypes();
		String lang = informationService.getSeletedLang();
		RoomTypeI18n cityI18n = roomTypeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);

		model.addAttribute("items", roomTypes);

		return "roomType/roomtypes";
	}

	/**
	 * addRoomType
	 * 
	 * @param roomType
	 * @return
	 */
	@PostMapping("/addroomtype")

	public String addRoomType(RoomType roomType) {
		roomTypeService.save(roomType);
		return "redirect:/roomtypes";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/roomtype/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		RoomType roomType = roomTypeService.findById(id);
		model.addAttribute("item", roomType);
		String lang = informationService.getSeletedLang();
		RoomTypeI18n cityI18n = roomTypeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);

		model.addAttribute("currency", currencyRepository.findById(1L).get());
		return "roomtype/view";
	}

	@RequestMapping("/editroomtype/{id}")
	public String findRoomTypeById(@PathVariable("id") Long id, Model model) {
		RoomType roomType = roomTypeService.findById(id);

		model.addAttribute("item", roomType);
		String lang = informationService.getSeletedLang();
		RoomTypeI18n cityI18n = roomTypeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "roomtype/edit";
	}

	/**
	 * updateRoomType
	 * 
	 * @param id
	 * @param roomType
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateroomtype/{id}")
	public String updateRoomType(@PathVariable("id") long id, @Validated RoomType roomType, BindingResult result,
			Model model) {

		roomTypeService.save(roomType);
		return "redirect:/roomtypes";
	}

	/**
	 * deleteRoomType
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteroomtype/{id}")
	@Transactional
	public String deleteRoomType(@PathVariable("id") Long id) {
		roomTypeService.delete(id);
		return "redirect:/roomtypes";
	}
}
