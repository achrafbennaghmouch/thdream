package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.PaymentMethodI18nRepository;

@Service
public class PaymentMethodDTO implements DTO {

	@Autowired
	PaymentMethodI18nRepository paymentMethodI18nRepository;

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		paymentMethodI18n.setCreateTitleI18n("Erstellen");
		paymentMethodI18n.setEditTitleI18n("Bearbeiten");
		paymentMethodI18n.setGetAllTitleI18n("Zahlungsmethoden");
		paymentMethodI18n.setGetTitleI18n("Zahlungsmethoden");
		paymentMethodI18n.setLangI18n("DE");
		paymentMethodI18n.setNameI18n("Name");
		paymentMethodI18nRepository.save(paymentMethodI18n);

		paymentMethodI18n2.setCreateTitleI18n("Create");
		paymentMethodI18n2.setEditTitleI18n("Edit");
		paymentMethodI18n2.setGetAllTitleI18n("Payment Methods");
		paymentMethodI18n2.setGetTitleI18n("Payment Method");
		paymentMethodI18n2.setLangI18n("EN");
		paymentMethodI18n2.setNameI18n("Name");
		paymentMethodI18nRepository.save(paymentMethodI18n2);

		paymentMethodI18n3.setCreateTitleI18n("Crear");
		paymentMethodI18n3.setEditTitleI18n("Editar");
		paymentMethodI18n3.setGetAllTitleI18n("Métodos de pago");
		paymentMethodI18n3.setGetTitleI18n("Método de pago");
		paymentMethodI18n3.setLangI18n("ES");
		paymentMethodI18n3.setNameI18n("Nombre");
		paymentMethodI18nRepository.save(paymentMethodI18n3);

		paymentMethodI18n4.setCreateTitleI18n("Créer");
		paymentMethodI18n4.setEditTitleI18n("Modifier");
		paymentMethodI18n4.setGetAllTitleI18n("Méthodes de paiement");
		paymentMethodI18n4.setGetTitleI18n("Mode de paiement");
		paymentMethodI18n4.setLangI18n("FR");
		paymentMethodI18n4.setNameI18n("Nom");
		paymentMethodI18nRepository.save(paymentMethodI18n4);

		paymentMethodI18n5.setCreateTitleI18n("إنشاء");
		paymentMethodI18n5.setEditTitleI18n("تحرير");
		paymentMethodI18n5.setGetAllTitleI18n("طرق الدفع");
		paymentMethodI18n5.setGetTitleI18n("طريقة الدفع");
		paymentMethodI18n5.setLangI18n("AR");
		paymentMethodI18n5.setNameI18n("الاسم");
		paymentMethodI18nRepository.save(paymentMethodI18n5);
	}

}
