package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.PaymentMethod;
import com.dev.delta.repositories.PaymentMethodRepository;

@Service
public class PaymentMethodService {

	/**
	 * paymentMethodRepository
	 */
	@Autowired
	private PaymentMethodRepository paymentMethodRepository;

	/**
	 * getPaymentMethods
	 * 
	 * @return
	 */
	public List<PaymentMethod> getPaymentMethods() {
		return paymentMethodRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return paymentMethodRepository.count();
	}

	/**
	 * save
	 * 
	 * @param paymentMethod
	 */
	public void save(PaymentMethod paymentMethod) {
		paymentMethodRepository.save(paymentMethod);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<PaymentMethod> findById(long id) {
		return paymentMethodRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		paymentMethodRepository.delete(paymentMethodRepository.findById(id).get());
	}
}
