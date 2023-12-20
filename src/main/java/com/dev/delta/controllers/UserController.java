package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.User;
import com.dev.delta.i18n.repositories.UserI18nRepository;
import com.dev.delta.repositories.UserRepository;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	UserI18nRepository userI18nRepository;

	@Autowired
	InformationService informationService;

	@GetMapping("/users")
	public String getUsers(Model model) {
		List<User> users = userRepository.findAll();
		model.addAttribute("items", users);
		menuHeaderUtil.getMenuHeader(model);
		String lang = informationService.getSeletedLang();
		model.addAttribute("itemI18n", userI18nRepository.findByLangI18n(lang));
		return "user/users";
	}
}
