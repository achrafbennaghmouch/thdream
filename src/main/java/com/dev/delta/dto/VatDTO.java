package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.VATRepository;

@Service
public class VatDTO implements DTO {

	@Autowired
	VATRepository vatRepository;

	@Override
	public void populate() {
		vat.setName("VAT");
		vat.setRate("25");
		vatRepository.save(vat);

	}

}
