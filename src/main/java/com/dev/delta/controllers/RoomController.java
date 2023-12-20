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

import com.dev.delta.entities.Room;
import com.dev.delta.i18n.entities.RoomI18n;
import com.dev.delta.i18n.repositories.RoomI18nRepository;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.RoomService;
import com.dev.delta.services.RoomTypeService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class RoomController {
	/**
	 * roomService
	 */
	@Autowired
	private RoomService roomService;

	@Autowired
	private RoomTypeService roomTypeService;

	@Autowired
	InformationService informationService;

	@Autowired
	RoomI18nRepository roomI18nRepository;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/add-room")
	public String getaddRoom(Model model) {
		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
		String lang = informationService.getSeletedLang();
		RoomI18n roomI18n = roomI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", roomI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "room/add";
	}

	/**
	 * getRooms
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/rooms")
	public String getRooms(Model model) {
		List<Room> rooms = roomService.getRooms();
		String lang = informationService.getSeletedLang();
		RoomI18n roomI18n = roomI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", roomI18n);
		menuHeaderUtil.getMenuHeader(model);
		model.addAttribute("items", rooms);

		return "room/rooms";
	}

	/**
	 * addRoom
	 * 
	 * @param room
	 * @return
	 */
	@PostMapping("/addroom")

	public String addRoom(Room room) {
		roomService.save(room);
		return "redirect:/rooms";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/room/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Room room = roomService.findById(id).get();
		model.addAttribute("item", room);
		String lang = informationService.getSeletedLang();
		RoomI18n roomI18n = roomI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", roomI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "room/view";
	}

	@RequestMapping("/editroom/{id}")
	public String findRoomById(@PathVariable("id") Long id, Model model) {
		Room room = roomService.findById(id).get();
		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
		model.addAttribute("item", room);
		String lang = informationService.getSeletedLang();
		RoomI18n roomI18n = roomI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", roomI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "room/edit";
	}

	/**
	 * updateRoom
	 * 
	 * @param id
	 * @param room
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateroom/{id}")
	public String updateRoom(@PathVariable("id") long id, @Validated Room room, BindingResult result, Model model) {

		roomService.save(room);
		return "redirect:/rooms";
	}

	/**
	 * deleteRoom
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteroom/{id}")
	@Transactional
	public String deleteRoom(@PathVariable("id") Long id) {
		roomService.delete(id);
		return "redirect:/rooms";
	}
}
