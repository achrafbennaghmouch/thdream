package com.dev.delta.paypal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;

@Controller
public class PaypalController {

	@Autowired
	PaypalService service;

	public static final String SUCCESS_URL = "pay/success";
	public static final String CANCEL_URL = "pay/cancel";

	@PostMapping("/pay")
	public String payment(@ModelAttribute("order") Order order) {

		switch (order.getMethod()) {
		case "paypal":
			try {
				Payment payment = service.createPayment(order.getPrice(), order.getCurrency(), "paypal", "sale",
						"hello", "http://localhost:8080/" + CANCEL_URL, "http://localhost:8080/" + SUCCESS_URL);
				for (Links link : payment.getLinks()) {
					if (link.getRel().equals("approval_url")) {
						return "redirect:" + link.getHref();
					}
				}

			} catch (PayPalRESTException e) {

				e.printStackTrace();
			}

			break;

		case "paycash":

			break;
		case "paycheck":

			break;
		default:

			break;
		}

		return "redirect:/";
	}

	@GetMapping(value = CANCEL_URL)
	public String cancelPay() {
		return "/pay/cancel";
	}

	@GetMapping(value = SUCCESS_URL)
	public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId) {
		try {
			Payment payment = service.executePayment(paymentId, payerId);
			System.out.println(payment.toJSON());
			if (payment.getState().equals("approved")) {
				return "/pay/success";
			}
		} catch (PayPalRESTException e) {
			System.out.println(e.getMessage());
		}
		return "/pay/success";
	}

}
