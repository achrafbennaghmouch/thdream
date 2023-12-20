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

import com.dev.delta.entities.Service;
import com.dev.delta.services.ServiceService;

@Controller
public class ServiceController {

	/**
	 * serviceService
	 */
	@Autowired
	private ServiceService serviceService;

	@GetMapping("/add-service")
	public String getaddService(Model model) {
		return "service/add";
	}

	/**
	 * getServices
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/services")
	public String getServices(Model model) {
		List<Service> services = serviceService.getServices();

		model.addAttribute("items", services);

		return "service/services";
	}

	/**
	 * addService
	 * 
	 * @param service
	 * @return
	 */
	@PostMapping("/addservice")

	public String addService(Service service) {
		serviceService.save(service);
		return "redirect:/services";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editservice/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Service service = serviceService.findById(id).get();
		model.addAttribute("item", service);
		return "service/edit";
	}

	/**
	 * updateService
	 * 
	 * @param id
	 * @param service
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateservice/{id}")
	public String updateService(@PathVariable("id") long id, @Validated Service service, BindingResult result,
			Model model) {

		serviceService.save(service);
		return "redirect:/services";
	}

	/**
	 * deleteService
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteservice/{id}")
	@Transactional
	public String deleteService(@PathVariable("id") Long id) {
		serviceService.delete(id);
		return "redirect:/services";
	}
}
