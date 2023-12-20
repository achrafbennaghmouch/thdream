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

import com.dev.delta.entities.Payment;
import com.dev.delta.i18n.entities.PaymentI18n;
import com.dev.delta.i18n.repositories.PaymentI18nRepository;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.PaymentMethodService;
import com.dev.delta.services.PaymentService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class PaymentController {
	/**
	 * paymentService
	 */
	@Autowired
	private PaymentService paymentService;

	@Autowired
	private PaymentMethodService paymentMethodService;

	@Autowired
	InformationService informationService;

	@Autowired
	PaymentI18nRepository paymentI18nRepository;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/add-payment")
	public String getaddPayment(Model model) {
		model.addAttribute("paymentMethods", paymentMethodService.getPaymentMethods());
		String lang = informationService.getSeletedLang();
		PaymentI18n cityI18n = paymentI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "payment/add";
	}

	/**
	 * getPayments
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/payments")
	public String getPayments(Model model) {
		List<Payment> payments = paymentService.getPayments();
		model.addAttribute("items", payments);
		String lang = informationService.getSeletedLang();
		PaymentI18n cityI18n = paymentI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "payment/payments";
	}

	/**
	 * addPayment
	 * 
	 * @param payment
	 * @return
	 */
	@PostMapping("/addpayment")

	public String addPayment(Payment payment) {
		paymentService.save(payment);
		return "redirect:/payments";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/payment/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Payment payment = paymentService.findById(id).get();
		model.addAttribute("item", payment);
		String lang = informationService.getSeletedLang();
		PaymentI18n cityI18n = paymentI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "payment/view";
	}

	@RequestMapping("/editpayment/{id}")
	public String findPaymentById(@PathVariable("id") Long id, Model model) {
		model.addAttribute("paymentMethods", paymentMethodService.getPaymentMethods());
		Payment payment = paymentService.findById(id).get();
		model.addAttribute("item", payment);
		String lang = informationService.getSeletedLang();
		PaymentI18n cityI18n = paymentI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", cityI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "payment/edit";
	}

	/**
	 * updatePayment
	 * 
	 * @param id
	 * @param payment
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepayment/{id}")
	public String updatePayment(@PathVariable("id") long id, @Validated Payment payment, BindingResult result,
			Model model) {

		paymentService.save(payment);
		return "redirect:/payments";
	}

	/**
	 * deletePayment
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepayment/{id}")
	@Transactional
	public String deletePayment(@PathVariable("id") Long id) {
		paymentService.delete(id);
		return "redirect:/payments";
	}
}
