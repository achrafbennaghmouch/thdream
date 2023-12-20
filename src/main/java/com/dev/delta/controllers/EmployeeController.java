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

import com.dev.delta.entities.Employee;
import com.dev.delta.i18n.entities.EmployeeI18n;
import com.dev.delta.i18n.repositories.EmployeeI18nRepository;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.DesignationService;
import com.dev.delta.services.EmployeeService;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.ShiftService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class EmployeeController {
	/**
	 * employeeService
	 */
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	DesignationService designationService;

	@Autowired
	private CityService cityService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private ShiftService shiftService;

	@Autowired
	EmployeeI18nRepository employeeI18nRepository;

	@Autowired
	InformationService informationService;
	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/add-employee")
	public String getadEmployee(Model model) {
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("designations", designationService.getDesignations());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("shifts", shiftService.getShifts());

		String lang = informationService.getSeletedLang();
		EmployeeI18n cityI18n = employeeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "employee/add";
	}

	/**
	 * getEmployees
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/employees")
	public String getEmployees(Model model) {
		List<Employee> employees = employeeService.getEmployees();

		model.addAttribute("items", employees);
		String lang = informationService.getSeletedLang();
		EmployeeI18n cityI18n = employeeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "employee/employees";
	}

	/**
	 * addEmployee
	 * 
	 * @param employee
	 * @return
	 */
	@PostMapping("/addemployee")

	public String addEmployee(Employee employee) {
		employeeService.save(employee);

		return "redirect:/employees";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/employee/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Employee employee = employeeService.findById(id);
		model.addAttribute("item", employee);
		String lang = informationService.getSeletedLang();
		EmployeeI18n cityI18n = employeeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "employee/view";
	}

	@RequestMapping("/editemployee/{id}")
	public String findEmployeeById(@PathVariable("id") Long id, Model model) {
		Employee employee = employeeService.findById(id);
		model.addAttribute("item", employee);
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("designations", designationService.getDesignations());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("shifts", shiftService.getShifts());
		String lang = informationService.getSeletedLang();
		EmployeeI18n cityI18n = employeeI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "employee/edit";
	}

	/**
	 * updateEmployee
	 * 
	 * @param id
	 * @param employee
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateemployee/{id}")
	public String updateEmployee(@PathVariable("id") long id, @Validated Employee employee, BindingResult result,
			Model model) {

		employeeService.save(employee);
		return "redirect:/employees";
	}

	/**
	 * deleteEmployee
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteemployee/{id}")
	@Transactional
	public String deleteEmployee(@PathVariable("id") Long id) {
		employeeService.delete(id);
		return "redirect:/employees";
	}

}
