package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.MessageI18nRepository;
import com.dev.delta.repositories.MessageRepository;

@Service
public class MessageDTO implements DTO {

	@Autowired
	MessageRepository messageRepository;

	@Autowired
	MessageI18nRepository messageI18nRepository;

	@Override
	public void populate() {
		message.setEmail("contact@gmail.com");
		message.setMsg("Hello Admin, How are you ?");
		message.setName("Contact");
		message.setSubject("Greetings");
		messageRepository.save(message);

		messageI18n.setEmailI18n("Email");
		messageI18n.setMsgI18n("Message");
		messageI18n.setNameI18n("Contact");
		messageI18n.setSubjectI18n("Subject");
		messageI18n.setGetTitleI18n("Message");
		messageI18n.setCreateTitleI18n("Create");
		messageI18n.setEditTitleI18n("Edit");
		messageI18n.setGetAllTitleI18n("Messages");
		messageI18n.setLangI18n("EN");
		messageI18nRepository.save(messageI18n);

		messageI18n3.setEmailI18n("البريد الإلكتروني");
		messageI18n3.setMsgI18n("رسالة");
		messageI18n3.setNameI18n("جهة اتصال");
		messageI18n3.setSubjectI18n("الموضوع");
		messageI18n3.setGetTitleI18n("رسالة");
		messageI18n3.setCreateTitleI18n("إنشاء");
		messageI18n3.setEditTitleI18n("تحرير");
		messageI18n3.setGetAllTitleI18n("الرسائل");
		messageI18n3.setLangI18n("AR");
		messageI18nRepository.save(messageI18n3);

		messageI18n4.setEmailI18n("E-mail");
		messageI18n4.setMsgI18n("Message");
		messageI18n4.setNameI18n("Contact");
		messageI18n4.setSubjectI18n("Sujet");
		messageI18n4.setGetTitleI18n("Ville");
		messageI18n4.setCreateTitleI18n("Créer une nouvelle ville");
		messageI18n4.setEditTitleI18n("Modifier la ville");
		messageI18n4.setGetAllTitleI18n("Villes");
		messageI18n4.setLangI18n("FR");
		messageI18nRepository.save(messageI18n4);

		messageI18n5.setEmailI18n("Correo electrónico");
		messageI18n5.setMsgI18n("tema");
		messageI18n5.setNameI18n("Contacto");
		messageI18n5.setSubjectI18n("tema");
		messageI18n5.setGetTitleI18n("Ciudad");
		messageI18n5.setCreateTitleI18n("Crear");
		messageI18n5.setEditTitleI18n("Editar");
		messageI18n5.setGetAllTitleI18n("Ciudades");
		messageI18n5.setLangI18n("ES");
		messageI18nRepository.save(messageI18n5);

		messageI18n2.setEmailI18n("Email");
		messageI18n2.setMsgI18n("Nachricht");
		messageI18n2.setNameI18n("Name");
		messageI18n2.setSubjectI18n("Thema");
		messageI18n2.setGetTitleI18n("Nachricht");
		messageI18n2.setCreateTitleI18n("Erstellen");
		messageI18n2.setEditTitleI18n("Bearbeiten");
		messageI18n2.setGetAllTitleI18n("Nachrichten");
		messageI18n2.setLangI18n("DE");
		messageI18nRepository.save(messageI18n2);

	}

}
