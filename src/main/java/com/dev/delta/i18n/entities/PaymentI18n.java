package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String OrderNumberI18n;
	String InvoiceNumberI18n;
	String DateI18n;
	String PaymentMethodI18n;
	String AmountI18n;
	String langI18n;
	String getAllTitleI18n;
	String getTitleI18n;
	String editTitleI18n;
	String createTitleI18n;

	public String getGetAllTitleI18n() {
		return getAllTitleI18n;
	}

	public void setGetAllTitleI18n(String getAllTitleI18n) {
		this.getAllTitleI18n = getAllTitleI18n;
	}

	public String getGetTitleI18n() {
		return getTitleI18n;
	}

	public void setGetTitleI18n(String getTitleI18n) {
		this.getTitleI18n = getTitleI18n;
	}

	public String getEditTitleI18n() {
		return editTitleI18n;
	}

	public void setEditTitleI18n(String editTitleI18n) {
		this.editTitleI18n = editTitleI18n;
	}

	public String getCreateTitleI18n() {
		return createTitleI18n;
	}

	public void setCreateTitleI18n(String createTitleI18n) {
		this.createTitleI18n = createTitleI18n;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNumberI18n() {
		return OrderNumberI18n;
	}

	public void setOrderNumberI18n(String orderNumberI18n) {
		OrderNumberI18n = orderNumberI18n;
	}

	public String getInvoiceNumberI18n() {
		return InvoiceNumberI18n;
	}

	public void setInvoiceNumberI18n(String invoiceNumberI18n) {
		InvoiceNumberI18n = invoiceNumberI18n;
	}

	public String getDateI18n() {
		return DateI18n;
	}

	public void setDateI18n(String dateI18n) {
		DateI18n = dateI18n;
	}

	public String getPaymentMethodI18n() {
		return PaymentMethodI18n;
	}

	public void setPaymentMethodI18n(String paymentMethodI18n) {
		PaymentMethodI18n = paymentMethodI18n;
	}

	public String getAmountI18n() {
		return AmountI18n;
	}

	public void setAmountI18n(String amountI18n) {
		AmountI18n = amountI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
