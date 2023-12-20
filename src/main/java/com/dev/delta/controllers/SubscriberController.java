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

import com.dev.delta.entities.Subscriber;
import com.dev.delta.i18n.repositories.SubscriberI18nRepository;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.SubscriberService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class SubscriberController {

	@Autowired
	SubscriberService subscriberService;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	SubscriberI18nRepository subscriberI18nRepository;

	@Autowired
	InformationService informationService;

	@GetMapping("/subscribers")
	public String getSubscribers(Model model) {
		List<Subscriber> subscribers = subscriberService.getSubcribers();
		model.addAttribute("items", subscribers);
		menuHeaderUtil.getMenuHeader(model);
		String lang = informationService.getSeletedLang();
		model.addAttribute("itemI18n", subscriberI18nRepository.findByLangI18n(lang));
		return "subscriber/subscribers";
	}

	@PostMapping("/addsubscriber")
	public String addShift(@Validated Subscriber subscriber, BindingResult result, Model model) {

		subscriberService.save(subscriber);
		return "redirect:/";
	}

	@GetMapping("/deletesubscriber/{id}")
	@Transactional
	public String deleteRoom(@PathVariable("id") Long id) {
		subscriberService.delete(id);
		return "redirect:/subscribers";
	}
}
