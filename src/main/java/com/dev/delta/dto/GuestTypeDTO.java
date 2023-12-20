package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.GuestTypeI18nRepository;
import com.dev.delta.repositories.GuestTypeRepository;

@Service
public class GuestTypeDTO implements DTO {

	@Autowired
	GuestTypeRepository guestTypeRepository;

	@Autowired
	GuestTypeI18nRepository guestTypeI18nRepository;

	@Override
	public void populate() {
		guestType1.setName("Normal");
		guestType2.setName("Business");
		guestTypeRepository.save(guestType1);
		guestTypeRepository.save(guestType2);

		guestTypeI18n.setNameI18n("Type");
		guestTypeI18n.setGetTitleI18n("Guest type");
		guestTypeI18n.setCreateTitleI18n("Create");
		guestTypeI18n.setEditTitleI18n("Edit ");
		guestTypeI18n.setGetAllTitleI18n("Guest types");
		guestTypeI18n.setLangI18n("EN");
		guestTypeI18nRepository.save(guestTypeI18n);

		guestTypeI18n2.setNameI18n("Typ");
		guestTypeI18n2.setGetTitleI18n("Gast Typ");
		guestTypeI18n2.setCreateTitleI18n("Erstellen");
		guestTypeI18n2.setEditTitleI18n("Bearbeiten");
		guestTypeI18n2.setGetAllTitleI18n("Gäste Typ");
		guestTypeI18n2.setLangI18n("DE");
		guestTypeI18nRepository.save(guestTypeI18n2);

		guestTypeI18n3.setNameI18n("Tipo");
		guestTypeI18n3.setGetTitleI18n("Tipo de invitado");
		guestTypeI18n3.setCreateTitleI18n("Crear");
		guestTypeI18n3.setEditTitleI18n("Editar");
		guestTypeI18n3.setGetAllTitleI18n("Tipos de invitados");
		guestTypeI18n3.setLangI18n("ES");
		guestTypeI18nRepository.save(guestTypeI18n3);

		guestTypeI18n4.setNameI18n("النوع");
		guestTypeI18n4.setGetTitleI18n("نوع الضيف");
		guestTypeI18n4.setCreateTitleI18n("إنشاء");
		guestTypeI18n4.setEditTitleI18n("تحرير");
		guestTypeI18n4.setGetAllTitleI18n("أنواع الضيف");
		guestTypeI18n4.setLangI18n("AR");
		guestTypeI18nRepository.save(guestTypeI18n4);

		guestTypeI18n5.setNameI18n("Type");
		guestTypeI18n5.setGetTitleI18n("Type d'invité");
		guestTypeI18n5.setCreateTitleI18n("Créer");
		guestTypeI18n5.setEditTitleI18n("Modifier ");
		guestTypeI18n5.setGetAllTitleI18n("Types d'invités");
		guestTypeI18n5.setLangI18n("FR");
		guestTypeI18nRepository.save(guestTypeI18n5);
	}

}
