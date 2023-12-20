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

import com.dev.delta.entities.ExpenseCategory;
import com.dev.delta.i18n.entities.ExpenseCategoryI18n;
import com.dev.delta.i18n.repositories.ExpenseCategoryI18nRepository;
import com.dev.delta.services.ExpenseCategoryService;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class ExpenseCategoryController {
	@Autowired
	private ExpenseCategoryService expenseCategoryService;

	@Autowired
	InformationService informationService;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	ExpenseCategoryI18nRepository expenseI18nRepository;

	@GetMapping("/add-expensecategory")
	public String getaddAmenity(Model model) {
		String lang = informationService.getSeletedLang();
		ExpenseCategoryI18n cityI18n = expenseI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "expensecategory/add";
	}

	/**
	 * expenseCategoryService
	 */

	/**
	 * getExpenseCategorys
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/expensecategories")
	public String getExpenseCategorys(Model model) {
		List<ExpenseCategory> expenseCategorys = expenseCategoryService.getExpenseCategorys();
		model.addAttribute("items", expenseCategorys);
		String lang = informationService.getSeletedLang();
		ExpenseCategoryI18n cityI18n = expenseI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "expensecategory/expensecategories";
	}

	/**
	 * addExpenseCategory
	 * 
	 * @param expenseCategory
	 * @return
	 */
	@PostMapping("/addexpensecategory")

	public String addExpenseCategory(ExpenseCategory expenseCategory) {
		expenseCategoryService.save(expenseCategory);
		return "redirect:/expensecategories";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editexpensecategory/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		ExpenseCategory expenseCategory = expenseCategoryService.findById(id).get();
		model.addAttribute("item", expenseCategory);
		String lang = informationService.getSeletedLang();
		ExpenseCategoryI18n cityI18n = expenseI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "expensecategory/edit";
	}

	/**
	 * updateExpenseCategory
	 * 
	 * @param id
	 * @param expenseCategory
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateexpensecategory/{id}")
	public String updateExpenseCategory(@PathVariable("id") long id, @Validated ExpenseCategory expenseCategory,
			BindingResult result, Model model) {

		expenseCategoryService.save(expenseCategory);
		return "redirect:/expensecategories";
	}

	/**
	 * deleteExpenseCategory
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteexpensecategory/{id}")
	@Transactional
	public String deleteExpenseCategory(@PathVariable("id") Long id) {
		expenseCategoryService.delete(id);
		return "redirect:/expensecategories";
	}

}
