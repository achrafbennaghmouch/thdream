package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.PaymentI18nRepository;

@Service
public class PaymentDTO implements DTO {

	@Autowired
	PaymentI18nRepository paymentI18nRepository;

	@Override
	public void populate() {
		// TODO Auto-generated method stub

		paymentI18n.setAmountI18n("Amount");
		paymentI18n.setCreateTitleI18n("Create");
		paymentI18n.setDateI18n("Date");
		paymentI18n.setEditTitleI18n("Edit");
		paymentI18n.setGetAllTitleI18n("Payments");
		paymentI18n.setGetTitleI18n("Payment");
		paymentI18n.setInvoiceNumberI18n("Invoice Number");
		paymentI18n.setLangI18n("EN");
		paymentI18n.setOrderNumberI18n("Order number");
		paymentI18n.setPaymentMethodI18n("Payment Method");
		paymentI18nRepository.save(paymentI18n);

		paymentI18n5.setAmountI18n("المبلغ");
		paymentI18n5.setCreateTitleI18n("إنشاء");
		paymentI18n5.setDateI18n("التاريخ");
		paymentI18n5.setEditTitleI18n("تحرير");
		paymentI18n5.setGetAllTitleI18n("المدفوعات");
		paymentI18n5.setGetTitleI18n("الدفع");
		paymentI18n5.setInvoiceNumberI18n("رقم الفاتورة");
		paymentI18n5.setLangI18n("AR");
		paymentI18n5.setOrderNumberI18n("رقم الطلب");
		paymentI18n5.setPaymentMethodI18n("طريقة الدفع");
		paymentI18nRepository.save(paymentI18n5);

		paymentI18n4.setAmountI18n("Montant");
		paymentI18n4.setCreateTitleI18n("Créer");
		paymentI18n4.setDateI18n("Date");
		paymentI18n4.setEditTitleI18n("Modifier");
		paymentI18n4.setGetAllTitleI18n("Paiements");
		paymentI18n4.setGetTitleI18n("Paiement");
		paymentI18n4.setInvoiceNumberI18n("Numéro de facture");
		paymentI18n4.setLangI18n("FR");
		paymentI18n4.setOrderNumberI18n("Numéro de commande");
		paymentI18n4.setPaymentMethodI18n("Mode de paiement");
		paymentI18nRepository.save(paymentI18n4);

		paymentI18n3.setAmountI18n("Cantidad");
		paymentI18n3.setCreateTitleI18n("Crear");
		paymentI18n3.setDateI18n("Fecha");
		paymentI18n3.setEditTitleI18n("Editar");
		paymentI18n3.setGetAllTitleI18n("Pagos");
		paymentI18n3.setGetTitleI18n("Pago");
		paymentI18n3.setInvoiceNumberI18n("Número de factura");
		paymentI18n3.setLangI18n("ES");
		paymentI18n3.setOrderNumberI18n("Número de pedido");
		paymentI18n3.setPaymentMethodI18n("Método de pago");
		paymentI18nRepository.save(paymentI18n3);

		paymentI18n2.setAmountI18n("Betragen");
		paymentI18n2.setCreateTitleI18n("Erstellen");
		paymentI18n2.setDateI18n("Datum");
		paymentI18n2.setEditTitleI18n("Bearbeiten");
		paymentI18n2.setGetAllTitleI18n("Zahlungen");
		paymentI18n2.setGetTitleI18n("Zahlung");
		paymentI18n2.setInvoiceNumberI18n("Rechnungsnummer");
		paymentI18n2.setLangI18n("DE");
		paymentI18n2.setOrderNumberI18n("Bestellnummer");
		paymentI18n2.setPaymentMethodI18n("Zahlungsmethode");
		paymentI18nRepository.save(paymentI18n2);
	}

}
