package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebsiteBookingRoomI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String bookingI18n;
	String detailsI18n;
	String summaryI18n;
	String paymentI18n;
	String bookI18n;
	String bookTitleI18n;
	String confirmBookingI18n;
	String saveI18n;
	String printI18n;
	String choosepaymentI18n;
	String paynowI18n;
	String bookingdetailsI18n;
	String contactdetailsI18n;
	String langI18n;
	String messageI18n;
	String invoiceI18n;

	public String getInvoiceI18n() {
		return invoiceI18n;
	}

	public void setInvoiceI18n(String invoiceI18n) {
		this.invoiceI18n = invoiceI18n;
	}

	public String getBookingdetailsI18n() {
		return bookingdetailsI18n;
	}

	public void setBookingdetailsI18n(String bookingdetailsI18n) {
		this.bookingdetailsI18n = bookingdetailsI18n;
	}

	public String getContactdetailsI18n() {
		return contactdetailsI18n;
	}

	public void setContactdetailsI18n(String contactdetailsI18n) {
		this.contactdetailsI18n = contactdetailsI18n;
	}

	public String getMessageI18n() {
		return messageI18n;
	}

	public void setMessageI18n(String messageI18n) {
		this.messageI18n = messageI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookingI18n() {
		return bookingI18n;
	}

	public void setBookingI18n(String bookingI18n) {
		this.bookingI18n = bookingI18n;
	}

	public String getDetailsI18n() {
		return detailsI18n;
	}

	public void setDetailsI18n(String detailsI18n) {
		this.detailsI18n = detailsI18n;
	}

	public String getSummaryI18n() {
		return summaryI18n;
	}

	public void setSummaryI18n(String summaryI18n) {
		this.summaryI18n = summaryI18n;
	}

	public String getPaymentI18n() {
		return paymentI18n;
	}

	public void setPaymentI18n(String paymentI18n) {
		this.paymentI18n = paymentI18n;
	}

	public String getBookI18n() {
		return bookI18n;
	}

	public void setBookI18n(String bookI18n) {
		this.bookI18n = bookI18n;
	}

	public String getBookTitleI18n() {
		return bookTitleI18n;
	}

	public void setBookTitleI18n(String bookTitleI18n) {
		this.bookTitleI18n = bookTitleI18n;
	}

	public String getConfirmBookingI18n() {
		return confirmBookingI18n;
	}

	public void setConfirmBookingI18n(String confirmBookingI18n) {
		this.confirmBookingI18n = confirmBookingI18n;
	}

	public String getSaveI18n() {
		return saveI18n;
	}

	public void setSaveI18n(String saveI18n) {
		this.saveI18n = saveI18n;
	}

	public String getPrintI18n() {
		return printI18n;
	}

	public void setPrintI18n(String printI18n) {
		this.printI18n = printI18n;
	}

	public String getChoosepaymentI18n() {
		return choosepaymentI18n;
	}

	public void setChoosepaymentI18n(String choosepaymentI18n) {
		this.choosepaymentI18n = choosepaymentI18n;
	}

	public String getPaynowI18n() {
		return paynowI18n;
	}

	public void setPaynowI18n(String paynowI18n) {
		this.paynowI18n = paynowI18n;
	}

}
