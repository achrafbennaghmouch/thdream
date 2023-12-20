package com.dev.delta.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.dev.delta.i18n.entities.UIHeaderI18n;
import com.dev.delta.i18n.entities.UIMenuI18n;
import com.dev.delta.i18n.repositories.UIHeaderI18nRepository;
import com.dev.delta.i18n.repositories.UIMenuI18nRepository;

import com.dev.delta.repositories.MessageRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.services.InformationService;

@Service
public class UIMenuHeaderUtil {

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
	NotificationRepository notificationRepository2;

	public void getMenuHeader(Model model) {
		String lang = informationService.getSeletedLang();
		UIMenuI18n menu = menuI18nRepository.findByLang(lang);
		UIHeaderI18n header = headerI18nRepository.findByLang(lang);
		model.addAttribute("messageNB", messageRepository.count());
		model.addAttribute("notificationNB", notificationRepository.count());

		model.addAttribute("menu", menu);
		model.addAttribute("header", header);
		model.addAttribute("notifications", notificationRepository.findAll());
		model.addAttribute("messages", messageRepository.findAll());
	}

}
