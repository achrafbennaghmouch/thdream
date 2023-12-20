package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.DepartementI18nRepository;
import com.dev.delta.repositories.DepartementRepository;

@Service
public class DepartementDTO implements DTO {

	@Autowired
	DepartementI18nRepository departementI18nRepository;

	@Autowired
	DepartementRepository departementRepository;

	@Override
	public void populate() {
		departement.setName("Administration");
		departementRepository.save(departement);

		departementI18n.setCreateTitleI18n("Create");
		departementI18n.setEditTitleI18n("Edit");
		departementI18n.setGetAllTitleI18n("Departements");
		departementI18n.setGetTitleI18n("Departement");
		departementI18n.setLangI18n("EN");
		departementI18n.setNameI18n("Name");

		departementI18n2.setCreateTitleI18n("Erstellen");
		departementI18n2.setEditTitleI18n("Bearbeiten");
		departementI18n2.setGetAllTitleI18n("Abteilungen");
		departementI18n2.setGetTitleI18n("Abteilungen");
		departementI18n2.setLangI18n("DE");
		departementI18n2.setNameI18n("Name");

		departementI18n3.setCreateTitleI18n("Crear");
		departementI18n3.setEditTitleI18n("Editar");
		departementI18n3.setGetAllTitleI18n("Departamentos");
		departementI18n3.setGetTitleI18n("Departamento");
		departementI18n3.setLangI18n("ES");
		departementI18n3.setNameI18n("Nombre");

		departementI18n4.setCreateTitleI18n("Créer");
		departementI18n4.setEditTitleI18n("Editer");
		departementI18n4.setGetAllTitleI18n("Départements");
		departementI18n4.setGetTitleI18n("Département");
		departementI18n4.setLangI18n("FR");
		departementI18n4.setNameI18n("Nom");

		departementI18n5.setCreateTitleI18n("إنشاء");
		departementI18n5.setEditTitleI18n("تحرير");
		departementI18n5.setGetAllTitleI18n("الأقسام");
		departementI18n5.setGetTitleI18n("القسم");
		departementI18n5.setLangI18n("AR");
		departementI18n5.setNameI18n("الاسم");

		departementI18nRepository.save(departementI18n);
		departementI18nRepository.save(departementI18n2);
		departementI18nRepository.save(departementI18n3);
		departementI18nRepository.save(departementI18n4);
		departementI18nRepository.save(departementI18n5);

	}

}
