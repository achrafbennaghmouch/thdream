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

import com.dev.delta.entities.PaymentMethod;
import com.dev.delta.i18n.entities.PaymentMethodI18n;
import com.dev.delta.i18n.repositories.PaymentMethodI18nRepository;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.PaymentMethodService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class PaymentMethodController {
	/**
	 * paymentMethodService
	 */
	@Autowired
	private PaymentMethodService paymentMethodService;

	@Autowired
	PaymentMethodI18nRepository paymentI18nRepository;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	InformationService informationService;

	@GetMapping("/add-paymentmethod")
	public String getaddPaymenType(Model model) {

		String lang = informationService.getSeletedLang();
		PaymentMethodI18n cityI18n = paymentI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "paymentmethod/add";
	}

	/**
	 * getPaymentMethods
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/paymentmethods")
	public String getPaymentMethods(Model model) {
		List<PaymentMethod> paymentMethods = paymentMethodService.getPaymentMethods();
		model.addAttribute("items", paymentMethods);
		String lang = informationService.getSeletedLang();
		PaymentMethodI18n cityI18n = paymentI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "paymentmethod/paymentmethods";
	}

	/**
	 * addPaymentMethod
	 * 
	 * @param paymentMethod
	 * @return
	 */
	@PostMapping("/addpaymentmethod")

	public String addPaymentMethod(PaymentMethod paymentMethod) {
		paymentMethodService.save(paymentMethod);
		return "redirect:/paymentmethods";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editpaymentmethod/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		PaymentMethod paymentMethod = paymentMethodService.findById(id).get();
		model.addAttribute("item", paymentMethod);
		String lang = informationService.getSeletedLang();
		PaymentMethodI18n cityI18n = paymentI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "paymentmethod/edit";
	}

	/**
	 * updatePaymentMethod
	 * 
	 * @param id
	 * @param paymentMethod
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepaymentmethod/{id}")
	public String updatePaymentMethod(@PathVariable("id") long id, @Validated PaymentMethod paymentMethod,
			BindingResult result, Model model) {

		paymentMethodService.save(paymentMethod);
		return "redirect:/paymentmethods";
	}

	/**
	 * deletePaymentMethod
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepaymentmethod/{id}")
	@Transactional
	public String deletePaymentMethod(@PathVariable("id") Long id) {
		paymentMethodService.delete(id);
		return "redirect:/paymentmethods";
	}
}
