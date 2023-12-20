package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Message;
import com.dev.delta.i18n.entities.MessageI18n;
import com.dev.delta.i18n.repositories.MessageI18nRepository;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.MessageService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class MessageController {

	@Autowired
	MessageService messageService;
	@Autowired
	InformationService informationService;
	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;
	@Autowired
	MessageI18nRepository messageI18nRepository;

	@GetMapping("/messagesadmin")
	public String getMessages(Model model) {
		List<Message> msgs = messageService.getMessages();
		model.addAttribute("items", msgs);
		String lang = informationService.getSeletedLang();
		MessageI18n cityI18n = messageI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "message/messages";
	}

	@PostMapping("/addmessage")
	public String addMessage(Message message) {

		messageService.addMessage(message);
		return "redirect:/";

	}

	@RequestMapping("/message/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Message message = messageService.findById(id);
		model.addAttribute("item", message);
		String lang = informationService.getSeletedLang();
		MessageI18n cityI18n = messageI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "message/view";
	}
}
