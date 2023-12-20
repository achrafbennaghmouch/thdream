package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.SubscriberI18nRepository;

@Service
public class SubscriberDTO implements DTO {

	@Autowired
	SubscriberI18nRepository subscriberI18nRepository;

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		subscriberI18n.setEmailI18n("Email");
		subscriberI18n.setLangI18n("EN");
		subscriberI18n.setGetAllTitleI18n("Subscribers");
		subscriberI18nRepository.save(subscriberI18n);

		subscriberI18n2.setEmailI18n("Email");
		subscriberI18n2.setLangI18n("DE");
		subscriberI18n2.setGetAllTitleI18n("Abonnenten");
		subscriberI18nRepository.save(subscriberI18n2);

		subscriberI18n3.setEmailI18n("Correo electrónico");
		subscriberI18n3.setLangI18n("ES");
		subscriberI18n3.setGetAllTitleI18n("Suscriptores");
		subscriberI18nRepository.save(subscriberI18n3);

		subscriberI18n4.setEmailI18n("E-mail");
		subscriberI18n4.setLangI18n("FR");
		subscriberI18n4.setGetAllTitleI18n("Abonnés");
		subscriberI18nRepository.save(subscriberI18n4);

		subscriberI18n5.setEmailI18n("البريد الإلكتروني");
		subscriberI18n5.setLangI18n("AR");
		subscriberI18n5.setGetAllTitleI18n("المشتركون");
		subscriberI18nRepository.save(subscriberI18n5);

	}
}
