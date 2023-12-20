package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.DesignationI18nRepository;
import com.dev.delta.services.DesignationService;

@Service
public class DesignationDTO implements DTO {

	@Autowired
	DesignationService designationService;

	@Autowired
	DesignationI18nRepository designationI18nRepository;

	@Override
	public void populate() {
		designation.setName("Receptionist");

		designationI18n.setNameI18n("Name");
		designationI18n.setGetTitleI18n("Designation");
		designationI18n.setCreateTitleI18n("Create");
		designationI18n.setEditTitleI18n("Edit");
		designationI18n.setGetAllTitleI18n("Designations");
		designationI18n.setLangI18n("EN");
		designationI18nRepository.save(designationI18n);

		designationI18n2.setNameI18n("Name");
		designationI18n2.setGetTitleI18n("Bezeichnung");
		designationI18n2.setCreateTitleI18n("Erstellen");
		designationI18n2.setEditTitleI18n("Bearbeiten");
		designationI18n2.setGetAllTitleI18n("Bezeichnungen");
		designationI18n2.setLangI18n("DE");
		designationI18nRepository.save(designationI18n2);

		designationI18n3.setNameI18n("Nombre");
		designationI18n3.setGetTitleI18n("Designación");
		designationI18n3.setCreateTitleI18n("Crear");
		designationI18n3.setEditTitleI18n("Editar");
		designationI18n3.setGetAllTitleI18n("Designaciones");
		designationI18n3.setLangI18n("ES");
		designationI18nRepository.save(designationI18n3);

		designationI18n4.setNameI18n("Nom");
		designationI18n4.setGetTitleI18n("Désignation");
		designationI18n4.setCreateTitleI18n("Créer");
		designationI18n4.setEditTitleI18n("Editer");
		designationI18n4.setGetAllTitleI18n("Désignations");
		designationI18n4.setLangI18n("FR");
		designationI18nRepository.save(designationI18n4);

		designationI18n5.setNameI18n("الاسم");
		designationI18n5.setGetTitleI18n("التسمية");
		designationI18n5.setCreateTitleI18n("إنشاء");
		designationI18n5.setEditTitleI18n("تحرير");
		designationI18n5.setGetAllTitleI18n("التعيينات");
		designationI18n5.setLangI18n("AR");
		designationI18nRepository.save(designationI18n5);

		designationService.save(designation);

	}

}
