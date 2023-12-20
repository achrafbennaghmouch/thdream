package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.Role;
import com.dev.delta.repositories.RoleRepository;

@Controller
public class RoleController {

	@Autowired
	RoleRepository roleRepository;

	@GetMapping("/roles")
	public String getRoles(Model model) {
		List<Role> roles = roleRepository.findAll();
		model.addAttribute("items", roles);
		return "role/roles";
	}
}
