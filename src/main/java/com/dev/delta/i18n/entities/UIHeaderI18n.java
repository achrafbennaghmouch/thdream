package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UIHeaderI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String viewallbutton;
	String messageone;
	String messagetwonotification;
	String messagetwolaundry;
	String messagetwomessage;
	String messagetwohousekeeping;
	String messagetwofood;
	String messagetwoextrabed;
	String bodymessage;
	String lang;

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getViewallbutton() {
		return viewallbutton;
	}

	public void setViewallbutton(String viewallbutton) {
		this.viewallbutton = viewallbutton;
	}

	public String getMessageone() {
		return messageone;
	}

	public void setMessageone(String messageone) {
		this.messageone = messageone;
	}

	public String getBodymessage() {
		return bodymessage;
	}

	public void setBodymessage(String bodymessage) {
		this.bodymessage = bodymessage;
	}

	public String getMessagetwonotification() {
		return messagetwonotification;
	}

	public void setMessagetwonotification(String messagetwonotification) {
		this.messagetwonotification = messagetwonotification;
	}

	public String getMessagetwolaundry() {
		return messagetwolaundry;
	}

	public void setMessagetwolaundry(String messagetwolaundry) {
		this.messagetwolaundry = messagetwolaundry;
	}

	public String getMessagetwomessage() {
		return messagetwomessage;
	}

	public void setMessagetwomessage(String messagetwomessage) {
		this.messagetwomessage = messagetwomessage;
	}

	public String getMessagetwohousekeeping() {
		return messagetwohousekeeping;
	}

	public void setMessagetwohousekeeping(String messagetwohousekeeping) {
		this.messagetwohousekeeping = messagetwohousekeeping;
	}

	public String getMessagetwofood() {
		return messagetwofood;
	}

	public void setMessagetwofood(String messagetwofood) {
		this.messagetwofood = messagetwofood;
	}

	public String getMessagetwoextrabed() {
		return messagetwoextrabed;
	}

	public void setMessagetwoextrabed(String messagetwoextrabed) {
		this.messagetwoextrabed = messagetwoextrabed;
	}

}
